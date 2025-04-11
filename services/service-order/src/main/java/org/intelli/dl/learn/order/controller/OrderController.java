package org.intelli.dl.learn.order.controller;

import org.intelli.dl.learn.order.bean.Order;
import org.intelli.dl.learn.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Michael
 * @date: 2025/4/11
 * @desc:
 */
@RestController()
public class OrderController {

    @Autowired
    private OrderService orderService;

    // 创建订单
    @GetMapping("/createOrder")
    public Order createOrder(@RequestParam("userId") Long userId,
                             @RequestParam("productId") Long productId){
        return orderService.createOrder(productId, userId);
    }
}
