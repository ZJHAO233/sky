package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 员工页面查询 DTO
 *
 * @author ZJHAO
 * @date 2024/01/31
 */
@Data
public class EmployeePageQueryDTO implements Serializable {

    //员工姓名
    private String name;

    //页码
    private int page;

    //每页显示记录数
    private int pageSize;

}