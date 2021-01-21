package ups.edu.ec.EvaluacionWSZhiminaicela.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {

	
	@Id
	private String cedula;
	private String nombre;
	private String apellido;
	
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	
	
	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
	
}
