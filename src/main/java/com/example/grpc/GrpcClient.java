package com.example.grpc;

import com.example.proto.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.time.LocalDateTime;
import java.util.Iterator;

/**
 * @author hzq
 * @date 2019/7/7 0007 下午 3:44
 */
public class GrpcClient {

    public static void main(String[] args) {
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost", 8080)
                .usePlaintext(true).build();

        //同步的
        StudentServiceGrpc.StudentServiceBlockingStub blockingStub = StudentServiceGrpc.newBlockingStub(managedChannel);
        //异步的
        StudentServiceGrpc.StudentServiceStub stub = StudentServiceGrpc.newStub(managedChannel);

        MyResponse response = blockingStub.getRealnameByUsername(MyRequest.newBuilder().setUsername("张三").build());

        System.out.println(response.getRealname());

//        System.out.println("========================================");
//
//        Iterator<StudentResponse> it = blockingStub.getStudnetByAge(StudentRequest.newBuilder().setAge(18).build());
//
//        while(it.hasNext()){
//            StudentResponse studentResponse = it.next();
//            System.out.println(studentResponse.getName() + "," + studentResponse.getAge() + "," + studentResponse.getCity());
//        }
//
//        System.out.println("========================================");

//        StreamObserver<StudentResponseList> studentResponseListStreamObserver = new StreamObserver<StudentResponseList>() {
//            @Override
//            public void onNext(StudentResponseList value) {
//                value.getStudentResponseList().forEach(studentResponse -> {
//                    System.out.println(studentResponse.getName());
//                    System.out.println(studentResponse.getAge());
//                    System.out.println(studentResponse.getCity());
//                });
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                System.out.println(t.getMessage());
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("completed!");
//            }
//        };
//
//        StreamObserver<StudentRequest> studentRequestStreamObserver = stub.getStudentsWrapperByAges(studentResponseListStreamObserver);
//
//        studentRequestStreamObserver.onNext(StudentRequest.newBuilder().setAge(18).build());
//        studentRequestStreamObserver.onNext(StudentRequest.newBuilder().setAge(19).build());
//        studentRequestStreamObserver.onNext(StudentRequest.newBuilder().setAge(20).build());
//        studentRequestStreamObserver.onNext(StudentRequest.newBuilder().setAge(21).build());
//
//        studentRequestStreamObserver.onCompleted();
//
//        System.out.println("========================================");



//        StreamObserver<StreamRequest> streamRequestStreamObserver = stub.biTalk(new StreamObserver<StreamResponse>() {
//
//            @Override
//            public void onNext(StreamResponse value) {
//                System.out.println(value.getResponseInfo());
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                System.out.println(t.getMessage());
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("completed!");
//            }
//        });
//
//        for(int i = 0; i < 10; i++){
//            streamRequestStreamObserver.onNext(StreamRequest.newBuilder().setRequestInto(LocalDateTime.now().toString()).build());
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//
//        try {
//            Thread.sleep(5000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}
