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
    comments = "Source: stickers.proto")
public final class StickersGrpc {

  private StickersGrpc() {}

  public static final String SERVICE_NAME = "dialog.Stickers";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestLoadOwnStickers,
      dialog.StickersOuterClass.ResponseLoadOwnStickers> getLoadOwnStickersMethod;

  public static io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestLoadOwnStickers,
      dialog.StickersOuterClass.ResponseLoadOwnStickers> getLoadOwnStickersMethod() {
    io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestLoadOwnStickers, dialog.StickersOuterClass.ResponseLoadOwnStickers> getLoadOwnStickersMethod;
    if ((getLoadOwnStickersMethod = StickersGrpc.getLoadOwnStickersMethod) == null) {
      synchronized (StickersGrpc.class) {
        if ((getLoadOwnStickersMethod = StickersGrpc.getLoadOwnStickersMethod) == null) {
          StickersGrpc.getLoadOwnStickersMethod = getLoadOwnStickersMethod = 
              io.grpc.MethodDescriptor.<dialog.StickersOuterClass.RequestLoadOwnStickers, dialog.StickersOuterClass.ResponseLoadOwnStickers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Stickers", "LoadOwnStickers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.StickersOuterClass.RequestLoadOwnStickers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.StickersOuterClass.ResponseLoadOwnStickers.getDefaultInstance()))
                  .setSchemaDescriptor(new StickersMethodDescriptorSupplier("LoadOwnStickers"))
                  .build();
          }
        }
     }
     return getLoadOwnStickersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestLoadAcesssibleStickers,
      dialog.StickersOuterClass.ResponseLoadAcesssibleStickers> getLoadAcesssibleStickersMethod;

  public static io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestLoadAcesssibleStickers,
      dialog.StickersOuterClass.ResponseLoadAcesssibleStickers> getLoadAcesssibleStickersMethod() {
    io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestLoadAcesssibleStickers, dialog.StickersOuterClass.ResponseLoadAcesssibleStickers> getLoadAcesssibleStickersMethod;
    if ((getLoadAcesssibleStickersMethod = StickersGrpc.getLoadAcesssibleStickersMethod) == null) {
      synchronized (StickersGrpc.class) {
        if ((getLoadAcesssibleStickersMethod = StickersGrpc.getLoadAcesssibleStickersMethod) == null) {
          StickersGrpc.getLoadAcesssibleStickersMethod = getLoadAcesssibleStickersMethod = 
              io.grpc.MethodDescriptor.<dialog.StickersOuterClass.RequestLoadAcesssibleStickers, dialog.StickersOuterClass.ResponseLoadAcesssibleStickers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Stickers", "LoadAcesssibleStickers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.StickersOuterClass.RequestLoadAcesssibleStickers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.StickersOuterClass.ResponseLoadAcesssibleStickers.getDefaultInstance()))
                  .setSchemaDescriptor(new StickersMethodDescriptorSupplier("LoadAcesssibleStickers"))
                  .build();
          }
        }
     }
     return getLoadAcesssibleStickersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestAddStickerPackReference,
      dialog.Miscellaneous.ResponseSeq> getAddStickerPackReferenceMethod;

  public static io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestAddStickerPackReference,
      dialog.Miscellaneous.ResponseSeq> getAddStickerPackReferenceMethod() {
    io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestAddStickerPackReference, dialog.Miscellaneous.ResponseSeq> getAddStickerPackReferenceMethod;
    if ((getAddStickerPackReferenceMethod = StickersGrpc.getAddStickerPackReferenceMethod) == null) {
      synchronized (StickersGrpc.class) {
        if ((getAddStickerPackReferenceMethod = StickersGrpc.getAddStickerPackReferenceMethod) == null) {
          StickersGrpc.getAddStickerPackReferenceMethod = getAddStickerPackReferenceMethod = 
              io.grpc.MethodDescriptor.<dialog.StickersOuterClass.RequestAddStickerPackReference, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Stickers", "AddStickerPackReference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.StickersOuterClass.RequestAddStickerPackReference.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new StickersMethodDescriptorSupplier("AddStickerPackReference"))
                  .build();
          }
        }
     }
     return getAddStickerPackReferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestRemoveStickerPackReference,
      dialog.Miscellaneous.ResponseSeq> getRemoveStickerPackReferenceMethod;

  public static io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestRemoveStickerPackReference,
      dialog.Miscellaneous.ResponseSeq> getRemoveStickerPackReferenceMethod() {
    io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestRemoveStickerPackReference, dialog.Miscellaneous.ResponseSeq> getRemoveStickerPackReferenceMethod;
    if ((getRemoveStickerPackReferenceMethod = StickersGrpc.getRemoveStickerPackReferenceMethod) == null) {
      synchronized (StickersGrpc.class) {
        if ((getRemoveStickerPackReferenceMethod = StickersGrpc.getRemoveStickerPackReferenceMethod) == null) {
          StickersGrpc.getRemoveStickerPackReferenceMethod = getRemoveStickerPackReferenceMethod = 
              io.grpc.MethodDescriptor.<dialog.StickersOuterClass.RequestRemoveStickerPackReference, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Stickers", "RemoveStickerPackReference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.StickersOuterClass.RequestRemoveStickerPackReference.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new StickersMethodDescriptorSupplier("RemoveStickerPackReference"))
                  .build();
          }
        }
     }
     return getRemoveStickerPackReferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestAddStickerCollection,
      dialog.Miscellaneous.ResponseSeq> getAddStickerCollectionMethod;

  public static io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestAddStickerCollection,
      dialog.Miscellaneous.ResponseSeq> getAddStickerCollectionMethod() {
    io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestAddStickerCollection, dialog.Miscellaneous.ResponseSeq> getAddStickerCollectionMethod;
    if ((getAddStickerCollectionMethod = StickersGrpc.getAddStickerCollectionMethod) == null) {
      synchronized (StickersGrpc.class) {
        if ((getAddStickerCollectionMethod = StickersGrpc.getAddStickerCollectionMethod) == null) {
          StickersGrpc.getAddStickerCollectionMethod = getAddStickerCollectionMethod = 
              io.grpc.MethodDescriptor.<dialog.StickersOuterClass.RequestAddStickerCollection, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Stickers", "AddStickerCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.StickersOuterClass.RequestAddStickerCollection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new StickersMethodDescriptorSupplier("AddStickerCollection"))
                  .build();
          }
        }
     }
     return getAddStickerCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestRemoveStickerCollection,
      dialog.Miscellaneous.ResponseSeq> getRemoveStickerCollectionMethod;

  public static io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestRemoveStickerCollection,
      dialog.Miscellaneous.ResponseSeq> getRemoveStickerCollectionMethod() {
    io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestRemoveStickerCollection, dialog.Miscellaneous.ResponseSeq> getRemoveStickerCollectionMethod;
    if ((getRemoveStickerCollectionMethod = StickersGrpc.getRemoveStickerCollectionMethod) == null) {
      synchronized (StickersGrpc.class) {
        if ((getRemoveStickerCollectionMethod = StickersGrpc.getRemoveStickerCollectionMethod) == null) {
          StickersGrpc.getRemoveStickerCollectionMethod = getRemoveStickerCollectionMethod = 
              io.grpc.MethodDescriptor.<dialog.StickersOuterClass.RequestRemoveStickerCollection, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Stickers", "RemoveStickerCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.StickersOuterClass.RequestRemoveStickerCollection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new StickersMethodDescriptorSupplier("RemoveStickerCollection"))
                  .build();
          }
        }
     }
     return getRemoveStickerCollectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestLoadStickerCollection,
      dialog.StickersOuterClass.ResponseLoadStickerCollection> getLoadStickerCollectionMethod;

  public static io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestLoadStickerCollection,
      dialog.StickersOuterClass.ResponseLoadStickerCollection> getLoadStickerCollectionMethod() {
    io.grpc.MethodDescriptor<dialog.StickersOuterClass.RequestLoadStickerCollection, dialog.StickersOuterClass.ResponseLoadStickerCollection> getLoadStickerCollectionMethod;
    if ((getLoadStickerCollectionMethod = StickersGrpc.getLoadStickerCollectionMethod) == null) {
      synchronized (StickersGrpc.class) {
        if ((getLoadStickerCollectionMethod = StickersGrpc.getLoadStickerCollectionMethod) == null) {
          StickersGrpc.getLoadStickerCollectionMethod = getLoadStickerCollectionMethod = 
              io.grpc.MethodDescriptor.<dialog.StickersOuterClass.RequestLoadStickerCollection, dialog.StickersOuterClass.ResponseLoadStickerCollection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Stickers", "LoadStickerCollection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.StickersOuterClass.RequestLoadStickerCollection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.StickersOuterClass.ResponseLoadStickerCollection.getDefaultInstance()))
                  .setSchemaDescriptor(new StickersMethodDescriptorSupplier("LoadStickerCollection"))
                  .build();
          }
        }
     }
     return getLoadStickerCollectionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StickersStub newStub(io.grpc.Channel channel) {
    return new StickersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StickersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StickersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StickersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StickersFutureStub(channel);
  }

  /**
   */
  public static abstract class StickersImplBase implements io.grpc.BindableService {

    /**
     */
    public void loadOwnStickers(dialog.StickersOuterClass.RequestLoadOwnStickers request,
        io.grpc.stub.StreamObserver<dialog.StickersOuterClass.ResponseLoadOwnStickers> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadOwnStickersMethod(), responseObserver);
    }

    /**
     */
    public void loadAcesssibleStickers(dialog.StickersOuterClass.RequestLoadAcesssibleStickers request,
        io.grpc.stub.StreamObserver<dialog.StickersOuterClass.ResponseLoadAcesssibleStickers> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadAcesssibleStickersMethod(), responseObserver);
    }

    /**
     */
    public void addStickerPackReference(dialog.StickersOuterClass.RequestAddStickerPackReference request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getAddStickerPackReferenceMethod(), responseObserver);
    }

    /**
     */
    public void removeStickerPackReference(dialog.StickersOuterClass.RequestRemoveStickerPackReference request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveStickerPackReferenceMethod(), responseObserver);
    }

    /**
     */
    public void addStickerCollection(dialog.StickersOuterClass.RequestAddStickerCollection request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getAddStickerCollectionMethod(), responseObserver);
    }

    /**
     */
    public void removeStickerCollection(dialog.StickersOuterClass.RequestRemoveStickerCollection request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveStickerCollectionMethod(), responseObserver);
    }

    /**
     */
    public void loadStickerCollection(dialog.StickersOuterClass.RequestLoadStickerCollection request,
        io.grpc.stub.StreamObserver<dialog.StickersOuterClass.ResponseLoadStickerCollection> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadStickerCollectionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoadOwnStickersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.StickersOuterClass.RequestLoadOwnStickers,
                dialog.StickersOuterClass.ResponseLoadOwnStickers>(
                  this, METHODID_LOAD_OWN_STICKERS)))
          .addMethod(
            getLoadAcesssibleStickersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.StickersOuterClass.RequestLoadAcesssibleStickers,
                dialog.StickersOuterClass.ResponseLoadAcesssibleStickers>(
                  this, METHODID_LOAD_ACESSSIBLE_STICKERS)))
          .addMethod(
            getAddStickerPackReferenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.StickersOuterClass.RequestAddStickerPackReference,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_ADD_STICKER_PACK_REFERENCE)))
          .addMethod(
            getRemoveStickerPackReferenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.StickersOuterClass.RequestRemoveStickerPackReference,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_REMOVE_STICKER_PACK_REFERENCE)))
          .addMethod(
            getAddStickerCollectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.StickersOuterClass.RequestAddStickerCollection,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_ADD_STICKER_COLLECTION)))
          .addMethod(
            getRemoveStickerCollectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.StickersOuterClass.RequestRemoveStickerCollection,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_REMOVE_STICKER_COLLECTION)))
          .addMethod(
            getLoadStickerCollectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.StickersOuterClass.RequestLoadStickerCollection,
                dialog.StickersOuterClass.ResponseLoadStickerCollection>(
                  this, METHODID_LOAD_STICKER_COLLECTION)))
          .build();
    }
  }

  /**
   */
  public static final class StickersStub extends io.grpc.stub.AbstractStub<StickersStub> {
    private StickersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StickersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StickersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StickersStub(channel, callOptions);
    }

    /**
     */
    public void loadOwnStickers(dialog.StickersOuterClass.RequestLoadOwnStickers request,
        io.grpc.stub.StreamObserver<dialog.StickersOuterClass.ResponseLoadOwnStickers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadOwnStickersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadAcesssibleStickers(dialog.StickersOuterClass.RequestLoadAcesssibleStickers request,
        io.grpc.stub.StreamObserver<dialog.StickersOuterClass.ResponseLoadAcesssibleStickers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadAcesssibleStickersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addStickerPackReference(dialog.StickersOuterClass.RequestAddStickerPackReference request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddStickerPackReferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeStickerPackReference(dialog.StickersOuterClass.RequestRemoveStickerPackReference request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveStickerPackReferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addStickerCollection(dialog.StickersOuterClass.RequestAddStickerCollection request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddStickerCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeStickerCollection(dialog.StickersOuterClass.RequestRemoveStickerCollection request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveStickerCollectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadStickerCollection(dialog.StickersOuterClass.RequestLoadStickerCollection request,
        io.grpc.stub.StreamObserver<dialog.StickersOuterClass.ResponseLoadStickerCollection> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadStickerCollectionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StickersBlockingStub extends io.grpc.stub.AbstractStub<StickersBlockingStub> {
    private StickersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StickersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StickersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StickersBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.StickersOuterClass.ResponseLoadOwnStickers loadOwnStickers(dialog.StickersOuterClass.RequestLoadOwnStickers request) {
      return blockingUnaryCall(
          getChannel(), getLoadOwnStickersMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.StickersOuterClass.ResponseLoadAcesssibleStickers loadAcesssibleStickers(dialog.StickersOuterClass.RequestLoadAcesssibleStickers request) {
      return blockingUnaryCall(
          getChannel(), getLoadAcesssibleStickersMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq addStickerPackReference(dialog.StickersOuterClass.RequestAddStickerPackReference request) {
      return blockingUnaryCall(
          getChannel(), getAddStickerPackReferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq removeStickerPackReference(dialog.StickersOuterClass.RequestRemoveStickerPackReference request) {
      return blockingUnaryCall(
          getChannel(), getRemoveStickerPackReferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq addStickerCollection(dialog.StickersOuterClass.RequestAddStickerCollection request) {
      return blockingUnaryCall(
          getChannel(), getAddStickerCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq removeStickerCollection(dialog.StickersOuterClass.RequestRemoveStickerCollection request) {
      return blockingUnaryCall(
          getChannel(), getRemoveStickerCollectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.StickersOuterClass.ResponseLoadStickerCollection loadStickerCollection(dialog.StickersOuterClass.RequestLoadStickerCollection request) {
      return blockingUnaryCall(
          getChannel(), getLoadStickerCollectionMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StickersFutureStub extends io.grpc.stub.AbstractStub<StickersFutureStub> {
    private StickersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StickersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StickersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StickersFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.StickersOuterClass.ResponseLoadOwnStickers> loadOwnStickers(
        dialog.StickersOuterClass.RequestLoadOwnStickers request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadOwnStickersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.StickersOuterClass.ResponseLoadAcesssibleStickers> loadAcesssibleStickers(
        dialog.StickersOuterClass.RequestLoadAcesssibleStickers request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadAcesssibleStickersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> addStickerPackReference(
        dialog.StickersOuterClass.RequestAddStickerPackReference request) {
      return futureUnaryCall(
          getChannel().newCall(getAddStickerPackReferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> removeStickerPackReference(
        dialog.StickersOuterClass.RequestRemoveStickerPackReference request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveStickerPackReferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> addStickerCollection(
        dialog.StickersOuterClass.RequestAddStickerCollection request) {
      return futureUnaryCall(
          getChannel().newCall(getAddStickerCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> removeStickerCollection(
        dialog.StickersOuterClass.RequestRemoveStickerCollection request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveStickerCollectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.StickersOuterClass.ResponseLoadStickerCollection> loadStickerCollection(
        dialog.StickersOuterClass.RequestLoadStickerCollection request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadStickerCollectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOAD_OWN_STICKERS = 0;
  private static final int METHODID_LOAD_ACESSSIBLE_STICKERS = 1;
  private static final int METHODID_ADD_STICKER_PACK_REFERENCE = 2;
  private static final int METHODID_REMOVE_STICKER_PACK_REFERENCE = 3;
  private static final int METHODID_ADD_STICKER_COLLECTION = 4;
  private static final int METHODID_REMOVE_STICKER_COLLECTION = 5;
  private static final int METHODID_LOAD_STICKER_COLLECTION = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StickersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StickersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOAD_OWN_STICKERS:
          serviceImpl.loadOwnStickers((dialog.StickersOuterClass.RequestLoadOwnStickers) request,
              (io.grpc.stub.StreamObserver<dialog.StickersOuterClass.ResponseLoadOwnStickers>) responseObserver);
          break;
        case METHODID_LOAD_ACESSSIBLE_STICKERS:
          serviceImpl.loadAcesssibleStickers((dialog.StickersOuterClass.RequestLoadAcesssibleStickers) request,
              (io.grpc.stub.StreamObserver<dialog.StickersOuterClass.ResponseLoadAcesssibleStickers>) responseObserver);
          break;
        case METHODID_ADD_STICKER_PACK_REFERENCE:
          serviceImpl.addStickerPackReference((dialog.StickersOuterClass.RequestAddStickerPackReference) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_REMOVE_STICKER_PACK_REFERENCE:
          serviceImpl.removeStickerPackReference((dialog.StickersOuterClass.RequestRemoveStickerPackReference) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_ADD_STICKER_COLLECTION:
          serviceImpl.addStickerCollection((dialog.StickersOuterClass.RequestAddStickerCollection) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_REMOVE_STICKER_COLLECTION:
          serviceImpl.removeStickerCollection((dialog.StickersOuterClass.RequestRemoveStickerCollection) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_LOAD_STICKER_COLLECTION:
          serviceImpl.loadStickerCollection((dialog.StickersOuterClass.RequestLoadStickerCollection) request,
              (io.grpc.stub.StreamObserver<dialog.StickersOuterClass.ResponseLoadStickerCollection>) responseObserver);
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

  private static abstract class StickersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StickersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.StickersOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Stickers");
    }
  }

  private static final class StickersFileDescriptorSupplier
      extends StickersBaseDescriptorSupplier {
    StickersFileDescriptorSupplier() {}
  }

  private static final class StickersMethodDescriptorSupplier
      extends StickersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StickersMethodDescriptorSupplier(String methodName) {
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
      synchronized (StickersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StickersFileDescriptorSupplier())
              .addMethod(getLoadOwnStickersMethod())
              .addMethod(getLoadAcesssibleStickersMethod())
              .addMethod(getAddStickerPackReferenceMethod())
              .addMethod(getRemoveStickerPackReferenceMethod())
              .addMethod(getAddStickerCollectionMethod())
              .addMethod(getRemoveStickerCollectionMethod())
              .addMethod(getLoadStickerCollectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
