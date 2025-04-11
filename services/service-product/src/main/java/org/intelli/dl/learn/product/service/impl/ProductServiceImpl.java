package org.intelli.dl.learn.product.service.impl;

import org.intelli.dl.learn.product.bean.Product;
import org.intelli.dl.learn.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author: Michael
 * @date: 2025/4/11
 * @desc:
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Product getProductById(Long productId) {
        Product product = new Product();

        product.setId(productId);
        product.setProductName("苹果-"+productId);
        product.setPrice(new BigDecimal(99));
        product.setNum(2);

        return product;
    }

}
