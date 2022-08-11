package com.sixsixdog.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

/**
 * @Package: com.sixsixdog.config
 * @ClassName: LogConfig
 * @Author: Sixsixdog
 * @CreateTime: 2022-08-11 21:43
 * @Description:
 */
@Configuration
public class LogConfig {
    // 可以设置日志级别，此处为debug
    @Bean
    Logger.Level level() {
        return Logger.Level.FULL;
    }
}
