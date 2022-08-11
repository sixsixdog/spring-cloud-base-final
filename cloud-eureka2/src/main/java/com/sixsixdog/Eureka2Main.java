package com.sixsixdog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
@Package: com.sixsixdog
@ClassName: ${NAME}
@Author: Sixsixdog
@CreateTime: ${YEAR}-${MONTH}-${DAY} ${TIME}
@Description: */

@EnableEurekaServer
@SpringBootApplication
public class Eureka2Main {
    public static void main(String[] args) {
        SpringApplication.run(Eureka2Main.class, args);
    }
}