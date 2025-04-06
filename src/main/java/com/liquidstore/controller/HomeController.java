package com.liquidstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showLoginPage() {
        return "member/login"; // /WEB-INF/views/member/login.jsp
    }
}
