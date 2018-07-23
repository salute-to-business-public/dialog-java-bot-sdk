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
    comments = "Source: sequence_and_updates.proto")
public final class SequenceAndUpdatesGrpc {

  private SequenceAndUpdatesGrpc() {}

  public static final String SERVICE_NAME = "dialog.SequenceAndUpdates";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestGetState,
      dialog.Miscellaneous.ResponseSeq> getGetStateMethod;

  public static io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestGetState,
      dialog.Miscellaneous.ResponseSeq> getGetStateMethod() {
    io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestGetState, dialog.Miscellaneous.ResponseSeq> getGetStateMethod;
    if ((getGetStateMethod = SequenceAndUpdatesGrpc.getGetStateMethod) == null) {
      synchronized (SequenceAndUpdatesGrpc.class) {
        if ((getGetStateMethod = SequenceAndUpdatesGrpc.getGetStateMethod) == null) {
          SequenceAndUpdatesGrpc.getGetStateMethod = getGetStateMethod = 
              io.grpc.MethodDescriptor.<dialog.SequenceAndUpdatesOuterClass.RequestGetState, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.SequenceAndUpdates", "GetState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SequenceAndUpdatesOuterClass.RequestGetState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new SequenceAndUpdatesMethodDescriptorSupplier("GetState"))
                  .build();
          }
        }
     }
     return getGetStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestGetDifference,
      dialog.SequenceAndUpdatesOuterClass.ResponseGetDifference> getGetDifferenceMethod;

  public static io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestGetDifference,
      dialog.SequenceAndUpdatesOuterClass.ResponseGetDifference> getGetDifferenceMethod() {
    io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestGetDifference, dialog.SequenceAndUpdatesOuterClass.ResponseGetDifference> getGetDifferenceMethod;
    if ((getGetDifferenceMethod = SequenceAndUpdatesGrpc.getGetDifferenceMethod) == null) {
      synchronized (SequenceAndUpdatesGrpc.class) {
        if ((getGetDifferenceMethod = SequenceAndUpdatesGrpc.getGetDifferenceMethod) == null) {
          SequenceAndUpdatesGrpc.getGetDifferenceMethod = getGetDifferenceMethod = 
              io.grpc.MethodDescriptor.<dialog.SequenceAndUpdatesOuterClass.RequestGetDifference, dialog.SequenceAndUpdatesOuterClass.ResponseGetDifference>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.SequenceAndUpdates", "GetDifference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SequenceAndUpdatesOuterClass.RequestGetDifference.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SequenceAndUpdatesOuterClass.ResponseGetDifference.getDefaultInstance()))
                  .setSchemaDescriptor(new SequenceAndUpdatesMethodDescriptorSupplier("GetDifference"))
                  .build();
          }
        }
     }
     return getGetDifferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestGetDialogsDifference,
      dialog.SequenceAndUpdatesOuterClass.ResponseGetDialogsDifference> getGetDialogsDifferenceMethod;

  public static io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestGetDialogsDifference,
      dialog.SequenceAndUpdatesOuterClass.ResponseGetDialogsDifference> getGetDialogsDifferenceMethod() {
    io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestGetDialogsDifference, dialog.SequenceAndUpdatesOuterClass.ResponseGetDialogsDifference> getGetDialogsDifferenceMethod;
    if ((getGetDialogsDifferenceMethod = SequenceAndUpdatesGrpc.getGetDialogsDifferenceMethod) == null) {
      synchronized (SequenceAndUpdatesGrpc.class) {
        if ((getGetDialogsDifferenceMethod = SequenceAndUpdatesGrpc.getGetDialogsDifferenceMethod) == null) {
          SequenceAndUpdatesGrpc.getGetDialogsDifferenceMethod = getGetDialogsDifferenceMethod = 
              io.grpc.MethodDescriptor.<dialog.SequenceAndUpdatesOuterClass.RequestGetDialogsDifference, dialog.SequenceAndUpdatesOuterClass.ResponseGetDialogsDifference>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.SequenceAndUpdates", "GetDialogsDifference"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SequenceAndUpdatesOuterClass.RequestGetDialogsDifference.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SequenceAndUpdatesOuterClass.ResponseGetDialogsDifference.getDefaultInstance()))
                  .setSchemaDescriptor(new SequenceAndUpdatesMethodDescriptorSupplier("GetDialogsDifference"))
                  .build();
          }
        }
     }
     return getGetDialogsDifferenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites,
      dialog.SequenceAndUpdatesOuterClass.ResponseGetReferencedEntitites> getGetReferencedEntititesMethod;

  public static io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites,
      dialog.SequenceAndUpdatesOuterClass.ResponseGetReferencedEntitites> getGetReferencedEntititesMethod() {
    io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites, dialog.SequenceAndUpdatesOuterClass.ResponseGetReferencedEntitites> getGetReferencedEntititesMethod;
    if ((getGetReferencedEntititesMethod = SequenceAndUpdatesGrpc.getGetReferencedEntititesMethod) == null) {
      synchronized (SequenceAndUpdatesGrpc.class) {
        if ((getGetReferencedEntititesMethod = SequenceAndUpdatesGrpc.getGetReferencedEntititesMethod) == null) {
          SequenceAndUpdatesGrpc.getGetReferencedEntititesMethod = getGetReferencedEntititesMethod = 
              io.grpc.MethodDescriptor.<dialog.SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites, dialog.SequenceAndUpdatesOuterClass.ResponseGetReferencedEntitites>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.SequenceAndUpdates", "GetReferencedEntitites"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SequenceAndUpdatesOuterClass.ResponseGetReferencedEntitites.getDefaultInstance()))
                  .setSchemaDescriptor(new SequenceAndUpdatesMethodDescriptorSupplier("GetReferencedEntitites"))
                  .build();
          }
        }
     }
     return getGetReferencedEntititesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToOnline,
      dialog.Miscellaneous.ResponseVoid> getSubscribeToOnlineMethod;

  public static io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToOnline,
      dialog.Miscellaneous.ResponseVoid> getSubscribeToOnlineMethod() {
    io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToOnline, dialog.Miscellaneous.ResponseVoid> getSubscribeToOnlineMethod;
    if ((getSubscribeToOnlineMethod = SequenceAndUpdatesGrpc.getSubscribeToOnlineMethod) == null) {
      synchronized (SequenceAndUpdatesGrpc.class) {
        if ((getSubscribeToOnlineMethod = SequenceAndUpdatesGrpc.getSubscribeToOnlineMethod) == null) {
          SequenceAndUpdatesGrpc.getSubscribeToOnlineMethod = getSubscribeToOnlineMethod = 
              io.grpc.MethodDescriptor.<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToOnline, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.SequenceAndUpdates", "SubscribeToOnline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToOnline.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new SequenceAndUpdatesMethodDescriptorSupplier("SubscribeToOnline"))
                  .build();
          }
        }
     }
     return getSubscribeToOnlineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromOnline,
      dialog.Miscellaneous.ResponseVoid> getSubscribeFromOnlineMethod;

  public static io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromOnline,
      dialog.Miscellaneous.ResponseVoid> getSubscribeFromOnlineMethod() {
    io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromOnline, dialog.Miscellaneous.ResponseVoid> getSubscribeFromOnlineMethod;
    if ((getSubscribeFromOnlineMethod = SequenceAndUpdatesGrpc.getSubscribeFromOnlineMethod) == null) {
      synchronized (SequenceAndUpdatesGrpc.class) {
        if ((getSubscribeFromOnlineMethod = SequenceAndUpdatesGrpc.getSubscribeFromOnlineMethod) == null) {
          SequenceAndUpdatesGrpc.getSubscribeFromOnlineMethod = getSubscribeFromOnlineMethod = 
              io.grpc.MethodDescriptor.<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromOnline, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.SequenceAndUpdates", "SubscribeFromOnline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromOnline.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new SequenceAndUpdatesMethodDescriptorSupplier("SubscribeFromOnline"))
                  .build();
          }
        }
     }
     return getSubscribeFromOnlineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToGroupOnline,
      dialog.Miscellaneous.ResponseVoid> getSubscribeToGroupOnlineMethod;

  public static io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToGroupOnline,
      dialog.Miscellaneous.ResponseVoid> getSubscribeToGroupOnlineMethod() {
    io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToGroupOnline, dialog.Miscellaneous.ResponseVoid> getSubscribeToGroupOnlineMethod;
    if ((getSubscribeToGroupOnlineMethod = SequenceAndUpdatesGrpc.getSubscribeToGroupOnlineMethod) == null) {
      synchronized (SequenceAndUpdatesGrpc.class) {
        if ((getSubscribeToGroupOnlineMethod = SequenceAndUpdatesGrpc.getSubscribeToGroupOnlineMethod) == null) {
          SequenceAndUpdatesGrpc.getSubscribeToGroupOnlineMethod = getSubscribeToGroupOnlineMethod = 
              io.grpc.MethodDescriptor.<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToGroupOnline, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.SequenceAndUpdates", "SubscribeToGroupOnline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToGroupOnline.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new SequenceAndUpdatesMethodDescriptorSupplier("SubscribeToGroupOnline"))
                  .build();
          }
        }
     }
     return getSubscribeToGroupOnlineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromGroupOnline,
      dialog.Miscellaneous.ResponseVoid> getSubscribeFromGroupOnlineMethod;

  public static io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromGroupOnline,
      dialog.Miscellaneous.ResponseVoid> getSubscribeFromGroupOnlineMethod() {
    io.grpc.MethodDescriptor<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromGroupOnline, dialog.Miscellaneous.ResponseVoid> getSubscribeFromGroupOnlineMethod;
    if ((getSubscribeFromGroupOnlineMethod = SequenceAndUpdatesGrpc.getSubscribeFromGroupOnlineMethod) == null) {
      synchronized (SequenceAndUpdatesGrpc.class) {
        if ((getSubscribeFromGroupOnlineMethod = SequenceAndUpdatesGrpc.getSubscribeFromGroupOnlineMethod) == null) {
          SequenceAndUpdatesGrpc.getSubscribeFromGroupOnlineMethod = getSubscribeFromGroupOnlineMethod = 
              io.grpc.MethodDescriptor.<dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromGroupOnline, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.SequenceAndUpdates", "SubscribeFromGroupOnline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromGroupOnline.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new SequenceAndUpdatesMethodDescriptorSupplier("SubscribeFromGroupOnline"))
                  .build();
          }
        }
     }
     return getSubscribeFromGroupOnlineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      dialog.SequenceAndUpdatesOuterClass.SeqUpdateBox> getSeqUpdatesMethod;

  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      dialog.SequenceAndUpdatesOuterClass.SeqUpdateBox> getSeqUpdatesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, dialog.SequenceAndUpdatesOuterClass.SeqUpdateBox> getSeqUpdatesMethod;
    if ((getSeqUpdatesMethod = SequenceAndUpdatesGrpc.getSeqUpdatesMethod) == null) {
      synchronized (SequenceAndUpdatesGrpc.class) {
        if ((getSeqUpdatesMethod = SequenceAndUpdatesGrpc.getSeqUpdatesMethod) == null) {
          SequenceAndUpdatesGrpc.getSeqUpdatesMethod = getSeqUpdatesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, dialog.SequenceAndUpdatesOuterClass.SeqUpdateBox>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "dialog.SequenceAndUpdates", "SeqUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.SequenceAndUpdatesOuterClass.SeqUpdateBox.getDefaultInstance()))
                  .setSchemaDescriptor(new SequenceAndUpdatesMethodDescriptorSupplier("SeqUpdates"))
                  .build();
          }
        }
     }
     return getSeqUpdatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SequenceAndUpdatesStub newStub(io.grpc.Channel channel) {
    return new SequenceAndUpdatesStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SequenceAndUpdatesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SequenceAndUpdatesBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SequenceAndUpdatesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SequenceAndUpdatesFutureStub(channel);
  }

  /**
   */
  public static abstract class SequenceAndUpdatesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getState(dialog.SequenceAndUpdatesOuterClass.RequestGetState request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStateMethod(), responseObserver);
    }

    /**
     */
    public void getDifference(dialog.SequenceAndUpdatesOuterClass.RequestGetDifference request,
        io.grpc.stub.StreamObserver<dialog.SequenceAndUpdatesOuterClass.ResponseGetDifference> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDifferenceMethod(), responseObserver);
    }

    /**
     */
    public void getDialogsDifference(dialog.SequenceAndUpdatesOuterClass.RequestGetDialogsDifference request,
        io.grpc.stub.StreamObserver<dialog.SequenceAndUpdatesOuterClass.ResponseGetDialogsDifference> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDialogsDifferenceMethod(), responseObserver);
    }

    /**
     */
    public void getReferencedEntitites(dialog.SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites request,
        io.grpc.stub.StreamObserver<dialog.SequenceAndUpdatesOuterClass.ResponseGetReferencedEntitites> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReferencedEntititesMethod(), responseObserver);
    }

    /**
     */
    public void subscribeToOnline(dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToOnline request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeToOnlineMethod(), responseObserver);
    }

    /**
     */
    public void subscribeFromOnline(dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromOnline request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeFromOnlineMethod(), responseObserver);
    }

    /**
     */
    public void subscribeToGroupOnline(dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToGroupOnline request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeToGroupOnlineMethod(), responseObserver);
    }

    /**
     */
    public void subscribeFromGroupOnline(dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromGroupOnline request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeFromGroupOnlineMethod(), responseObserver);
    }

    /**
     */
    public void seqUpdates(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<dialog.SequenceAndUpdatesOuterClass.SeqUpdateBox> responseObserver) {
      asyncUnimplementedUnaryCall(getSeqUpdatesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetStateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SequenceAndUpdatesOuterClass.RequestGetState,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_GET_STATE)))
          .addMethod(
            getGetDifferenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SequenceAndUpdatesOuterClass.RequestGetDifference,
                dialog.SequenceAndUpdatesOuterClass.ResponseGetDifference>(
                  this, METHODID_GET_DIFFERENCE)))
          .addMethod(
            getGetDialogsDifferenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SequenceAndUpdatesOuterClass.RequestGetDialogsDifference,
                dialog.SequenceAndUpdatesOuterClass.ResponseGetDialogsDifference>(
                  this, METHODID_GET_DIALOGS_DIFFERENCE)))
          .addMethod(
            getGetReferencedEntititesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites,
                dialog.SequenceAndUpdatesOuterClass.ResponseGetReferencedEntitites>(
                  this, METHODID_GET_REFERENCED_ENTITITES)))
          .addMethod(
            getSubscribeToOnlineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToOnline,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_SUBSCRIBE_TO_ONLINE)))
          .addMethod(
            getSubscribeFromOnlineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromOnline,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_SUBSCRIBE_FROM_ONLINE)))
          .addMethod(
            getSubscribeToGroupOnlineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToGroupOnline,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_SUBSCRIBE_TO_GROUP_ONLINE)))
          .addMethod(
            getSubscribeFromGroupOnlineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromGroupOnline,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_SUBSCRIBE_FROM_GROUP_ONLINE)))
          .addMethod(
            getSeqUpdatesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                dialog.SequenceAndUpdatesOuterClass.SeqUpdateBox>(
                  this, METHODID_SEQ_UPDATES)))
          .build();
    }
  }

  /**
   */
  public static final class SequenceAndUpdatesStub extends io.grpc.stub.AbstractStub<SequenceAndUpdatesStub> {
    private SequenceAndUpdatesStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SequenceAndUpdatesStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SequenceAndUpdatesStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SequenceAndUpdatesStub(channel, callOptions);
    }

    /**
     */
    public void getState(dialog.SequenceAndUpdatesOuterClass.RequestGetState request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDifference(dialog.SequenceAndUpdatesOuterClass.RequestGetDifference request,
        io.grpc.stub.StreamObserver<dialog.SequenceAndUpdatesOuterClass.ResponseGetDifference> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDifferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDialogsDifference(dialog.SequenceAndUpdatesOuterClass.RequestGetDialogsDifference request,
        io.grpc.stub.StreamObserver<dialog.SequenceAndUpdatesOuterClass.ResponseGetDialogsDifference> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDialogsDifferenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReferencedEntitites(dialog.SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites request,
        io.grpc.stub.StreamObserver<dialog.SequenceAndUpdatesOuterClass.ResponseGetReferencedEntitites> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReferencedEntititesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeToOnline(dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToOnline request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscribeToOnlineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeFromOnline(dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromOnline request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscribeFromOnlineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeToGroupOnline(dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToGroupOnline request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscribeToGroupOnlineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribeFromGroupOnline(dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromGroupOnline request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscribeFromGroupOnlineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void seqUpdates(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<dialog.SequenceAndUpdatesOuterClass.SeqUpdateBox> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSeqUpdatesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SequenceAndUpdatesBlockingStub extends io.grpc.stub.AbstractStub<SequenceAndUpdatesBlockingStub> {
    private SequenceAndUpdatesBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SequenceAndUpdatesBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SequenceAndUpdatesBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SequenceAndUpdatesBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq getState(dialog.SequenceAndUpdatesOuterClass.RequestGetState request) {
      return blockingUnaryCall(
          getChannel(), getGetStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.SequenceAndUpdatesOuterClass.ResponseGetDifference getDifference(dialog.SequenceAndUpdatesOuterClass.RequestGetDifference request) {
      return blockingUnaryCall(
          getChannel(), getGetDifferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.SequenceAndUpdatesOuterClass.ResponseGetDialogsDifference getDialogsDifference(dialog.SequenceAndUpdatesOuterClass.RequestGetDialogsDifference request) {
      return blockingUnaryCall(
          getChannel(), getGetDialogsDifferenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.SequenceAndUpdatesOuterClass.ResponseGetReferencedEntitites getReferencedEntitites(dialog.SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites request) {
      return blockingUnaryCall(
          getChannel(), getGetReferencedEntititesMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid subscribeToOnline(dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToOnline request) {
      return blockingUnaryCall(
          getChannel(), getSubscribeToOnlineMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid subscribeFromOnline(dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromOnline request) {
      return blockingUnaryCall(
          getChannel(), getSubscribeFromOnlineMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid subscribeToGroupOnline(dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToGroupOnline request) {
      return blockingUnaryCall(
          getChannel(), getSubscribeToGroupOnlineMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid subscribeFromGroupOnline(dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromGroupOnline request) {
      return blockingUnaryCall(
          getChannel(), getSubscribeFromGroupOnlineMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dialog.SequenceAndUpdatesOuterClass.SeqUpdateBox> seqUpdates(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getSeqUpdatesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SequenceAndUpdatesFutureStub extends io.grpc.stub.AbstractStub<SequenceAndUpdatesFutureStub> {
    private SequenceAndUpdatesFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SequenceAndUpdatesFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SequenceAndUpdatesFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SequenceAndUpdatesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> getState(
        dialog.SequenceAndUpdatesOuterClass.RequestGetState request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.SequenceAndUpdatesOuterClass.ResponseGetDifference> getDifference(
        dialog.SequenceAndUpdatesOuterClass.RequestGetDifference request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDifferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.SequenceAndUpdatesOuterClass.ResponseGetDialogsDifference> getDialogsDifference(
        dialog.SequenceAndUpdatesOuterClass.RequestGetDialogsDifference request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDialogsDifferenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.SequenceAndUpdatesOuterClass.ResponseGetReferencedEntitites> getReferencedEntitites(
        dialog.SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReferencedEntititesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> subscribeToOnline(
        dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToOnline request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscribeToOnlineMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> subscribeFromOnline(
        dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromOnline request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscribeFromOnlineMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> subscribeToGroupOnline(
        dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToGroupOnline request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscribeToGroupOnlineMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> subscribeFromGroupOnline(
        dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromGroupOnline request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscribeFromGroupOnlineMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STATE = 0;
  private static final int METHODID_GET_DIFFERENCE = 1;
  private static final int METHODID_GET_DIALOGS_DIFFERENCE = 2;
  private static final int METHODID_GET_REFERENCED_ENTITITES = 3;
  private static final int METHODID_SUBSCRIBE_TO_ONLINE = 4;
  private static final int METHODID_SUBSCRIBE_FROM_ONLINE = 5;
  private static final int METHODID_SUBSCRIBE_TO_GROUP_ONLINE = 6;
  private static final int METHODID_SUBSCRIBE_FROM_GROUP_ONLINE = 7;
  private static final int METHODID_SEQ_UPDATES = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SequenceAndUpdatesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SequenceAndUpdatesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STATE:
          serviceImpl.getState((dialog.SequenceAndUpdatesOuterClass.RequestGetState) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_GET_DIFFERENCE:
          serviceImpl.getDifference((dialog.SequenceAndUpdatesOuterClass.RequestGetDifference) request,
              (io.grpc.stub.StreamObserver<dialog.SequenceAndUpdatesOuterClass.ResponseGetDifference>) responseObserver);
          break;
        case METHODID_GET_DIALOGS_DIFFERENCE:
          serviceImpl.getDialogsDifference((dialog.SequenceAndUpdatesOuterClass.RequestGetDialogsDifference) request,
              (io.grpc.stub.StreamObserver<dialog.SequenceAndUpdatesOuterClass.ResponseGetDialogsDifference>) responseObserver);
          break;
        case METHODID_GET_REFERENCED_ENTITITES:
          serviceImpl.getReferencedEntitites((dialog.SequenceAndUpdatesOuterClass.RequestGetReferencedEntitites) request,
              (io.grpc.stub.StreamObserver<dialog.SequenceAndUpdatesOuterClass.ResponseGetReferencedEntitites>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_ONLINE:
          serviceImpl.subscribeToOnline((dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToOnline) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_FROM_ONLINE:
          serviceImpl.subscribeFromOnline((dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromOnline) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_TO_GROUP_ONLINE:
          serviceImpl.subscribeToGroupOnline((dialog.SequenceAndUpdatesOuterClass.RequestSubscribeToGroupOnline) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_FROM_GROUP_ONLINE:
          serviceImpl.subscribeFromGroupOnline((dialog.SequenceAndUpdatesOuterClass.RequestSubscribeFromGroupOnline) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_SEQ_UPDATES:
          serviceImpl.seqUpdates((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<dialog.SequenceAndUpdatesOuterClass.SeqUpdateBox>) responseObserver);
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

  private static abstract class SequenceAndUpdatesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SequenceAndUpdatesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.SequenceAndUpdatesOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SequenceAndUpdates");
    }
  }

  private static final class SequenceAndUpdatesFileDescriptorSupplier
      extends SequenceAndUpdatesBaseDescriptorSupplier {
    SequenceAndUpdatesFileDescriptorSupplier() {}
  }

  private static final class SequenceAndUpdatesMethodDescriptorSupplier
      extends SequenceAndUpdatesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SequenceAndUpdatesMethodDescriptorSupplier(String methodName) {
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
      synchronized (SequenceAndUpdatesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SequenceAndUpdatesFileDescriptorSupplier())
              .addMethod(getGetStateMethod())
              .addMethod(getGetDifferenceMethod())
              .addMethod(getGetDialogsDifferenceMethod())
              .addMethod(getGetReferencedEntititesMethod())
              .addMethod(getSubscribeToOnlineMethod())
              .addMethod(getSubscribeFromOnlineMethod())
              .addMethod(getSubscribeToGroupOnlineMethod())
              .addMethod(getSubscribeFromGroupOnlineMethod())
              .addMethod(getSeqUpdatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
