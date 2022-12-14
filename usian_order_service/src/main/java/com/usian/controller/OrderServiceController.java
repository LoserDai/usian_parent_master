package com.usian.controller;

import com.usian.pojo.OrderInfo;
import com.usian.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Loser
 * @date 2021年12月03日 14:16
 */
@RestController
@RequestMapping("/service/order")
public class OrderServiceController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/insertOrder")
    public Long insertOrder(@RequestBody OrderInfo orderInfo){
        return orderService.insertOrder(orderInfo);
    }

}
