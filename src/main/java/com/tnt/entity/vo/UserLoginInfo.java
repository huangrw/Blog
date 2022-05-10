package com.tnt.entity.vo;

import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author huangrw
 * @program: Blog
 * @Description
 * @createTime 2022年05月10日 22:42:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserLoginInfo {
    private String username;
    private String password;
}
