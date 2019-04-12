package bd2.Muber.model;

import java.util.Collection;
import java.util.HashSet;

public class Sitio {

	protected Collection<Viaje> viajes = new HashSet<Viaje>();
	protected Collection<Conductor> conductores = new HashSet<Conductor>();
	protected Collection<Pasajero> pasajeros = new HashSet<Pasajero>();
	private long id;

	public Sitio() {
	}

	public void agregarViaje(Viaje viaje){
		this.getViajes().add(viaje);
	}
	public void agregarConductor(Conductor conductor){
		this.getConductores().add(conductor);
	}
	public void agregarPasajero(Pasajero pasajero){
		this.getPasajeros().add(pasajero);
	}
	
	public Collection<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(Collection<Viaje> viajes) {
		this.viajes = viajes;
	}

	public Collection<Conductor> getConductores() {
		return conductores;
	}

	public void setConductores(Collection<Conductor> conductores) {
		this.conductores = conductores;
	}

	public Collection<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Collection<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
