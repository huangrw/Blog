package com.tnt.dao;

import com.tnt.entity.dto.Role;
import com.tnt.entity.dto.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    void getUserByName() {
        User userInfo = userDao.getUserByName("admin");
        System.out.println(userInfo);
    }

    @Test
    void getRolesById() {
        List<Role> rolesById = userDao.getRolesById(1);
        rolesById.forEach(role -> System.out.println(role));
    }
    @Test
    void testPassword(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("12345"));
    }
}
