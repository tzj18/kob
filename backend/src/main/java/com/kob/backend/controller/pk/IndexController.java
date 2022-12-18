package com.kob.backend.controller.pk;


import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//把这个函数变成链接对应的函数


@Controller
//这个是不分离
@RequestMapping("/pk/")
public class IndexController {

    @RequestMapping("/index")
    public String index()
    {
        return "/pk/index.html";
    }
}
