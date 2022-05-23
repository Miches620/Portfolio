package com.miPortfolio.backend.Modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Entity
@Setter
public class Educacion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Basic
    private String titulo;
    private String icono;
    private String institucion;
    private int anio;
    private String web;

    public Educacion(long id, String titulo, String icono, String institucion, int anio, String web) {
        this.id = id;
        this.titulo = titulo;
        this.icono = icono;
        this.institucion = institucion;
        this.anio = anio;
        this.web = web;
    }

    public Educacion() {}

    
    
}   