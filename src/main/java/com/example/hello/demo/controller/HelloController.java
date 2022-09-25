package com.example.hello.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @BelongsProject: ExpertiseHello
 * @BelongsPackage: com.example.hello.demo.controller
 * @Author: Insist On
 * @CreateTime: 2022-09-25  09:41
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello(){
        return "你好";
    }
    @ResponseBody
    @RequestMapping(value = "/bye")
    public String bye(){
        return "再见";
    }
}
