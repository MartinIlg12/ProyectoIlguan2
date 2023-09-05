package com.itsqmet.ProyectoIlguan2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaReproductor {
    @GetMapping("spiderman")
    public String spiderman(){
        return "/peliculas/spiderman";
    }
    @GetMapping("blue")
    public String blue(){
        return "/peliculas/blue";
    }
    @GetMapping("insidius")
    public String insidius(){
        return "/peliculas/insidius";
    }
    @GetMapping("mario")
    public String mario(){
        return "/peliculas/mario";
    }
    @GetMapping("bullet")
    public String bullet(){
        return "/peliculas/bullet";
    }
    @GetMapping("meg")
    public String meg(){
        return "/peliculas/meg";
    }
    @GetMapping("jep")
    public String jep(){
        return "/peliculas/jep";
    }
    @GetMapping("bayi")
    public String bayi(){
        return "/peliculas/bayi";
    }
    @GetMapping("transformers")
    public String transformers(){
        return "/peliculas/transformers";
    }
    @GetMapping("shazam")
    public String shazam(){
        return "/peliculas/shazam";
    }
    @GetMapping("wick")
    public String wick(){
        return "/peliculas/wick";
    }
    @GetMapping("fandf")
    public String fandf(){
        return "/peliculas/fandf";
    }
    @GetMapping("avion")
    public String avion(){
        return "/peliculas/avion";
    }
    @GetMapping("power")
    public String power(){
        return "/peliculas/power";
    }
}
