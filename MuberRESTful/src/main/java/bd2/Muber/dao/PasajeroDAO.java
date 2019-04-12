package bd2.Muber.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import bd2.Muber.dto.PasajeroDTO;
import bd2.Muber.model.*;

public class PasajeroDAO extends AbstractDAO {

	public PasajeroDAO(Session session) {
		this.setCurrentSession(session);
	}

	public Collection<Pasajero> getPasajeros() {

		Collection<Pasajero> result;

		Query aQuery = this.getCurrentSession().createQuery("from Pasajero");
		result = aQuery.list();

		return result;
	}

	public Pasajero obtenerPasajero(long id) {
		Query aQuery = this.currentSession.createQuery("from Pasajero where id=:id");
		aQuery.setParameter("id", id);
		Pasajero pasajero = (Pasajero) aQuery.list().get(0);
		return pasajero;
	}

}
