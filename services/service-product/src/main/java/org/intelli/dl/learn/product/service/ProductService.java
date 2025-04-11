package org.intelli.dl.learn.product.service;

import org.intelli.dl.learn.product.bean.Product;

/**
 * @author: Michael
 * @date: 2025/4/11
 * @desc:
 */
public interface ProductService {

    Product getProductById(Long productId);
}
