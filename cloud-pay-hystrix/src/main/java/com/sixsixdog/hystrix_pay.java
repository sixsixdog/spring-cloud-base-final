package com.sixsixdog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
@Package: com.sixsixdog
@ClassName: ${NAME}
@Author: Sixsixdog
@CreateTime: ${YEAR}-${MONTH}-${DAY} ${TIME}
@Description: */

@EnableHystrix
@SpringBootApplication
public class hystrix_pay {
    public static void main(String[] args) {
        SpringApplication.run(hystrix_pay.class, args);
    }
}