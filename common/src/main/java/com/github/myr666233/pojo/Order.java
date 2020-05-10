package com.github.myr666233.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author moyiran
 */
@Data
@AllArgsConstructor
public class Order {

    private Long orderId;

    private String orderTitle;

    private Long userId;
}
