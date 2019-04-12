package bd2.Muber.model;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Pasajero extends Usuario {

	protected long credito;

	public Pasajero() {
		this.credito = 0;
	}

	public void calificar(Viaje viaje, int puntaje, String comentario) {
		Calificacion calificacion = new Calificacion(puntaje, comentario, viaje, this);
		viaje.getConductor().agregarCalificacion(calificacion);
	}

	public Pasajero(String email, String contrasenha, Date fechaDeRegistro) {
		super(email, contrasenha, fechaDeRegistro);
	}

	public Pasajero(String email, String contrasenha) {
		super();
		Calendar cal = Calendar.getInstance();
		this.email = email;
		this.contrasenha = contrasenha;
		this.fechaDeRegistro = cal.getTime();
	}

	public void agregarCredito(long credito) {
		this.setCredito(this.getCredito() + credito);
	}

	public void descontarCredito(long credito) {
		this.setCredito(this.getCredito() - credito);
	}

	public long getCredito() {
		return credito;
	}

	public void setCredito(long credito) {
		this.credito = credito;
	}

}
