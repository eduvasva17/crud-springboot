package com.eamapp.crudspringboot.service;

import com.eamapp.crudspringboot.entity.Departamento;

import java.util.List;

public interface DepartamentoServicio {
    public List<Departamento> listarTodosLosDepartamentos();

    public Departamento guardarDepartamento(Departamento departamento);

    public Departamento obtenerDepartamentoPorId(int id);

    public Departamento actualizarDepartamento(Departamento departamento);

    public void eliminarDepartamento(int id);
}
