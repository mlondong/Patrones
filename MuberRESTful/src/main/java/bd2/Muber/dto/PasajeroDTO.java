package bd2.Muber.dto;

import java.util.Date;

import bd2.Muber.model.Pasajero;

public class PasajeroDTO extends UsuarioDTO {

	private static final long serialVersionUID = 3169760236672853878L;
	protected long credito;

	public PasajeroDTO() {
	}

	public PasajeroDTO(Pasajero pasajero) {
		super();
		this.setCredito(pasajero.getCredito());
		this.setId(pasajero.getId());
		this.setEmail(pasajero.getEmail());
		this.setContrasenha(pasajero.getContrasenha());
		this.setFechaDeRegistro(pasajero.getFechaDeRegistro());
	}

	public long getCredito() {
		return credito;
	}

	public void setCredito(long credito) {
		this.credito = credito;
	}

	public Pasajero toModel() {
		Pasajero pasajero = new Pasajero(this.getEmail(), this.getContrasenha(), this.getFechaDeRegistro());
		pasajero.setId(this.getId());
		return pasajero;
	}

}
