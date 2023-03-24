package com.eamapp.crudspringboot.controller;

import com.eamapp.crudspringboot.entity.Cliente;
import com.eamapp.crudspringboot.entity.Departamento;
import com.eamapp.crudspringboot.service.ClienteServicio;
import com.eamapp.crudspringboot.service.DepartamentoServicio;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClienteControlador {
    @Autowired
    private ClienteServicio servicio;
    @Autowired
    private DepartamentoServicio serviciodepto;

    @GetMapping({ "/clientes", "/" })
    public String listarclientes(Model modelo) {
        modelo.addAttribute("clientes", servicio.listarTodosLosClientes());
        modelo.addAttribute("departamentos", serviciodepto.listarTodosLosDepartamentos());
        return "clientes"; // nos retorna al archivo clientes
    }

    @GetMapping("/clientes/nuevo")
    public String mostrarFormularioDeRegistrtarCliente(Model modelo) {
        Cliente cliente = new Cliente();
        cliente.setDepartamento(new Departamento());
        modelo.addAttribute("cliente", cliente);
        modelo.addAttribute("listadepartamentos", serviciodepto.listarTodosLosDepartamentos());
        return "crear_cliente";
    }

    @PostMapping("/clientes")
    public String guardarCliente(@ModelAttribute("cliente") Cliente cliente) {
        servicio.guardarCliente(cliente);
        return "redirect:/clientes";
    }

    @GetMapping("/clientes/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable int id, Model modelo) {
        modelo.addAttribute("cliente", servicio.obtenerClientePorId(id));
        return "editar_cliente";
    }

    @PostMapping("/clientes/{id}")
    public String actualizarCliente(@PathVariable int id, @ModelAttribute("cliente") Cliente cliente,
                                       Model modelo) {
        Cliente clienteExistente = servicio.obtenerClientePorId(id);
        clienteExistente.setId(id);
        clienteExistente.setNif(cliente.getNif());
        clienteExistente.setNombre(cliente.getNombre());
        clienteExistente.setApellido1(cliente.getApellido1());
        clienteExistente.setApellido2(cliente.getApellido2());
        clienteExistente.setDepartamento(cliente.getDepartamento());
        servicio.actualizarCliente(clienteExistente);
        return "redirect:/clientes";
    }

    @GetMapping("/clientes/{id}")
    public String eliminarCliente(@PathVariable int id) {
        servicio.eliminarCliente(id);
        return "redirect:/clientes";
    }


}