package com.itsqmet.ProyectoFinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
    @GetMapping("/iniciar")
    public String iniciar(){
        return "iniciar";
    }
    @GetMapping("/registro")
    public String registro(){
        return "registro";
    }
}