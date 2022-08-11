package com.sixsixdog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Package: PACKAGE_NAME
 * @ClassName: payMain
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-07 16:09
 * @Description:
 */
@EnableEurekaClient
@SpringBootApplication
public class PayMain2
{
    public static void main(String[] args) {
        SpringApplication.run(PayMain2.class,args);
    }
}
