package com.ultra.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ultra.utils.LocaleMessageSourceUtil;

/**
 * Created by zhenglian on 2016/10/9.
 */
@Controller
public class HelloController {
    @Autowired
    private LocaleMessageSourceUtil messageSourceUtil;

    @RequestMapping("/hello")
    public String hello() {
        String welcome = messageSourceUtil.getMessage("welcome");
        System.out.println(welcome);
        return "hello";
    }

    @RequestMapping("/hello2")
    public String changeSessionLanauage() {
        String welcome = messageSourceUtil.getMessage("welcome");
        System.out.println(welcome);
        return "hello2";
    }
}
