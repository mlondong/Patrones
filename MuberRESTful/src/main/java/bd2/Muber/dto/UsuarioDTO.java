package bd2.Muber.dto;

import java.util.Date;

public abstract class UsuarioDTO extends AbstractDTO {

	private static final long serialVersionUID = -8473530179826530691L;
	protected String email, contrasenha;
	protected Date fechaDeRegistro;

	public UsuarioDTO() {
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

}
