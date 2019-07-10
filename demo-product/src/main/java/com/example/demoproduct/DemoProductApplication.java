package com.example.demoproduct;

import com.example.demoproduct.config.DemoConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Configuration;

@SpringCloudApplication
@EnableConfigurationProperties(DemoConfig.class)
public class DemoProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoProductApplication.class, args);
    }
}
