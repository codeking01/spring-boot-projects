package com.codeking.boot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : codeking
 * @create : 2022/11/28 16:24
 *
 * SpringBootApplication代表是一个SpringBoot应用
 * 这个位置是有讲究的，需要有一个根目录（初步测试，需要三层）,名字无所谓 com.codeking.boot
 * 其他的 包需要放在这个根目录下（这里指的是boot下）
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class,args);
    }
}