package com.ych.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: chengHang
 * @version: 1.0
 * @create: 2020-09-22 10:58
 **/
@Configuration
public class ApplicationContextConfig {
    /**
     *客户端负载均衡
     **/
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
