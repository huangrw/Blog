package com.tnt.service.serviceImpl;

import com.tnt.dao.UserDao;
import com.tnt.entity.dto.Role;
import com.tnt.entity.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年06月12日 20:16:00
 */
@Component
public class MyUserDetailSevceImpl implements UserDetailsService {

    @Autowired
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userDao.getUserByName(username);
        if (ObjectUtils.isEmpty(user))throw new RuntimeException("用户不存在");
        List<Role> userRoles = userDao.getRolesById(user.getId());
        user.setRoles(userRoles);
        System.out.println(user);
        return user;
    }
}
