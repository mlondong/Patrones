package bd2.Muber.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AbstractDAO {

	protected SessionFactory sessionFactory;
	protected Session currentSession;
	protected Transaction currentTransaction;

	public AbstractDAO() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		this.setSessionFactory(cfg.buildSessionFactory());
	}

	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	public void setSessionFactory(SessionFactory aSessionFactory) {
		this.sessionFactory = aSessionFactory;
	}

	public void beginTransaction() {
		Session session = this.getSessionFactory().openSession();
		this.currentTransaction = session.beginTransaction();
	}

	public void commitTransaction() {
		this.currentTransaction.commit();
		this.getSessionFactory().getCurrentSession().close();
	}

	protected Session getCurrentSession() {
		return currentSession;
	}

	protected void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

}
