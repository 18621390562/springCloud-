package com.example.demoapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringCloudApplication
@EnableZuulProxy
public class DemoApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApiGatewayApplication.class, args);
    }
}
