package com.itsqmet.ProyectoIlguan2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping("/")
    public String home(){
        return "home";
    }


    @GetMapping("/admin/gestion")
    public  String admin(){
        return "administrador/admin";
    }
    @GetMapping("/user/usuarios")
    public  String user(){
        return "users/users";
    }


}


