package com.jmx.hello.service.impl;

import com.jmx.hello.mbean.MyMBean;
import com.jmx.hello.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MyServiceImpl implements MyService {

    @Autowired
    MyMBean mbean;

    public void run() {
        while(mbean.getToggle()){
            System.out.println("run()..");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                //ignore
            }
        }

        System.out.println("END");

    }

}
