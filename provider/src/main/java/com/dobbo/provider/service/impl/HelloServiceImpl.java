package com.dobbo.provider.service.impl;

import com.dobbo.common.service.HelloService;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String name) {
        System.out.println("from client massage:=" + name);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(calendar.getTime());
        return "Server return massage:=" + name + ",CurrentTime:=" + currentTime;
    }
}
