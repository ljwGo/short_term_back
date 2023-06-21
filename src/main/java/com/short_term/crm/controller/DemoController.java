package com.short_term.crm.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
@CrossOrigin  // 跨域处理
public class DemoController {

    @RequestMapping("/test")
    public String test(){
        return "...";
    }

    @RequestMapping("/post")
    public String post(){
        return "我接受到了axios请求, 现在将数据发送给前台";
    }
}
