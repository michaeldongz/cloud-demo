package org.intelli.dl.learn.product.controller;

import org.intelli.dl.learn.product.bean.Product;
import org.intelli.dl.learn.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Michael
 * @date: 2025/4/11
 * @desc:
 */
@RestController()
public class ProductController {

    @Autowired
    private ProductService productService;

    // 查询商品
    @GetMapping("/getProductById/{id}")
    public Product getProductById(@PathVariable("id") Long productId) {
        return productService.getProductById(productId);
    }
}
