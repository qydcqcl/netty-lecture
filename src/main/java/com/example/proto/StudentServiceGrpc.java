package com.example.proto;

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
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: Strudent.proto")
public final class StudentServiceGrpc {

  private StudentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.proto.StudentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.proto.MyRequest,
      com.example.proto.MyResponse> getGetRealnameByUsernameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRealnameByUsername",
      requestType = com.example.proto.MyRequest.class,
      responseType = com.example.proto.MyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.proto.MyRequest,
      com.example.proto.MyResponse> getGetRealnameByUsernameMethod() {
    io.grpc.MethodDescriptor<com.example.proto.MyRequest, com.example.proto.MyResponse> getGetRealnameByUsernameMethod;
    if ((getGetRealnameByUsernameMethod = StudentServiceGrpc.getGetRealnameByUsernameMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetRealnameByUsernameMethod = StudentServiceGrpc.getGetRealnameByUsernameMethod) == null) {
          StudentServiceGrpc.getGetRealnameByUsernameMethod = getGetRealnameByUsernameMethod = 
              io.grpc.MethodDescriptor.<com.example.proto.MyRequest, com.example.proto.MyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.proto.StudentService", "GetRealnameByUsername"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.proto.MyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.proto.MyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetRealnameByUsername"))
                  .build();
          }
        }
     }
     return getGetRealnameByUsernameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.proto.StudentRequest,
      com.example.proto.StudentResponse> getGetStudnetByAgeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudnetByAge",
      requestType = com.example.proto.StudentRequest.class,
      responseType = com.example.proto.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.proto.StudentRequest,
      com.example.proto.StudentResponse> getGetStudnetByAgeMethod() {
    io.grpc.MethodDescriptor<com.example.proto.StudentRequest, com.example.proto.StudentResponse> getGetStudnetByAgeMethod;
    if ((getGetStudnetByAgeMethod = StudentServiceGrpc.getGetStudnetByAgeMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudnetByAgeMethod = StudentServiceGrpc.getGetStudnetByAgeMethod) == null) {
          StudentServiceGrpc.getGetStudnetByAgeMethod = getGetStudnetByAgeMethod = 
              io.grpc.MethodDescriptor.<com.example.proto.StudentRequest, com.example.proto.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.proto.StudentService", "GetStudnetByAge"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.proto.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.proto.StudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudnetByAge"))
                  .build();
          }
        }
     }
     return getGetStudnetByAgeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.proto.StudentRequest,
      com.example.proto.StudentResponseList> getGetStudentsWrapperByAgesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStudentsWrapperByAges",
      requestType = com.example.proto.StudentRequest.class,
      responseType = com.example.proto.StudentResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.proto.StudentRequest,
      com.example.proto.StudentResponseList> getGetStudentsWrapperByAgesMethod() {
    io.grpc.MethodDescriptor<com.example.proto.StudentRequest, com.example.proto.StudentResponseList> getGetStudentsWrapperByAgesMethod;
    if ((getGetStudentsWrapperByAgesMethod = StudentServiceGrpc.getGetStudentsWrapperByAgesMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getGetStudentsWrapperByAgesMethod = StudentServiceGrpc.getGetStudentsWrapperByAgesMethod) == null) {
          StudentServiceGrpc.getGetStudentsWrapperByAgesMethod = getGetStudentsWrapperByAgesMethod = 
              io.grpc.MethodDescriptor.<com.example.proto.StudentRequest, com.example.proto.StudentResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.proto.StudentService", "GetStudentsWrapperByAges"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.proto.StudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.proto.StudentResponseList.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("GetStudentsWrapperByAges"))
                  .build();
          }
        }
     }
     return getGetStudentsWrapperByAgesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.proto.StreamRequest,
      com.example.proto.StreamResponse> getBiTalkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BiTalk",
      requestType = com.example.proto.StreamRequest.class,
      responseType = com.example.proto.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.proto.StreamRequest,
      com.example.proto.StreamResponse> getBiTalkMethod() {
    io.grpc.MethodDescriptor<com.example.proto.StreamRequest, com.example.proto.StreamResponse> getBiTalkMethod;
    if ((getBiTalkMethod = StudentServiceGrpc.getBiTalkMethod) == null) {
      synchronized (StudentServiceGrpc.class) {
        if ((getBiTalkMethod = StudentServiceGrpc.getBiTalkMethod) == null) {
          StudentServiceGrpc.getBiTalkMethod = getBiTalkMethod = 
              io.grpc.MethodDescriptor.<com.example.proto.StreamRequest, com.example.proto.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.proto.StudentService", "BiTalk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.proto.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.proto.StreamResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new StudentServiceMethodDescriptorSupplier("BiTalk"))
                  .build();
          }
        }
     }
     return getBiTalkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StudentServiceStub newStub(io.grpc.Channel channel) {
    return new StudentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new StudentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new StudentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class StudentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRealnameByUsername(com.example.proto.MyRequest request,
        io.grpc.stub.StreamObserver<com.example.proto.MyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRealnameByUsernameMethod(), responseObserver);
    }

    /**
     */
    public void getStudnetByAge(com.example.proto.StudentRequest request,
        io.grpc.stub.StreamObserver<com.example.proto.StudentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStudnetByAgeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.proto.StudentRequest> getStudentsWrapperByAges(
        io.grpc.stub.StreamObserver<com.example.proto.StudentResponseList> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetStudentsWrapperByAgesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.proto.StreamRequest> biTalk(
        io.grpc.stub.StreamObserver<com.example.proto.StreamResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getBiTalkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRealnameByUsernameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.proto.MyRequest,
                com.example.proto.MyResponse>(
                  this, METHODID_GET_REALNAME_BY_USERNAME)))
          .addMethod(
            getGetStudnetByAgeMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.example.proto.StudentRequest,
                com.example.proto.StudentResponse>(
                  this, METHODID_GET_STUDNET_BY_AGE)))
          .addMethod(
            getGetStudentsWrapperByAgesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.example.proto.StudentRequest,
                com.example.proto.StudentResponseList>(
                  this, METHODID_GET_STUDENTS_WRAPPER_BY_AGES)))
          .addMethod(
            getBiTalkMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.proto.StreamRequest,
                com.example.proto.StreamResponse>(
                  this, METHODID_BI_TALK)))
          .build();
    }
  }

  /**
   */
  public static final class StudentServiceStub extends io.grpc.stub.AbstractStub<StudentServiceStub> {
    private StudentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRealnameByUsername(com.example.proto.MyRequest request,
        io.grpc.stub.StreamObserver<com.example.proto.MyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRealnameByUsernameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudnetByAge(com.example.proto.StudentRequest request,
        io.grpc.stub.StreamObserver<com.example.proto.StudentResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetStudnetByAgeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.proto.StudentRequest> getStudentsWrapperByAges(
        io.grpc.stub.StreamObserver<com.example.proto.StudentResponseList> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetStudentsWrapperByAgesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.proto.StreamRequest> biTalk(
        io.grpc.stub.StreamObserver<com.example.proto.StreamResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getBiTalkMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class StudentServiceBlockingStub extends io.grpc.stub.AbstractStub<StudentServiceBlockingStub> {
    private StudentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.proto.MyResponse getRealnameByUsername(com.example.proto.MyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRealnameByUsernameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.proto.StudentResponse> getStudnetByAge(
        com.example.proto.StudentRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetStudnetByAgeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StudentServiceFutureStub extends io.grpc.stub.AbstractStub<StudentServiceFutureStub> {
    private StudentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private StudentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StudentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new StudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.proto.MyResponse> getRealnameByUsername(
        com.example.proto.MyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRealnameByUsernameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REALNAME_BY_USERNAME = 0;
  private static final int METHODID_GET_STUDNET_BY_AGE = 1;
  private static final int METHODID_GET_STUDENTS_WRAPPER_BY_AGES = 2;
  private static final int METHODID_BI_TALK = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REALNAME_BY_USERNAME:
          serviceImpl.getRealnameByUsername((com.example.proto.MyRequest) request,
              (io.grpc.stub.StreamObserver<com.example.proto.MyResponse>) responseObserver);
          break;
        case METHODID_GET_STUDNET_BY_AGE:
          serviceImpl.getStudnetByAge((com.example.proto.StudentRequest) request,
              (io.grpc.stub.StreamObserver<com.example.proto.StudentResponse>) responseObserver);
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
        case METHODID_GET_STUDENTS_WRAPPER_BY_AGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getStudentsWrapperByAges(
              (io.grpc.stub.StreamObserver<com.example.proto.StudentResponseList>) responseObserver);
        case METHODID_BI_TALK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.biTalk(
              (io.grpc.stub.StreamObserver<com.example.proto.StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.proto.StudentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StudentService");
    }
  }

  private static final class StudentServiceFileDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier {
    StudentServiceFileDescriptorSupplier() {}
  }

  private static final class StudentServiceMethodDescriptorSupplier
      extends StudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StudentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (StudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StudentServiceFileDescriptorSupplier())
              .addMethod(getGetRealnameByUsernameMethod())
              .addMethod(getGetStudnetByAgeMethod())
              .addMethod(getGetStudentsWrapperByAgesMethod())
              .addMethod(getBiTalkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
