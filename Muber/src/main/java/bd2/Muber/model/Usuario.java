package bd2.Muber.model;

import java.util.Date;

public class Usuario {

	protected String email, contrasenha;
	protected Date fechaDeRegistro;
	private long id;
	
	public Usuario() {
	}

	public Usuario(String email, String contrasenha, Date fechaDeRegistro) {
		super();
		this.email = email;
		this.contrasenha = contrasenha;
		this.fechaDeRegistro = fechaDeRegistro;
		System.out.println("creando..." + this.email + " "+this.contrasenha + "desde Clase ABstracta Usuario");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenha() {
		return contrasenha;
	}

	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}

	public Date getFechaDeRegistro() {
		return fechaDeRegistro;
	}

	public void setFechaDeRegistro(Date fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
