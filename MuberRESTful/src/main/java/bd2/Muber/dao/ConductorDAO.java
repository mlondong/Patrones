package bd2.Muber.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import bd2.Muber.dto.ConductorDTO;
import bd2.Muber.dto.PasajeroDTO;
import bd2.Muber.model.Conductor;
import bd2.Muber.model.Pasajero;

public class ConductorDAO extends AbstractDAO {

	public ConductorDAO(Session session) {
		this.setCurrentSession(session);
	}

	public Collection<Conductor> getConductores() {
		Collection<Conductor> result;
		Query aQuery = this.getCurrentSession().createQuery("from Conductor");
		result = aQuery.list();
		return result;
	}

	public Conductor obtenerConductor(long id) {
		Query aQuery = this.currentSession.createQuery("from Conductor where id=:id");
		aQuery.setParameter("id", id);
		Conductor conductor = (Conductor) aQuery.list().get(0);
		return conductor;
	}

}
