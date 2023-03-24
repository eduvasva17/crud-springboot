package com.eamapp.crudspringboot.service;

import com.eamapp.crudspringboot.entity.Cliente;

import java.util.List;

public interface ClienteServicio {
    public List<Cliente> listarTodosLosClientes();

    public Cliente guardarCliente(Cliente cliente);

    public Cliente obtenerClientePorId(int id);

    public Cliente actualizarCliente(Cliente cliente);

    public void eliminarCliente(int id);
}
