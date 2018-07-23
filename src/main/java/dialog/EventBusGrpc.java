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
    comments = "Source: event_bus.proto")
public final class EventBusGrpc {

  private EventBusGrpc() {}

  public static final String SERVICE_NAME = "dialog.EventBus";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.EventBusOuterClass.RequestJoinEventBus,
      dialog.EventBusOuterClass.ResponseJoinEventBus> getJoinEventBusMethod;

  public static io.grpc.MethodDescriptor<dialog.EventBusOuterClass.RequestJoinEventBus,
      dialog.EventBusOuterClass.ResponseJoinEventBus> getJoinEventBusMethod() {
    io.grpc.MethodDescriptor<dialog.EventBusOuterClass.RequestJoinEventBus, dialog.EventBusOuterClass.ResponseJoinEventBus> getJoinEventBusMethod;
    if ((getJoinEventBusMethod = EventBusGrpc.getJoinEventBusMethod) == null) {
      synchronized (EventBusGrpc.class) {
        if ((getJoinEventBusMethod = EventBusGrpc.getJoinEventBusMethod) == null) {
          EventBusGrpc.getJoinEventBusMethod = getJoinEventBusMethod = 
              io.grpc.MethodDescriptor.<dialog.EventBusOuterClass.RequestJoinEventBus, dialog.EventBusOuterClass.ResponseJoinEventBus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.EventBus", "JoinEventBus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.EventBusOuterClass.RequestJoinEventBus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.EventBusOuterClass.ResponseJoinEventBus.getDefaultInstance()))
                  .setSchemaDescriptor(new EventBusMethodDescriptorSupplier("JoinEventBus"))
                  .build();
          }
        }
     }
     return getJoinEventBusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.EventBusOuterClass.RequestKeepAliveEventBus,
      dialog.Miscellaneous.ResponseVoid> getKeepAliveEventBusMethod;

  public static io.grpc.MethodDescriptor<dialog.EventBusOuterClass.RequestKeepAliveEventBus,
      dialog.Miscellaneous.ResponseVoid> getKeepAliveEventBusMethod() {
    io.grpc.MethodDescriptor<dialog.EventBusOuterClass.RequestKeepAliveEventBus, dialog.Miscellaneous.ResponseVoid> getKeepAliveEventBusMethod;
    if ((getKeepAliveEventBusMethod = EventBusGrpc.getKeepAliveEventBusMethod) == null) {
      synchronized (EventBusGrpc.class) {
        if ((getKeepAliveEventBusMethod = EventBusGrpc.getKeepAliveEventBusMethod) == null) {
          EventBusGrpc.getKeepAliveEventBusMethod = getKeepAliveEventBusMethod = 
              io.grpc.MethodDescriptor.<dialog.EventBusOuterClass.RequestKeepAliveEventBus, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.EventBus", "KeepAliveEventBus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.EventBusOuterClass.RequestKeepAliveEventBus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new EventBusMethodDescriptorSupplier("KeepAliveEventBus"))
                  .build();
          }
        }
     }
     return getKeepAliveEventBusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.EventBusOuterClass.RequestPostToEventBus,
      dialog.Miscellaneous.ResponseVoid> getPostToEventBusMethod;

  public static io.grpc.MethodDescriptor<dialog.EventBusOuterClass.RequestPostToEventBus,
      dialog.Miscellaneous.ResponseVoid> getPostToEventBusMethod() {
    io.grpc.MethodDescriptor<dialog.EventBusOuterClass.RequestPostToEventBus, dialog.Miscellaneous.ResponseVoid> getPostToEventBusMethod;
    if ((getPostToEventBusMethod = EventBusGrpc.getPostToEventBusMethod) == null) {
      synchronized (EventBusGrpc.class) {
        if ((getPostToEventBusMethod = EventBusGrpc.getPostToEventBusMethod) == null) {
          EventBusGrpc.getPostToEventBusMethod = getPostToEventBusMethod = 
              io.grpc.MethodDescriptor.<dialog.EventBusOuterClass.RequestPostToEventBus, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.EventBus", "PostToEventBus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.EventBusOuterClass.RequestPostToEventBus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new EventBusMethodDescriptorSupplier("PostToEventBus"))
                  .build();
          }
        }
     }
     return getPostToEventBusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventBusStub newStub(io.grpc.Channel channel) {
    return new EventBusStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventBusBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventBusBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventBusFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventBusFutureStub(channel);
  }

  /**
   */
  public static abstract class EventBusImplBase implements io.grpc.BindableService {

    /**
     */
    public void joinEventBus(dialog.EventBusOuterClass.RequestJoinEventBus request,
        io.grpc.stub.StreamObserver<dialog.EventBusOuterClass.ResponseJoinEventBus> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinEventBusMethod(), responseObserver);
    }

    /**
     */
    public void keepAliveEventBus(dialog.EventBusOuterClass.RequestKeepAliveEventBus request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getKeepAliveEventBusMethod(), responseObserver);
    }

    /**
     */
    public void postToEventBus(dialog.EventBusOuterClass.RequestPostToEventBus request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getPostToEventBusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getJoinEventBusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.EventBusOuterClass.RequestJoinEventBus,
                dialog.EventBusOuterClass.ResponseJoinEventBus>(
                  this, METHODID_JOIN_EVENT_BUS)))
          .addMethod(
            getKeepAliveEventBusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.EventBusOuterClass.RequestKeepAliveEventBus,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_KEEP_ALIVE_EVENT_BUS)))
          .addMethod(
            getPostToEventBusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.EventBusOuterClass.RequestPostToEventBus,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_POST_TO_EVENT_BUS)))
          .build();
    }
  }

  /**
   */
  public static final class EventBusStub extends io.grpc.stub.AbstractStub<EventBusStub> {
    private EventBusStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventBusStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventBusStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventBusStub(channel, callOptions);
    }

    /**
     */
    public void joinEventBus(dialog.EventBusOuterClass.RequestJoinEventBus request,
        io.grpc.stub.StreamObserver<dialog.EventBusOuterClass.ResponseJoinEventBus> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinEventBusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void keepAliveEventBus(dialog.EventBusOuterClass.RequestKeepAliveEventBus request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKeepAliveEventBusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postToEventBus(dialog.EventBusOuterClass.RequestPostToEventBus request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostToEventBusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EventBusBlockingStub extends io.grpc.stub.AbstractStub<EventBusBlockingStub> {
    private EventBusBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventBusBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventBusBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventBusBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.EventBusOuterClass.ResponseJoinEventBus joinEventBus(dialog.EventBusOuterClass.RequestJoinEventBus request) {
      return blockingUnaryCall(
          getChannel(), getJoinEventBusMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid keepAliveEventBus(dialog.EventBusOuterClass.RequestKeepAliveEventBus request) {
      return blockingUnaryCall(
          getChannel(), getKeepAliveEventBusMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid postToEventBus(dialog.EventBusOuterClass.RequestPostToEventBus request) {
      return blockingUnaryCall(
          getChannel(), getPostToEventBusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventBusFutureStub extends io.grpc.stub.AbstractStub<EventBusFutureStub> {
    private EventBusFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventBusFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventBusFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventBusFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.EventBusOuterClass.ResponseJoinEventBus> joinEventBus(
        dialog.EventBusOuterClass.RequestJoinEventBus request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinEventBusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> keepAliveEventBus(
        dialog.EventBusOuterClass.RequestKeepAliveEventBus request) {
      return futureUnaryCall(
          getChannel().newCall(getKeepAliveEventBusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> postToEventBus(
        dialog.EventBusOuterClass.RequestPostToEventBus request) {
      return futureUnaryCall(
          getChannel().newCall(getPostToEventBusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_JOIN_EVENT_BUS = 0;
  private static final int METHODID_KEEP_ALIVE_EVENT_BUS = 1;
  private static final int METHODID_POST_TO_EVENT_BUS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventBusImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventBusImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_JOIN_EVENT_BUS:
          serviceImpl.joinEventBus((dialog.EventBusOuterClass.RequestJoinEventBus) request,
              (io.grpc.stub.StreamObserver<dialog.EventBusOuterClass.ResponseJoinEventBus>) responseObserver);
          break;
        case METHODID_KEEP_ALIVE_EVENT_BUS:
          serviceImpl.keepAliveEventBus((dialog.EventBusOuterClass.RequestKeepAliveEventBus) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_POST_TO_EVENT_BUS:
          serviceImpl.postToEventBus((dialog.EventBusOuterClass.RequestPostToEventBus) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
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

  private static abstract class EventBusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventBusBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.EventBusOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventBus");
    }
  }

  private static final class EventBusFileDescriptorSupplier
      extends EventBusBaseDescriptorSupplier {
    EventBusFileDescriptorSupplier() {}
  }

  private static final class EventBusMethodDescriptorSupplier
      extends EventBusBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventBusMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventBusGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventBusFileDescriptorSupplier())
              .addMethod(getJoinEventBusMethod())
              .addMethod(getKeepAliveEventBusMethod())
              .addMethod(getPostToEventBusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
