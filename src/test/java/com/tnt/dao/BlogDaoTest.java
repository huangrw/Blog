package com.tnt.dao;

import com.tnt.entity.dto.Blog;
import com.tnt.entity.vo.BlogInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月14日 17:24:00
 */
@SpringBootTest
public class BlogDaoTest {


    @Autowired
    BlogDao blogDao;

    @Test
    public void testBlogInsert(){
        BlogInfo blogInfo = new BlogInfo(null, "titel3", "content", "", "1", 0, true, false, true, true, false, new Date(), new Date(), 1, null, 1);

        int i = blogDao.insertBlog(blogInfo);
        Long id = blogInfo.getId();
        System.out.println(id);
    }

    @Test
    public void testDAte(){
        Date date = new Date();
        System.out.println(date);
    }
}
