package com.tnt.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月15日 16:31:00
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class BlogInfo {

    private Long id;

    private String title;

    private String content;

    private String firstPic;

    private String flag;

    private Integer views;

    private boolean appreciation;

    private boolean shareStatement;

    private boolean  commentabled;

    private boolean published;

    private boolean recommend;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date updateTime;


    private long typeId;

    private List<Integer> tagIdList;

    private long userId;
}
