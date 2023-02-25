package pe.company.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import pe.company.model.Alumno;
import pe.company.repository.AlumnoRepository;

@Service
public class ClienteServiceImpl implements AlumnoService {
	@Autowired
	private AlumnoRepository repository;

	@Override
	@Transactional(readOnly=true)
	public Collection<Alumno> findAll(){
		return (Collection<Alumno>) repository.findAll();
	}
	

}
