package pe.company.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.company.model.Alumno;
import pe.company.service.AlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoRestController {
	@Autowired
	private AlumnoService instructorService;
	
	@GetMapping("/listar_public")
	public ResponseEntity<?> listarPUBLIC() 	{
		Collection<Alumno> itemsInstructor=instructorService.findAll();
		
		if(itemsInstructor.isEmpty()) {
			return new ResponseEntity<>(itemsInstructor,HttpStatus.NO_CONTENT);
		}		
		return new ResponseEntity<>(itemsInstructor,HttpStatus.OK);
	}
	
	@GetMapping("/listar_admin")
	public ResponseEntity<?> listarADMIN() {
		Collection<Alumno> itemsInstructor=instructorService.findAll();
		
		if(itemsInstructor.isEmpty()) {
			return new ResponseEntity<>(itemsInstructor,HttpStatus.NO_CONTENT);
		}		
		return new ResponseEntity<>(itemsInstructor,HttpStatus.OK);
	}
	
	@GetMapping("/listar_user")
	public ResponseEntity<?> listarUSER() {
		Collection<Alumno> itemsInstructor=instructorService.findAll();
		
		if(itemsInstructor.isEmpty()) {
			return new ResponseEntity<>(itemsInstructor,HttpStatus.NO_CONTENT);
		}		
		return new ResponseEntity<>(itemsInstructor,HttpStatus.OK);
	}
}
