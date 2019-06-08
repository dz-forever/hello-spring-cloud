package com.funtl.hello.spring.cloud.services.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ServicesAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicesAdminApplication.class, args);
    }
}
