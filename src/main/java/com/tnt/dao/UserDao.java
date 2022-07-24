package com.tnt.dao;

import com.tnt.entity.dto.Role;
import com.tnt.entity.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月10日 22:48:00
 */

@Repository
public interface UserDao {

    User selectUserInfoByName(@Param("username")String username,@Param("password")String password);

    User getUserByName(@Param("username")String username);

    List<Role> getRolesById(@Param("uid")Integer uid);

}
