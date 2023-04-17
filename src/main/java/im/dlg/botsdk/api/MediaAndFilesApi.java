package im.dlg.botsdk.api;

import im.dlg.botsdk.model.ServerFile;
import im.dlg.grpc.services.MediaAndFilesGrpc;
import im.dlg.grpc.services.MediaAndFilesOuterClass;
import io.grpc.ManagedChannel;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.asynchttpclient.AsyncHttpClient;
import org.javatuples.Pair;
import im.dlg.botsdk.internal.InternalBot;
import im.dlg.botsdk.model.media.FileLocation;

import javax.annotation.Nonnull;
import javax.net.ssl.SSLContext;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.KeyStore;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class MediaAndFilesApi {

    private final ManagedChannel channel;
    private final InternalBot internalBot;
    private final AsyncHttpClient asyncHttpClient;

    public MediaAndFilesApi(ManagedChannel channel, InternalBot internalBot, AsyncHttpClient asyncHttpClient) {
        this.channel = channel;
        this.internalBot = internalBot;
        this.asyncHttpClient = asyncHttpClient;
    }

    /**
     * Uploads a file to server
     *
     * @param file     - file to upload
     * @return A CompletableFuture for FileLocation on server side (FileLocation for
     * Dialog internal api)
     */
    public CompletableFuture<FileLocation> uploadFile(@Nonnull File file) {
        if (!file.isFile()) {
            throw new IllegalArgumentException("Input isn't a file !");
        }

        if (false) {
            try {
                return uploadFile(Files.readAllBytes(file.toPath()), file.getName());
            } catch (IOException exception) {
                return CompletableFuture.completedFuture(null);
            }
        }

        String fileName = file.getName();
        int fileSize = (int) file.length();

        MediaAndFilesOuterClass.RequestGetFileUploadUrl.Builder requestGetUrl = MediaAndFilesOuterClass.RequestGetFileUploadUrl.newBuilder()
                .setExpectedSize(fileSize);

        return internalBot
                .withToken(MediaAndFilesGrpc.newFutureStub(channel).withDeadlineAfter(1,
                        TimeUnit.MINUTES), stub -> stub.getFileUploadUrl(requestGetUrl.build())
                ).thenCompose(responseGetFileUploadUrl -> {
                    MediaAndFilesOuterClass.RequestGetFileUploadPartUrl.Builder uploadPart =
                            MediaAndFilesOuterClass.RequestGetFileUploadPartUrl.newBuilder().setPartNumber(0).
                                    setPartSize(fileSize).setUploadKey(responseGetFileUploadUrl.getUploadKey());
                    return internalBot
                            .withToken(MediaAndFilesGrpc.newFutureStub(channel).withDeadlineAfter(3,
                                    TimeUnit.MINUTES), stub -> stub.getFileUploadPartUrl(uploadPart.build()))
                            .thenApply(res -> new Pair<>(res.getUrl(), responseGetFileUploadUrl.getUploadKey()));
                }).thenCompose(respPair ->
                        asyncHttpClient.preparePut(respPair.getValue0())

                                .setBody(file).execute().toCompletableFuture()
                                .thenApply(val -> respPair.getValue1())
                ).thenCompose(uploadKey -> internalBot
                        .withToken(MediaAndFilesGrpc.newFutureStub(channel).withDeadlineAfter(3,
                                TimeUnit.MINUTES), stub ->
                                stub.commitFileUpload(MediaAndFilesOuterClass.RequestCommitFileUpload.newBuilder()
                                        .setFileName(fileName)
                                        .setUploadKey(uploadKey).build()))
                        .thenApply(r -> new FileLocation(r.getUploadedFileLocation())));




    }

    public CompletableFuture<FileLocation> uploadFile(@Nonnull byte[] file, String fileName) {
        int fileSize = file.length;

        MediaAndFilesOuterClass.RequestGetFileUploadUrl.Builder requestGetUrl = MediaAndFilesOuterClass.RequestGetFileUploadUrl.newBuilder()
                .setExpectedSize(fileSize);

        return internalBot
                .withToken(MediaAndFilesGrpc.newFutureStub(channel).withDeadlineAfter(1,
                        TimeUnit.MINUTES), stub -> stub.getFileUploadUrl(requestGetUrl.build())
                ).thenCompose(responseGetFileUploadUrl -> {
                    MediaAndFilesOuterClass.RequestGetFileUploadPartUrl.Builder uploadPart =
                            MediaAndFilesOuterClass.RequestGetFileUploadPartUrl.newBuilder().setPartNumber(0).
                                    setPartSize(fileSize).setUploadKey(responseGetFileUploadUrl.getUploadKey());
                    return internalBot
                            .withToken(MediaAndFilesGrpc.newFutureStub(channel).withDeadlineAfter(3,
                                    TimeUnit.MINUTES), stub -> stub.getFileUploadPartUrl(uploadPart.build()))
                            .thenApply(res -> new Pair<>(res.getUrl(), responseGetFileUploadUrl.getUploadKey()));
                }).thenCompose(respPair ->
                        asyncHttpClient.preparePut(respPair.getValue0())

                                .setBody(file).execute().toCompletableFuture()
                                .thenApply(val -> respPair.getValue1())
                ).thenCompose(uploadKey -> internalBot
                        .withToken(MediaAndFilesGrpc.newFutureStub(channel).withDeadlineAfter(3,
                                TimeUnit.MINUTES), stub ->
                                stub.commitFileUpload(MediaAndFilesOuterClass.RequestCommitFileUpload.newBuilder()
                                        .setFileName(fileName)
                                        .setUploadKey(uploadKey).build()))
                        .thenApply(r -> new FileLocation(r.getUploadedFileLocation())));
    }

    /**
     * Get Url to download a file from server
     *
     * @param fileLoc - file location (dialog internal API)
     * @return - A CompletableFuture for a String containing download url
     */
    public CompletableFuture<String> getFileUrl(FileLocation fileLoc) {
        return internalBot.withToken(
                MediaAndFilesGrpc.newFutureStub(channel).withDeadlineAfter(2, TimeUnit.MINUTES),
                stub -> stub.getFileUrls(MediaAndFilesOuterClass.RequestGetFileUrls.newBuilder().addFiles(fileLoc.toServer()).build()))
                .thenApply(resp -> resp.getFileUrlsList().get(0).getUrl());
    }

    public CompletableFuture<Optional<ServerFile>> getFile(FileLocation fileLocation)
    {
        ResourceBundle bundle = ResourceBundle.getBundle("application");
        String certPath = bundle.getString("bot.certPath");
        String certPass = bundle.getString("bot.certPass");
        return getFileUrl(fileLocation).thenApply(url -> {
                    KeyStore keyStore = null;
                    try {
                        HttpClientBuilder clientBuilder = HttpClients.custom();
                        if (certPath != null) {
                            keyStore = KeyStore.getInstance("PKCS12");
                            keyStore.load(new FileInputStream(certPath), certPass.toCharArray());

                            SSLContext sslContext = SSLContexts
                                    .custom()
                                    .loadKeyMaterial(keyStore, certPass.toCharArray())
                                    .build();
                            clientBuilder.setSSLContext(sslContext);
                        }

                        CloseableHttpClient httpClient = clientBuilder.build();
                        CloseableHttpResponse response = httpClient.execute(new HttpGet(url));

                        if (response.getStatusLine().getStatusCode() != 200) throw new Exception("File not found");
                        byte[] result = EntityUtils.toByteArray(response.getEntity());


                        return Optional.of(new ServerFile("",result));

                    } catch (Exception e) {
                        return Optional.empty();
                    }
                }
        );

    }


}