package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author changyuan.guo@hand-china.com
 * @Title UserInfoDO
 * @Description
 * @date 2019/03/13
 */
@Data
@TableName(value = "user_info")
public class UserInfoDO implements Serializable {
     @TableId(value = "USER_ID", type = IdType.INPUT)
    private Integer userId;

    @TableField(value = "NICK_NAME")
    private String nickName;

    @TableField(value = "NAME")
    private String name;

    @TableField(value = "MOBILE_NUMBER")
    private String mobileNumber;

    @TableField(value = "WECHAT")
    private String wechat;

    @TableField(value = "SEX")
    private String sex;

    @TableField(value = "AGE")
    private Integer age;

    @TableField(value = "CITY")
    private String city;

    @TableField(value = "SIGN")
    private String sign;

    private static final long serialVersionUID = 1L;

    public static final String COL_USER_ID = "USER_ID";

    public static final String COL_NICK_NAME = "NICK_NAME";

    public static final String COL_NAME = "NAME";

    public static final String COL_MOBILE_NUMBER = "MOBILE_NUMBER";

    public static final String COL_WECHAT = "WECHAT";

    public static final String COL_SEX = "SEX";

    public static final String COL_AGE = "AGE";

    public static final String COL_CITY = "CITY";

    public static final String COL_SIGN = "SIGN";
}