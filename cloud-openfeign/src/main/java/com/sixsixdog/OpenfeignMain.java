package com.sixsixdog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
@Package: com.sixsixdog
@ClassName: ${NAME}
@Author: Sixsixdog
@CreateTime: ${YEAR}-${MONTH}-${DAY} ${TIME}
@Description: */

@EnableFeignClients
@SpringBootApplication
public class OpenfeignMain {
    public static void main(String[] args) {
        SpringApplication.run(OpenfeignMain.class, args);
    }
}