package com.novi.eindwerkstuk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/")
    public String welcome() {
        return "Welkom bij de garage.";
    }
}
