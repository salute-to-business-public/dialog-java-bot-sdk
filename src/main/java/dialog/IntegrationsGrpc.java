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
    comments = "Source: integrations.proto")
public final class IntegrationsGrpc {

  private IntegrationsGrpc() {}

  public static final String SERVICE_NAME = "dialog.Integrations";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.IntegrationsOuterClass.RequestGetIntegrationToken,
      dialog.IntegrationsOuterClass.ResponseIntegrationToken> getGetIntegrationTokenMethod;

  public static io.grpc.MethodDescriptor<dialog.IntegrationsOuterClass.RequestGetIntegrationToken,
      dialog.IntegrationsOuterClass.ResponseIntegrationToken> getGetIntegrationTokenMethod() {
    io.grpc.MethodDescriptor<dialog.IntegrationsOuterClass.RequestGetIntegrationToken, dialog.IntegrationsOuterClass.ResponseIntegrationToken> getGetIntegrationTokenMethod;
    if ((getGetIntegrationTokenMethod = IntegrationsGrpc.getGetIntegrationTokenMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGetIntegrationTokenMethod = IntegrationsGrpc.getGetIntegrationTokenMethod) == null) {
          IntegrationsGrpc.getGetIntegrationTokenMethod = getGetIntegrationTokenMethod = 
              io.grpc.MethodDescriptor.<dialog.IntegrationsOuterClass.RequestGetIntegrationToken, dialog.IntegrationsOuterClass.ResponseIntegrationToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Integrations", "GetIntegrationToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.IntegrationsOuterClass.RequestGetIntegrationToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.IntegrationsOuterClass.ResponseIntegrationToken.getDefaultInstance()))
                  .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("GetIntegrationToken"))
                  .build();
          }
        }
     }
     return getGetIntegrationTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.IntegrationsOuterClass.RequestRevokeIntegrationToken,
      dialog.IntegrationsOuterClass.ResponseIntegrationToken> getRevokeIntegrationTokenMethod;

  public static io.grpc.MethodDescriptor<dialog.IntegrationsOuterClass.RequestRevokeIntegrationToken,
      dialog.IntegrationsOuterClass.ResponseIntegrationToken> getRevokeIntegrationTokenMethod() {
    io.grpc.MethodDescriptor<dialog.IntegrationsOuterClass.RequestRevokeIntegrationToken, dialog.IntegrationsOuterClass.ResponseIntegrationToken> getRevokeIntegrationTokenMethod;
    if ((getRevokeIntegrationTokenMethod = IntegrationsGrpc.getRevokeIntegrationTokenMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getRevokeIntegrationTokenMethod = IntegrationsGrpc.getRevokeIntegrationTokenMethod) == null) {
          IntegrationsGrpc.getRevokeIntegrationTokenMethod = getRevokeIntegrationTokenMethod = 
              io.grpc.MethodDescriptor.<dialog.IntegrationsOuterClass.RequestRevokeIntegrationToken, dialog.IntegrationsOuterClass.ResponseIntegrationToken>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Integrations", "RevokeIntegrationToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.IntegrationsOuterClass.RequestRevokeIntegrationToken.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.IntegrationsOuterClass.ResponseIntegrationToken.getDefaultInstance()))
                  .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("RevokeIntegrationToken"))
                  .build();
          }
        }
     }
     return getRevokeIntegrationTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntegrationsStub newStub(io.grpc.Channel channel) {
    return new IntegrationsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntegrationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IntegrationsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntegrationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IntegrationsFutureStub(channel);
  }

  /**
   */
  public static abstract class IntegrationsImplBase implements io.grpc.BindableService {

    /**
     */
    public void getIntegrationToken(dialog.IntegrationsOuterClass.RequestGetIntegrationToken request,
        io.grpc.stub.StreamObserver<dialog.IntegrationsOuterClass.ResponseIntegrationToken> responseObserver) {
      asyncUnimplementedUnaryCall(getGetIntegrationTokenMethod(), responseObserver);
    }

    /**
     */
    public void revokeIntegrationToken(dialog.IntegrationsOuterClass.RequestRevokeIntegrationToken request,
        io.grpc.stub.StreamObserver<dialog.IntegrationsOuterClass.ResponseIntegrationToken> responseObserver) {
      asyncUnimplementedUnaryCall(getRevokeIntegrationTokenMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetIntegrationTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.IntegrationsOuterClass.RequestGetIntegrationToken,
                dialog.IntegrationsOuterClass.ResponseIntegrationToken>(
                  this, METHODID_GET_INTEGRATION_TOKEN)))
          .addMethod(
            getRevokeIntegrationTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.IntegrationsOuterClass.RequestRevokeIntegrationToken,
                dialog.IntegrationsOuterClass.ResponseIntegrationToken>(
                  this, METHODID_REVOKE_INTEGRATION_TOKEN)))
          .build();
    }
  }

  /**
   */
  public static final class IntegrationsStub extends io.grpc.stub.AbstractStub<IntegrationsStub> {
    private IntegrationsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegrationsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegrationsStub(channel, callOptions);
    }

    /**
     */
    public void getIntegrationToken(dialog.IntegrationsOuterClass.RequestGetIntegrationToken request,
        io.grpc.stub.StreamObserver<dialog.IntegrationsOuterClass.ResponseIntegrationToken> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetIntegrationTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeIntegrationToken(dialog.IntegrationsOuterClass.RequestRevokeIntegrationToken request,
        io.grpc.stub.StreamObserver<dialog.IntegrationsOuterClass.ResponseIntegrationToken> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevokeIntegrationTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IntegrationsBlockingStub extends io.grpc.stub.AbstractStub<IntegrationsBlockingStub> {
    private IntegrationsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegrationsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegrationsBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.IntegrationsOuterClass.ResponseIntegrationToken getIntegrationToken(dialog.IntegrationsOuterClass.RequestGetIntegrationToken request) {
      return blockingUnaryCall(
          getChannel(), getGetIntegrationTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.IntegrationsOuterClass.ResponseIntegrationToken revokeIntegrationToken(dialog.IntegrationsOuterClass.RequestRevokeIntegrationToken request) {
      return blockingUnaryCall(
          getChannel(), getRevokeIntegrationTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IntegrationsFutureStub extends io.grpc.stub.AbstractStub<IntegrationsFutureStub> {
    private IntegrationsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IntegrationsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IntegrationsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.IntegrationsOuterClass.ResponseIntegrationToken> getIntegrationToken(
        dialog.IntegrationsOuterClass.RequestGetIntegrationToken request) {
      return futureUnaryCall(
          getChannel().newCall(getGetIntegrationTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.IntegrationsOuterClass.ResponseIntegrationToken> revokeIntegrationToken(
        dialog.IntegrationsOuterClass.RequestRevokeIntegrationToken request) {
      return futureUnaryCall(
          getChannel().newCall(getRevokeIntegrationTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_INTEGRATION_TOKEN = 0;
  private static final int METHODID_REVOKE_INTEGRATION_TOKEN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntegrationsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IntegrationsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_INTEGRATION_TOKEN:
          serviceImpl.getIntegrationToken((dialog.IntegrationsOuterClass.RequestGetIntegrationToken) request,
              (io.grpc.stub.StreamObserver<dialog.IntegrationsOuterClass.ResponseIntegrationToken>) responseObserver);
          break;
        case METHODID_REVOKE_INTEGRATION_TOKEN:
          serviceImpl.revokeIntegrationToken((dialog.IntegrationsOuterClass.RequestRevokeIntegrationToken) request,
              (io.grpc.stub.StreamObserver<dialog.IntegrationsOuterClass.ResponseIntegrationToken>) responseObserver);
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

  private static abstract class IntegrationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntegrationsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.IntegrationsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Integrations");
    }
  }

  private static final class IntegrationsFileDescriptorSupplier
      extends IntegrationsBaseDescriptorSupplier {
    IntegrationsFileDescriptorSupplier() {}
  }

  private static final class IntegrationsMethodDescriptorSupplier
      extends IntegrationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IntegrationsMethodDescriptorSupplier(String methodName) {
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
      synchronized (IntegrationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntegrationsFileDescriptorSupplier())
              .addMethod(getGetIntegrationTokenMethod())
              .addMethod(getRevokeIntegrationTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
