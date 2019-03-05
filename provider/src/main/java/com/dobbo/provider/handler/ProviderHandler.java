package com.dobbo.provider.handler;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderHandler {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");

        context.start();
        System.in.read();
    }
}
