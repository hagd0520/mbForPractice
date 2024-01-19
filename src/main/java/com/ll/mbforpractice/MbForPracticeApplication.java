package com.ll.mbforpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MbForPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MbForPracticeApplication.class, args);
    }

}
