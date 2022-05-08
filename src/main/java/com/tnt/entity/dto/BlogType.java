package com.tnt.entity.dto;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 560461
 * @version 1.0.0
 * @ClassName BlogType.java
 * @Description 文章分类 实体
 * @createTime 2022年05月06日 15:54:00
 */
@Data
@AllArgsConstructor
@ToString
@Table
public class BlogType {
    @IsKey
    @IsAutoIncrement
    private Long id;
    @Column
    private String typeName;

}
