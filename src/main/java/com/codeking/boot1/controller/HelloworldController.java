package com.codeking.boot1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : codeking
 * @create : 2022/11/28 16:41
 */
//@Controller
@RestController
public class HelloworldController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello!!!!";
    }
}
