package com.example.Examen4.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "Alumnos")
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String apellido;
    private String direccion;
    private String mail;

public Alumno(){

}

    public Alumno(Integer id, String name, String apellido, String mail) {
        id = id;
        this.name = name;
        this.apellido = apellido;
        this.mail = mail;
    }

}
