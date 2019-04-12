package bd2.Muber.dto;

import bd2.Muber.model.*;

public class CalificacionDTO extends AbstractDTO {

	private static final long serialVersionUID = -8298488245512207405L;
	protected int puntaje;
	protected String comentario;
	protected ViajeDTO viaje;
	protected PasajeroDTO pasajero;

	public CalificacionDTO() {
	}

	public CalificacionDTO(Calificacion calificacion) {
		this.setPuntaje(calificacion.getPuntaje());
		this.setComentario(calificacion.getComentario());
		this.setPasajero(new PasajeroDTO(calificacion.getPasajero()));
		//this.setViaje(new ViajeDTO(calificacion.getViaje()));
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

	public ViajeDTO getViaje() {
		return viaje;
	}

	public void setViaje(ViajeDTO viaje) {
		this.viaje = viaje;
	}

	public PasajeroDTO getPasajero() {
		return pasajero;
	}

	public void setPasajero(PasajeroDTO pasajero) {
		this.pasajero = pasajero;
	}

	public Calificacion toModel() {
		Calificacion calificacion = new Calificacion(this.getPuntaje(), this.getComentario(), this.getViaje().toModel(),
				this.getPasajero().toModel());
		calificacion.setId(this.getId());
		return calificacion;
	}

}
