package com.example.supportservice;

import com.example.supportservice.infrastructure.ChatDomainConfig;
import com.example.supportservice.infrastructure.UserDomainConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({
        UserDomainConfig.class,
        ChatDomainConfig.class
})
public class SupportServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupportServiceApplication.class, args);
    }

}
