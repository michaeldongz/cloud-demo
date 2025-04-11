package org.intelli.dl.learn.product.bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author: Michael
 * @date: 2025/4/11
 * @desc:
 */
@Data
public class Product {

    private Long id;

    private BigDecimal price;

    private String productName;

    private int num;
}
