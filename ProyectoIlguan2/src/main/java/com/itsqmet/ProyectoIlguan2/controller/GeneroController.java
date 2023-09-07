package com.itsqmet.ProyectoIlguan2.controller;

import com.itsqmet.ProyectoIlguan2.entidades.Genero;
import com.itsqmet.ProyectoIlguan2.entidades.Usuario;
import com.itsqmet.ProyectoIlguan2.repositorios.GeneroRepository;
import com.itsqmet.ProyectoIlguan2.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class GeneroController {
    @Autowired
    GeneroRepository generoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;
    @GetMapping("/generos")
    public  String listar(Model model){
        List<Genero> generos = generoRepository.findAll();
        model.addAttribute("generos", generos);
        return "genero";
    }
    @GetMapping("/genero/form")
    public String ingreso (Model model){
        model.addAttribute("genero", new Genero());
        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios );
    return "ingresoGenero";
    }
    @PostMapping("/genero/form")
    public String crear(Genero genero){
        generoRepository.save(genero);
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public  String edit (@PathVariable int id, Model model){
        Optional<Genero> genero= generoRepository.findById(id);
        model.addAttribute("genero", genero);
        return "ingresoGenero";
    }
    @GetMapping("/elim/{id}")
    public String elim(@PathVariable int id){
        generoRepository.deleteById(id);
        return "redirect:/generos";
    }

}
