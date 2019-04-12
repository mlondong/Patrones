package bd2.Muber.dto;

import bd2.Muber.model.*;

public class ViajeDTO extends AbstractDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1364387826203874602L;
	protected ConductorDTO conductor;
	protected long costoTotal;
	protected String origen, destino;

	public ViajeDTO() {
	}

	public ViajeDTO(Viaje viaje) {
		this.setCostoTotal(viaje.getCostoTotal());
		this.setOrigen(viaje.getOrigen());
		this.setDestino(viaje.getDestino());
		if (this.getConductor() == null)
			this.setConductor(new ConductorDTO(viaje.getConductor()));
	}

	public ConductorDTO getConductor() {
		return conductor;
	}

	public void setConductor(ConductorDTO conductor) {
		this.conductor = conductor;
	}

	public long getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(long costoTotal) {
		this.costoTotal = costoTotal;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Viaje toModel() {
		Viaje viaje = new Viaje(this.getOrigen(), this.getDestino(), this.getCostoTotal(),
				this.getConductor().toModel());
		viaje.setId(this.getId());
		return viaje;
	}

}
