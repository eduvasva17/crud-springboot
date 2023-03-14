package com.eamapp.crud.crudspringboot.repositorie;

import com.eamapp.crud.crudspringboot.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Long>{

}


