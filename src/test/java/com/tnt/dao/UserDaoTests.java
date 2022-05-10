package com.tnt.dao;
import com.tnt.entity.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月10日 23:03:00
 */
@SpringBootTest
public class UserDaoTests {

    @Resource
    UserDao userDao;

    @Test
    public void testSelectUserInfoByName() {
        User user = userDao.selectUserInfoByName("rongwei", "qwe!2345");
        System.out.println(user);

    }
}
