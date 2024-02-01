package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 分类页面查询 DTO
 *
 * @author ZJHAO
 * @date 2024/01/31
 */
@Data
public class CategoryPageQueryDTO implements Serializable {

    //页码
    private int page;

    //每页记录数
    private int pageSize;

    //分类名称
    private String name;

    //分类类型 1菜品分类  2套餐分类
    private Integer type;

}