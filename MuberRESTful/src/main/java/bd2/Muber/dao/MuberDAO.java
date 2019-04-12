package bd2.Muber.dao;

import org.hibernate.Query;
import org.hibernate.Session;

import bd2.Muber.model.Muber;

public class MuberDAO extends AbstractDAO {

	public MuberDAO(Session session) {
		this.setCurrentSession(session);

	}

	public Muber obtenerMuber(){
		Query aQuery = this.getCurrentSession().createQuery("from Muber");
		Muber muber = (Muber) aQuery.list().get(0);
		return muber;
	}

}
