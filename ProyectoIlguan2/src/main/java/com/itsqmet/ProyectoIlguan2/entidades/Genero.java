package com.itsqmet.ProyectoIlguan2.entidades;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Controller;

@Data
@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String titulo;
    private String categoria;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
