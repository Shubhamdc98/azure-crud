package com.example.azure_crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class homeController {

    @GetMapping("home")
    public String myHome(){
        return "My Sweet Home";
    }
}
