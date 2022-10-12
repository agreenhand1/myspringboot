package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    ///error默认请求
    @RequestMapping("/hello")
    @ResponseBody
    public String helloWord(){
        return "hello";
    }

}
