package bd2.Muber.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import bd2.Muber.dto.ViajeDTO;
import bd2.Muber.model.Conductor;
import bd2.Muber.model.Muber;
import bd2.Muber.model.Pasajero;
import bd2.Muber.model.Viaje;

public class ViajeDAO extends AbstractDAO {

	public ViajeDAO(Session session) {
		this.setCurrentSession(session);
	}

	public Collection<Viaje> getViajes() {
		Collection<Viaje> result;
		Query aQuery = this.getCurrentSession().createQuery("from Viaje");
		result = aQuery.list();
		return result;
	}

	public Viaje obtenerViaje(long id) {
		Query aQuery = this.getCurrentSession().createQuery("from Viaje where id=:id");
		aQuery.setParameter("id", id);
		Viaje viaje = (Viaje) aQuery.list().get(0);
		return viaje;
	}

}
