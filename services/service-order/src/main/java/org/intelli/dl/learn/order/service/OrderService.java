package org.intelli.dl.learn.order.service;

import org.intelli.dl.learn.order.bean.Order;

/**
 * @author: Michael
 * @date: 2025/4/11
 * @desc:
 */
public interface OrderService {

    Order createOrder(Long productId, Long userId);
}
