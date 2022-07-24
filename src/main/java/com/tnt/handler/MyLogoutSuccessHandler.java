package com.tnt.handler;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

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
 * @createTime 2022年06月09日 23:54:00
 */
public class MyLogoutSuccessHandler implements LogoutSuccessHandler {

    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        Map<String, Object> result = new HashMap<String, Object>();

        result.put("msg", "注销成功");

        result.put("status", 200);

        httpServletResponse.setContentType("application/json;charset=UTF-8"); String s = new ObjectMapper().writeValueAsString(result);

        httpServletResponse.getWriter().println(s);
    }
}
