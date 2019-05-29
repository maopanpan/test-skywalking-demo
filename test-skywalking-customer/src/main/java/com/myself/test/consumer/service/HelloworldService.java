package com.myself.test.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类名称：HelloworldService<br>
 * 类描述：<br>
 * 创建时间：2019年05月29日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@FeignClient(value = "test-skywalking-producer")
public interface HelloworldService {
    @GetMapping(value = "/sayHello")
    String sayHello(@RequestParam(value = "name") String name);

    @GetMapping(value = "/findByName")
    String findByName(@RequestParam(value = "name") String name);
}
