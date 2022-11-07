package com.mustache.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MustacheController {

    @GetMapping(value = "/hi")
    public String mustacheCon(Model model) {
        model.addAttribute("username","hi");
        model.addAttribute("id","0");
        return "greeting";
    }

    @GetMapping(value = "/hi2")
    public String mustacheCon2(Model model) {
        model.addAttribute("username","안녕");
        return "greeting";
    }
}
