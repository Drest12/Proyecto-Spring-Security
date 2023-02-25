package pe.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import pe.company.model.Alumno;






public interface AlumnoRepository  extends CrudRepository<Alumno,Integer>{

}
