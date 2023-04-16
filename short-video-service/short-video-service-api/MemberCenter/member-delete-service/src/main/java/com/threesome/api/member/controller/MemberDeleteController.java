package com.threesome.api.member.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberDeleteController {
    @DeleteMapping("/member/delete")
    public void delete(){

    }
}
