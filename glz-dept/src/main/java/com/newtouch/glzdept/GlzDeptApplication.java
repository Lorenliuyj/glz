package com.newtouch.glzdept;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan("com.newtouch")
@MapperScan({"com.newtouch.*.*.dao"})
public class GlzDeptApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(GlzDeptApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(GlzDeptApplication.class);
        springApplication.run(GlzDeptApplication.class, args);
    }
}
