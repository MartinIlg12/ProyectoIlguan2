package com.itsqmet.ProyectoIlguan2.entidades;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Usuario {

    
    private Integer id;
    private String nombre;
    private String correo;
    private String contrasenia;
    private String fecha;

}
