package com.miPortfolio.backend.Modelo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Basic
    private String img;
    private String proyecto;
    private String descripcion;

    public Proyectos(long id, String img, String proyecto, String descripcion) {
        this.id = id;
        this.img = img;
        this.proyecto = proyecto;
        this.descripcion = descripcion;
    }

    public Proyectos() {
    }

}
