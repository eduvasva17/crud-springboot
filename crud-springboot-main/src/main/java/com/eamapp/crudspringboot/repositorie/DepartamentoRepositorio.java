package com.eamapp.crudspringboot.repositorie;

import com.eamapp.crudspringboot.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Integer> {
}


