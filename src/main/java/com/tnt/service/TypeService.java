package com.tnt.service;

import com.tnt.entity.dto.BlogType;

import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月14日 23:42:00
 */
public interface TypeService {
    int addType(BlogType blogType);
    List<BlogType> getTypes();


}
