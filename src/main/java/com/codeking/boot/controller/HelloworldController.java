package com.codeking.boot.controller;

import com.codeking.boot.bean.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : codeking
 * @create : 2022/11/28 16:41
 */
//@Controller
@RestController
public class HelloworldController {
    @Autowired
    Cars car;

    @RequestMapping("/car")
    public Cars car() {
        return car;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello!!!!答复";
    }

}
