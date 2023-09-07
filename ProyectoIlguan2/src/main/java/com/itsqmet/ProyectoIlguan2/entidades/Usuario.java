package com.itsqmet.ProyectoIlguan2.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Integer id;
    private String rol;
    private String nombre;
    private String correo;
    private String contrasenia;
    private String fecha;

}
