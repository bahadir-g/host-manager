package com.example.hostmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class HostManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HostManagerApplication.class, args);
    }


}
