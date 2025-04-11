package org.intelli.dl.learn.order.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: Michael
 * @date: 2025/4/11
 * @desc:
 */
@Data
public class Order {

    private Long id;

    private BigDecimal totalAmount;

    private Long userId;

    private String nickName;

    private String address;

    private List<Object> productList;
}
