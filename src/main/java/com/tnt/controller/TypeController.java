package com.tnt.controller;

import com.tnt.entity.dto.BlogType;
import com.tnt.service.TypeService;
import com.tnt.util.resultUtils.Result;
import com.tnt.util.resultUtils.ResultCode;
import com.tnt.util.resultUtils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月14日 22:32:00
 */
@RestController
public class TypeController {
    @Autowired
    TypeService typeService;

    @PostMapping("/bolg/addBlogType")
    public Result<Integer> addType(@RequestBody BlogType blogType){


        int res = typeService.addType(blogType);

        if (res == 1 ){
            return ResultUtils.success("type 增加成功");
        }

        return ResultUtils.failure(ResultCode.DAO_ERROR,"type已存在");

    }

    @GetMapping("/blog/getTypes")
    Result<List<BlogType>> getTypes(){
        List<BlogType> types = typeService.getTypes();

        return ResultUtils.success(types,"BlogTypes 查询成功");
    }


}
