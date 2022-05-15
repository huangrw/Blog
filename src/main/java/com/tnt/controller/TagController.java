package com.tnt.controller;

import com.tnt.entity.dto.BlogTag;
import com.tnt.entity.dto.BlogType;
import com.tnt.service.TagService;
import com.tnt.util.resultUtils.Result;
import com.tnt.util.resultUtils.ResultCode;
import com.tnt.util.resultUtils.ResultUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月15日 00:10:00
 */
@RestController
public class TagController {
    @Autowired
    TagService tagService;

    @PostMapping("/blog/addTag")
    Result<Integer> addTag(@RequestBody BlogTag blogTag){
        int insertRes = tagService.addTag(blogTag);

        if(insertRes == 1){
            return ResultUtils.success("tag 增加成功");
        }

        return ResultUtils.failure(ResultCode.DAO_ERROR,"tag 已存在");
    }


    @GetMapping("/blog/getTags")
    Result<List<BlogTag>> getTags(){
        List<BlogTag> tags = tagService.getTags();
        return ResultUtils.success(tags,"blogTags 查询成功");
    }
}
