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
    comments = "Source: users.proto")
public final class UsersGrpc {

  private UsersGrpc() {}

  public static final String SERVICE_NAME = "dialog.Users";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.UsersOuterClass.RequestEditUserLocalName,
      dialog.Miscellaneous.ResponseSeq> getEditUserLocalNameMethod;

  public static io.grpc.MethodDescriptor<dialog.UsersOuterClass.RequestEditUserLocalName,
      dialog.Miscellaneous.ResponseSeq> getEditUserLocalNameMethod() {
    io.grpc.MethodDescriptor<dialog.UsersOuterClass.RequestEditUserLocalName, dialog.Miscellaneous.ResponseSeq> getEditUserLocalNameMethod;
    if ((getEditUserLocalNameMethod = UsersGrpc.getEditUserLocalNameMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getEditUserLocalNameMethod = UsersGrpc.getEditUserLocalNameMethod) == null) {
          UsersGrpc.getEditUserLocalNameMethod = getEditUserLocalNameMethod = 
              io.grpc.MethodDescriptor.<dialog.UsersOuterClass.RequestEditUserLocalName, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Users", "EditUserLocalName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.UsersOuterClass.RequestEditUserLocalName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new UsersMethodDescriptorSupplier("EditUserLocalName"))
                  .build();
          }
        }
     }
     return getEditUserLocalNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.UsersOuterClass.RequestLoadFullUsers,
      dialog.UsersOuterClass.ResponseLoadFullUsers> getLoadFullUsersMethod;

  public static io.grpc.MethodDescriptor<dialog.UsersOuterClass.RequestLoadFullUsers,
      dialog.UsersOuterClass.ResponseLoadFullUsers> getLoadFullUsersMethod() {
    io.grpc.MethodDescriptor<dialog.UsersOuterClass.RequestLoadFullUsers, dialog.UsersOuterClass.ResponseLoadFullUsers> getLoadFullUsersMethod;
    if ((getLoadFullUsersMethod = UsersGrpc.getLoadFullUsersMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getLoadFullUsersMethod = UsersGrpc.getLoadFullUsersMethod) == null) {
          UsersGrpc.getLoadFullUsersMethod = getLoadFullUsersMethod = 
              io.grpc.MethodDescriptor.<dialog.UsersOuterClass.RequestLoadFullUsers, dialog.UsersOuterClass.ResponseLoadFullUsers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Users", "LoadFullUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.UsersOuterClass.RequestLoadFullUsers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.UsersOuterClass.ResponseLoadFullUsers.getDefaultInstance()))
                  .setSchemaDescriptor(new UsersMethodDescriptorSupplier("LoadFullUsers"))
                  .build();
          }
        }
     }
     return getLoadFullUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersStub newStub(io.grpc.Channel channel) {
    return new UsersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UsersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UsersFutureStub(channel);
  }

  /**
   */
  public static abstract class UsersImplBase implements io.grpc.BindableService {

    /**
     */
    public void editUserLocalName(dialog.UsersOuterClass.RequestEditUserLocalName request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getEditUserLocalNameMethod(), responseObserver);
    }

    /**
     */
    public void loadFullUsers(dialog.UsersOuterClass.RequestLoadFullUsers request,
        io.grpc.stub.StreamObserver<dialog.UsersOuterClass.ResponseLoadFullUsers> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadFullUsersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEditUserLocalNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.UsersOuterClass.RequestEditUserLocalName,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_EDIT_USER_LOCAL_NAME)))
          .addMethod(
            getLoadFullUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.UsersOuterClass.RequestLoadFullUsers,
                dialog.UsersOuterClass.ResponseLoadFullUsers>(
                  this, METHODID_LOAD_FULL_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class UsersStub extends io.grpc.stub.AbstractStub<UsersStub> {
    private UsersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsersStub(channel, callOptions);
    }

    /**
     */
    public void editUserLocalName(dialog.UsersOuterClass.RequestEditUserLocalName request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditUserLocalNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadFullUsers(dialog.UsersOuterClass.RequestLoadFullUsers request,
        io.grpc.stub.StreamObserver<dialog.UsersOuterClass.ResponseLoadFullUsers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadFullUsersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UsersBlockingStub extends io.grpc.stub.AbstractStub<UsersBlockingStub> {
    private UsersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsersBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq editUserLocalName(dialog.UsersOuterClass.RequestEditUserLocalName request) {
      return blockingUnaryCall(
          getChannel(), getEditUserLocalNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.UsersOuterClass.ResponseLoadFullUsers loadFullUsers(dialog.UsersOuterClass.RequestLoadFullUsers request) {
      return blockingUnaryCall(
          getChannel(), getLoadFullUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UsersFutureStub extends io.grpc.stub.AbstractStub<UsersFutureStub> {
    private UsersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UsersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UsersFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> editUserLocalName(
        dialog.UsersOuterClass.RequestEditUserLocalName request) {
      return futureUnaryCall(
          getChannel().newCall(getEditUserLocalNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.UsersOuterClass.ResponseLoadFullUsers> loadFullUsers(
        dialog.UsersOuterClass.RequestLoadFullUsers request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadFullUsersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EDIT_USER_LOCAL_NAME = 0;
  private static final int METHODID_LOAD_FULL_USERS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UsersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UsersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EDIT_USER_LOCAL_NAME:
          serviceImpl.editUserLocalName((dialog.UsersOuterClass.RequestEditUserLocalName) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_LOAD_FULL_USERS:
          serviceImpl.loadFullUsers((dialog.UsersOuterClass.RequestLoadFullUsers) request,
              (io.grpc.stub.StreamObserver<dialog.UsersOuterClass.ResponseLoadFullUsers>) responseObserver);
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

  private static abstract class UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.UsersOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Users");
    }
  }

  private static final class UsersFileDescriptorSupplier
      extends UsersBaseDescriptorSupplier {
    UsersFileDescriptorSupplier() {}
  }

  private static final class UsersMethodDescriptorSupplier
      extends UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UsersMethodDescriptorSupplier(String methodName) {
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
      synchronized (UsersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersFileDescriptorSupplier())
              .addMethod(getEditUserLocalNameMethod())
              .addMethod(getLoadFullUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
