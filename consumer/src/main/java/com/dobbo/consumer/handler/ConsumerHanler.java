package com.dobbo.consumer.handler;

import com.dobbo.common.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerHanler {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");

        context.start();
        HelloService service = context.getBean("helloService",HelloService.class);
        String hello = service.sayHello("I am dobbo.");
        System.out.println("hello calling:=" + hello);
    }
}
