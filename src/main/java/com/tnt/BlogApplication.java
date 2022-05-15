package com.tnt;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@ComponentScan({"com.gitee.sunchenbin.mybatis.actable.manager.*","com.tnt.*"})
@MapperScan({"com.gitee.sunchenbin.mybatis.actable.dao.*","com.tnt.dao"})
@SpringBootApplication
public class BlogApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // 项目启动成功
        log.info("项目启动成功");
    }

}
