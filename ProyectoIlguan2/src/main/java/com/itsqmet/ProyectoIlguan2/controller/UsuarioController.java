package com.itsqmet.ProyectoIlguan2.controller;

import com.itsqmet.ProyectoIlguan2.entidades.Usuario;
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
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/registro")
    public String registro(Model model){
        model .addAttribute("usuario",new Usuario() );
        return "registro";
    }
    @GetMapping("/usuarios")
    public String usuario(Model model){
        List<Usuario> usuarioss = usuarioRepository.findAll();
        model.addAttribute("usuarioss",usuarioss);
        return "usuarios";
    }

    @PostMapping("/registro")
    public String crear(Usuario usuario){
        usuarioRepository.save(usuario);
        return "redirect:/genero/form";
    }

    @GetMapping("/editar/{id}")
    public String actualizar(@PathVariable int id, Model model){
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        model.addAttribute("usuario",usuario);
        return "registro";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable int id){
        usuarioRepository.deleteById(id);
        return"redirect:/usuarios";
    }
}
