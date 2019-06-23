package com.hnxyzn.ybb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description 测试controller
 * @Author ybb 34953126@qq.com
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/6/23
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    private String index(){
        System.out.println("hello");
        return "Hello World!";
    }
}
