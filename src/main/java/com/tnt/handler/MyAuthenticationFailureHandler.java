package com.tnt.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年06月09日 23:26:00
 */
public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse,
                                        AuthenticationException e) throws IOException {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("msg", "登录失败: "+e.getMessage());
        result.put("status", 500);
        httpServletResponse.setContentType("application/json;charset=UTF8");
        String s = new ObjectMapper().writeValueAsString(result);
        httpServletResponse.getWriter().println(s);
    }
}
