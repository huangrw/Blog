package com.tnt.controller;

import lombok.extern.slf4j.Slf4j;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 560461
 * @version 1.0.0
 * @ClassName SystemController.java
 * @Description 系统接口
 * @createTime 2022年02月14日 14:30:00
 */
@RestController
@RequestMapping
@Slf4j
public class SystemController {

    /**
     * @Author 560461
     * @Description 健康检查接口
     * @Date 2022/2/14 15:15
     * @Param []
     * @return java.lang.Boolean
     **/
    @GetMapping("/helathcheck")
    public Boolean helathCheck(){
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject("http://127.0.0.1:8582/actuator/health", String.class);

        //对字符串进行解析
        JSONObject checkObj = JSONObject.parseObject(result);
        String helathCheck = (String) checkObj.get("status");

        log.info("System status check result:{}",result);

        return helathCheck.equals("UP");
    }
}
