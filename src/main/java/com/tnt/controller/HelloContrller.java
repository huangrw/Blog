package com.tnt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月11日 00:46:00
 */
@Controller
public class HelloContrller {

    @GetMapping("/hello")
    public String testController(){
        return "hello";
    }
}
