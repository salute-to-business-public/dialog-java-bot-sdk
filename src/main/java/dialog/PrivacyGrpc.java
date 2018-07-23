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
    comments = "Source: privacy.proto")
public final class PrivacyGrpc {

  private PrivacyGrpc() {}

  public static final String SERVICE_NAME = "dialog.Privacy";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.PrivacyOuterClass.RequestBlockUser,
      dialog.Miscellaneous.ResponseSeq> getBlockUserMethod;

  public static io.grpc.MethodDescriptor<dialog.PrivacyOuterClass.RequestBlockUser,
      dialog.Miscellaneous.ResponseSeq> getBlockUserMethod() {
    io.grpc.MethodDescriptor<dialog.PrivacyOuterClass.RequestBlockUser, dialog.Miscellaneous.ResponseSeq> getBlockUserMethod;
    if ((getBlockUserMethod = PrivacyGrpc.getBlockUserMethod) == null) {
      synchronized (PrivacyGrpc.class) {
        if ((getBlockUserMethod = PrivacyGrpc.getBlockUserMethod) == null) {
          PrivacyGrpc.getBlockUserMethod = getBlockUserMethod = 
              io.grpc.MethodDescriptor.<dialog.PrivacyOuterClass.RequestBlockUser, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Privacy", "BlockUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.PrivacyOuterClass.RequestBlockUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new PrivacyMethodDescriptorSupplier("BlockUser"))
                  .build();
          }
        }
     }
     return getBlockUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.PrivacyOuterClass.RequestUnblockUser,
      dialog.Miscellaneous.ResponseSeq> getUnblockUserMethod;

  public static io.grpc.MethodDescriptor<dialog.PrivacyOuterClass.RequestUnblockUser,
      dialog.Miscellaneous.ResponseSeq> getUnblockUserMethod() {
    io.grpc.MethodDescriptor<dialog.PrivacyOuterClass.RequestUnblockUser, dialog.Miscellaneous.ResponseSeq> getUnblockUserMethod;
    if ((getUnblockUserMethod = PrivacyGrpc.getUnblockUserMethod) == null) {
      synchronized (PrivacyGrpc.class) {
        if ((getUnblockUserMethod = PrivacyGrpc.getUnblockUserMethod) == null) {
          PrivacyGrpc.getUnblockUserMethod = getUnblockUserMethod = 
              io.grpc.MethodDescriptor.<dialog.PrivacyOuterClass.RequestUnblockUser, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Privacy", "UnblockUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.PrivacyOuterClass.RequestUnblockUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new PrivacyMethodDescriptorSupplier("UnblockUser"))
                  .build();
          }
        }
     }
     return getUnblockUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.PrivacyOuterClass.RequestLoadBlockedUsers,
      dialog.PrivacyOuterClass.ResponseLoadBlockedUsers> getLoadBlockedUsersMethod;

  public static io.grpc.MethodDescriptor<dialog.PrivacyOuterClass.RequestLoadBlockedUsers,
      dialog.PrivacyOuterClass.ResponseLoadBlockedUsers> getLoadBlockedUsersMethod() {
    io.grpc.MethodDescriptor<dialog.PrivacyOuterClass.RequestLoadBlockedUsers, dialog.PrivacyOuterClass.ResponseLoadBlockedUsers> getLoadBlockedUsersMethod;
    if ((getLoadBlockedUsersMethod = PrivacyGrpc.getLoadBlockedUsersMethod) == null) {
      synchronized (PrivacyGrpc.class) {
        if ((getLoadBlockedUsersMethod = PrivacyGrpc.getLoadBlockedUsersMethod) == null) {
          PrivacyGrpc.getLoadBlockedUsersMethod = getLoadBlockedUsersMethod = 
              io.grpc.MethodDescriptor.<dialog.PrivacyOuterClass.RequestLoadBlockedUsers, dialog.PrivacyOuterClass.ResponseLoadBlockedUsers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Privacy", "LoadBlockedUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.PrivacyOuterClass.RequestLoadBlockedUsers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.PrivacyOuterClass.ResponseLoadBlockedUsers.getDefaultInstance()))
                  .setSchemaDescriptor(new PrivacyMethodDescriptorSupplier("LoadBlockedUsers"))
                  .build();
          }
        }
     }
     return getLoadBlockedUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrivacyStub newStub(io.grpc.Channel channel) {
    return new PrivacyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrivacyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PrivacyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrivacyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PrivacyFutureStub(channel);
  }

  /**
   */
  public static abstract class PrivacyImplBase implements io.grpc.BindableService {

    /**
     */
    public void blockUser(dialog.PrivacyOuterClass.RequestBlockUser request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockUserMethod(), responseObserver);
    }

    /**
     */
    public void unblockUser(dialog.PrivacyOuterClass.RequestUnblockUser request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getUnblockUserMethod(), responseObserver);
    }

    /**
     */
    public void loadBlockedUsers(dialog.PrivacyOuterClass.RequestLoadBlockedUsers request,
        io.grpc.stub.StreamObserver<dialog.PrivacyOuterClass.ResponseLoadBlockedUsers> responseObserver) {
      asyncUnimplementedUnaryCall(getLoadBlockedUsersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBlockUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.PrivacyOuterClass.RequestBlockUser,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_BLOCK_USER)))
          .addMethod(
            getUnblockUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.PrivacyOuterClass.RequestUnblockUser,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_UNBLOCK_USER)))
          .addMethod(
            getLoadBlockedUsersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.PrivacyOuterClass.RequestLoadBlockedUsers,
                dialog.PrivacyOuterClass.ResponseLoadBlockedUsers>(
                  this, METHODID_LOAD_BLOCKED_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class PrivacyStub extends io.grpc.stub.AbstractStub<PrivacyStub> {
    private PrivacyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrivacyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivacyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrivacyStub(channel, callOptions);
    }

    /**
     */
    public void blockUser(dialog.PrivacyOuterClass.RequestBlockUser request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unblockUser(dialog.PrivacyOuterClass.RequestUnblockUser request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUnblockUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadBlockedUsers(dialog.PrivacyOuterClass.RequestLoadBlockedUsers request,
        io.grpc.stub.StreamObserver<dialog.PrivacyOuterClass.ResponseLoadBlockedUsers> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoadBlockedUsersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PrivacyBlockingStub extends io.grpc.stub.AbstractStub<PrivacyBlockingStub> {
    private PrivacyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrivacyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivacyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrivacyBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq blockUser(dialog.PrivacyOuterClass.RequestBlockUser request) {
      return blockingUnaryCall(
          getChannel(), getBlockUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq unblockUser(dialog.PrivacyOuterClass.RequestUnblockUser request) {
      return blockingUnaryCall(
          getChannel(), getUnblockUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.PrivacyOuterClass.ResponseLoadBlockedUsers loadBlockedUsers(dialog.PrivacyOuterClass.RequestLoadBlockedUsers request) {
      return blockingUnaryCall(
          getChannel(), getLoadBlockedUsersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PrivacyFutureStub extends io.grpc.stub.AbstractStub<PrivacyFutureStub> {
    private PrivacyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrivacyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrivacyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrivacyFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> blockUser(
        dialog.PrivacyOuterClass.RequestBlockUser request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> unblockUser(
        dialog.PrivacyOuterClass.RequestUnblockUser request) {
      return futureUnaryCall(
          getChannel().newCall(getUnblockUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.PrivacyOuterClass.ResponseLoadBlockedUsers> loadBlockedUsers(
        dialog.PrivacyOuterClass.RequestLoadBlockedUsers request) {
      return futureUnaryCall(
          getChannel().newCall(getLoadBlockedUsersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BLOCK_USER = 0;
  private static final int METHODID_UNBLOCK_USER = 1;
  private static final int METHODID_LOAD_BLOCKED_USERS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrivacyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrivacyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BLOCK_USER:
          serviceImpl.blockUser((dialog.PrivacyOuterClass.RequestBlockUser) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_UNBLOCK_USER:
          serviceImpl.unblockUser((dialog.PrivacyOuterClass.RequestUnblockUser) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_LOAD_BLOCKED_USERS:
          serviceImpl.loadBlockedUsers((dialog.PrivacyOuterClass.RequestLoadBlockedUsers) request,
              (io.grpc.stub.StreamObserver<dialog.PrivacyOuterClass.ResponseLoadBlockedUsers>) responseObserver);
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

  private static abstract class PrivacyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrivacyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.PrivacyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Privacy");
    }
  }

  private static final class PrivacyFileDescriptorSupplier
      extends PrivacyBaseDescriptorSupplier {
    PrivacyFileDescriptorSupplier() {}
  }

  private static final class PrivacyMethodDescriptorSupplier
      extends PrivacyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrivacyMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrivacyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrivacyFileDescriptorSupplier())
              .addMethod(getBlockUserMethod())
              .addMethod(getUnblockUserMethod())
              .addMethod(getLoadBlockedUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
