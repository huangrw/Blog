package com.tnt.controller;

import com.tnt.entity.dto.Blog;
import com.tnt.entity.vo.BlogInfo;
import com.tnt.service.BlogService;
import com.tnt.util.resultUtils.Result;
import com.tnt.util.resultUtils.ResultCode;
import com.tnt.util.resultUtils.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangrw
 * @program: Blog
 * @Description  博客相关操作Controller
 * @createTime 2022年05月14日 16:30:00
 */
@RestController
@Slf4j
public class BlogController {
    @Autowired
    BlogService blogService;

    @PostMapping("/blog/publishBlog")
    public Result<Integer> publishBlog(@RequestBody BlogInfo blogInfo){
        int res = blogService.publishBlog(blogInfo);
        if (res != 1){
            return ResultUtils.failure(ResultCode.DAO_ERROR,"插入失败");
        }
        return ResultUtils.success(ResultCode.SUCCESS,"博客新增成功");
    }
}
