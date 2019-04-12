package bd2.Muber.model;

import java.util.Date;

import java.util.Collection;
import java.util.HashSet;


public class Conductor extends Usuario {

	protected Collection<Calificacion> calificaciones = new HashSet<Calificacion>();

	public Conductor() {
	}

	public Conductor(String email, String contrasenha, Date fechaDeRegistro) {
		super(email, contrasenha, fechaDeRegistro);
	}

	public void agregarCalificacion(Calificacion calificacion){
		this.getCalificaciones().add(calificacion);
	}
	
	public long puntajePromedio(){
		return this.puntajeTotal() /  this.getCalificaciones().size();
	}
	
	public long puntajeTotal(){
		long puntaje = 0;
		for (Calificacion calificacion : this.getCalificaciones()) {
			puntaje+= calificacion.getPuntaje();
		}
		return puntaje;
	}
	
	public Collection<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	public void setCalificaciones(Collection<Calificacion> calificaciones) {
		this.calificaciones = calificaciones;
	}

}
