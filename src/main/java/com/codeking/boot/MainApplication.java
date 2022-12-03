package com.codeking.boot;

import ch.qos.logback.classic.db.DBHelper;
import com.codeking.boot.bean.Pet;
import com.codeking.boot.bean.User;
import com.codeking.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author : codeking
 * @create : 2022/11/28 16:24
 * <p>
 * <p>
 * SpringBootApplication代表是一个SpringBoot应用
 * 这个位置是有讲究的，需要有一个根目录（初步测试，需要三层）,名字无所谓 com.codeking.boot
 * 其他的 包需要放在这个根目录下（这里指的是boot下）
 * @SpringBootApplication //等同于
 * //@SpringBootConfiguration
 * //@EnableAutoConfiguration
 * //@ComponentScan("com.codeking.boot")
 * <p>
 * • 自动配好SpringMVC
 * °引入SpringMVC全套组件
 * 。自动配好SpringMVC常用组件 （功能）
 * • 自动配好Web常见功能，如：字符编码问题
 * 。SpringBoot帮我们配置好了所有web开发的常见场景
 * • 默认的包结构
 * o 主程序所在包及其下面的所有子包里面的组件都会被默认扫描进来
 * ◦ 无需以前的包扫描配置
 * °想要改变扫描路径，@SpringBootApplication(scanBasePackages=com.atguigu")
 * ■ 或者@ComponentScan 指定扫描路径
 */

/**
 *
 * @SpringBootApplication
 * //等同于
 * //@SpringBootConfiguration
 * //@EnableAutoConfiguration
 * //@ComponentScan("com.codeking.boot")
 *
 * • 自动配好SpringMVC
 * °引入SpringMVC全套组件
 * 。自动配好SpringMVC常用组件 （功能）
 * • 自动配好Web常见功能，如：字符编码问题
 * 。SpringBoot帮我们配置好了所有web开发的常见场景
 * • 默认的包结构
 * o 主程序所在包及其下面的所有子包里面的组件都会被默认扫描进来
 * ◦ 无需以前的包扫描配置
 * °想要改变扫描路径，@SpringBootApplication(scanBasePackages=com.atguigu")
 * ■ 或者@ComponentScan 指定扫描路径
 *
 * * 4、@Impont({User.class,DBHelper.class})
 *      * 给容器中自动创建出这两个类型的组件、默认组件的名字就是全类名
 *-----
 *  @@ImportResource("classpath:beans.xml") 这个注解 原生配置文件（xml）引入
 */

/**
 * 各种配置拥有默认值
 * 。默认配置最终都是映射到某个类上，如：MultipartProperties
 * ◦ 配置文件的值最终会绑定每个类上，这个类会在容器中创建对象
 * • 按需加载所有自动配置项
 * °非常多的starter
 * 。引入了哪些场景这个场景的自动配置才会开启
 * 。SpringBoot所有的自动配置功能都在 spring-boot-autoconfigure 包里面
 *
 */
//@Import({User.class, DBHelper.class})
//@ImportResource("classpath:beans.xml")
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
        /*User user02 = run.getBean("user02", User.class);
        User user01 = run.getBean("user02", User.class);
        System.out.println("user02:" + user02);
        System.out.println("user01:" + user01);
        System.out.println(user01 == user02);
        System.out.println("**************");
        MyConfig bean = run.getBean(MyConfig.class);
        User user = bean.user01();
        User user1 = bean.user01();
        System.out.println("user:" + user);
        System.out.println("user1:" + user1);
        System.out.println(user == user1);
        System.out.println("**************");
        Pet tom = run.getBean("tom", Pet.class);
        Pet tom1 = run.getBean(Pet.class);
        System.out.println("宠物.." + (user1.getPet() == tom));
        System.out.println("宠物.." + (user1.getPet() == tom1));

        //String[] beanDefinitionNames = run.getBeanDefinitionNames();
        //for (String beanDefinitionName : beanDefinitionNames) {
        //    System.out.println("beanDefinitionName:"+beanDefinitionName);
        //}
        System.out.println("********");
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/
        // 先查看容器中有没有组件
        //boolean tom=run.containsBean("tom");
        //boolean user02=run.containsBean("user02");
        //System.out.println("tom:"+tom);
        //System.out.println("user02:"+user02);

        // 检查配置问价导入是否成功
        boolean haha=run.containsBean("haha");
        boolean hehe=run.containsBean("hehe");
        System.out.println("haha:"+haha);
        System.out.println("hehe:"+hehe);
    }
}