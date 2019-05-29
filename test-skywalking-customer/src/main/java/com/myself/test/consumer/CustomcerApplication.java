package com.myself.test.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 类名称：CustomcerApplication<br>
 * 类描述：<br>
 * 创建时间：2019年05月29日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CustomcerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomcerApplication.class, args);
    }
}
