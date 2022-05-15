package com.tnt.dao;

import com.tnt.entity.dto.BlogTagRealationship;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月15日 14:05:00
 */
@SpringBootTest
public class BlogTagRelaTest {
    @Autowired
    BlogTagRelationDao blogTagRelationDao;

    @Test
    void testBlogTagRea(){
       // int res = blogTagRelationDao.insertBlogTagRelationBatch(new BlogTagRealationship(0, 1, 1));
        //System.out.println(res);
    }
}
