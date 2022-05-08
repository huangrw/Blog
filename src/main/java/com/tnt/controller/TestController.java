package com.tnt.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 560461
 * @version 1.0.0
 * @ClassName TestController.java
 * @Description 测试Controller
 * @createTime 2022年05月05日 15:02:00
 */
@RestController
@RequestMapping
@Slf4j
public class TestController {

    @GetMapping("/hello/{id}")
    public String testController(@PathVariable Integer id){
        log.info("id:{}",id);
        return "hello controller";
    }

}
