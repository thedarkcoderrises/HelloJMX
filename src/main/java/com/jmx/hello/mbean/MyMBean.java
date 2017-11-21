package com.jmx.hello.mbean;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@ManagedResource(objectName = "com.jmx.hello.mbean:name=MyMBean")
public class MyMBean {

    private boolean toggle;

    @PostConstruct
    void init(){
        this.toggle=true;
    }

    @ManagedAttribute
    public boolean getToggle() {
        return toggle;
    }

    @ManagedAttribute
    public void setToggle(boolean toggle) {
        this.toggle = toggle;
    }
}
