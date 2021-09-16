package com.dario.empleado.backend.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dario.empleado.backend.dao.IEmpleadoDao;
import com.dario.empleado.backend.model.Empleado;
import com.dario.empleado.backend.service.IEmpleadoService;

@Service
public class EmpleadoServiceimpl implements IEmpleadoService {

	@Autowired
	private IEmpleadoDao empleadoDao;
	
	@Override
	public List<Empleado> buscar() {
		return empleadoDao.findAll();
	}

	@Override
	public Empleado buscarporId(String id) {
		Optional<Empleado> empl = empleadoDao.findById(id);
		if(empl.isPresent()) {
			return empl.get();
		}
		
		return null;
	}

	@Override
	public Empleado guardar(Empleado empleado) {
		
		return empleadoDao.save(empleado);
	}

	@Override
	public void eliminar(String id) {
		empleadoDao.deleteById(id);
		
	}

	
	
}
