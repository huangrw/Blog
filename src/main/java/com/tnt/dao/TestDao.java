package com.tnt.dao;

import com.tnt.entity.dto.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 560461
 * @version 1.0.0
 * @ClassName TestDao.java
 * @Description 测试Dao
 * @createTime 2022年05月05日 15:03:00
 */
@Mapper
public interface TestDao {

    User getUserInfo();

}
