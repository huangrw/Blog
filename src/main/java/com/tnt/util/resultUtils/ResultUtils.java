package com.tnt.util.resultUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月10日 22:40:00
 */
public class ResultUtils {
    //查询成功调用
    public static <T> Result<T> success(T data, String message) {
        Map<String,Object> meta = new HashMap<>();
        meta.put("code",ResultCode.SUCCESS);
        meta.put("message",message);
        return new Result<>(data,meta);
    }

    //查询成功调用，不包含data
    public static <T> Result<T> success( String message) {
        Map<String,Object> meta = new HashMap<>();
        meta.put("code",ResultCode.SUCCESS);
        meta.put("message",message);
        return new Result<>(meta);
    }

    //查询失败调用
    public static Result failure(Integer code, String message) {
        Map<String,Object> meta = new HashMap<>();
        meta.put("code",code);
        meta.put("message",message);
        return new Result<>(meta);
    }
}
