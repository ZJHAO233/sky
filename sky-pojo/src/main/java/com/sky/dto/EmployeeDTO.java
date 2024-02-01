package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 员工 DTO
 *
 * @author ZJHAO
 * @date 2024/01/31
 */
@Data
public class EmployeeDTO implements Serializable {

    /**
     * 编号
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 名字
     */
    private String name;

    /**
     * 电话
     */
    private String phone;

    /**
     * 性别
     */
    private String sex;

    /**
     * 身份证号码
     */
    private String idNumber;

}