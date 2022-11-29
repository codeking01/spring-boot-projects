package com.codeking.boot.config;

import com.codeking.boot.bean.Pet;
import com.codeking.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : codeking
 * @create : 2022/11/28 22:23
 */

/**
 * #############################Configuration使用示例###########################枏
 * 2
 * * 1、配置类里面使用@86卽标注在方法上给容器注册组件，默认也是单实例的
 * * 2、配置类本身也是组件
 * * 3、proxyBeanMethods：代理bean的方法
 * * Full(proxyBeanMethods = true)、【保证每个@Bean方法被调用多少次返回的组件;
 * * Lite(proxyBeanMethods = false)【每个@Bean方法被调用多少次返回的组件都是新
 * * 组件依赖必须使用Full模式默认。其他默认是否Lite模式
 */
@Configuration(proxyBeanMethods = true)
public class MyConfig {
    @Bean("user02")
    public User user01(){
        User user1 = new User("张三");
        user1.setPet(tomcatPet());
        return user1;
    }

    @Bean("tom")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }

}
