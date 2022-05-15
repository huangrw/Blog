package com.tnt.entity.dto;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 560461
 * @version 1.0.0
 * @ClassName BlogTag.java
 * @Description 博客标签
 * @createTime 2022年05月06日 15:58:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
public class BlogTag {
    @IsKey
    @IsAutoIncrement
    private Long id;
    @Column
    private String tagName;

}
