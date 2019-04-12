package bd2.Muber.model;

public class Calificacion {

	protected int puntaje;
	protected String comentario;
	protected Viaje viaje;
	protected Pasajero pasajero;
	private long id;

	public Calificacion() {
	}

	public Calificacion(int puntaje, String comentario, Viaje viaje, Pasajero pasajero) {
		super();
		this.puntaje = puntaje;
		this.comentario = comentario;
		this.viaje = viaje;
		this.pasajero = pasajero;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
