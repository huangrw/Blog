package com.tnt.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * @ClassName Blog.java
 * @Description Blog Entity
 * @createTime 2022年05月06日 15:39:00
 */
@Data
@AllArgsConstructor
@ToString
@Table
public class Blog {
    @IsKey
    @IsAutoIncrement
    private Long id;
    @Column
    private String title;
    @Column
    private String content;
    @Column
    private String firstPic;
    @Column
    private String flag;
    @Column
    private Integer views;
    @Column
    private boolean appreciation;
    @Column
    private boolean shareStatement;
    @Column
    private boolean  commentabled;
    @Column
    private boolean published;
    @Column
    private boolean recommend;
    @Column
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    @Column
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;

    @Column
    private long typeId;

    @Column
    private long userId;
}
