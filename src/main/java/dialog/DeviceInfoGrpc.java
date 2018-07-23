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
    comments = "Source: device_info.proto")
public final class DeviceInfoGrpc {

  private DeviceInfoGrpc() {}

  public static final String SERVICE_NAME = "dialog.DeviceInfo";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.DeviceInfoOuterClass.RequestNotifyAboutDeviceInfo,
      dialog.Miscellaneous.ResponseVoid> getNotifyAboutDeviceInfoMethod;

  public static io.grpc.MethodDescriptor<dialog.DeviceInfoOuterClass.RequestNotifyAboutDeviceInfo,
      dialog.Miscellaneous.ResponseVoid> getNotifyAboutDeviceInfoMethod() {
    io.grpc.MethodDescriptor<dialog.DeviceInfoOuterClass.RequestNotifyAboutDeviceInfo, dialog.Miscellaneous.ResponseVoid> getNotifyAboutDeviceInfoMethod;
    if ((getNotifyAboutDeviceInfoMethod = DeviceInfoGrpc.getNotifyAboutDeviceInfoMethod) == null) {
      synchronized (DeviceInfoGrpc.class) {
        if ((getNotifyAboutDeviceInfoMethod = DeviceInfoGrpc.getNotifyAboutDeviceInfoMethod) == null) {
          DeviceInfoGrpc.getNotifyAboutDeviceInfoMethod = getNotifyAboutDeviceInfoMethod = 
              io.grpc.MethodDescriptor.<dialog.DeviceInfoOuterClass.RequestNotifyAboutDeviceInfo, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.DeviceInfo", "NotifyAboutDeviceInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.DeviceInfoOuterClass.RequestNotifyAboutDeviceInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new DeviceInfoMethodDescriptorSupplier("NotifyAboutDeviceInfo"))
                  .build();
          }
        }
     }
     return getNotifyAboutDeviceInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeviceInfoStub newStub(io.grpc.Channel channel) {
    return new DeviceInfoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeviceInfoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeviceInfoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeviceInfoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeviceInfoFutureStub(channel);
  }

  /**
   */
  public static abstract class DeviceInfoImplBase implements io.grpc.BindableService {

    /**
     */
    public void notifyAboutDeviceInfo(dialog.DeviceInfoOuterClass.RequestNotifyAboutDeviceInfo request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyAboutDeviceInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNotifyAboutDeviceInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.DeviceInfoOuterClass.RequestNotifyAboutDeviceInfo,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_NOTIFY_ABOUT_DEVICE_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class DeviceInfoStub extends io.grpc.stub.AbstractStub<DeviceInfoStub> {
    private DeviceInfoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceInfoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceInfoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceInfoStub(channel, callOptions);
    }

    /**
     */
    public void notifyAboutDeviceInfo(dialog.DeviceInfoOuterClass.RequestNotifyAboutDeviceInfo request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyAboutDeviceInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeviceInfoBlockingStub extends io.grpc.stub.AbstractStub<DeviceInfoBlockingStub> {
    private DeviceInfoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceInfoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceInfoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceInfoBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid notifyAboutDeviceInfo(dialog.DeviceInfoOuterClass.RequestNotifyAboutDeviceInfo request) {
      return blockingUnaryCall(
          getChannel(), getNotifyAboutDeviceInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeviceInfoFutureStub extends io.grpc.stub.AbstractStub<DeviceInfoFutureStub> {
    private DeviceInfoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeviceInfoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeviceInfoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeviceInfoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> notifyAboutDeviceInfo(
        dialog.DeviceInfoOuterClass.RequestNotifyAboutDeviceInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyAboutDeviceInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOTIFY_ABOUT_DEVICE_INFO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeviceInfoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeviceInfoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOTIFY_ABOUT_DEVICE_INFO:
          serviceImpl.notifyAboutDeviceInfo((dialog.DeviceInfoOuterClass.RequestNotifyAboutDeviceInfo) request,
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

  private static abstract class DeviceInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeviceInfoBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.DeviceInfoOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeviceInfo");
    }
  }

  private static final class DeviceInfoFileDescriptorSupplier
      extends DeviceInfoBaseDescriptorSupplier {
    DeviceInfoFileDescriptorSupplier() {}
  }

  private static final class DeviceInfoMethodDescriptorSupplier
      extends DeviceInfoBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeviceInfoMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeviceInfoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeviceInfoFileDescriptorSupplier())
              .addMethod(getNotifyAboutDeviceInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
