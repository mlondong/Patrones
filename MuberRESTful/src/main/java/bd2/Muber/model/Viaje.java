package bd2.Muber.model;

import java.util.Collection;
import java.util.HashSet;

public class Viaje {

	protected Collection<Pasajero> pasajeros = new HashSet<Pasajero>();
	protected Conductor conductor;
	protected long costoTotal;
	protected String origen, destino;
	private long id;
	
	public Viaje() {
	}

	public Viaje(String origen, String destino, long costoTotal, Conductor conductor) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.costoTotal = costoTotal;
		this.conductor = conductor;
	}
	
	public void agregarPasajero(Pasajero pasajero){
		this.getPasajeros().add(pasajero);
	}
	
	public void cerrarViaje(){
		for (Pasajero pasajero : this.getPasajeros()) {
			pasajero.descontarCredito(this.costoPorPasajero());
		}
	}
	
	public long costoPorPasajero(){
		return this.getCostoTotal() / this.getPasajeros().size();
	}
	
	
	public Collection<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Collection<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}

	public Conductor getConductor() {
		return conductor;
	}

	public void setConductor(Conductor conductor) {
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

}
