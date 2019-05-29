package com.myself.test.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称：HelloworldController<br>
 * 类描述：<br>
 * 创建时间：2019年05月29日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@RestController
public class HelloworldController {

    @GetMapping(value = "/sayHello")
    String sayHello(@RequestParam(value = "name") String name) {
        return "Hello, " + name;
    }

    @GetMapping(value = "/findByName")
    String findByName(@RequestParam(value = "name") String name) {
        throw new RuntimeException("测试");
    }
}
