package com.tnt.dao;

import com.tnt.entity.dto.BlogTag;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月15日 00:01:00
 */
@Repository
public interface TagDao {
    int insertTag(@Param("tagName") String tagName);

    List<BlogTag> selectTags();
    // todo 查询所有 Tag 根据 Id 排序
}
