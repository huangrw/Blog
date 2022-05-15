package com.tnt.dao;

import com.tnt.entity.dto.BlogTag;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月15日 00:04:00
 */
@SpringBootTest
public class TagDaoTest {
    @Autowired
    TagDao tagDao;

    @Test
    void testTagInsert(){
        int mysql = tagDao.insertTag("mysql");
        System.out.println(mysql);
    }

    @Test
    void testSelectTags(){
        List<BlogTag> blogTags = tagDao.selectTags();

        System.out.println(blogTags.toString());
    }
}
