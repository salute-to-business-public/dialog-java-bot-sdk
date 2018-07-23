package dialog;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.13.2)",
    comments = "Source: media_and_files.proto")
public final class MediaAndFilesGrpc {

  private MediaAndFilesGrpc() {}

  public static final String SERVICE_NAME = "dialog.MediaAndFiles";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUrl,
      dialog.MediaAndFilesOuterClass.ResponseGetFileUrl> getGetFileUrlMethod;

  public static io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUrl,
      dialog.MediaAndFilesOuterClass.ResponseGetFileUrl> getGetFileUrlMethod() {
    io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUrl, dialog.MediaAndFilesOuterClass.ResponseGetFileUrl> getGetFileUrlMethod;
    if ((getGetFileUrlMethod = MediaAndFilesGrpc.getGetFileUrlMethod) == null) {
      synchronized (MediaAndFilesGrpc.class) {
        if ((getGetFileUrlMethod = MediaAndFilesGrpc.getGetFileUrlMethod) == null) {
          MediaAndFilesGrpc.getGetFileUrlMethod = getGetFileUrlMethod = 
              io.grpc.MethodDescriptor.<dialog.MediaAndFilesOuterClass.RequestGetFileUrl, dialog.MediaAndFilesOuterClass.ResponseGetFileUrl>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.MediaAndFiles", "GetFileUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MediaAndFilesOuterClass.RequestGetFileUrl.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MediaAndFilesOuterClass.ResponseGetFileUrl.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaAndFilesMethodDescriptorSupplier("GetFileUrl"))
                  .build();
          }
        }
     }
     return getGetFileUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUrls,
      dialog.MediaAndFilesOuterClass.ResponseGetFileUrls> getGetFileUrlsMethod;

  public static io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUrls,
      dialog.MediaAndFilesOuterClass.ResponseGetFileUrls> getGetFileUrlsMethod() {
    io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUrls, dialog.MediaAndFilesOuterClass.ResponseGetFileUrls> getGetFileUrlsMethod;
    if ((getGetFileUrlsMethod = MediaAndFilesGrpc.getGetFileUrlsMethod) == null) {
      synchronized (MediaAndFilesGrpc.class) {
        if ((getGetFileUrlsMethod = MediaAndFilesGrpc.getGetFileUrlsMethod) == null) {
          MediaAndFilesGrpc.getGetFileUrlsMethod = getGetFileUrlsMethod = 
              io.grpc.MethodDescriptor.<dialog.MediaAndFilesOuterClass.RequestGetFileUrls, dialog.MediaAndFilesOuterClass.ResponseGetFileUrls>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.MediaAndFiles", "GetFileUrls"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MediaAndFilesOuterClass.RequestGetFileUrls.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MediaAndFilesOuterClass.ResponseGetFileUrls.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaAndFilesMethodDescriptorSupplier("GetFileUrls"))
                  .build();
          }
        }
     }
     return getGetFileUrlsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUrlBuilder,
      dialog.MediaAndFilesOuterClass.ResponseGetFileUrlBuilder> getGetFileUrlBuilderMethod;

  public static io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUrlBuilder,
      dialog.MediaAndFilesOuterClass.ResponseGetFileUrlBuilder> getGetFileUrlBuilderMethod() {
    io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUrlBuilder, dialog.MediaAndFilesOuterClass.ResponseGetFileUrlBuilder> getGetFileUrlBuilderMethod;
    if ((getGetFileUrlBuilderMethod = MediaAndFilesGrpc.getGetFileUrlBuilderMethod) == null) {
      synchronized (MediaAndFilesGrpc.class) {
        if ((getGetFileUrlBuilderMethod = MediaAndFilesGrpc.getGetFileUrlBuilderMethod) == null) {
          MediaAndFilesGrpc.getGetFileUrlBuilderMethod = getGetFileUrlBuilderMethod = 
              io.grpc.MethodDescriptor.<dialog.MediaAndFilesOuterClass.RequestGetFileUrlBuilder, dialog.MediaAndFilesOuterClass.ResponseGetFileUrlBuilder>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.MediaAndFiles", "GetFileUrlBuilder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MediaAndFilesOuterClass.RequestGetFileUrlBuilder.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MediaAndFilesOuterClass.ResponseGetFileUrlBuilder.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaAndFilesMethodDescriptorSupplier("GetFileUrlBuilder"))
                  .build();
          }
        }
     }
     return getGetFileUrlBuilderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUploadUrl,
      dialog.MediaAndFilesOuterClass.ResponseGetFileUploadUrl> getGetFileUploadUrlMethod;

  public static io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUploadUrl,
      dialog.MediaAndFilesOuterClass.ResponseGetFileUploadUrl> getGetFileUploadUrlMethod() {
    io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUploadUrl, dialog.MediaAndFilesOuterClass.ResponseGetFileUploadUrl> getGetFileUploadUrlMethod;
    if ((getGetFileUploadUrlMethod = MediaAndFilesGrpc.getGetFileUploadUrlMethod) == null) {
      synchronized (MediaAndFilesGrpc.class) {
        if ((getGetFileUploadUrlMethod = MediaAndFilesGrpc.getGetFileUploadUrlMethod) == null) {
          MediaAndFilesGrpc.getGetFileUploadUrlMethod = getGetFileUploadUrlMethod = 
              io.grpc.MethodDescriptor.<dialog.MediaAndFilesOuterClass.RequestGetFileUploadUrl, dialog.MediaAndFilesOuterClass.ResponseGetFileUploadUrl>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.MediaAndFiles", "GetFileUploadUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MediaAndFilesOuterClass.RequestGetFileUploadUrl.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MediaAndFilesOuterClass.ResponseGetFileUploadUrl.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaAndFilesMethodDescriptorSupplier("GetFileUploadUrl"))
                  .build();
          }
        }
     }
     return getGetFileUploadUrlMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestCommitFileUpload,
      dialog.MediaAndFilesOuterClass.ResponseCommitFileUpload> getCommitFileUploadMethod;

  public static io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestCommitFileUpload,
      dialog.MediaAndFilesOuterClass.ResponseCommitFileUpload> getCommitFileUploadMethod() {
    io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestCommitFileUpload, dialog.MediaAndFilesOuterClass.ResponseCommitFileUpload> getCommitFileUploadMethod;
    if ((getCommitFileUploadMethod = MediaAndFilesGrpc.getCommitFileUploadMethod) == null) {
      synchronized (MediaAndFilesGrpc.class) {
        if ((getCommitFileUploadMethod = MediaAndFilesGrpc.getCommitFileUploadMethod) == null) {
          MediaAndFilesGrpc.getCommitFileUploadMethod = getCommitFileUploadMethod = 
              io.grpc.MethodDescriptor.<dialog.MediaAndFilesOuterClass.RequestCommitFileUpload, dialog.MediaAndFilesOuterClass.ResponseCommitFileUpload>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.MediaAndFiles", "CommitFileUpload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MediaAndFilesOuterClass.RequestCommitFileUpload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MediaAndFilesOuterClass.ResponseCommitFileUpload.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaAndFilesMethodDescriptorSupplier("CommitFileUpload"))
                  .build();
          }
        }
     }
     return getCommitFileUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUploadPartUrl,
      dialog.MediaAndFilesOuterClass.ResponseGetFileUploadPartUrl> getGetFileUploadPartUrlMethod;

  public static io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUploadPartUrl,
      dialog.MediaAndFilesOuterClass.ResponseGetFileUploadPartUrl> getGetFileUploadPartUrlMethod() {
    io.grpc.MethodDescriptor<dialog.MediaAndFilesOuterClass.RequestGetFileUploadPartUrl, dialog.MediaAndFilesOuterClass.ResponseGetFileUploadPartUrl> getGetFileUploadPartUrlMethod;
    if ((getGetFileUploadPartUrlMethod = MediaAndFilesGrpc.getGetFileUploadPartUrlMethod) == null) {
      synchronized (MediaAndFilesGrpc.class) {
        if ((getGetFileUploadPartUrlMethod = MediaAndFilesGrpc.getGetFileUploadPartUrlMethod) == null) {
          MediaAndFilesGrpc.getGetFileUploadPartUrlMethod = getGetFileUploadPartUrlMethod = 
              io.grpc.MethodDescriptor.<dialog.MediaAndFilesOuterClass.RequestGetFileUploadPartUrl, dialog.MediaAndFilesOuterClass.ResponseGetFileUploadPartUrl>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.MediaAndFiles", "GetFileUploadPartUrl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MediaAndFilesOuterClass.RequestGetFileUploadPartUrl.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.MediaAndFilesOuterClass.ResponseGetFileUploadPartUrl.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaAndFilesMethodDescriptorSupplier("GetFileUploadPartUrl"))
                  .build();
          }
        }
     }
     return getGetFileUploadPartUrlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MediaAndFilesStub newStub(io.grpc.Channel channel) {
    return new MediaAndFilesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MediaAndFilesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MediaAndFilesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MediaAndFilesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MediaAndFilesFutureStub(channel);
  }

  /**
   */
  public static abstract class MediaAndFilesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFileUrl(dialog.MediaAndFilesOuterClass.RequestGetFileUrl request,
        io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUrl> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileUrlMethod(), responseObserver);
    }

    /**
     */
    public void getFileUrls(dialog.MediaAndFilesOuterClass.RequestGetFileUrls request,
        io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUrls> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileUrlsMethod(), responseObserver);
    }

    /**
     */
    public void getFileUrlBuilder(dialog.MediaAndFilesOuterClass.RequestGetFileUrlBuilder request,
        io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUrlBuilder> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileUrlBuilderMethod(), responseObserver);
    }

    /**
     */
    public void getFileUploadUrl(dialog.MediaAndFilesOuterClass.RequestGetFileUploadUrl request,
        io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUploadUrl> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileUploadUrlMethod(), responseObserver);
    }

    /**
     */
    public void commitFileUpload(dialog.MediaAndFilesOuterClass.RequestCommitFileUpload request,
        io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseCommitFileUpload> responseObserver) {
      asyncUnimplementedUnaryCall(getCommitFileUploadMethod(), responseObserver);
    }

    /**
     */
    public void getFileUploadPartUrl(dialog.MediaAndFilesOuterClass.RequestGetFileUploadPartUrl request,
        io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUploadPartUrl> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFileUploadPartUrlMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFileUrlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MediaAndFilesOuterClass.RequestGetFileUrl,
                dialog.MediaAndFilesOuterClass.ResponseGetFileUrl>(
                  this, METHODID_GET_FILE_URL)))
          .addMethod(
            getGetFileUrlsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MediaAndFilesOuterClass.RequestGetFileUrls,
                dialog.MediaAndFilesOuterClass.ResponseGetFileUrls>(
                  this, METHODID_GET_FILE_URLS)))
          .addMethod(
            getGetFileUrlBuilderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MediaAndFilesOuterClass.RequestGetFileUrlBuilder,
                dialog.MediaAndFilesOuterClass.ResponseGetFileUrlBuilder>(
                  this, METHODID_GET_FILE_URL_BUILDER)))
          .addMethod(
            getGetFileUploadUrlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MediaAndFilesOuterClass.RequestGetFileUploadUrl,
                dialog.MediaAndFilesOuterClass.ResponseGetFileUploadUrl>(
                  this, METHODID_GET_FILE_UPLOAD_URL)))
          .addMethod(
            getCommitFileUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MediaAndFilesOuterClass.RequestCommitFileUpload,
                dialog.MediaAndFilesOuterClass.ResponseCommitFileUpload>(
                  this, METHODID_COMMIT_FILE_UPLOAD)))
          .addMethod(
            getGetFileUploadPartUrlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.MediaAndFilesOuterClass.RequestGetFileUploadPartUrl,
                dialog.MediaAndFilesOuterClass.ResponseGetFileUploadPartUrl>(
                  this, METHODID_GET_FILE_UPLOAD_PART_URL)))
          .build();
    }
  }

  /**
   */
  public static final class MediaAndFilesStub extends io.grpc.stub.AbstractStub<MediaAndFilesStub> {
    private MediaAndFilesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MediaAndFilesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaAndFilesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MediaAndFilesStub(channel, callOptions);
    }

    /**
     */
    public void getFileUrl(dialog.MediaAndFilesOuterClass.RequestGetFileUrl request,
        io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUrl> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFileUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFileUrls(dialog.MediaAndFilesOuterClass.RequestGetFileUrls request,
        io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUrls> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFileUrlsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFileUrlBuilder(dialog.MediaAndFilesOuterClass.RequestGetFileUrlBuilder request,
        io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUrlBuilder> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFileUrlBuilderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFileUploadUrl(dialog.MediaAndFilesOuterClass.RequestGetFileUploadUrl request,
        io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUploadUrl> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFileUploadUrlMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commitFileUpload(dialog.MediaAndFilesOuterClass.RequestCommitFileUpload request,
        io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseCommitFileUpload> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommitFileUploadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFileUploadPartUrl(dialog.MediaAndFilesOuterClass.RequestGetFileUploadPartUrl request,
        io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUploadPartUrl> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFileUploadPartUrlMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MediaAndFilesBlockingStub extends io.grpc.stub.AbstractStub<MediaAndFilesBlockingStub> {
    private MediaAndFilesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MediaAndFilesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaAndFilesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MediaAndFilesBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.MediaAndFilesOuterClass.ResponseGetFileUrl getFileUrl(dialog.MediaAndFilesOuterClass.RequestGetFileUrl request) {
      return blockingUnaryCall(
          getChannel(), getGetFileUrlMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MediaAndFilesOuterClass.ResponseGetFileUrls getFileUrls(dialog.MediaAndFilesOuterClass.RequestGetFileUrls request) {
      return blockingUnaryCall(
          getChannel(), getGetFileUrlsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MediaAndFilesOuterClass.ResponseGetFileUrlBuilder getFileUrlBuilder(dialog.MediaAndFilesOuterClass.RequestGetFileUrlBuilder request) {
      return blockingUnaryCall(
          getChannel(), getGetFileUrlBuilderMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MediaAndFilesOuterClass.ResponseGetFileUploadUrl getFileUploadUrl(dialog.MediaAndFilesOuterClass.RequestGetFileUploadUrl request) {
      return blockingUnaryCall(
          getChannel(), getGetFileUploadUrlMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MediaAndFilesOuterClass.ResponseCommitFileUpload commitFileUpload(dialog.MediaAndFilesOuterClass.RequestCommitFileUpload request) {
      return blockingUnaryCall(
          getChannel(), getCommitFileUploadMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.MediaAndFilesOuterClass.ResponseGetFileUploadPartUrl getFileUploadPartUrl(dialog.MediaAndFilesOuterClass.RequestGetFileUploadPartUrl request) {
      return blockingUnaryCall(
          getChannel(), getGetFileUploadPartUrlMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MediaAndFilesFutureStub extends io.grpc.stub.AbstractStub<MediaAndFilesFutureStub> {
    private MediaAndFilesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MediaAndFilesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaAndFilesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MediaAndFilesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MediaAndFilesOuterClass.ResponseGetFileUrl> getFileUrl(
        dialog.MediaAndFilesOuterClass.RequestGetFileUrl request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFileUrlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MediaAndFilesOuterClass.ResponseGetFileUrls> getFileUrls(
        dialog.MediaAndFilesOuterClass.RequestGetFileUrls request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFileUrlsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MediaAndFilesOuterClass.ResponseGetFileUrlBuilder> getFileUrlBuilder(
        dialog.MediaAndFilesOuterClass.RequestGetFileUrlBuilder request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFileUrlBuilderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MediaAndFilesOuterClass.ResponseGetFileUploadUrl> getFileUploadUrl(
        dialog.MediaAndFilesOuterClass.RequestGetFileUploadUrl request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFileUploadUrlMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MediaAndFilesOuterClass.ResponseCommitFileUpload> commitFileUpload(
        dialog.MediaAndFilesOuterClass.RequestCommitFileUpload request) {
      return futureUnaryCall(
          getChannel().newCall(getCommitFileUploadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.MediaAndFilesOuterClass.ResponseGetFileUploadPartUrl> getFileUploadPartUrl(
        dialog.MediaAndFilesOuterClass.RequestGetFileUploadPartUrl request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFileUploadPartUrlMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FILE_URL = 0;
  private static final int METHODID_GET_FILE_URLS = 1;
  private static final int METHODID_GET_FILE_URL_BUILDER = 2;
  private static final int METHODID_GET_FILE_UPLOAD_URL = 3;
  private static final int METHODID_COMMIT_FILE_UPLOAD = 4;
  private static final int METHODID_GET_FILE_UPLOAD_PART_URL = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MediaAndFilesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MediaAndFilesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FILE_URL:
          serviceImpl.getFileUrl((dialog.MediaAndFilesOuterClass.RequestGetFileUrl) request,
              (io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUrl>) responseObserver);
          break;
        case METHODID_GET_FILE_URLS:
          serviceImpl.getFileUrls((dialog.MediaAndFilesOuterClass.RequestGetFileUrls) request,
              (io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUrls>) responseObserver);
          break;
        case METHODID_GET_FILE_URL_BUILDER:
          serviceImpl.getFileUrlBuilder((dialog.MediaAndFilesOuterClass.RequestGetFileUrlBuilder) request,
              (io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUrlBuilder>) responseObserver);
          break;
        case METHODID_GET_FILE_UPLOAD_URL:
          serviceImpl.getFileUploadUrl((dialog.MediaAndFilesOuterClass.RequestGetFileUploadUrl) request,
              (io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUploadUrl>) responseObserver);
          break;
        case METHODID_COMMIT_FILE_UPLOAD:
          serviceImpl.commitFileUpload((dialog.MediaAndFilesOuterClass.RequestCommitFileUpload) request,
              (io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseCommitFileUpload>) responseObserver);
          break;
        case METHODID_GET_FILE_UPLOAD_PART_URL:
          serviceImpl.getFileUploadPartUrl((dialog.MediaAndFilesOuterClass.RequestGetFileUploadPartUrl) request,
              (io.grpc.stub.StreamObserver<dialog.MediaAndFilesOuterClass.ResponseGetFileUploadPartUrl>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MediaAndFilesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MediaAndFilesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.MediaAndFilesOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MediaAndFiles");
    }
  }

  private static final class MediaAndFilesFileDescriptorSupplier
      extends MediaAndFilesBaseDescriptorSupplier {
    MediaAndFilesFileDescriptorSupplier() {}
  }

  private static final class MediaAndFilesMethodDescriptorSupplier
      extends MediaAndFilesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MediaAndFilesMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MediaAndFilesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MediaAndFilesFileDescriptorSupplier())
              .addMethod(getGetFileUrlMethod())
              .addMethod(getGetFileUrlsMethod())
              .addMethod(getGetFileUrlBuilderMethod())
              .addMethod(getGetFileUploadUrlMethod())
              .addMethod(getCommitFileUploadMethod())
              .addMethod(getGetFileUploadPartUrlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
