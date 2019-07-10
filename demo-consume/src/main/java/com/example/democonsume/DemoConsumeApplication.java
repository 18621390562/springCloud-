package com.example.democonsume;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class DemoConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConsumeApplication.class, args);
    }
}
