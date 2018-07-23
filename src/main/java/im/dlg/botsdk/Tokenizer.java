package im.dlg.botsdk;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Metadata;
import io.grpc.stub.AbstractStub;
import io.grpc.stub.MetadataUtils;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

class Tokenizer {
    private Metadata meta;
    private DialogExecutor executor;

    public Tokenizer(Metadata meta, DialogExecutor executor) {
        this.meta = meta;
        this.executor = executor;
    }

    <T extends AbstractStub<T>, R> CompletableFuture<R> withToken(T stub, Function<T, ListenableFuture<R>> f) {
        T newStub = MetadataUtils.attachHeaders(stub, meta);
        return executor.convert(f.apply(newStub));
    }
}
