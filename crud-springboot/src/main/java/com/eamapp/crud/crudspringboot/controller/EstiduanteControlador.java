package com.eamapp.crud.crudspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eamapp.crud.crudspringboot.service.EstudianteServicio;

@Controller
public class EstiduanteControlador {

    @Autowired
    private EstudianteServicio servicio;


    @GetMapping({"/estudiantes","/"})
    public String ListarEstudiantes(Model modelo){
        modelo.addAttribute("estudiantes", servicio.listarTodosLoEstudiantes());
        return "estudiantes";
    }
    
}
