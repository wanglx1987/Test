package com.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Tes {

    @RequestMapping("goCheck")
    public String goCheck() {
        System.out.println("22222222");
        return "test1";
    }
}
