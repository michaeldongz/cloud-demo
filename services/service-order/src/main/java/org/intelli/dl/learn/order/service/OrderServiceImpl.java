package org.intelli.dl.learn.order.service;

import org.intelli.dl.learn.order.bean.Order;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * @author: Michael
 * @date: 2025/4/11
 * @desc:
 */
@Service
public class OrderServiceImpl implements OrderService{

    @Override
    public Order createOrder(Long productId, Long userId) {
        Order order = new Order();

        order.setId(1L);
        order.setTotalAmount(new BigDecimal(99));
        order.setUserId(userId);
        order.setNickName("小明");
        order.setAddress("北京");
        order.setProductList(null);

        return order;
    }

}
