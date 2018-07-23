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
    comments = "Source: authentication.proto")
public final class AuthenticationGrpc {

  private AuthenticationGrpc() {}

  public static final String SERVICE_NAME = "dialog.Authentication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartPhoneAuth,
      dialog.AuthenticationOuterClass.ResponseStartPhoneAuth> getStartPhoneAuthMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartPhoneAuth,
      dialog.AuthenticationOuterClass.ResponseStartPhoneAuth> getStartPhoneAuthMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartPhoneAuth, dialog.AuthenticationOuterClass.ResponseStartPhoneAuth> getStartPhoneAuthMethod;
    if ((getStartPhoneAuthMethod = AuthenticationGrpc.getStartPhoneAuthMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getStartPhoneAuthMethod = AuthenticationGrpc.getStartPhoneAuthMethod) == null) {
          AuthenticationGrpc.getStartPhoneAuthMethod = getStartPhoneAuthMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestStartPhoneAuth, dialog.AuthenticationOuterClass.ResponseStartPhoneAuth>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "StartPhoneAuth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestStartPhoneAuth.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseStartPhoneAuth.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("StartPhoneAuth"))
                  .build();
          }
        }
     }
     return getStartPhoneAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSendCodeByPhoneCall,
      dialog.Miscellaneous.ResponseVoid> getSendCodeByPhoneCallMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSendCodeByPhoneCall,
      dialog.Miscellaneous.ResponseVoid> getSendCodeByPhoneCallMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSendCodeByPhoneCall, dialog.Miscellaneous.ResponseVoid> getSendCodeByPhoneCallMethod;
    if ((getSendCodeByPhoneCallMethod = AuthenticationGrpc.getSendCodeByPhoneCallMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getSendCodeByPhoneCallMethod = AuthenticationGrpc.getSendCodeByPhoneCallMethod) == null) {
          AuthenticationGrpc.getSendCodeByPhoneCallMethod = getSendCodeByPhoneCallMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestSendCodeByPhoneCall, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "SendCodeByPhoneCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestSendCodeByPhoneCall.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("SendCodeByPhoneCall"))
                  .build();
          }
        }
     }
     return getSendCodeByPhoneCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartEmailAuth,
      dialog.AuthenticationOuterClass.ResponseStartEmailAuth> getStartEmailAuthMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartEmailAuth,
      dialog.AuthenticationOuterClass.ResponseStartEmailAuth> getStartEmailAuthMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartEmailAuth, dialog.AuthenticationOuterClass.ResponseStartEmailAuth> getStartEmailAuthMethod;
    if ((getStartEmailAuthMethod = AuthenticationGrpc.getStartEmailAuthMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getStartEmailAuthMethod = AuthenticationGrpc.getStartEmailAuthMethod) == null) {
          AuthenticationGrpc.getStartEmailAuthMethod = getStartEmailAuthMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestStartEmailAuth, dialog.AuthenticationOuterClass.ResponseStartEmailAuth>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "StartEmailAuth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestStartEmailAuth.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseStartEmailAuth.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("StartEmailAuth"))
                  .build();
          }
        }
     }
     return getStartEmailAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartAnonymousAuth,
      dialog.AuthenticationOuterClass.ResponseAuth> getStartAnonymousAuthMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartAnonymousAuth,
      dialog.AuthenticationOuterClass.ResponseAuth> getStartAnonymousAuthMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartAnonymousAuth, dialog.AuthenticationOuterClass.ResponseAuth> getStartAnonymousAuthMethod;
    if ((getStartAnonymousAuthMethod = AuthenticationGrpc.getStartAnonymousAuthMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getStartAnonymousAuthMethod = AuthenticationGrpc.getStartAnonymousAuthMethod) == null) {
          AuthenticationGrpc.getStartAnonymousAuthMethod = getStartAnonymousAuthMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestStartAnonymousAuth, dialog.AuthenticationOuterClass.ResponseAuth>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "StartAnonymousAuth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestStartAnonymousAuth.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseAuth.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("StartAnonymousAuth"))
                  .build();
          }
        }
     }
     return getStartAnonymousAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartTokenAuth,
      dialog.AuthenticationOuterClass.ResponseAuth> getStartTokenAuthMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartTokenAuth,
      dialog.AuthenticationOuterClass.ResponseAuth> getStartTokenAuthMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartTokenAuth, dialog.AuthenticationOuterClass.ResponseAuth> getStartTokenAuthMethod;
    if ((getStartTokenAuthMethod = AuthenticationGrpc.getStartTokenAuthMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getStartTokenAuthMethod = AuthenticationGrpc.getStartTokenAuthMethod) == null) {
          AuthenticationGrpc.getStartTokenAuthMethod = getStartTokenAuthMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestStartTokenAuth, dialog.AuthenticationOuterClass.ResponseAuth>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "StartTokenAuth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestStartTokenAuth.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseAuth.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("StartTokenAuth"))
                  .build();
          }
        }
     }
     return getStartTokenAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartUsernameAuth,
      dialog.AuthenticationOuterClass.ResponseStartUsernameAuth> getStartUsernameAuthMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartUsernameAuth,
      dialog.AuthenticationOuterClass.ResponseStartUsernameAuth> getStartUsernameAuthMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestStartUsernameAuth, dialog.AuthenticationOuterClass.ResponseStartUsernameAuth> getStartUsernameAuthMethod;
    if ((getStartUsernameAuthMethod = AuthenticationGrpc.getStartUsernameAuthMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getStartUsernameAuthMethod = AuthenticationGrpc.getStartUsernameAuthMethod) == null) {
          AuthenticationGrpc.getStartUsernameAuthMethod = getStartUsernameAuthMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestStartUsernameAuth, dialog.AuthenticationOuterClass.ResponseStartUsernameAuth>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "StartUsernameAuth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestStartUsernameAuth.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseStartUsernameAuth.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("StartUsernameAuth"))
                  .build();
          }
        }
     }
     return getStartUsernameAuthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestValidateCode,
      dialog.AuthenticationOuterClass.ResponseAuth> getValidateCodeMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestValidateCode,
      dialog.AuthenticationOuterClass.ResponseAuth> getValidateCodeMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestValidateCode, dialog.AuthenticationOuterClass.ResponseAuth> getValidateCodeMethod;
    if ((getValidateCodeMethod = AuthenticationGrpc.getValidateCodeMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getValidateCodeMethod = AuthenticationGrpc.getValidateCodeMethod) == null) {
          AuthenticationGrpc.getValidateCodeMethod = getValidateCodeMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestValidateCode, dialog.AuthenticationOuterClass.ResponseAuth>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "ValidateCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestValidateCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseAuth.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("ValidateCode"))
                  .build();
          }
        }
     }
     return getValidateCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestResendCode,
      dialog.Miscellaneous.ResponseVoid> getResendCodeMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestResendCode,
      dialog.Miscellaneous.ResponseVoid> getResendCodeMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestResendCode, dialog.Miscellaneous.ResponseVoid> getResendCodeMethod;
    if ((getResendCodeMethod = AuthenticationGrpc.getResendCodeMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getResendCodeMethod = AuthenticationGrpc.getResendCodeMethod) == null) {
          AuthenticationGrpc.getResendCodeMethod = getResendCodeMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestResendCode, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "ResendCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestResendCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("ResendCode"))
                  .build();
          }
        }
     }
     return getResendCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestValidatePassword,
      dialog.AuthenticationOuterClass.ResponseAuth> getValidatePasswordMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestValidatePassword,
      dialog.AuthenticationOuterClass.ResponseAuth> getValidatePasswordMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestValidatePassword, dialog.AuthenticationOuterClass.ResponseAuth> getValidatePasswordMethod;
    if ((getValidatePasswordMethod = AuthenticationGrpc.getValidatePasswordMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getValidatePasswordMethod = AuthenticationGrpc.getValidatePasswordMethod) == null) {
          AuthenticationGrpc.getValidatePasswordMethod = getValidatePasswordMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestValidatePassword, dialog.AuthenticationOuterClass.ResponseAuth>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "ValidatePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestValidatePassword.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseAuth.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("ValidatePassword"))
                  .build();
          }
        }
     }
     return getValidatePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestGetOAuth2Params,
      dialog.AuthenticationOuterClass.ResponseGetOAuth2Params> getGetOAuth2ParamsMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestGetOAuth2Params,
      dialog.AuthenticationOuterClass.ResponseGetOAuth2Params> getGetOAuth2ParamsMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestGetOAuth2Params, dialog.AuthenticationOuterClass.ResponseGetOAuth2Params> getGetOAuth2ParamsMethod;
    if ((getGetOAuth2ParamsMethod = AuthenticationGrpc.getGetOAuth2ParamsMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getGetOAuth2ParamsMethod = AuthenticationGrpc.getGetOAuth2ParamsMethod) == null) {
          AuthenticationGrpc.getGetOAuth2ParamsMethod = getGetOAuth2ParamsMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestGetOAuth2Params, dialog.AuthenticationOuterClass.ResponseGetOAuth2Params>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "GetOAuth2Params"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestGetOAuth2Params.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseGetOAuth2Params.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("GetOAuth2Params"))
                  .build();
          }
        }
     }
     return getGetOAuth2ParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestCompleteOAuth2,
      dialog.AuthenticationOuterClass.ResponseAuth> getCompleteOAuth2Method;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestCompleteOAuth2,
      dialog.AuthenticationOuterClass.ResponseAuth> getCompleteOAuth2Method() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestCompleteOAuth2, dialog.AuthenticationOuterClass.ResponseAuth> getCompleteOAuth2Method;
    if ((getCompleteOAuth2Method = AuthenticationGrpc.getCompleteOAuth2Method) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getCompleteOAuth2Method = AuthenticationGrpc.getCompleteOAuth2Method) == null) {
          AuthenticationGrpc.getCompleteOAuth2Method = getCompleteOAuth2Method = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestCompleteOAuth2, dialog.AuthenticationOuterClass.ResponseAuth>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "CompleteOAuth2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestCompleteOAuth2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseAuth.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("CompleteOAuth2"))
                  .build();
          }
        }
     }
     return getCompleteOAuth2Method;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSignUp,
      dialog.AuthenticationOuterClass.ResponseAuth> getSignUpMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSignUp,
      dialog.AuthenticationOuterClass.ResponseAuth> getSignUpMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSignUp, dialog.AuthenticationOuterClass.ResponseAuth> getSignUpMethod;
    if ((getSignUpMethod = AuthenticationGrpc.getSignUpMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getSignUpMethod = AuthenticationGrpc.getSignUpMethod) == null) {
          AuthenticationGrpc.getSignUpMethod = getSignUpMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestSignUp, dialog.AuthenticationOuterClass.ResponseAuth>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "SignUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestSignUp.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseAuth.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("SignUp"))
                  .build();
          }
        }
     }
     return getSignUpMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestGetAuthSessions,
      dialog.AuthenticationOuterClass.ResponseGetAuthSessions> getGetAuthSessionsMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestGetAuthSessions,
      dialog.AuthenticationOuterClass.ResponseGetAuthSessions> getGetAuthSessionsMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestGetAuthSessions, dialog.AuthenticationOuterClass.ResponseGetAuthSessions> getGetAuthSessionsMethod;
    if ((getGetAuthSessionsMethod = AuthenticationGrpc.getGetAuthSessionsMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getGetAuthSessionsMethod = AuthenticationGrpc.getGetAuthSessionsMethod) == null) {
          AuthenticationGrpc.getGetAuthSessionsMethod = getGetAuthSessionsMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestGetAuthSessions, dialog.AuthenticationOuterClass.ResponseGetAuthSessions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "GetAuthSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestGetAuthSessions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseGetAuthSessions.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("GetAuthSessions"))
                  .build();
          }
        }
     }
     return getGetAuthSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestTerminateSession,
      dialog.Miscellaneous.ResponseVoid> getTerminateSessionMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestTerminateSession,
      dialog.Miscellaneous.ResponseVoid> getTerminateSessionMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestTerminateSession, dialog.Miscellaneous.ResponseVoid> getTerminateSessionMethod;
    if ((getTerminateSessionMethod = AuthenticationGrpc.getTerminateSessionMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getTerminateSessionMethod = AuthenticationGrpc.getTerminateSessionMethod) == null) {
          AuthenticationGrpc.getTerminateSessionMethod = getTerminateSessionMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestTerminateSession, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "TerminateSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestTerminateSession.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("TerminateSession"))
                  .build();
          }
        }
     }
     return getTerminateSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestTerminateAllSessions,
      dialog.Miscellaneous.ResponseVoid> getTerminateAllSessionsMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestTerminateAllSessions,
      dialog.Miscellaneous.ResponseVoid> getTerminateAllSessionsMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestTerminateAllSessions, dialog.Miscellaneous.ResponseVoid> getTerminateAllSessionsMethod;
    if ((getTerminateAllSessionsMethod = AuthenticationGrpc.getTerminateAllSessionsMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getTerminateAllSessionsMethod = AuthenticationGrpc.getTerminateAllSessionsMethod) == null) {
          AuthenticationGrpc.getTerminateAllSessionsMethod = getTerminateAllSessionsMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestTerminateAllSessions, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "TerminateAllSessions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestTerminateAllSessions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("TerminateAllSessions"))
                  .build();
          }
        }
     }
     return getTerminateAllSessionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSignOut,
      dialog.Miscellaneous.ResponseVoid> getSignOutMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSignOut,
      dialog.Miscellaneous.ResponseVoid> getSignOutMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSignOut, dialog.Miscellaneous.ResponseVoid> getSignOutMethod;
    if ((getSignOutMethod = AuthenticationGrpc.getSignOutMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getSignOutMethod = AuthenticationGrpc.getSignOutMethod) == null) {
          AuthenticationGrpc.getSignOutMethod = getSignOutMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestSignOut, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "SignOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestSignOut.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("SignOut"))
                  .build();
          }
        }
     }
     return getSignOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSignInObsolete,
      dialog.AuthenticationOuterClass.ResponseAuth> getSignInObsoleteMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSignInObsolete,
      dialog.AuthenticationOuterClass.ResponseAuth> getSignInObsoleteMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSignInObsolete, dialog.AuthenticationOuterClass.ResponseAuth> getSignInObsoleteMethod;
    if ((getSignInObsoleteMethod = AuthenticationGrpc.getSignInObsoleteMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getSignInObsoleteMethod = AuthenticationGrpc.getSignInObsoleteMethod) == null) {
          AuthenticationGrpc.getSignInObsoleteMethod = getSignInObsoleteMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestSignInObsolete, dialog.AuthenticationOuterClass.ResponseAuth>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "SignInObsolete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestSignInObsolete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseAuth.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("SignInObsolete"))
                  .build();
          }
        }
     }
     return getSignInObsoleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSignUpObsolete,
      dialog.AuthenticationOuterClass.ResponseAuth> getSignUpObsoleteMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSignUpObsolete,
      dialog.AuthenticationOuterClass.ResponseAuth> getSignUpObsoleteMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSignUpObsolete, dialog.AuthenticationOuterClass.ResponseAuth> getSignUpObsoleteMethod;
    if ((getSignUpObsoleteMethod = AuthenticationGrpc.getSignUpObsoleteMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getSignUpObsoleteMethod = AuthenticationGrpc.getSignUpObsoleteMethod) == null) {
          AuthenticationGrpc.getSignUpObsoleteMethod = getSignUpObsoleteMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestSignUpObsolete, dialog.AuthenticationOuterClass.ResponseAuth>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "SignUpObsolete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestSignUpObsolete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseAuth.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("SignUpObsolete"))
                  .build();
          }
        }
     }
     return getSignUpObsoleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSendAuthCodeObsolete,
      dialog.AuthenticationOuterClass.ResponseSendAuthCodeObsolete> getSendAuthCodeObsoleteMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSendAuthCodeObsolete,
      dialog.AuthenticationOuterClass.ResponseSendAuthCodeObsolete> getSendAuthCodeObsoleteMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSendAuthCodeObsolete, dialog.AuthenticationOuterClass.ResponseSendAuthCodeObsolete> getSendAuthCodeObsoleteMethod;
    if ((getSendAuthCodeObsoleteMethod = AuthenticationGrpc.getSendAuthCodeObsoleteMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getSendAuthCodeObsoleteMethod = AuthenticationGrpc.getSendAuthCodeObsoleteMethod) == null) {
          AuthenticationGrpc.getSendAuthCodeObsoleteMethod = getSendAuthCodeObsoleteMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestSendAuthCodeObsolete, dialog.AuthenticationOuterClass.ResponseSendAuthCodeObsolete>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "SendAuthCodeObsolete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestSendAuthCodeObsolete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.ResponseSendAuthCodeObsolete.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("SendAuthCodeObsolete"))
                  .build();
          }
        }
     }
     return getSendAuthCodeObsoleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSendAuthCallObsolete,
      dialog.Miscellaneous.ResponseVoid> getSendAuthCallObsoleteMethod;

  public static io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSendAuthCallObsolete,
      dialog.Miscellaneous.ResponseVoid> getSendAuthCallObsoleteMethod() {
    io.grpc.MethodDescriptor<dialog.AuthenticationOuterClass.RequestSendAuthCallObsolete, dialog.Miscellaneous.ResponseVoid> getSendAuthCallObsoleteMethod;
    if ((getSendAuthCallObsoleteMethod = AuthenticationGrpc.getSendAuthCallObsoleteMethod) == null) {
      synchronized (AuthenticationGrpc.class) {
        if ((getSendAuthCallObsoleteMethod = AuthenticationGrpc.getSendAuthCallObsoleteMethod) == null) {
          AuthenticationGrpc.getSendAuthCallObsoleteMethod = getSendAuthCallObsoleteMethod = 
              io.grpc.MethodDescriptor.<dialog.AuthenticationOuterClass.RequestSendAuthCallObsolete, dialog.Miscellaneous.ResponseVoid>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "dialog.Authentication", "SendAuthCallObsolete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.AuthenticationOuterClass.RequestSendAuthCallObsolete.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dialog.Miscellaneous.ResponseVoid.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthenticationMethodDescriptorSupplier("SendAuthCallObsolete"))
                  .build();
          }
        }
     }
     return getSendAuthCallObsoleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthenticationStub newStub(io.grpc.Channel channel) {
    return new AuthenticationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthenticationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthenticationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthenticationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthenticationFutureStub(channel);
  }

  /**
   */
  public static abstract class AuthenticationImplBase implements io.grpc.BindableService {

    /**
     */
    public void startPhoneAuth(dialog.AuthenticationOuterClass.RequestStartPhoneAuth request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseStartPhoneAuth> responseObserver) {
      asyncUnimplementedUnaryCall(getStartPhoneAuthMethod(), responseObserver);
    }

    /**
     */
    public void sendCodeByPhoneCall(dialog.AuthenticationOuterClass.RequestSendCodeByPhoneCall request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getSendCodeByPhoneCallMethod(), responseObserver);
    }

    /**
     */
    public void startEmailAuth(dialog.AuthenticationOuterClass.RequestStartEmailAuth request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseStartEmailAuth> responseObserver) {
      asyncUnimplementedUnaryCall(getStartEmailAuthMethod(), responseObserver);
    }

    /**
     */
    public void startAnonymousAuth(dialog.AuthenticationOuterClass.RequestStartAnonymousAuth request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnimplementedUnaryCall(getStartAnonymousAuthMethod(), responseObserver);
    }

    /**
     */
    public void startTokenAuth(dialog.AuthenticationOuterClass.RequestStartTokenAuth request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnimplementedUnaryCall(getStartTokenAuthMethod(), responseObserver);
    }

    /**
     */
    public void startUsernameAuth(dialog.AuthenticationOuterClass.RequestStartUsernameAuth request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseStartUsernameAuth> responseObserver) {
      asyncUnimplementedUnaryCall(getStartUsernameAuthMethod(), responseObserver);
    }

    /**
     */
    public void validateCode(dialog.AuthenticationOuterClass.RequestValidateCode request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateCodeMethod(), responseObserver);
    }

    /**
     */
    public void resendCode(dialog.AuthenticationOuterClass.RequestResendCode request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getResendCodeMethod(), responseObserver);
    }

    /**
     */
    public void validatePassword(dialog.AuthenticationOuterClass.RequestValidatePassword request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnimplementedUnaryCall(getValidatePasswordMethod(), responseObserver);
    }

    /**
     */
    public void getOAuth2Params(dialog.AuthenticationOuterClass.RequestGetOAuth2Params request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseGetOAuth2Params> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOAuth2ParamsMethod(), responseObserver);
    }

    /**
     */
    public void completeOAuth2(dialog.AuthenticationOuterClass.RequestCompleteOAuth2 request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnimplementedUnaryCall(getCompleteOAuth2Method(), responseObserver);
    }

    /**
     */
    public void signUp(dialog.AuthenticationOuterClass.RequestSignUp request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    /**
     */
    public void getAuthSessions(dialog.AuthenticationOuterClass.RequestGetAuthSessions request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseGetAuthSessions> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAuthSessionsMethod(), responseObserver);
    }

    /**
     */
    public void terminateSession(dialog.AuthenticationOuterClass.RequestTerminateSession request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getTerminateSessionMethod(), responseObserver);
    }

    /**
     */
    public void terminateAllSessions(dialog.AuthenticationOuterClass.RequestTerminateAllSessions request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getTerminateAllSessionsMethod(), responseObserver);
    }

    /**
     */
    public void signOut(dialog.AuthenticationOuterClass.RequestSignOut request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getSignOutMethod(), responseObserver);
    }

    /**
     */
    public void signInObsolete(dialog.AuthenticationOuterClass.RequestSignInObsolete request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnimplementedUnaryCall(getSignInObsoleteMethod(), responseObserver);
    }

    /**
     */
    public void signUpObsolete(dialog.AuthenticationOuterClass.RequestSignUpObsolete request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnimplementedUnaryCall(getSignUpObsoleteMethod(), responseObserver);
    }

    /**
     */
    public void sendAuthCodeObsolete(dialog.AuthenticationOuterClass.RequestSendAuthCodeObsolete request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseSendAuthCodeObsolete> responseObserver) {
      asyncUnimplementedUnaryCall(getSendAuthCodeObsoleteMethod(), responseObserver);
    }

    /**
     */
    public void sendAuthCallObsolete(dialog.AuthenticationOuterClass.RequestSendAuthCallObsolete request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnimplementedUnaryCall(getSendAuthCallObsoleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartPhoneAuthMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestStartPhoneAuth,
                dialog.AuthenticationOuterClass.ResponseStartPhoneAuth>(
                  this, METHODID_START_PHONE_AUTH)))
          .addMethod(
            getSendCodeByPhoneCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestSendCodeByPhoneCall,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_SEND_CODE_BY_PHONE_CALL)))
          .addMethod(
            getStartEmailAuthMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestStartEmailAuth,
                dialog.AuthenticationOuterClass.ResponseStartEmailAuth>(
                  this, METHODID_START_EMAIL_AUTH)))
          .addMethod(
            getStartAnonymousAuthMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestStartAnonymousAuth,
                dialog.AuthenticationOuterClass.ResponseAuth>(
                  this, METHODID_START_ANONYMOUS_AUTH)))
          .addMethod(
            getStartTokenAuthMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestStartTokenAuth,
                dialog.AuthenticationOuterClass.ResponseAuth>(
                  this, METHODID_START_TOKEN_AUTH)))
          .addMethod(
            getStartUsernameAuthMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestStartUsernameAuth,
                dialog.AuthenticationOuterClass.ResponseStartUsernameAuth>(
                  this, METHODID_START_USERNAME_AUTH)))
          .addMethod(
            getValidateCodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestValidateCode,
                dialog.AuthenticationOuterClass.ResponseAuth>(
                  this, METHODID_VALIDATE_CODE)))
          .addMethod(
            getResendCodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestResendCode,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_RESEND_CODE)))
          .addMethod(
            getValidatePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestValidatePassword,
                dialog.AuthenticationOuterClass.ResponseAuth>(
                  this, METHODID_VALIDATE_PASSWORD)))
          .addMethod(
            getGetOAuth2ParamsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestGetOAuth2Params,
                dialog.AuthenticationOuterClass.ResponseGetOAuth2Params>(
                  this, METHODID_GET_OAUTH2PARAMS)))
          .addMethod(
            getCompleteOAuth2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestCompleteOAuth2,
                dialog.AuthenticationOuterClass.ResponseAuth>(
                  this, METHODID_COMPLETE_OAUTH2)))
          .addMethod(
            getSignUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestSignUp,
                dialog.AuthenticationOuterClass.ResponseAuth>(
                  this, METHODID_SIGN_UP)))
          .addMethod(
            getGetAuthSessionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestGetAuthSessions,
                dialog.AuthenticationOuterClass.ResponseGetAuthSessions>(
                  this, METHODID_GET_AUTH_SESSIONS)))
          .addMethod(
            getTerminateSessionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestTerminateSession,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_TERMINATE_SESSION)))
          .addMethod(
            getTerminateAllSessionsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestTerminateAllSessions,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_TERMINATE_ALL_SESSIONS)))
          .addMethod(
            getSignOutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestSignOut,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_SIGN_OUT)))
          .addMethod(
            getSignInObsoleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestSignInObsolete,
                dialog.AuthenticationOuterClass.ResponseAuth>(
                  this, METHODID_SIGN_IN_OBSOLETE)))
          .addMethod(
            getSignUpObsoleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestSignUpObsolete,
                dialog.AuthenticationOuterClass.ResponseAuth>(
                  this, METHODID_SIGN_UP_OBSOLETE)))
          .addMethod(
            getSendAuthCodeObsoleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestSendAuthCodeObsolete,
                dialog.AuthenticationOuterClass.ResponseSendAuthCodeObsolete>(
                  this, METHODID_SEND_AUTH_CODE_OBSOLETE)))
          .addMethod(
            getSendAuthCallObsoleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                dialog.AuthenticationOuterClass.RequestSendAuthCallObsolete,
                dialog.Miscellaneous.ResponseVoid>(
                  this, METHODID_SEND_AUTH_CALL_OBSOLETE)))
          .build();
    }
  }

  /**
   */
  public static final class AuthenticationStub extends io.grpc.stub.AbstractStub<AuthenticationStub> {
    private AuthenticationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthenticationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthenticationStub(channel, callOptions);
    }

    /**
     */
    public void startPhoneAuth(dialog.AuthenticationOuterClass.RequestStartPhoneAuth request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseStartPhoneAuth> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartPhoneAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendCodeByPhoneCall(dialog.AuthenticationOuterClass.RequestSendCodeByPhoneCall request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendCodeByPhoneCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startEmailAuth(dialog.AuthenticationOuterClass.RequestStartEmailAuth request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseStartEmailAuth> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartEmailAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startAnonymousAuth(dialog.AuthenticationOuterClass.RequestStartAnonymousAuth request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartAnonymousAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startTokenAuth(dialog.AuthenticationOuterClass.RequestStartTokenAuth request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartTokenAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startUsernameAuth(dialog.AuthenticationOuterClass.RequestStartUsernameAuth request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseStartUsernameAuth> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartUsernameAuthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateCode(dialog.AuthenticationOuterClass.RequestValidateCode request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resendCode(dialog.AuthenticationOuterClass.RequestResendCode request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResendCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validatePassword(dialog.AuthenticationOuterClass.RequestValidatePassword request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidatePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOAuth2Params(dialog.AuthenticationOuterClass.RequestGetOAuth2Params request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseGetOAuth2Params> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOAuth2ParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void completeOAuth2(dialog.AuthenticationOuterClass.RequestCompleteOAuth2 request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCompleteOAuth2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signUp(dialog.AuthenticationOuterClass.RequestSignUp request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAuthSessions(dialog.AuthenticationOuterClass.RequestGetAuthSessions request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseGetAuthSessions> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAuthSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void terminateSession(dialog.AuthenticationOuterClass.RequestTerminateSession request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTerminateSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void terminateAllSessions(dialog.AuthenticationOuterClass.RequestTerminateAllSessions request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTerminateAllSessionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signOut(dialog.AuthenticationOuterClass.RequestSignOut request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignOutMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signInObsolete(dialog.AuthenticationOuterClass.RequestSignInObsolete request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignInObsoleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signUpObsolete(dialog.AuthenticationOuterClass.RequestSignUpObsolete request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignUpObsoleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendAuthCodeObsolete(dialog.AuthenticationOuterClass.RequestSendAuthCodeObsolete request,
        io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseSendAuthCodeObsolete> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendAuthCodeObsoleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendAuthCallObsolete(dialog.AuthenticationOuterClass.RequestSendAuthCallObsolete request,
        io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendAuthCallObsoleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuthenticationBlockingStub extends io.grpc.stub.AbstractStub<AuthenticationBlockingStub> {
    private AuthenticationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthenticationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthenticationBlockingStub(channel, callOptions);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseStartPhoneAuth startPhoneAuth(dialog.AuthenticationOuterClass.RequestStartPhoneAuth request) {
      return blockingUnaryCall(
          getChannel(), getStartPhoneAuthMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid sendCodeByPhoneCall(dialog.AuthenticationOuterClass.RequestSendCodeByPhoneCall request) {
      return blockingUnaryCall(
          getChannel(), getSendCodeByPhoneCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseStartEmailAuth startEmailAuth(dialog.AuthenticationOuterClass.RequestStartEmailAuth request) {
      return blockingUnaryCall(
          getChannel(), getStartEmailAuthMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseAuth startAnonymousAuth(dialog.AuthenticationOuterClass.RequestStartAnonymousAuth request) {
      return blockingUnaryCall(
          getChannel(), getStartAnonymousAuthMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseAuth startTokenAuth(dialog.AuthenticationOuterClass.RequestStartTokenAuth request) {
      return blockingUnaryCall(
          getChannel(), getStartTokenAuthMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseStartUsernameAuth startUsernameAuth(dialog.AuthenticationOuterClass.RequestStartUsernameAuth request) {
      return blockingUnaryCall(
          getChannel(), getStartUsernameAuthMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseAuth validateCode(dialog.AuthenticationOuterClass.RequestValidateCode request) {
      return blockingUnaryCall(
          getChannel(), getValidateCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid resendCode(dialog.AuthenticationOuterClass.RequestResendCode request) {
      return blockingUnaryCall(
          getChannel(), getResendCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseAuth validatePassword(dialog.AuthenticationOuterClass.RequestValidatePassword request) {
      return blockingUnaryCall(
          getChannel(), getValidatePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseGetOAuth2Params getOAuth2Params(dialog.AuthenticationOuterClass.RequestGetOAuth2Params request) {
      return blockingUnaryCall(
          getChannel(), getGetOAuth2ParamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseAuth completeOAuth2(dialog.AuthenticationOuterClass.RequestCompleteOAuth2 request) {
      return blockingUnaryCall(
          getChannel(), getCompleteOAuth2Method(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseAuth signUp(dialog.AuthenticationOuterClass.RequestSignUp request) {
      return blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseGetAuthSessions getAuthSessions(dialog.AuthenticationOuterClass.RequestGetAuthSessions request) {
      return blockingUnaryCall(
          getChannel(), getGetAuthSessionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid terminateSession(dialog.AuthenticationOuterClass.RequestTerminateSession request) {
      return blockingUnaryCall(
          getChannel(), getTerminateSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid terminateAllSessions(dialog.AuthenticationOuterClass.RequestTerminateAllSessions request) {
      return blockingUnaryCall(
          getChannel(), getTerminateAllSessionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid signOut(dialog.AuthenticationOuterClass.RequestSignOut request) {
      return blockingUnaryCall(
          getChannel(), getSignOutMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseAuth signInObsolete(dialog.AuthenticationOuterClass.RequestSignInObsolete request) {
      return blockingUnaryCall(
          getChannel(), getSignInObsoleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseAuth signUpObsolete(dialog.AuthenticationOuterClass.RequestSignUpObsolete request) {
      return blockingUnaryCall(
          getChannel(), getSignUpObsoleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.AuthenticationOuterClass.ResponseSendAuthCodeObsolete sendAuthCodeObsolete(dialog.AuthenticationOuterClass.RequestSendAuthCodeObsolete request) {
      return blockingUnaryCall(
          getChannel(), getSendAuthCodeObsoleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public dialog.Miscellaneous.ResponseVoid sendAuthCallObsolete(dialog.AuthenticationOuterClass.RequestSendAuthCallObsolete request) {
      return blockingUnaryCall(
          getChannel(), getSendAuthCallObsoleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuthenticationFutureStub extends io.grpc.stub.AbstractStub<AuthenticationFutureStub> {
    private AuthenticationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthenticationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthenticationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthenticationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseStartPhoneAuth> startPhoneAuth(
        dialog.AuthenticationOuterClass.RequestStartPhoneAuth request) {
      return futureUnaryCall(
          getChannel().newCall(getStartPhoneAuthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> sendCodeByPhoneCall(
        dialog.AuthenticationOuterClass.RequestSendCodeByPhoneCall request) {
      return futureUnaryCall(
          getChannel().newCall(getSendCodeByPhoneCallMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseStartEmailAuth> startEmailAuth(
        dialog.AuthenticationOuterClass.RequestStartEmailAuth request) {
      return futureUnaryCall(
          getChannel().newCall(getStartEmailAuthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseAuth> startAnonymousAuth(
        dialog.AuthenticationOuterClass.RequestStartAnonymousAuth request) {
      return futureUnaryCall(
          getChannel().newCall(getStartAnonymousAuthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseAuth> startTokenAuth(
        dialog.AuthenticationOuterClass.RequestStartTokenAuth request) {
      return futureUnaryCall(
          getChannel().newCall(getStartTokenAuthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseStartUsernameAuth> startUsernameAuth(
        dialog.AuthenticationOuterClass.RequestStartUsernameAuth request) {
      return futureUnaryCall(
          getChannel().newCall(getStartUsernameAuthMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseAuth> validateCode(
        dialog.AuthenticationOuterClass.RequestValidateCode request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateCodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> resendCode(
        dialog.AuthenticationOuterClass.RequestResendCode request) {
      return futureUnaryCall(
          getChannel().newCall(getResendCodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseAuth> validatePassword(
        dialog.AuthenticationOuterClass.RequestValidatePassword request) {
      return futureUnaryCall(
          getChannel().newCall(getValidatePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseGetOAuth2Params> getOAuth2Params(
        dialog.AuthenticationOuterClass.RequestGetOAuth2Params request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOAuth2ParamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseAuth> completeOAuth2(
        dialog.AuthenticationOuterClass.RequestCompleteOAuth2 request) {
      return futureUnaryCall(
          getChannel().newCall(getCompleteOAuth2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseAuth> signUp(
        dialog.AuthenticationOuterClass.RequestSignUp request) {
      return futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseGetAuthSessions> getAuthSessions(
        dialog.AuthenticationOuterClass.RequestGetAuthSessions request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAuthSessionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> terminateSession(
        dialog.AuthenticationOuterClass.RequestTerminateSession request) {
      return futureUnaryCall(
          getChannel().newCall(getTerminateSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> terminateAllSessions(
        dialog.AuthenticationOuterClass.RequestTerminateAllSessions request) {
      return futureUnaryCall(
          getChannel().newCall(getTerminateAllSessionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> signOut(
        dialog.AuthenticationOuterClass.RequestSignOut request) {
      return futureUnaryCall(
          getChannel().newCall(getSignOutMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseAuth> signInObsolete(
        dialog.AuthenticationOuterClass.RequestSignInObsolete request) {
      return futureUnaryCall(
          getChannel().newCall(getSignInObsoleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseAuth> signUpObsolete(
        dialog.AuthenticationOuterClass.RequestSignUpObsolete request) {
      return futureUnaryCall(
          getChannel().newCall(getSignUpObsoleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.AuthenticationOuterClass.ResponseSendAuthCodeObsolete> sendAuthCodeObsolete(
        dialog.AuthenticationOuterClass.RequestSendAuthCodeObsolete request) {
      return futureUnaryCall(
          getChannel().newCall(getSendAuthCodeObsoleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dialog.Miscellaneous.ResponseVoid> sendAuthCallObsolete(
        dialog.AuthenticationOuterClass.RequestSendAuthCallObsolete request) {
      return futureUnaryCall(
          getChannel().newCall(getSendAuthCallObsoleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START_PHONE_AUTH = 0;
  private static final int METHODID_SEND_CODE_BY_PHONE_CALL = 1;
  private static final int METHODID_START_EMAIL_AUTH = 2;
  private static final int METHODID_START_ANONYMOUS_AUTH = 3;
  private static final int METHODID_START_TOKEN_AUTH = 4;
  private static final int METHODID_START_USERNAME_AUTH = 5;
  private static final int METHODID_VALIDATE_CODE = 6;
  private static final int METHODID_RESEND_CODE = 7;
  private static final int METHODID_VALIDATE_PASSWORD = 8;
  private static final int METHODID_GET_OAUTH2PARAMS = 9;
  private static final int METHODID_COMPLETE_OAUTH2 = 10;
  private static final int METHODID_SIGN_UP = 11;
  private static final int METHODID_GET_AUTH_SESSIONS = 12;
  private static final int METHODID_TERMINATE_SESSION = 13;
  private static final int METHODID_TERMINATE_ALL_SESSIONS = 14;
  private static final int METHODID_SIGN_OUT = 15;
  private static final int METHODID_SIGN_IN_OBSOLETE = 16;
  private static final int METHODID_SIGN_UP_OBSOLETE = 17;
  private static final int METHODID_SEND_AUTH_CODE_OBSOLETE = 18;
  private static final int METHODID_SEND_AUTH_CALL_OBSOLETE = 19;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthenticationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthenticationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START_PHONE_AUTH:
          serviceImpl.startPhoneAuth((dialog.AuthenticationOuterClass.RequestStartPhoneAuth) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseStartPhoneAuth>) responseObserver);
          break;
        case METHODID_SEND_CODE_BY_PHONE_CALL:
          serviceImpl.sendCodeByPhoneCall((dialog.AuthenticationOuterClass.RequestSendCodeByPhoneCall) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_START_EMAIL_AUTH:
          serviceImpl.startEmailAuth((dialog.AuthenticationOuterClass.RequestStartEmailAuth) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseStartEmailAuth>) responseObserver);
          break;
        case METHODID_START_ANONYMOUS_AUTH:
          serviceImpl.startAnonymousAuth((dialog.AuthenticationOuterClass.RequestStartAnonymousAuth) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth>) responseObserver);
          break;
        case METHODID_START_TOKEN_AUTH:
          serviceImpl.startTokenAuth((dialog.AuthenticationOuterClass.RequestStartTokenAuth) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth>) responseObserver);
          break;
        case METHODID_START_USERNAME_AUTH:
          serviceImpl.startUsernameAuth((dialog.AuthenticationOuterClass.RequestStartUsernameAuth) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseStartUsernameAuth>) responseObserver);
          break;
        case METHODID_VALIDATE_CODE:
          serviceImpl.validateCode((dialog.AuthenticationOuterClass.RequestValidateCode) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth>) responseObserver);
          break;
        case METHODID_RESEND_CODE:
          serviceImpl.resendCode((dialog.AuthenticationOuterClass.RequestResendCode) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_VALIDATE_PASSWORD:
          serviceImpl.validatePassword((dialog.AuthenticationOuterClass.RequestValidatePassword) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth>) responseObserver);
          break;
        case METHODID_GET_OAUTH2PARAMS:
          serviceImpl.getOAuth2Params((dialog.AuthenticationOuterClass.RequestGetOAuth2Params) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseGetOAuth2Params>) responseObserver);
          break;
        case METHODID_COMPLETE_OAUTH2:
          serviceImpl.completeOAuth2((dialog.AuthenticationOuterClass.RequestCompleteOAuth2) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth>) responseObserver);
          break;
        case METHODID_SIGN_UP:
          serviceImpl.signUp((dialog.AuthenticationOuterClass.RequestSignUp) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth>) responseObserver);
          break;
        case METHODID_GET_AUTH_SESSIONS:
          serviceImpl.getAuthSessions((dialog.AuthenticationOuterClass.RequestGetAuthSessions) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseGetAuthSessions>) responseObserver);
          break;
        case METHODID_TERMINATE_SESSION:
          serviceImpl.terminateSession((dialog.AuthenticationOuterClass.RequestTerminateSession) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_TERMINATE_ALL_SESSIONS:
          serviceImpl.terminateAllSessions((dialog.AuthenticationOuterClass.RequestTerminateAllSessions) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_SIGN_OUT:
          serviceImpl.signOut((dialog.AuthenticationOuterClass.RequestSignOut) request,
              (io.grpc.stub.StreamObserver<dialog.Miscellaneous.ResponseVoid>) responseObserver);
          break;
        case METHODID_SIGN_IN_OBSOLETE:
          serviceImpl.signInObsolete((dialog.AuthenticationOuterClass.RequestSignInObsolete) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth>) responseObserver);
          break;
        case METHODID_SIGN_UP_OBSOLETE:
          serviceImpl.signUpObsolete((dialog.AuthenticationOuterClass.RequestSignUpObsolete) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseAuth>) responseObserver);
          break;
        case METHODID_SEND_AUTH_CODE_OBSOLETE:
          serviceImpl.sendAuthCodeObsolete((dialog.AuthenticationOuterClass.RequestSendAuthCodeObsolete) request,
              (io.grpc.stub.StreamObserver<dialog.AuthenticationOuterClass.ResponseSendAuthCodeObsolete>) responseObserver);
          break;
        case METHODID_SEND_AUTH_CALL_OBSOLETE:
          serviceImpl.sendAuthCallObsolete((dialog.AuthenticationOuterClass.RequestSendAuthCallObsolete) request,
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

  private static abstract class AuthenticationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthenticationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dialog.AuthenticationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Authentication");
    }
  }

  private static final class AuthenticationFileDescriptorSupplier
      extends AuthenticationBaseDescriptorSupplier {
    AuthenticationFileDescriptorSupplier() {}
  }

  private static final class AuthenticationMethodDescriptorSupplier
      extends AuthenticationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthenticationMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthenticationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthenticationFileDescriptorSupplier())
              .addMethod(getStartPhoneAuthMethod())
              .addMethod(getSendCodeByPhoneCallMethod())
              .addMethod(getStartEmailAuthMethod())
              .addMethod(getStartAnonymousAuthMethod())
              .addMethod(getStartTokenAuthMethod())
              .addMethod(getStartUsernameAuthMethod())
              .addMethod(getValidateCodeMethod())
              .addMethod(getResendCodeMethod())
              .addMethod(getValidatePasswordMethod())
              .addMethod(getGetOAuth2ParamsMethod())
              .addMethod(getCompleteOAuth2Method())
              .addMethod(getSignUpMethod())
              .addMethod(getGetAuthSessionsMethod())
              .addMethod(getTerminateSessionMethod())
              .addMethod(getTerminateAllSessionsMethod())
              .addMethod(getSignOutMethod())
              .addMethod(getSignInObsoleteMethod())
              .addMethod(getSignUpObsoleteMethod())
              .addMethod(getSendAuthCodeObsoleteMethod())
              .addMethod(getSendAuthCallObsoleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
