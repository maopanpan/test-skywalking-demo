package com.myself.test.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 类名称：EurekaApplication<br>
 * 类描述：<br>
 * 创建时间：2019年05月29日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
