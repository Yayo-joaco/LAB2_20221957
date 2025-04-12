package com.example.lab2_20221957.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "sedes")
public class Sede {

    @Id
    @Column(name = "idsede")
    private Integer idSede;

    @Column(name = "distrito")
    private String distrito;

    @Column(name = "direccion")
    private String direccion;

    public Sede(){}

    public Integer getIdSede() {
        return idSede;
    }
    public void setIdSede(Integer idSede) {
        this.idSede = idSede;
    }
    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
