package com.exam.demoExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    /**
     * 회원가입 페이지
     */
    @GetMapping("/auth/user/save")
    public String userSave() {
        return "layout/user/user-save";
    }

    /**
     * 회원로그인 페이지
     */
    @GetMapping("/auth/user/login")
    public String userLogin() {
        return "layout/user/user-login";
    }

    /**
     * 회원수정 페이지
     */
    @GetMapping("/user/update")
    public String userUpdate() {
        return "layout/user/user-update";
    }

    /**
     * 회원탈퇴 페이지
     */
    @GetMapping("/user/delete")
    public String userDelete() {
        return "layout/user/user-delete";
    }

}
