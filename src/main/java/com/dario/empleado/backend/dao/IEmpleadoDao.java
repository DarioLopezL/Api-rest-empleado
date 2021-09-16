package com.dario.empleado.backend.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dario.empleado.backend.model.Empleado;

public interface IEmpleadoDao extends MongoRepository<Empleado, String> {

	
	
}
