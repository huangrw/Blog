package com.tnt.springboottemplate;

import com.tnt.dao.TestDao;
import com.tnt.entity.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {
    @Autowired
    TestDao testDao;

    @Test
    void contextLoads() {
        User userInfo = testDao.getUserInfo();
        System.out.println(userInfo);
    }

}
