package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 订单取消 DTO
 *
 * @author ZJHAO
 * @date 2024/01/31
 */
@Data
public class OrdersCancelDTO implements Serializable {

    private Long id;
    //订单取消原因
    private String cancelReason;

}