package com.zero.druid;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.zero.druid.mapper")
public class ZeroDruidBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeroDruidBootApplication.class, args);
    }

}
