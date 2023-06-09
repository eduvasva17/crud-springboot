package com.eamapp.crud.crudspringboot.entity;

import jakarta.persistence.*;;

@Entity
@Table(name = "estudiantes")
public class Estudiante {
 
@Id     
@GeneratedValue(strategy = GenerationType.IDENTITY)     
private Long id; 

@Column(name = "nombre",nullable = false, length = 50)
private String nombre;

@Column(name = "apellido",nullable = false, length = 50)
private String apellido;

@Column(name = "email",nullable = false, length = 50,unique = true)
private String email;

public Estudiante() {
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}




}
