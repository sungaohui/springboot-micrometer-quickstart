package com.example.metrics.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhongkuo
 * @create: 2020-12-02
 * @description:
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Object hell() {
        return "hello";
    }

}
