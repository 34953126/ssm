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
 * @ComponentScan 自动扫描包路径下的所有@Controller、@Service、@Repository、@Component的类
 * @MapperScan 之前是直接在mapper类上面添加注解@Mapper，这种方式需要对每一个mapper类添加此注解，
 * 非常麻烦。所以通过@MapperScan可以指定要扫面的Mapper类的包的路径
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.**"})
@MapperScan(basePackages = "com.**.dao")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
