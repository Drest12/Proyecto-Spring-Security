package pe.company.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno implements Serializable {
	private static final long serialVersionUID = 1L;
	// propiedades
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer alumnoId;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String direccion;
	@Column
	private String telefono;
	@Column
	private String dni;

	public Alumno() {
		
	}

	public Alumno(Integer alumnoId, String nombre, String apellido, String direccion, String telefono, String dni) {
		super();
		this.alumnoId = alumnoId;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.dni = dni;
	}


	public Integer getAlumnoId() {
		return alumnoId;
	}

	public void setAlumnoId(Integer alumnoId) {
		this.alumnoId = alumnoId;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
}
