package com.tnt.service.serviceImpl;

import com.tnt.dao.UserDao;
import com.tnt.entity.dto.User;
import com.tnt.entity.vo.UserLoginInfo;
import com.tnt.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月10日 22:46:00
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    /**
     * @param userLoginInfo
     * @return com.tnt.entity.dto.User
     * @Author huangrw
     * @Description 用户登录检查
     * @Date 10:46 PM 2022/5/10
     * @Param [userLoginInfo]
     */
    @Override
    public User userLogin(UserLoginInfo userLoginInfo) {
        User user = userDao.selectUserInfoByName(userLoginInfo.getUsername(), userLoginInfo.getPassword());
        log.info("查询到的用户信息结果:{}",user);
        return user;
    }
}
