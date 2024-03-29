package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 类别 DTO
 *
 * @author ZJHAO
 * @date 2024/01/31
 */
@Data
public class CategoryDTO implements Serializable {

    //主键
    private Long id;

    //类型 1 菜品分类 2 套餐分类
    private Integer type;

    //分类名称
    private String name;

    //排序
    private Integer sort;

}