package com.jacky;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboMeetingServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(DubboMeetingServiceApplication.class, args);
    }

}
