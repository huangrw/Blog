package com.tnt.config;

import com.tnt.handler.MyAuthenticationFailureHandler;
import com.tnt.handler.MyAuthenticationSuccessHandler;
import com.tnt.handler.MyLogoutSuccessHandler;
import com.tnt.service.serviceImpl.MyUserDetailSevceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年06月09日 22:37:00
 */
@Configuration
public class WebSecurityConfiguer extends WebSecurityConfigurerAdapter {

    @Autowired
    MyUserDetailSevceImpl myUserDetailSevce;

    // 实现 myUserDetailService,自定义认证
    @Override
    public void configure(AuthenticationManagerBuilder builder) throws Exception {
        builder.userDetailsService(myUserDetailSevce)
                .passwordEncoder(new BCryptPasswordEncoder()); // 设置密码加密方式
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                // 放行 knife4j 的静态资源
                .antMatchers("/doc.html", "/doc.html/**", "/webjars/**", "/v2/**", "/swagger-resources",
                        "/swagger-resources/**", "/swagger-ui.html", "/swagger-ui.html/**").permitAll()
                .mvcMatchers("/user/login").permitAll()  // 放行请求
                .mvcMatchers("/doc.html").permitAll()
                .mvcMatchers("/blog/getTags").permitAll()
                .anyRequest().authenticated()   // 需要授权
                .and()
                .formLogin()
                .loginProcessingUrl("/login")   //处理登录的 url
                .usernameParameter("username")   // 登录的参数
                .passwordParameter("password")
                .successHandler(new MyAuthenticationSuccessHandler())   //登录成功的处理
                .failureHandler(new MyAuthenticationFailureHandler())   // 登录失败的处理
                .and()
                .logout()
                .logoutUrl("/logout")
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutSuccessHandler(new MyLogoutSuccessHandler())
                .and()
                .csrf().disable();
    }


}


