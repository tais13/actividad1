package com.example.actividad1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HolaMundo {

    @GetMapping("/HolaMundo")
    public String holamundo(){
        return "Hola Mundo";

    }
}
