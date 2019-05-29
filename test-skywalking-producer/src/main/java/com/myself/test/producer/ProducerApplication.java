package com.myself.test.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 类名称：ProducerApplication<br>
 * 类描述：<br>
 * 创建时间：2019年05月29日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@SpringBootApplication
@EnableEurekaClient
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
