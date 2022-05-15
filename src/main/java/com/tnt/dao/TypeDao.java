package com.tnt.dao;

import com.tnt.entity.dto.BlogTag;
import com.tnt.entity.dto.BlogType;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月14日 22:43:00
 */
@Repository
public interface TypeDao {

    int insertType(@Param("typeName") String typeName);

    List<BlogType> selectTypes();



}
