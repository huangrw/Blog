package com.tnt.service;

import com.tnt.entity.dto.BlogTag;

import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月15日 00:05:00
 */

public interface TagService {
    int addTag(BlogTag blogTag);
    List<BlogTag> getTags();
}
