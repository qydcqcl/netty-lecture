package com.example.thrift;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import thrift.generated.Person;
import thrift.generated.PersonService;

/**
 * @author hzq
 * @date 2019/6/30 0030 下午 3:38
 */
public class ThriftClient {

    public static void main(String[] args) {
        TTransport transport = new TFramedTransport(new TSocket("localhost", 8080), 600);
        TProtocol protocol = new TCompactProtocol(transport);
        PersonService.Client client = new PersonService.Client(protocol);
        try {
            transport.open();
            Person ming = client.getPersonByUsername("ming");
            System.out.println(ming.getUsername());
            System.out.println(ming.getAge());
            System.out.println(ming.isMarried());

            System.out.println("---------------------------");
            Person person = new Person();
            person.setUsername("李四");
            person.setAge(10);
            person.setMarried(true);
            client.savePerson(person);

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            transport.close();
        }
    }
}
