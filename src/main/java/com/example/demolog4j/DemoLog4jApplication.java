package com.example.demolog4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoLog4jApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoLog4jApplication.class, args);
    }

}
