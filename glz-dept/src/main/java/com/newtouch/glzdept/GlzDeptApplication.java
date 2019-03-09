package com.newtouch.glzdept;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.newtouch")
@MapperScan({"com.newtouch.*.dao"})
public class GlzDeptApplication {


    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(GlzDeptApplication.class);
        springApplication.run(args);
    }
}
