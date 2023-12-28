package com.onestep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
@ComponentScan("com.onestep")
@ComponentScan("io.swagger")
public class APIRAGDemoServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(APIRAGDemoServiceApplication.class, args);
    }

}
