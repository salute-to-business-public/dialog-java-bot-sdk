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
    comments = "Source: obsolete.proto")
public final class ObsoleteGrpc {

  private ObsoleteGrpc() {}

  public static final String SERVICE_NAME = "dialog.Obsolete";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.BytesValue,
      com.google.protobuf.BytesValue> getObsoleteMethod;

  public static io.grpc.MethodDescriptor<com.google.protobuf.BytesValue,
      com.google.protobuf.BytesValue> getObsoleteMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.BytesValue, com.google.protobuf.BytesValue> getObsoleteMethod;
    if ((getObsoleteMethod = ObsoleteGrpc.getObsoleteMethod) == null) {
      synchronized (ObsoleteGrpc.class) {
        if ((getObsoleteMethod = ObsoleteGrpc.getObsoleteMethod) == null) {
          ObsoleteGrpc.getObsoleteMethod = getObsoleteMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.BytesValue, com.google.protobuf.BytesValue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Obsolete", "Obsolete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BytesValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.BytesValue.getDefaultInstance()))
                  .setSchemaDescriptor(new ObsoleteMethodDescriptorSupplier("Obsolete"))
                  .build();
          }
        }
     }
     return getObsoleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      dialog.ObsoleteOuterClass.ObsoleteSeqUpdateBox> getSeqUpdatesMethod;

  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      dialog.ObsoleteOuterClass.ObsoleteSeqUpdateBox> getSeqUpdatesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, dialog.ObsoleteOuterClass.ObsoleteSeqUpdateBox> getSeqUpdatesMethod;
    if ((getSeqUpdatesMethod = ObsoleteGrpc.getSeqUpdatesMethod) == null) {
      synchronized (ObsoleteGrpc.class) {
        if ((getSeqUpdatesMethod = ObsoleteGrpc.getSeqUpdatesMethod) == null) {
          ObsoleteGrpc.getSeqUpdatesMethod = getSeqUpdatesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, dialog.ObsoleteOuterClass.ObsoleteSeqUpdateBox>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Obsolete", "SeqUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ObsoleteOuterClass.ObsoleteSeqUpdateBox.getDefaultInstance()))
                  .setSchemaDescriptor(new ObsoleteMethodDescriptorSupplier("SeqUpdates"))
                  .build();
          }
        }
     }
     return getSeqUpdatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ObsoleteOuterClass.ObsoleteWeakUpdateCommand,
      dialog.ObsoleteOuterClass.ObsoleteWeakUpdateBox> getWeakUpdatesMethod;

  public static io.grpc.MethodDescriptor<dialog.ObsoleteOuterClass.ObsoleteWeakUpdateCommand,
      dialog.ObsoleteOuterClass.ObsoleteWeakUpdateBox> getWeakUpdatesMethod() {
    io.grpc.MethodDescriptor<dialog.ObsoleteOuterClass.ObsoleteWeakUpdateCommand, dialog.ObsoleteOuterClass.ObsoleteWeakUpdateBox> getWeakUpdatesMethod;
    if ((getWeakUpdatesMethod = ObsoleteGrpc.getWeakUpdatesMethod) == null) {
      synchronized (ObsoleteGrpc.class) {
        if ((getWeakUpdatesMethod = ObsoleteGrpc.getWeakUpdatesMethod) == null) {
          ObsoleteGrpc.getWeakUpdatesMethod = getWeakUpdatesMethod = 
              io.grpc.MethodDescriptor.<dialog.ObsoleteOuterClass.ObsoleteWeakUpdateCommand, dialog.ObsoleteOuterClass.ObsoleteWeakUpdateBox>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Obsolete", "WeakUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ObsoleteOuterClass.ObsoleteWeakUpdateCommand.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ObsoleteOuterClass.ObsoleteWeakUpdateBox.getDefaultInstance()))
                  .setSchemaDescriptor(new ObsoleteMethodDescriptorSupplier("WeakUpdates"))
                  .build();
          }
        }
     }
     return getWeakUpdatesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ObsoleteStub newStub(io.grpc.Channel channel) {
    return new ObsoleteStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ObsoleteBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ObsoleteBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ObsoleteFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ObsoleteFutureStub(channel);
  }

  /**
   */
  public static abstract class ObsoleteImplBase implements io.grpc.BindableService {

    /**
     */
    public void obsolete(com.google.protobuf.BytesValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BytesValue> responseObserver) {
      asyncUnimplementedUnaryCall(getObsoleteMethod(), responseObserver);
    }

    /**
     */
    public void seqUpdates(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<dialog.ObsoleteOuterClass.ObsoleteSeqUpdateBox> responseObserver) {
      asyncUnimplementedUnaryCall(getSeqUpdatesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<dialog.ObsoleteOuterClass.ObsoleteWeakUpdateCommand> weakUpdates(
        io.grpc.stub.StreamObserver<dialog.ObsoleteOuterClass.ObsoleteWeakUpdateBox> responseObserver) {
      return asyncUnimplementedStreamingCall(getWeakUpdatesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getObsoleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.BytesValue,
                com.google.protobuf.BytesValue>(
                  this, METHODID_OBSOLETE)))
          .addMethod(
            getSeqUpdatesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                dialog.ObsoleteOuterClass.ObsoleteSeqUpdateBox>(
                  this, METHODID_SEQ_UPDATES)))
          .addMethod(
            getWeakUpdatesMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                dialog.ObsoleteOuterClass.ObsoleteWeakUpdateCommand,
                dialog.ObsoleteOuterClass.ObsoleteWeakUpdateBox>(
                  this, METHODID_WEAK_UPDATES)))
          .build();
    }
  }

  /**
   */
  public static final class ObsoleteStub extends io.grpc.stub.AbstractStub<ObsoleteStub> {
    private ObsoleteStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ObsoleteStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObsoleteStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ObsoleteStub(channel, callOptions);
    }

    /**
     */
    public void obsolete(com.google.protobuf.BytesValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.BytesValue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getObsoleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void seqUpdates(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<dialog.ObsoleteOuterClass.ObsoleteSeqUpdateBox> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSeqUpdatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<dialog.ObsoleteOuterClass.ObsoleteWeakUpdateCommand> weakUpdates(
        io.grpc.stub.StreamObserver<dialog.ObsoleteOuterClass.ObsoleteWeakUpdateBox> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getWeakUpdatesMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ObsoleteBlockingStub extends io.grpc.stub.AbstractStub<ObsoleteBlockingStub> {
    private ObsoleteBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ObsoleteBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObsoleteBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ObsoleteBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.BytesValue obsolete(com.google.protobuf.BytesValue request) {
      return blockingUnaryCall(
          getChannel(), getObsoleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<dialog.ObsoleteOuterClass.ObsoleteSeqUpdateBox> seqUpdates(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getSeqUpdatesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ObsoleteFutureStub extends io.grpc.stub.AbstractStub<ObsoleteFutureStub> {
    private ObsoleteFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ObsoleteFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObsoleteFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ObsoleteFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.BytesValue> obsolete(
        com.google.protobuf.BytesValue request) {
      return futureUnaryCall(
          getChannel().newCall(getObsoleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_OBSOLETE = 0;
  private static final int METHODID_SEQ_UPDATES = 1;
  private static final int METHODID_WEAK_UPDATES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ObsoleteImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ObsoleteImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_OBSOLETE:
          serviceImpl.obsolete((com.google.protobuf.BytesValue) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.BytesValue>) responseObserver);
          break;
        case METHODID_SEQ_UPDATES:
          serviceImpl.seqUpdates((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<dialog.ObsoleteOuterClass.ObsoleteSeqUpdateBox>) responseObserver);
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
        case METHODID_WEAK_UPDATES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.weakUpdates(
              (io.grpc.stub.StreamObserver<dialog.ObsoleteOuterClass.ObsoleteWeakUpdateBox>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ObsoleteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ObsoleteBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.ObsoleteOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Obsolete");
    }
  }

  private static final class ObsoleteFileDescriptorSupplier
      extends ObsoleteBaseDescriptorSupplier {
    ObsoleteFileDescriptorSupplier() {}
  }

  private static final class ObsoleteMethodDescriptorSupplier
      extends ObsoleteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ObsoleteMethodDescriptorSupplier(String methodName) {
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
      synchronized (ObsoleteGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ObsoleteFileDescriptorSupplier())
              .addMethod(getObsoleteMethod())
              .addMethod(getSeqUpdatesMethod())
              .addMethod(getWeakUpdatesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
