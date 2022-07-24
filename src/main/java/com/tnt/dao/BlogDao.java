package com.tnt.dao;
import com.tnt.entity.vo.BlogInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月14日 16:43:00
 */
@Repository
public interface BlogDao {
    int insertBlog(BlogInfo blogInfo);

    // 展示博客列表
    //



}
