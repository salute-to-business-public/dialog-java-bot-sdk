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
    comments = "Source: config_sync.proto")
public final class ConfigSyncGrpc {

  private ConfigSyncGrpc() {}

  public static final String SERVICE_NAME = "dialog.ConfigSync";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.ConfigSyncOuterClass.RequestGetParameters,
      dialog.ConfigSyncOuterClass.ResponseGetParameters> getGetParametersMethod;

  public static io.grpc.MethodDescriptor<dialog.ConfigSyncOuterClass.RequestGetParameters,
      dialog.ConfigSyncOuterClass.ResponseGetParameters> getGetParametersMethod() {
    io.grpc.MethodDescriptor<dialog.ConfigSyncOuterClass.RequestGetParameters, dialog.ConfigSyncOuterClass.ResponseGetParameters> getGetParametersMethod;
    if ((getGetParametersMethod = ConfigSyncGrpc.getGetParametersMethod) == null) {
      synchronized (ConfigSyncGrpc.class) {
        if ((getGetParametersMethod = ConfigSyncGrpc.getGetParametersMethod) == null) {
          ConfigSyncGrpc.getGetParametersMethod = getGetParametersMethod = 
              io.grpc.MethodDescriptor.<dialog.ConfigSyncOuterClass.RequestGetParameters, dialog.ConfigSyncOuterClass.ResponseGetParameters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.ConfigSync", "GetParameters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ConfigSyncOuterClass.RequestGetParameters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ConfigSyncOuterClass.ResponseGetParameters.getDefaultInstance()))
                  .setSchemaDescriptor(new ConfigSyncMethodDescriptorSupplier("GetParameters"))
                  .build();
          }
        }
     }
     return getGetParametersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ConfigSyncOuterClass.RequestEditParameter,
      dialog.Miscellaneous.ResponseSeq> getEditParameterMethod;

  public static io.grpc.MethodDescriptor<dialog.ConfigSyncOuterClass.RequestEditParameter,
      dialog.Miscellaneous.ResponseSeq> getEditParameterMethod() {
    io.grpc.MethodDescriptor<dialog.ConfigSyncOuterClass.RequestEditParameter, dialog.Miscellaneous.ResponseSeq> getEditParameterMethod;
    if ((getEditParameterMethod = ConfigSyncGrpc.getEditParameterMethod) == null) {
      synchronized (ConfigSyncGrpc.class) {
        if ((getEditParameterMethod = ConfigSyncGrpc.getEditParameterMethod) == null) {
          ConfigSyncGrpc.getEditParameterMethod = getEditParameterMethod = 
              io.grpc.MethodDescriptor.<dialog.ConfigSyncOuterClass.RequestEditParameter, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.ConfigSync", "EditParameter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ConfigSyncOuterClass.RequestEditParameter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new ConfigSyncMethodDescriptorSupplier("EditParameter"))
                  .build();
          }
        }
     }
     return getEditParameterMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConfigSyncStub newStub(io.grpc.Channel channel) {
    return new ConfigSyncStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConfigSyncBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConfigSyncBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConfigSyncFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConfigSyncFutureStub(channel);
  }

  /**
   */
  public static abstract class ConfigSyncImplBase implements io.grpc.BindableService {

    /**
     */
    public void getParameters(dialog.ConfigSyncOuterClass.RequestGetParameters request,
        io.grpc.stub.StreamObserver<dialog.ConfigSyncOuterClass.ResponseGetParameters> responseObserver) {
      asyncUnimplementedUnaryCall(getGetParametersMethod(), responseObserver);
    }

    /**
     */
    public void editParameter(dialog.ConfigSyncOuterClass.RequestEditParameter request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getEditParameterMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetParametersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ConfigSyncOuterClass.RequestGetParameters,
                dialog.ConfigSyncOuterClass.ResponseGetParameters>(
                  this, METHODID_GET_PARAMETERS)))
          .addMethod(
            getEditParameterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ConfigSyncOuterClass.RequestEditParameter,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_EDIT_PARAMETER)))
          .build();
    }
  }

  /**
   */
  public static final class ConfigSyncStub extends io.grpc.stub.AbstractStub<ConfigSyncStub> {
    private ConfigSyncStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConfigSyncStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigSyncStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConfigSyncStub(channel, callOptions);
    }

    /**
     */
    public void getParameters(dialog.ConfigSyncOuterClass.RequestGetParameters request,
        io.grpc.stub.StreamObserver<dialog.ConfigSyncOuterClass.ResponseGetParameters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetParametersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editParameter(dialog.ConfigSyncOuterClass.RequestEditParameter request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditParameterMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConfigSyncBlockingStub extends io.grpc.stub.AbstractStub<ConfigSyncBlockingStub> {
    private ConfigSyncBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConfigSyncBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigSyncBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConfigSyncBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.ConfigSyncOuterClass.ResponseGetParameters getParameters(dialog.ConfigSyncOuterClass.RequestGetParameters request) {
      return blockingUnaryCall(
          getChannel(), getGetParametersMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq editParameter(dialog.ConfigSyncOuterClass.RequestEditParameter request) {
      return blockingUnaryCall(
          getChannel(), getEditParameterMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConfigSyncFutureStub extends io.grpc.stub.AbstractStub<ConfigSyncFutureStub> {
    private ConfigSyncFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConfigSyncFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigSyncFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConfigSyncFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.ConfigSyncOuterClass.ResponseGetParameters> getParameters(
        dialog.ConfigSyncOuterClass.RequestGetParameters request) {
      return futureUnaryCall(
          getChannel().newCall(getGetParametersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> editParameter(
        dialog.ConfigSyncOuterClass.RequestEditParameter request) {
      return futureUnaryCall(
          getChannel().newCall(getEditParameterMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PARAMETERS = 0;
  private static final int METHODID_EDIT_PARAMETER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConfigSyncImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConfigSyncImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PARAMETERS:
          serviceImpl.getParameters((dialog.ConfigSyncOuterClass.RequestGetParameters) request,
              (io.grpc.stub.StreamObserver<dialog.ConfigSyncOuterClass.ResponseGetParameters>) responseObserver);
          break;
        case METHODID_EDIT_PARAMETER:
          serviceImpl.editParameter((dialog.ConfigSyncOuterClass.RequestEditParameter) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
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

  private static abstract class ConfigSyncBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConfigSyncBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.ConfigSyncOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ConfigSync");
    }
  }

  private static final class ConfigSyncFileDescriptorSupplier
      extends ConfigSyncBaseDescriptorSupplier {
    ConfigSyncFileDescriptorSupplier() {}
  }

  private static final class ConfigSyncMethodDescriptorSupplier
      extends ConfigSyncBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConfigSyncMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConfigSyncGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConfigSyncFileDescriptorSupplier())
              .addMethod(getGetParametersMethod())
              .addMethod(getEditParameterMethod())
              .build();
        }
      }
    }
    return result;
  }
}
