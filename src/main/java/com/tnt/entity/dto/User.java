package com.tnt.entity.dto;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @author 560461
 * @version 1.0.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2022年05月05日 16:05:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
public class User {
    @IsKey
    @IsAutoIncrement
    private Long id;
    @Column
    private String nickname;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String avatar;
    @Column
    private Integer type;
    @Column
    private Date createTime;
    @Column
    private Date updateTime;
}
