package com.example.securtyassignment.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String getIndexPage(){
        return "index";
    }

}
