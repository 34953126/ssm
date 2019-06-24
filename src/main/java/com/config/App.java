package com.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description springboot 启动入口
 * @Author common 34953126@qq.com
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/6/23
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.**.controller"})
@MapperScan(basePackages = "com.**.dao")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
