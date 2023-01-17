package com.bigdata.mybatis.bean;

import cn.hutool.core.date.DateTime;
import lombok.Data;

@Data
public class ShuqiUser {
    private int id;
    private String name;
    private String email;
    private String phone;
    private int sex;
    private String password;
    private int age;
    private String createTime;

}
