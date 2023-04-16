package com.threesome.api.user.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDeleteController {
    @DeleteMapping("/user/delete")
    public void delete(){

    }
}
