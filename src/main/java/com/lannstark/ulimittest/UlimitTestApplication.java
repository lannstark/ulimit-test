package com.lannstark.ulimittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class UlimitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(UlimitTestApplication.class, args);
    }

}
