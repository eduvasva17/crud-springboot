package com.eamapp.crudspringboot.entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.eamapp.crudspringboot.repositorie.DepartamentoRepositorio;
import com.eamapp.crudspringboot.service.DepartamentoServicio;
import com.eamapp.crudspringboot.service.DepartamentoServicioImpl;

import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id 
    //@Column(name="id",updatable=false,nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nif",nullable = false,length = 9)
    private String nif;
    
    @Column(name = "nombre",nullable = false,length = 100)
    private String nombre;

    @Column(name = "apellido1",nullable = false,length = 100)
    private String apellido1;

    @Column(name = "apellido2",nullable = true,length = 100)
    private String apellido2;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;
    
    public Cliente() {
    }

    public Cliente(int id, String nif, String nombre, String apellido1, String apellido2, Departamento departamento) {
        this.id = id;
        this.nif = nif;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }    


    
}
