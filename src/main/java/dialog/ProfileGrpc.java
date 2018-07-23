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
    comments = "Source: profile.proto")
public final class ProfileGrpc {

  private ProfileGrpc() {}

  public static final String SERVICE_NAME = "dialog.Profile";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditName,
      dialog.Miscellaneous.ResponseSeq> getEditNameMethod;

  public static io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditName,
      dialog.Miscellaneous.ResponseSeq> getEditNameMethod() {
    io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditName, dialog.Miscellaneous.ResponseSeq> getEditNameMethod;
    if ((getEditNameMethod = ProfileGrpc.getEditNameMethod) == null) {
      synchronized (ProfileGrpc.class) {
        if ((getEditNameMethod = ProfileGrpc.getEditNameMethod) == null) {
          ProfileGrpc.getEditNameMethod = getEditNameMethod = 
              io.grpc.MethodDescriptor.<dialog.ProfileOuterClass.RequestEditName, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Profile", "EditName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ProfileOuterClass.RequestEditName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileMethodDescriptorSupplier("EditName"))
                  .build();
          }
        }
     }
     return getEditNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditNickName,
      dialog.Miscellaneous.ResponseSeq> getEditNickNameMethod;

  public static io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditNickName,
      dialog.Miscellaneous.ResponseSeq> getEditNickNameMethod() {
    io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditNickName, dialog.Miscellaneous.ResponseSeq> getEditNickNameMethod;
    if ((getEditNickNameMethod = ProfileGrpc.getEditNickNameMethod) == null) {
      synchronized (ProfileGrpc.class) {
        if ((getEditNickNameMethod = ProfileGrpc.getEditNickNameMethod) == null) {
          ProfileGrpc.getEditNickNameMethod = getEditNickNameMethod = 
              io.grpc.MethodDescriptor.<dialog.ProfileOuterClass.RequestEditNickName, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Profile", "EditNickName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ProfileOuterClass.RequestEditNickName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileMethodDescriptorSupplier("EditNickName"))
                  .build();
          }
        }
     }
     return getEditNickNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestCheckNickName,
      dialog.Miscellaneous.ResponseBool> getCheckNickNameMethod;

  public static io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestCheckNickName,
      dialog.Miscellaneous.ResponseBool> getCheckNickNameMethod() {
    io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestCheckNickName, dialog.Miscellaneous.ResponseBool> getCheckNickNameMethod;
    if ((getCheckNickNameMethod = ProfileGrpc.getCheckNickNameMethod) == null) {
      synchronized (ProfileGrpc.class) {
        if ((getCheckNickNameMethod = ProfileGrpc.getCheckNickNameMethod) == null) {
          ProfileGrpc.getCheckNickNameMethod = getCheckNickNameMethod = 
              io.grpc.MethodDescriptor.<dialog.ProfileOuterClass.RequestCheckNickName, dialog.Miscellaneous.ResponseBool>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Profile", "CheckNickName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ProfileOuterClass.RequestCheckNickName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseBool.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileMethodDescriptorSupplier("CheckNickName"))
                  .build();
          }
        }
     }
     return getCheckNickNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditAbout,
      dialog.Miscellaneous.ResponseSeq> getEditAboutMethod;

  public static io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditAbout,
      dialog.Miscellaneous.ResponseSeq> getEditAboutMethod() {
    io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditAbout, dialog.Miscellaneous.ResponseSeq> getEditAboutMethod;
    if ((getEditAboutMethod = ProfileGrpc.getEditAboutMethod) == null) {
      synchronized (ProfileGrpc.class) {
        if ((getEditAboutMethod = ProfileGrpc.getEditAboutMethod) == null) {
          ProfileGrpc.getEditAboutMethod = getEditAboutMethod = 
              io.grpc.MethodDescriptor.<dialog.ProfileOuterClass.RequestEditAbout, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Profile", "EditAbout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ProfileOuterClass.RequestEditAbout.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileMethodDescriptorSupplier("EditAbout"))
                  .build();
          }
        }
     }
     return getEditAboutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditAvatar,
      dialog.ProfileOuterClass.ResponseEditAvatar> getEditAvatarMethod;

  public static io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditAvatar,
      dialog.ProfileOuterClass.ResponseEditAvatar> getEditAvatarMethod() {
    io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditAvatar, dialog.ProfileOuterClass.ResponseEditAvatar> getEditAvatarMethod;
    if ((getEditAvatarMethod = ProfileGrpc.getEditAvatarMethod) == null) {
      synchronized (ProfileGrpc.class) {
        if ((getEditAvatarMethod = ProfileGrpc.getEditAvatarMethod) == null) {
          ProfileGrpc.getEditAvatarMethod = getEditAvatarMethod = 
              io.grpc.MethodDescriptor.<dialog.ProfileOuterClass.RequestEditAvatar, dialog.ProfileOuterClass.ResponseEditAvatar>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Profile", "EditAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ProfileOuterClass.RequestEditAvatar.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ProfileOuterClass.ResponseEditAvatar.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileMethodDescriptorSupplier("EditAvatar"))
                  .build();
          }
        }
     }
     return getEditAvatarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestRemoveAvatar,
      dialog.Miscellaneous.ResponseSeq> getRemoveAvatarMethod;

  public static io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestRemoveAvatar,
      dialog.Miscellaneous.ResponseSeq> getRemoveAvatarMethod() {
    io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestRemoveAvatar, dialog.Miscellaneous.ResponseSeq> getRemoveAvatarMethod;
    if ((getRemoveAvatarMethod = ProfileGrpc.getRemoveAvatarMethod) == null) {
      synchronized (ProfileGrpc.class) {
        if ((getRemoveAvatarMethod = ProfileGrpc.getRemoveAvatarMethod) == null) {
          ProfileGrpc.getRemoveAvatarMethod = getRemoveAvatarMethod = 
              io.grpc.MethodDescriptor.<dialog.ProfileOuterClass.RequestRemoveAvatar, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Profile", "RemoveAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ProfileOuterClass.RequestRemoveAvatar.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileMethodDescriptorSupplier("RemoveAvatar"))
                  .build();
          }
        }
     }
     return getRemoveAvatarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditMyTimeZone,
      dialog.Miscellaneous.ResponseSeq> getEditMyTimeZoneMethod;

  public static io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditMyTimeZone,
      dialog.Miscellaneous.ResponseSeq> getEditMyTimeZoneMethod() {
    io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditMyTimeZone, dialog.Miscellaneous.ResponseSeq> getEditMyTimeZoneMethod;
    if ((getEditMyTimeZoneMethod = ProfileGrpc.getEditMyTimeZoneMethod) == null) {
      synchronized (ProfileGrpc.class) {
        if ((getEditMyTimeZoneMethod = ProfileGrpc.getEditMyTimeZoneMethod) == null) {
          ProfileGrpc.getEditMyTimeZoneMethod = getEditMyTimeZoneMethod = 
              io.grpc.MethodDescriptor.<dialog.ProfileOuterClass.RequestEditMyTimeZone, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Profile", "EditMyTimeZone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ProfileOuterClass.RequestEditMyTimeZone.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileMethodDescriptorSupplier("EditMyTimeZone"))
                  .build();
          }
        }
     }
     return getEditMyTimeZoneMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditMyPreferredLanguages,
      dialog.Miscellaneous.ResponseSeq> getEditMyPreferredLanguagesMethod;

  public static io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditMyPreferredLanguages,
      dialog.Miscellaneous.ResponseSeq> getEditMyPreferredLanguagesMethod() {
    io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditMyPreferredLanguages, dialog.Miscellaneous.ResponseSeq> getEditMyPreferredLanguagesMethod;
    if ((getEditMyPreferredLanguagesMethod = ProfileGrpc.getEditMyPreferredLanguagesMethod) == null) {
      synchronized (ProfileGrpc.class) {
        if ((getEditMyPreferredLanguagesMethod = ProfileGrpc.getEditMyPreferredLanguagesMethod) == null) {
          ProfileGrpc.getEditMyPreferredLanguagesMethod = getEditMyPreferredLanguagesMethod = 
              io.grpc.MethodDescriptor.<dialog.ProfileOuterClass.RequestEditMyPreferredLanguages, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Profile", "EditMyPreferredLanguages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ProfileOuterClass.RequestEditMyPreferredLanguages.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileMethodDescriptorSupplier("EditMyPreferredLanguages"))
                  .build();
          }
        }
     }
     return getEditMyPreferredLanguagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditSex,
      dialog.Miscellaneous.ResponseSeq> getEditSexMethod;

  public static io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditSex,
      dialog.Miscellaneous.ResponseSeq> getEditSexMethod() {
    io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditSex, dialog.Miscellaneous.ResponseSeq> getEditSexMethod;
    if ((getEditSexMethod = ProfileGrpc.getEditSexMethod) == null) {
      synchronized (ProfileGrpc.class) {
        if ((getEditSexMethod = ProfileGrpc.getEditSexMethod) == null) {
          ProfileGrpc.getEditSexMethod = getEditSexMethod = 
              io.grpc.MethodDescriptor.<dialog.ProfileOuterClass.RequestEditSex, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Profile", "EditSex"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ProfileOuterClass.RequestEditSex.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileMethodDescriptorSupplier("EditSex"))
                  .build();
          }
        }
     }
     return getEditSexMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditCustomProfile,
      dialog.Miscellaneous.ResponseSeq> getEditCustomProfileMethod;

  public static io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditCustomProfile,
      dialog.Miscellaneous.ResponseSeq> getEditCustomProfileMethod() {
    io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestEditCustomProfile, dialog.Miscellaneous.ResponseSeq> getEditCustomProfileMethod;
    if ((getEditCustomProfileMethod = ProfileGrpc.getEditCustomProfileMethod) == null) {
      synchronized (ProfileGrpc.class) {
        if ((getEditCustomProfileMethod = ProfileGrpc.getEditCustomProfileMethod) == null) {
          ProfileGrpc.getEditCustomProfileMethod = getEditCustomProfileMethod = 
              io.grpc.MethodDescriptor.<dialog.ProfileOuterClass.RequestEditCustomProfile, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Profile", "EditCustomProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ProfileOuterClass.RequestEditCustomProfile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileMethodDescriptorSupplier("EditCustomProfile"))
                  .build();
          }
        }
     }
     return getEditCustomProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestChangeUserStatus,
      dialog.Miscellaneous.ResponseSeq> getChangeUserStatusMethod;

  public static io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestChangeUserStatus,
      dialog.Miscellaneous.ResponseSeq> getChangeUserStatusMethod() {
    io.grpc.MethodDescriptor<dialog.ProfileOuterClass.RequestChangeUserStatus, dialog.Miscellaneous.ResponseSeq> getChangeUserStatusMethod;
    if ((getChangeUserStatusMethod = ProfileGrpc.getChangeUserStatusMethod) == null) {
      synchronized (ProfileGrpc.class) {
        if ((getChangeUserStatusMethod = ProfileGrpc.getChangeUserStatusMethod) == null) {
          ProfileGrpc.getChangeUserStatusMethod = getChangeUserStatusMethod = 
              io.grpc.MethodDescriptor.<dialog.ProfileOuterClass.RequestChangeUserStatus, dialog.Miscellaneous.ResponseSeq>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Profile", "ChangeUserStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.ProfileOuterClass.RequestChangeUserStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseSeq.getDefaultInstance()))
                  .setSchemaDescriptor(new ProfileMethodDescriptorSupplier("ChangeUserStatus"))
                  .build();
          }
        }
     }
     return getChangeUserStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProfileStub newStub(io.grpc.Channel channel) {
    return new ProfileStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProfileBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProfileBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProfileFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProfileFutureStub(channel);
  }

  /**
   */
  public static abstract class ProfileImplBase implements io.grpc.BindableService {

    /**
     */
    public void editName(dialog.ProfileOuterClass.RequestEditName request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getEditNameMethod(), responseObserver);
    }

    /**
     */
    public void editNickName(dialog.ProfileOuterClass.RequestEditNickName request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getEditNickNameMethod(), responseObserver);
    }

    /**
     */
    public void checkNickName(dialog.ProfileOuterClass.RequestCheckNickName request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseBool> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckNickNameMethod(), responseObserver);
    }

    /**
     */
    public void editAbout(dialog.ProfileOuterClass.RequestEditAbout request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getEditAboutMethod(), responseObserver);
    }

    /**
     */
    public void editAvatar(dialog.ProfileOuterClass.RequestEditAvatar request,
        io.grpc.stub.StreamObserver<dialog.ProfileOuterClass.ResponseEditAvatar> responseObserver) {
      asyncUnimplementedUnaryCall(getEditAvatarMethod(), responseObserver);
    }

    /**
     */
    public void removeAvatar(dialog.ProfileOuterClass.RequestRemoveAvatar request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveAvatarMethod(), responseObserver);
    }

    /**
     */
    public void editMyTimeZone(dialog.ProfileOuterClass.RequestEditMyTimeZone request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getEditMyTimeZoneMethod(), responseObserver);
    }

    /**
     */
    public void editMyPreferredLanguages(dialog.ProfileOuterClass.RequestEditMyPreferredLanguages request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getEditMyPreferredLanguagesMethod(), responseObserver);
    }

    /**
     */
    public void editSex(dialog.ProfileOuterClass.RequestEditSex request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getEditSexMethod(), responseObserver);
    }

    /**
     */
    public void editCustomProfile(dialog.ProfileOuterClass.RequestEditCustomProfile request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getEditCustomProfileMethod(), responseObserver);
    }

    /**
     */
    public void changeUserStatus(dialog.ProfileOuterClass.RequestChangeUserStatus request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnimplementedUnaryCall(getChangeUserStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEditNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ProfileOuterClass.RequestEditName,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_EDIT_NAME)))
          .addMethod(
            getEditNickNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ProfileOuterClass.RequestEditNickName,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_EDIT_NICK_NAME)))
          .addMethod(
            getCheckNickNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ProfileOuterClass.RequestCheckNickName,
                dialog.Miscellaneous.ResponseBool>(
                  this, METHODID_CHECK_NICK_NAME)))
          .addMethod(
            getEditAboutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ProfileOuterClass.RequestEditAbout,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_EDIT_ABOUT)))
          .addMethod(
            getEditAvatarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ProfileOuterClass.RequestEditAvatar,
                dialog.ProfileOuterClass.ResponseEditAvatar>(
                  this, METHODID_EDIT_AVATAR)))
          .addMethod(
            getRemoveAvatarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ProfileOuterClass.RequestRemoveAvatar,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_REMOVE_AVATAR)))
          .addMethod(
            getEditMyTimeZoneMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ProfileOuterClass.RequestEditMyTimeZone,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_EDIT_MY_TIME_ZONE)))
          .addMethod(
            getEditMyPreferredLanguagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ProfileOuterClass.RequestEditMyPreferredLanguages,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_EDIT_MY_PREFERRED_LANGUAGES)))
          .addMethod(
            getEditSexMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ProfileOuterClass.RequestEditSex,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_EDIT_SEX)))
          .addMethod(
            getEditCustomProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ProfileOuterClass.RequestEditCustomProfile,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_EDIT_CUSTOM_PROFILE)))
          .addMethod(
            getChangeUserStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.ProfileOuterClass.RequestChangeUserStatus,
                dialog.Miscellaneous.ResponseSeq>(
                  this, METHODID_CHANGE_USER_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class ProfileStub extends io.grpc.stub.AbstractStub<ProfileStub> {
    private ProfileStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfileStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfileStub(channel, callOptions);
    }

    /**
     */
    public void editName(dialog.ProfileOuterClass.RequestEditName request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editNickName(dialog.ProfileOuterClass.RequestEditNickName request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditNickNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkNickName(dialog.ProfileOuterClass.RequestCheckNickName request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseBool> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckNickNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editAbout(dialog.ProfileOuterClass.RequestEditAbout request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditAboutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editAvatar(dialog.ProfileOuterClass.RequestEditAvatar request,
        io.grpc.stub.StreamObserver<dialog.ProfileOuterClass.ResponseEditAvatar> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditAvatarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeAvatar(dialog.ProfileOuterClass.RequestRemoveAvatar request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveAvatarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editMyTimeZone(dialog.ProfileOuterClass.RequestEditMyTimeZone request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditMyTimeZoneMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editMyPreferredLanguages(dialog.ProfileOuterClass.RequestEditMyPreferredLanguages request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditMyPreferredLanguagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editSex(dialog.ProfileOuterClass.RequestEditSex request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditSexMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void editCustomProfile(dialog.ProfileOuterClass.RequestEditCustomProfile request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEditCustomProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeUserStatus(dialog.ProfileOuterClass.RequestChangeUserStatus request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangeUserStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProfileBlockingStub extends io.grpc.stub.AbstractStub<ProfileBlockingStub> {
    private ProfileBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfileBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfileBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq editName(dialog.ProfileOuterClass.RequestEditName request) {
      return blockingUnaryCall(
          getChannel(), getEditNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq editNickName(dialog.ProfileOuterClass.RequestEditNickName request) {
      return blockingUnaryCall(
          getChannel(), getEditNickNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseBool checkNickName(dialog.ProfileOuterClass.RequestCheckNickName request) {
      return blockingUnaryCall(
          getChannel(), getCheckNickNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq editAbout(dialog.ProfileOuterClass.RequestEditAbout request) {
      return blockingUnaryCall(
          getChannel(), getEditAboutMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.ProfileOuterClass.ResponseEditAvatar editAvatar(dialog.ProfileOuterClass.RequestEditAvatar request) {
      return blockingUnaryCall(
          getChannel(), getEditAvatarMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq removeAvatar(dialog.ProfileOuterClass.RequestRemoveAvatar request) {
      return blockingUnaryCall(
          getChannel(), getRemoveAvatarMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq editMyTimeZone(dialog.ProfileOuterClass.RequestEditMyTimeZone request) {
      return blockingUnaryCall(
          getChannel(), getEditMyTimeZoneMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq editMyPreferredLanguages(dialog.ProfileOuterClass.RequestEditMyPreferredLanguages request) {
      return blockingUnaryCall(
          getChannel(), getEditMyPreferredLanguagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq editSex(dialog.ProfileOuterClass.RequestEditSex request) {
      return blockingUnaryCall(
          getChannel(), getEditSexMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq editCustomProfile(dialog.ProfileOuterClass.RequestEditCustomProfile request) {
      return blockingUnaryCall(
          getChannel(), getEditCustomProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseSeq changeUserStatus(dialog.ProfileOuterClass.RequestChangeUserStatus request) {
      return blockingUnaryCall(
          getChannel(), getChangeUserStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProfileFutureStub extends io.grpc.stub.AbstractStub<ProfileFutureStub> {
    private ProfileFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfileFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfileFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfileFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> editName(
        dialog.ProfileOuterClass.RequestEditName request) {
      return futureUnaryCall(
          getChannel().newCall(getEditNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> editNickName(
        dialog.ProfileOuterClass.RequestEditNickName request) {
      return futureUnaryCall(
          getChannel().newCall(getEditNickNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseBool> checkNickName(
        dialog.ProfileOuterClass.RequestCheckNickName request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckNickNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> editAbout(
        dialog.ProfileOuterClass.RequestEditAbout request) {
      return futureUnaryCall(
          getChannel().newCall(getEditAboutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.ProfileOuterClass.ResponseEditAvatar> editAvatar(
        dialog.ProfileOuterClass.RequestEditAvatar request) {
      return futureUnaryCall(
          getChannel().newCall(getEditAvatarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> removeAvatar(
        dialog.ProfileOuterClass.RequestRemoveAvatar request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveAvatarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> editMyTimeZone(
        dialog.ProfileOuterClass.RequestEditMyTimeZone request) {
      return futureUnaryCall(
          getChannel().newCall(getEditMyTimeZoneMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> editMyPreferredLanguages(
        dialog.ProfileOuterClass.RequestEditMyPreferredLanguages request) {
      return futureUnaryCall(
          getChannel().newCall(getEditMyPreferredLanguagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> editSex(
        dialog.ProfileOuterClass.RequestEditSex request) {
      return futureUnaryCall(
          getChannel().newCall(getEditSexMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> editCustomProfile(
        dialog.ProfileOuterClass.RequestEditCustomProfile request) {
      return futureUnaryCall(
          getChannel().newCall(getEditCustomProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseSeq> changeUserStatus(
        dialog.ProfileOuterClass.RequestChangeUserStatus request) {
      return futureUnaryCall(
          getChannel().newCall(getChangeUserStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EDIT_NAME = 0;
  private static final int METHODID_EDIT_NICK_NAME = 1;
  private static final int METHODID_CHECK_NICK_NAME = 2;
  private static final int METHODID_EDIT_ABOUT = 3;
  private static final int METHODID_EDIT_AVATAR = 4;
  private static final int METHODID_REMOVE_AVATAR = 5;
  private static final int METHODID_EDIT_MY_TIME_ZONE = 6;
  private static final int METHODID_EDIT_MY_PREFERRED_LANGUAGES = 7;
  private static final int METHODID_EDIT_SEX = 8;
  private static final int METHODID_EDIT_CUSTOM_PROFILE = 9;
  private static final int METHODID_CHANGE_USER_STATUS = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProfileImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProfileImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EDIT_NAME:
          serviceImpl.editName((dialog.ProfileOuterClass.RequestEditName) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_EDIT_NICK_NAME:
          serviceImpl.editNickName((dialog.ProfileOuterClass.RequestEditNickName) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_CHECK_NICK_NAME:
          serviceImpl.checkNickName((dialog.ProfileOuterClass.RequestCheckNickName) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseBool>) responseObserver);
          break;
        case METHODID_EDIT_ABOUT:
          serviceImpl.editAbout((dialog.ProfileOuterClass.RequestEditAbout) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_EDIT_AVATAR:
          serviceImpl.editAvatar((dialog.ProfileOuterClass.RequestEditAvatar) request,
              (io.grpc.stub.StreamObserver<dialog.ProfileOuterClass.ResponseEditAvatar>) responseObserver);
          break;
        case METHODID_REMOVE_AVATAR:
          serviceImpl.removeAvatar((dialog.ProfileOuterClass.RequestRemoveAvatar) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_EDIT_MY_TIME_ZONE:
          serviceImpl.editMyTimeZone((dialog.ProfileOuterClass.RequestEditMyTimeZone) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_EDIT_MY_PREFERRED_LANGUAGES:
          serviceImpl.editMyPreferredLanguages((dialog.ProfileOuterClass.RequestEditMyPreferredLanguages) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_EDIT_SEX:
          serviceImpl.editSex((dialog.ProfileOuterClass.RequestEditSex) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_EDIT_CUSTOM_PROFILE:
          serviceImpl.editCustomProfile((dialog.ProfileOuterClass.RequestEditCustomProfile) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseSeq>) responseObserver);
          break;
        case METHODID_CHANGE_USER_STATUS:
          serviceImpl.changeUserStatus((dialog.ProfileOuterClass.RequestChangeUserStatus) request,
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

  private static abstract class ProfileBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProfileBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.ProfileOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Profile");
    }
  }

  private static final class ProfileFileDescriptorSupplier
      extends ProfileBaseDescriptorSupplier {
    ProfileFileDescriptorSupplier() {}
  }

  private static final class ProfileMethodDescriptorSupplier
      extends ProfileBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProfileMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProfileGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProfileFileDescriptorSupplier())
              .addMethod(getEditNameMethod())
              .addMethod(getEditNickNameMethod())
              .addMethod(getCheckNickNameMethod())
              .addMethod(getEditAboutMethod())
              .addMethod(getEditAvatarMethod())
              .addMethod(getRemoveAvatarMethod())
              .addMethod(getEditMyTimeZoneMethod())
              .addMethod(getEditMyPreferredLanguagesMethod())
              .addMethod(getEditSexMethod())
              .addMethod(getEditCustomProfileMethod())
              .addMethod(getChangeUserStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
