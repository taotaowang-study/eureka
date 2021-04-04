package com.study.consumerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient //注解用来将当前应用加入到服务治理体系中
public class ConsumerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerServerApplication.class, args);
    }

    /**
     *
     * @description:  初始化RestTemplate，用来真正发起REST请求
     * @param
     * @return: org.springframework.web.client.RestTemplate
     * @author: wtt
     * @date: 2021/4/3 8:55 下午
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
