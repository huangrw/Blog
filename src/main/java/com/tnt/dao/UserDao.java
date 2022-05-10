package com.tnt.dao;

import com.tnt.entity.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月10日 22:48:00
 */

@Repository
public interface UserDao {

    public User selectUserInfoByName(@Param("username")String username,@Param("password")String password);

}
