package com.github.myr666233.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author moyiran
 */
@Data
@AllArgsConstructor
public class User {

    private Long id;

    private String username;

    private String password;

    private String phone;

}
