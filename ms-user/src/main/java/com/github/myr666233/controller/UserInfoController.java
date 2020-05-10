package com.github.myr666233.controller;

import com.github.myr666233.feigen.OrderFeigen;
import com.github.myr666233.pojo.Order;
import com.github.myr666233.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author moyiran
 */
@RestController
@RequestMapping("user")
@RefreshScope
public class UserInfoController {

    @Value("${user.username}")
    private String username;

    @Autowired
    private OrderFeigen orderFeigen;

    @GetMapping("/getUserInfo/{userId}")
    public ResponseEntity<User> getUserInfo(@PathVariable Long userId) {
        return ResponseEntity.ok(new User(userId, username, "123456", "13472726902"));
    }

    @RequestMapping("/testFeigin")
    public ResponseEntity<Order> testFeigen() {
        ResponseEntity<Order> responseEntity = orderFeigen.findOrderByOrderId();
        Order order = responseEntity.getBody();
        order.setOrderTitle("这被修改了！");
        return ResponseEntity.ok(order);
    }
}
