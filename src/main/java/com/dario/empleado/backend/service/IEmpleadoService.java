package com.dario.empleado.backend.service;

import java.util.List;

import com.dario.empleado.backend.model.Empleado;

public interface IEmpleadoService {

	List<Empleado> buscar();

	Empleado buscarporId(String id);

	Empleado guardar(Empleado empleado);

	void eliminar(String id);
}
