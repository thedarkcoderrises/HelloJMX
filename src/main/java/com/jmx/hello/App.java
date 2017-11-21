package com.jmx.hello;

import com.jmx.hello.service.MyService;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{

    public static void main( String[] args ){
        SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.OFF);

        ApplicationContext ac =  app.run(args);
       MyService ms = ac.getBean(MyService.class);
       ms.run();


        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

