package com.example.lab2_20221957.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "seguros")
public class Seguro {

    @Id
    @Column(name = "idseguro")
    private Integer idSeguro;

    @Column(name = "empresa_aseguradora")
    private String empresaAseguradora;

    @Column(name = "cobertura_maxima")
    private String coberturaMaxima;

    @Column(name = "tarifa")
    private Double tarifa;


    public Seguro(){}

    public Integer getIdSeguro() {
        return idSeguro;
    }
    public void setIdSeguro(Integer idSeguro) {
        this.idSeguro = idSeguro;
    }
    public String getEmpresaAseguradora() {
        return empresaAseguradora;
    }
    public void setEmpresaAseguradora(String empresaAseguradora) {
        this.empresaAseguradora = empresaAseguradora;
    }
    public String getCoberturaMaxima() {
        return coberturaMaxima;
    }
    public void setCoberturaMaxima(String coberturaMaxima) {
        this.coberturaMaxima = coberturaMaxima;
    }
    public Double getTarifa() {
        return tarifa;
    }
    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

}
