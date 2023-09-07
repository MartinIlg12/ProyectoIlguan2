package com.itsqmet.ProyectoIlguan2.repositorios;

import com.itsqmet.ProyectoIlguan2.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Integer> {
 Usuario findByNombre(String nombre);

}
