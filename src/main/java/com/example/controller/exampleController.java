package com.example.controller;

import com.example.VO.ExampleVO;

import org.springframework.stereotype.Controller;

@Controller
public class exampleController {
    
    public static void ex(){
        ExampleVO evo = new ExampleVO();
        evo.setId("오~"); 
        System.out.println(evo.getId()); 
    }
}
