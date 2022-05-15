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
 * @author huangrw
 * @program: Blog
 * @Description  Blog 与 Tag 关系对应表
 * @createTime 2022年05月06日 23:11:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
public class BlogTagRealationship {
    @IsKey
    @IsAutoIncrement
    private Long id;
    @Column
    private long blogId;
    @Column
    private long tagId;
}
