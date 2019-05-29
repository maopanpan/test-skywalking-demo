package com.myself.test.consumer.controller;

import com.myself.test.consumer.service.HelloworldService;
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

    private final HelloworldService helloworldService;

    public HelloworldController(HelloworldService helloworldService) {
        this.helloworldService = helloworldService;
    }

    @GetMapping(value = "/sayHello")
    public String sayHello(@RequestParam(value = "name") String name) {
        return helloworldService.sayHello(name);
    }

    @GetMapping(value = "/findByName")
    public String findByName(@RequestParam(value = "name") String name) {
        return helloworldService.findByName(name);
    }

    @GetMapping(value = "/test")
    public String test() {
        throw new RuntimeException("test");
    }
}
