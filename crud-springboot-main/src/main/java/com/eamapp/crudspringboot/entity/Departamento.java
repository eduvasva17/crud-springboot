package com.eamapp.crudspringboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "departamentos")
public class Departamento {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombre",nullable = false,length = 100)
    private String nombre;

    @Column(name = "presupuesto",nullable = false)
    private Double presupuesto;

    @Column(name = "gastos",nullable = false)
    private Double gastos;

    public Departamento() {
    }

    public Departamento(int id, String nombre, Double presupuesto, Double gastos) {
        this.id = id;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.gastos = gastos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Double getGastos() {
        return gastos;
    }

    public void setGastos(Double gastos) {
        this.gastos = gastos;
    }
    
}
