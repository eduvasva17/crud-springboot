package com.eamapp.crudspringboot.service;

import com.eamapp.crudspringboot.entity.Cliente;
import com.eamapp.crudspringboot.entity.Departamento;
import com.eamapp.crudspringboot.repositorie.ClienteRepositorio;
import com.eamapp.crudspringboot.repositorie.DepartamentoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicioImpl implements ClienteServicio{
    @Autowired
    private ClienteRepositorio repositorio;
    @Override
    public List<Cliente> listarTodosLosClientes() {
        return repositorio.findAll();
    }

    @Override
    public Cliente guardarCliente(Cliente cliente) {

        return repositorio.save(cliente);
    }

    @Override
    public Cliente obtenerClientePorId(int id) {
        return repositorio.findById(id).get();
    }

    @Override
    public Cliente actualizarCliente(Cliente cliente) {

        return repositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(int id) {
        repositorio.deleteById(id);

    }
}
