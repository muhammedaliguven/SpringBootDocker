package com.example.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    @GetMapping("/user")
    public String hello() {
        return "muhammmed ali guven";
    }
}
