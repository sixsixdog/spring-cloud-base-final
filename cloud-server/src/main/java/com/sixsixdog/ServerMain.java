package com.sixsixdog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Package: PACKAGE_NAME
 * @ClassName: serverMain
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-08 14:02
 * @Description:
 */
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class ServerMain {
    public static void main(String[] args) {
        SpringApplication.run(ServerMain.class, args);
    }
}
