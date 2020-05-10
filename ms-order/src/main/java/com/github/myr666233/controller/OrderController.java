package com.github.myr666233.controller;

import com.github.myr666233.pojo.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moyiran
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @GetMapping("/findOrderByOrderId")
    public ResponseEntity<Order> findOrderByOrderId() {
        return ResponseEntity.ok(new Order(1L, "这是一张订单", 1L));
    }
}
