package com.yuhen.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.yuhen")
@MapperScan("com.yuhen.mapper")
public class BlogApplication {
    // SpringBoot实战 https://potoyang.gitbook.io/spring-in-action-v5/di-4-zhang-spring-an-quan/4.2-pei-zhi-spring-security
    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

}
