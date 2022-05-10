package com.tnt.controller;

import com.tnt.entity.dto.User;
import com.tnt.entity.vo.UserLoginInfo;
import com.tnt.service.UserService;
import com.tnt.util.resultUtils.Result;
import com.tnt.util.resultUtils.ResultCode;
import com.tnt.util.resultUtils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
}
