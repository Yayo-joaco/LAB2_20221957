package com.example.lab2_20221957.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "autos")
public class Auto {

    @Id
    @Column(name = "idauto")
    private Integer idAuto;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "color")
    private String color;

    @Column(name = "kilometraje")
    private Integer kilometraje;

    @Column(name = "costo_por_dia")
    private Double costoPorDia;

    public Auto(){}

    public Integer getIdAuto() {
        return idAuto;
    }
    public void setIdAuto(Integer idAuto) {
        this.idAuto = idAuto;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Integer getKilometraje() {
        return kilometraje;
    }
    public void setKilometraje(Integer kilometraje) {
        this.kilometraje = kilometraje;
    }
    public Double getCostoPorDia() {
        return costoPorDia;
    }
    public void setCostoPorDia(Double costoPorDia) {
        this.costoPorDia = costoPorDia;
    }

}
