package com.example.grpc;

import com.example.proto.*;
import io.grpc.stub.StreamObserver;

import java.util.UUID;

/**
 * @author hzq
 * @date 2019/7/7 0007 下午 3:28
 */
public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    @Override
    public void getRealnameByUsername(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println("接收到客户端请求: " + request.getUsername());

        responseObserver.onNext(MyResponse.newBuilder().setRealname("张三").build());
        responseObserver.onCompleted();
    }

    @Override
    public void getStudnetByAge(StudentRequest request, StreamObserver<StudentResponse> responseObserver) {
        System.out.println("接收到客户端请求: " + request.getAge());

        responseObserver.onNext(StudentResponse.newBuilder().setName("张三").setAge(18).setCity("北京").build());
        responseObserver.onNext(StudentResponse.newBuilder().setName("李四").setAge(19).setCity("上海").build());
        responseObserver.onNext(StudentResponse.newBuilder().setName("王五").setAge(20).setCity("广州").build());
        responseObserver.onNext(StudentResponse.newBuilder().setName("赵六").setAge(21).setCity("深圳").build());

        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<StudentRequest> getStudentsWrapperByAges(StreamObserver<StudentResponseList> responseObserver) {
        return new StreamObserver<StudentRequest>() {
            @Override
            public void onNext(StudentRequest value) {
                System.out.println("onNext: " + value.getAge());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                StudentResponse response1 = StudentResponse.newBuilder().setName("王二").setAge(18).setCity("北京").build();
                StudentResponse response2 = StudentResponse.newBuilder().setName("麻子").setAge(19).setCity("上海").build();

                StudentResponseList list = StudentResponseList.newBuilder().addStudentResponse(response1).addStudentResponse(response2).build();

                responseObserver.onNext(list);
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<StreamRequest> biTalk(StreamObserver<StreamResponse> responseObserver) {
        return new StreamObserver<StreamRequest>() {
            @Override
            public void onNext(StreamRequest value) {
                System.out.println(value.getRequestInto());

                responseObserver.onNext(StreamResponse.newBuilder().setResponseInfo(UUID.randomUUID().toString()).build());
            }

            @Override
            public void onError(Throwable t) {
                System.out.println(t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
