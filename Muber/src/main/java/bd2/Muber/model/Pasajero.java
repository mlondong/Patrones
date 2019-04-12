package bd2.Muber.model;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Pasajero extends Usuario {

	protected long credito;
	protected Collection<Viaje> viajes = new HashSet<Viaje>();
	
	public Pasajero() {
			this.credito = 0;
	}
	
	public Pasajero(String email, String contrasenha, Date fechaDeRegistro) {
		System.out.println("Creando..pasajero..");
		//super(email, contrasenha, fechaDeRegistro);
	}
	
	
	
	public void calificar(Viaje viaje, int puntaje, String comentario){
		Calificacion calificacion = new Calificacion(puntaje, comentario, viaje, this);
		viaje.getConductor().agregarCalificacion(calificacion);
	}

	

	public void agregarCredito(long credito){
		this.setCredito(this.getCredito() + credito);
	}
	
	public void descontarCredito(long credito){
		this.setCredito(this.getCredito() - credito);
	}

	public long getCredito() {
		return credito;
	}

	public void setCredito(long credito) {
		this.credito = credito;
	}
	
	public Collection<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(Collection<Viaje> viajes) {
		this.viajes = viajes;
	}
	
}
