package com.tnt.entity.dto;

import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年06月14日 12:23:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table
public class Role {
    private Integer id;
    private String name;
    private String nameZh;
}
