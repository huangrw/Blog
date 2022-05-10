package com.tnt.service;

import com.tnt.entity.dto.User;
import com.tnt.entity.vo.UserLoginInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月10日 22:44:00
 */
public interface UserService {

    /**
     * @Author huangrw
     * @Description 用户登录检查
     * @Date 10:46 PM 2022/5/10
     * @Param [userLoginInfo]
     * @return com.tnt.entity.dto.User
     **/
    public User userLogin(UserLoginInfo userLoginInfo);

}
