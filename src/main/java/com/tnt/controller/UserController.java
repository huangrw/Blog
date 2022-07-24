package com.tnt.controller;

import com.tnt.entity.dto.User;
import com.tnt.entity.vo.UserLoginInfo;
import com.tnt.service.UserService;
import com.tnt.util.resultUtils.Result;
import com.tnt.util.resultUtils.ResultCode;
import com.tnt.util.resultUtils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


/**
 * @author huangrw
 * @program: Blog
 * @Description 用户 Controller
 * @createTime 2022年05月10日 22:27:00
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user/login")
    public Result<String> userLogin(@RequestBody UserLoginInfo userLoginInfo){

        log.info("请求参数:{}",userLoginInfo);

        User user = userService.userLogin(userLoginInfo);


        if (user != null){
            String username = user.getUsername();
            log.info("{} 登录成功",username);
            return ResultUtils.success(username,"登录成功");
        }

        log.info("{} 登录失败",userLoginInfo.getUsername());

        return ResultUtils.failure(ResultCode.ERROR,"登录失败");

    }

    @GetMapping("user/getUserInfo")
    public Map<String, Object> getUserInfoById(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        String name = authentication.getName();
        Object credentials = authentication.getCredentials();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

        HashMap<String, Object> resultMap = new HashMap<String,Object>();
        resultMap.put("username",name);
        resultMap.put("凭证",credentials);
        resultMap.put("权限",authorities);

        return resultMap;


    }

}
