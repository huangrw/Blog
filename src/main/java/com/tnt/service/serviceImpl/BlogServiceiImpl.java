package com.tnt.service.serviceImpl;

import com.tnt.dao.BlogDao;
import com.tnt.dao.BlogTagRelationDao;
import com.tnt.entity.dto.Blog;
import com.tnt.entity.dto.BlogTagRealationship;
import com.tnt.entity.vo.BlogInfo;
import com.tnt.service.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月14日 16:42:00
 */
@Service
@Slf4j
public class BlogServiceiImpl implements BlogService {

    @Autowired
    BlogDao blogDao;
    @Autowired
    BlogTagRelationDao blogTagRelationDao;
    @Override
    public int publishBlog(BlogInfo blogInfo) {
        // 新增博客
        int res = blogDao.insertBlog(blogInfo);

        // 维护博客和 tag 对应关系
        for (Integer tagId : blogInfo.getTagIdList()) {
            BlogTagRealationship blogTagRealationship = new BlogTagRealationship(null, blogInfo.getId(), tagId);
            log.info("blogTagRealationship:{}",blogTagRealationship);
            blogTagRelationDao.insertBlogTagRelationBatch(blogTagRealationship);
        }
        return res;
    }
}
