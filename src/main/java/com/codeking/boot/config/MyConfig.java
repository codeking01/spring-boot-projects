package com.codeking.boot.config;

import com.codeking.boot.bean.Cars;
import com.codeking.boot.bean.Pet;
import com.codeking.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
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
 *
 *
 * ------
 * 组件扫描是有顺序要求的，从上到下扫面！！！
 * ConditionalOnBean(name="组件名字")
 * 满足条件才会注入这个组件
 * Conditional有很多，可以查看实现或者继承类
 *
 */
@Configuration(proxyBeanMethods = true)
//@EnableConfigurationProperties(Cars.class)
public class MyConfig {

    @Bean("tom")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
    //组件扫描是有顺序要求的，从上到下扫面！！！
    @Bean("user02")
    @ConditionalOnBean(name="tom")
    //@ConditionalOnMissingBean(name="jack")
    public User user01(){
        User user1 = new User("张三");
        user1.setPet(tomcatPet());
        return user1;
    }
}
