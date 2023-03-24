package com.eamapp.crudspringboot.service;

import com.eamapp.crudspringboot.entity.Departamento;
import com.eamapp.crudspringboot.repositorie.DepartamentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoServicioImpl implements DepartamentoServicio{

    @Autowired
    private DepartamentoRepositorio repositorio;
    @Override
    public List<Departamento> listarTodosLosDepartamentos() {

        return repositorio.findAll();
    }

    @Override
    public Departamento guardarDepartamento(Departamento departamento) {

        return repositorio.save(departamento);
    }

    @Override
    public Departamento obtenerDepartamentoPorId(int id) {

        return repositorio.findById((int) id).get();
    }

    @Override
    public Departamento actualizarDepartamento(Departamento departamento) {

        return repositorio.save(departamento);
    }

    @Override
    public void eliminarDepartamento(int id) {
        repositorio.deleteById((int) id);

    }
}