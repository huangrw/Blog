package com.tnt.dao;

import com.tnt.entity.dto.Blog;
import com.tnt.entity.dto.BlogTagRealationship;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月15日 13:25:00
 */
@Repository
public interface BlogTagRelationDao {

    int insertBlogTagRelationBatch(BlogTagRealationship blogTagRealationship);

}
