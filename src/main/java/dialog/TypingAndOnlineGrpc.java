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
    comments = "Source: typing_and_online.proto")
public final class TypingAndOnlineGrpc {

  private TypingAndOnlineGrpc() {}

  public static final String SERVICE_NAME = "dialog.TypingAndOnline";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestTyping,
      dialog.Miscellaneous.ResponseVoid> getTypingMethod;

  public static io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestTyping,
      dialog.Miscellaneous.ResponseVoid> getTypingMethod() {
    io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestTyping, dialog.Miscellaneous.ResponseVoid> getTypingMethod;
    if ((getTypingMethod = TypingAndOnlineGrpc.getTypingMethod) == null) {
      synchronized (TypingAndOnlineGrpc.class) {
        if ((getTypingMethod = TypingAndOnlineGrpc.getTypingMethod) == null) {
          TypingAndOnlineGrpc.getTypingMethod = getTypingMethod = 
              io.grpc.MethodDescriptor.<dialog.TypingAndOnlineOuterClass.RequestTyping, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.TypingAndOnline", "Typing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.TypingAndOnlineOuterClass.RequestTyping.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new TypingAndOnlineMethodDescriptorSupplier("Typing"))
                  .build();
          }
        }
     }
     return getTypingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestStopTyping,
      dialog.Miscellaneous.ResponseVoid> getStopTypingMethod;

  public static io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestStopTyping,
      dialog.Miscellaneous.ResponseVoid> getStopTypingMethod() {
    io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestStopTyping, dialog.Miscellaneous.ResponseVoid> getStopTypingMethod;
    if ((getStopTypingMethod = TypingAndOnlineGrpc.getStopTypingMethod) == null) {
      synchronized (TypingAndOnlineGrpc.class) {
        if ((getStopTypingMethod = TypingAndOnlineGrpc.getStopTypingMethod) == null) {
          TypingAndOnlineGrpc.getStopTypingMethod = getStopTypingMethod = 
              io.grpc.MethodDescriptor.<dialog.TypingAndOnlineOuterClass.RequestStopTyping, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.TypingAndOnline", "StopTyping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.TypingAndOnlineOuterClass.RequestStopTyping.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new TypingAndOnlineMethodDescriptorSupplier("StopTyping"))
                  .build();
          }
        }
     }
     return getStopTypingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestSetOnline,
      dialog.Miscellaneous.ResponseVoid> getSetOnlineMethod;

  public static io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestSetOnline,
      dialog.Miscellaneous.ResponseVoid> getSetOnlineMethod() {
    io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestSetOnline, dialog.Miscellaneous.ResponseVoid> getSetOnlineMethod;
    if ((getSetOnlineMethod = TypingAndOnlineGrpc.getSetOnlineMethod) == null) {
      synchronized (TypingAndOnlineGrpc.class) {
        if ((getSetOnlineMethod = TypingAndOnlineGrpc.getSetOnlineMethod) == null) {
          TypingAndOnlineGrpc.getSetOnlineMethod = getSetOnlineMethod = 
              io.grpc.MethodDescriptor.<dialog.TypingAndOnlineOuterClass.RequestSetOnline, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.TypingAndOnline", "SetOnline"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.TypingAndOnlineOuterClass.RequestSetOnline.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new TypingAndOnlineMethodDescriptorSupplier("SetOnline"))
                  .build();
          }
        }
     }
     return getSetOnlineMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestPauseNotifications,
      dialog.Miscellaneous.ResponseVoid> getPauseNotificationsMethod;

  public static io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestPauseNotifications,
      dialog.Miscellaneous.ResponseVoid> getPauseNotificationsMethod() {
    io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestPauseNotifications, dialog.Miscellaneous.ResponseVoid> getPauseNotificationsMethod;
    if ((getPauseNotificationsMethod = TypingAndOnlineGrpc.getPauseNotificationsMethod) == null) {
      synchronized (TypingAndOnlineGrpc.class) {
        if ((getPauseNotificationsMethod = TypingAndOnlineGrpc.getPauseNotificationsMethod) == null) {
          TypingAndOnlineGrpc.getPauseNotificationsMethod = getPauseNotificationsMethod = 
              io.grpc.MethodDescriptor.<dialog.TypingAndOnlineOuterClass.RequestPauseNotifications, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.TypingAndOnline", "PauseNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.TypingAndOnlineOuterClass.RequestPauseNotifications.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new TypingAndOnlineMethodDescriptorSupplier("PauseNotifications"))
                  .build();
          }
        }
     }
     return getPauseNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestRestoreNotifications,
      dialog.Miscellaneous.ResponseVoid> getRestoreNotificationsMethod;

  public static io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestRestoreNotifications,
      dialog.Miscellaneous.ResponseVoid> getRestoreNotificationsMethod() {
    io.grpc.MethodDescriptor<dialog.TypingAndOnlineOuterClass.RequestRestoreNotifications, dialog.Miscellaneous.ResponseVoid> getRestoreNotificationsMethod;
    if ((getRestoreNotificationsMethod = TypingAndOnlineGrpc.getRestoreNotificationsMethod) == null) {
      synchronized (TypingAndOnlineGrpc.class) {
        if ((getRestoreNotificationsMethod = TypingAndOnlineGrpc.getRestoreNotificationsMethod) == null) {
          TypingAndOnlineGrpc.getRestoreNotificationsMethod = getRestoreNotificationsMethod = 
              io.grpc.MethodDescriptor.<dialog.TypingAndOnlineOuterClass.RequestRestoreNotifications, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.TypingAndOnline", "RestoreNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.TypingAndOnlineOuterClass.RequestRestoreNotifications.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new TypingAndOnlineMethodDescriptorSupplier("RestoreNotifications"))
                  .build();
          }
        }
     }
     return getRestoreNotificationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TypingAndOnlineStub newStub(io.grpc.Channel channel) {
    return new TypingAndOnlineStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TypingAndOnlineBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TypingAndOnlineBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TypingAndOnlineFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TypingAndOnlineFutureStub(channel);
  }

  /**
   */
  public static abstract class TypingAndOnlineImplBase implements io.grpc.BindableService {

    /**
     */
    public void typing(dialog.TypingAndOnlineOuterClass.RequestTyping request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getTypingMethod(), responseObserver);
    }

    /**
     */
    public void stopTyping(dialog.TypingAndOnlineOuterClass.RequestStopTyping request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getStopTypingMethod(), responseObserver);
    }

    /**
     */
    public void setOnline(dialog.TypingAndOnlineOuterClass.RequestSetOnline request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getSetOnlineMethod(), responseObserver);
    }

    /**
     */
    public void pauseNotifications(dialog.TypingAndOnlineOuterClass.RequestPauseNotifications request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getPauseNotificationsMethod(), responseObserver);
    }

    /**
     */
    public void restoreNotifications(dialog.TypingAndOnlineOuterClass.RequestRestoreNotifications request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getRestoreNotificationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTypingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.TypingAndOnlineOuterClass.RequestTyping,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_TYPING)))
          .addMethod(
            getStopTypingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.TypingAndOnlineOuterClass.RequestStopTyping,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_STOP_TYPING)))
          .addMethod(
            getSetOnlineMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.TypingAndOnlineOuterClass.RequestSetOnline,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_SET_ONLINE)))
          .addMethod(
            getPauseNotificationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.TypingAndOnlineOuterClass.RequestPauseNotifications,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_PAUSE_NOTIFICATIONS)))
          .addMethod(
            getRestoreNotificationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.TypingAndOnlineOuterClass.RequestRestoreNotifications,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_RESTORE_NOTIFICATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class TypingAndOnlineStub extends io.grpc.stub.AbstractStub<TypingAndOnlineStub> {
    private TypingAndOnlineStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TypingAndOnlineStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TypingAndOnlineStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TypingAndOnlineStub(channel, callOptions);
    }

    /**
     */
    public void typing(dialog.TypingAndOnlineOuterClass.RequestTyping request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTypingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopTyping(dialog.TypingAndOnlineOuterClass.RequestStopTyping request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStopTypingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOnline(dialog.TypingAndOnlineOuterClass.RequestSetOnline request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetOnlineMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pauseNotifications(dialog.TypingAndOnlineOuterClass.RequestPauseNotifications request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPauseNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void restoreNotifications(dialog.TypingAndOnlineOuterClass.RequestRestoreNotifications request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRestoreNotificationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TypingAndOnlineBlockingStub extends io.grpc.stub.AbstractStub<TypingAndOnlineBlockingStub> {
    private TypingAndOnlineBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TypingAndOnlineBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TypingAndOnlineBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TypingAndOnlineBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid typing(dialog.TypingAndOnlineOuterClass.RequestTyping request) {
      return blockingUnaryCall(
          getChannel(), getTypingMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid stopTyping(dialog.TypingAndOnlineOuterClass.RequestStopTyping request) {
      return blockingUnaryCall(
          getChannel(), getStopTypingMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid setOnline(dialog.TypingAndOnlineOuterClass.RequestSetOnline request) {
      return blockingUnaryCall(
          getChannel(), getSetOnlineMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid pauseNotifications(dialog.TypingAndOnlineOuterClass.RequestPauseNotifications request) {
      return blockingUnaryCall(
          getChannel(), getPauseNotificationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid restoreNotifications(dialog.TypingAndOnlineOuterClass.RequestRestoreNotifications request) {
      return blockingUnaryCall(
          getChannel(), getRestoreNotificationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TypingAndOnlineFutureStub extends io.grpc.stub.AbstractStub<TypingAndOnlineFutureStub> {
    private TypingAndOnlineFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TypingAndOnlineFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TypingAndOnlineFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TypingAndOnlineFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> typing(
        dialog.TypingAndOnlineOuterClass.RequestTyping request) {
      return futureUnaryCall(
          getChannel().newCall(getTypingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> stopTyping(
        dialog.TypingAndOnlineOuterClass.RequestStopTyping request) {
      return futureUnaryCall(
          getChannel().newCall(getStopTypingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> setOnline(
        dialog.TypingAndOnlineOuterClass.RequestSetOnline request) {
      return futureUnaryCall(
          getChannel().newCall(getSetOnlineMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> pauseNotifications(
        dialog.TypingAndOnlineOuterClass.RequestPauseNotifications request) {
      return futureUnaryCall(
          getChannel().newCall(getPauseNotificationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> restoreNotifications(
        dialog.TypingAndOnlineOuterClass.RequestRestoreNotifications request) {
      return futureUnaryCall(
          getChannel().newCall(getRestoreNotificationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TYPING = 0;
  private static final int METHODID_STOP_TYPING = 1;
  private static final int METHODID_SET_ONLINE = 2;
  private static final int METHODID_PAUSE_NOTIFICATIONS = 3;
  private static final int METHODID_RESTORE_NOTIFICATIONS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TypingAndOnlineImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TypingAndOnlineImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TYPING:
          serviceImpl.typing((dialog.TypingAndOnlineOuterClass.RequestTyping) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_STOP_TYPING:
          serviceImpl.stopTyping((dialog.TypingAndOnlineOuterClass.RequestStopTyping) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_SET_ONLINE:
          serviceImpl.setOnline((dialog.TypingAndOnlineOuterClass.RequestSetOnline) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_PAUSE_NOTIFICATIONS:
          serviceImpl.pauseNotifications((dialog.TypingAndOnlineOuterClass.RequestPauseNotifications) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_RESTORE_NOTIFICATIONS:
          serviceImpl.restoreNotifications((dialog.TypingAndOnlineOuterClass.RequestRestoreNotifications) request,
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

  private static abstract class TypingAndOnlineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TypingAndOnlineBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.TypingAndOnlineOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TypingAndOnline");
    }
  }

  private static final class TypingAndOnlineFileDescriptorSupplier
      extends TypingAndOnlineBaseDescriptorSupplier {
    TypingAndOnlineFileDescriptorSupplier() {}
  }

  private static final class TypingAndOnlineMethodDescriptorSupplier
      extends TypingAndOnlineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TypingAndOnlineMethodDescriptorSupplier(String methodName) {
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
      synchronized (TypingAndOnlineGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TypingAndOnlineFileDescriptorSupplier())
              .addMethod(getTypingMethod())
              .addMethod(getStopTypingMethod())
              .addMethod(getSetOnlineMethod())
              .addMethod(getPauseNotificationsMethod())
              .addMethod(getRestoreNotificationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
