package com.eamapp.crud.crudspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eamapp.crud.crudspringboot.entity.Estudiante;
import com.eamapp.crud.crudspringboot.repositorie.EstudianteRepositorio;

@Service
public class EstudianteServicioImpl implements EstudianteServicio {

    @Autowired
    private EstudianteRepositorio repositorio;

    @Override
    public List<Estudiante> listarTodosLoEstudiantes() {
        return repositorio.findAll();
    }
    
}
