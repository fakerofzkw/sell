package com.example.sell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/buyer/product")
public class BuyerProductController {

    @GetMapping(value = "/list")
    public void list(){
        
    }

}
