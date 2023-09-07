package com.itsqmet.ProyectoIlguan2.controller;

import com.itsqmet.ProyectoIlguan2.entidades.Usuario;
import com.itsqmet.ProyectoIlguan2.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

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
        Usuario usuario1 = new Usuario();

        usuario1.setId(usuario.getId());
        usuario1.setNombre(usuario.getNombre());
        usuario1.setContrasenia(bCryptPasswordEncoder().encode(usuario.getContrasenia()));
        usuario1.setCorreo(usuario.getCorreo());
        usuario1.setRol(usuario.getRol());
        usuario1.setFecha(usuario.getFecha());
        usuarioRepository.save(usuario1);
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
        return "redirect:/usuarios";
   }

}
