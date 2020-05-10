package com.github.myr666233.feigen;

import com.github.myr666233.pojo.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author moyiran
 */
//@FeignClient("order-service")
@FeignClient("ms-order")
public interface OrderFeigen {

    @GetMapping("order/findOrderByOrderId")
    ResponseEntity<Order> findOrderByOrderId();
}
