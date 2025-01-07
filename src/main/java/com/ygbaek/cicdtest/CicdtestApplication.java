package com.ygbaek.cicdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class CicdtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdtestApplication.class, args);
    }

}
