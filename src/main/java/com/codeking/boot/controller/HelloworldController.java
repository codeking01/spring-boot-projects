package com.codeking.boot.controller;

import com.codeking.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : codeking
 * @create : 2022/11/28 16:41
 */

/**
 * @Autowired(required = false) 可以设置 required = false，这样的话，可以不必组件存在
 */
//@Controller
@RestController
public class HelloworldController {
    @Autowired(required = false)
    Car car;

    @RequestMapping("/car")
    public Car car() {
        return car;
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello!!!!答复";
    }

}
