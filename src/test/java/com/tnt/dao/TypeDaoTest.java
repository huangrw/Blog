package com.tnt.dao;

import com.tnt.entity.dto.BlogTag;
import com.tnt.entity.dto.BlogType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月14日 23:26:00
 */
@SpringBootTest
public class TypeDaoTest {
    @Autowired
    TypeDao typeDao;

    @Test
    void testTypeInsert(){
        int mysql =0;
        try {
             mysql = typeDao.insertType("Mysql2");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(mysql);
        }
        System.out.println(mysql);
    }

    @Test
    void testSelectTags(){
        List<BlogType> blogTags =typeDao.selectTypes();

        System.out.println(blogTags.toString());
    }
}
