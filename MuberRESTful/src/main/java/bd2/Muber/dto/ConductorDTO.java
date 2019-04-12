package bd2.Muber.dto;

import java.util.Collection;
import java.util.HashSet;

import bd2.Muber.model.*;

public class ConductorDTO extends UsuarioDTO {

	private static final long serialVersionUID = -2083159169162338548L;
	protected Collection<CalificacionDTO> calificaciones = new HashSet<CalificacionDTO>();

	public ConductorDTO() {
	}

	public ConductorDTO(Conductor conductor) {
		super();
		this.setId(conductor.getId());
		this.setEmail(conductor.getEmail());
		this.setContrasenha(conductor.getContrasenha());
		this.setFechaDeRegistro(conductor.getFechaDeRegistro());
		if (this.calificaciones.isEmpty())
			for (Calificacion calificacion : conductor.getCalificaciones())
				this.calificaciones.add(new CalificacionDTO(calificacion));
	}

	public Conductor toModel() {
		Conductor conductor = new Conductor(this.getEmail(), this.getContrasenha(), this.getFechaDeRegistro());
		for (CalificacionDTO calificacionDTO : this.calificaciones)
			conductor.agregarCalificacion(calificacionDTO.toModel());
		conductor.setId(this.getId());
		return conductor;
	}

}
