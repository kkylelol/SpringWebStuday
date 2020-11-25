package com.kl.ssm.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("controller")
public class FirstController {
    @RequestMapping("/firstController")
    //
    public String hello(Model model){
        model.addAttribute("msg","第一个Controller");
        return "/jsp/First";
    }
}
