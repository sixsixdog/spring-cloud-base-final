package com.sixsixdog.request;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Package: config.request
 * @ClassName: RestTemplate
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-08 13:46
 * @Description:
 */
//配置类
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
