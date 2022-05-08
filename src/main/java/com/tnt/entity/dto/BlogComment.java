package com.tnt.entity.dto;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @author 560461
 * @version 1.0.0
 * @ClassName BlogComment.java
 * @Description 博客评论
 * @createTime 2022年05月06日 16:01:00
 */
@Data
@AllArgsConstructor
@ToString
@Table
public class BlogComment {
    @IsKey
    @IsAutoIncrement
    private Long id;
    @Column
    private String nickName;
    @Column
    private String email;
    @Column
    private String content;
    @Column
    private String avatar;
    @Column
    private Date createTime;

    @Column
    private long parentCommentId;  // 自关联

    @Column
    private long blogId; // 外键关联 blog id

}
