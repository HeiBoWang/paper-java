package com.jd.paper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 请填写类的描述
 *
 * @author wangyongpeng11
 * @date 2021-03-03 20:35
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    private String hello(){
        return "hhhhhhhhhhhhhhhhhhhhh";
    }
}
