package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String first(Model model){
        System.out.println("hello 제발..");
        model.addAttribute("name", "내 이름은 박영상!");
        return "first";  
    }
    
}
