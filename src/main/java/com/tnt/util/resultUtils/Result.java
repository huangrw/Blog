package com.tnt.util.resultUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Map;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月10日 22:38:00
 */
@Data
public class Result<T> {
    /**
     *返回数据
     */
    private T data;

    /**
     *返回信息
     * 包含状态码code及提示信息message
     */
    private Map<String,Object> meta;

    public Result(T data, Map<String, Object> meta) {
        this.data = data;
        this.meta = meta;
    }

    public Result(Map<String, Object> meta) {
        this.meta = meta;
    }

}
