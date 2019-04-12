package bd2.Muber.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import bd2.Muber.dao.PasajeroDAO;
import bd2.Muber.dto.PasajeroDTO;
import bd2.Muber.model.*;

public class DBLoader {

	private static SessionFactory sessions;

	public DBLoader() {
	}

	public static void main(String[] args) {
		try {
			System.out.println("----------------------- Setting up Hibernate -----------------------");
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");

			System.out.println("Droping schema.........");
			new SchemaExport(cfg).drop(true, true);
			System.out.println("DONE Dropping schema.");

			System.out.println("Generating schema.........");
			new SchemaExport(cfg).create(true, true);
			System.out.println("DONE Generating schema.");

			System.out.println("Building sessions.........");
			sessions = cfg.buildSessionFactory();
			Muber muber = cargarBase();

			Session session = sessions.openSession();
			Transaction tx = null;
			try {
				tx = session.beginTransaction();
				session.save(muber);
				session.flush();
				tx.commit();
			} catch (Exception e) {
				e.printStackTrace();
				if (tx != null) {
					tx.rollback();
				}
			} finally {
				session.close();
			}

			System.out.println("DONE.");

//			session = sessions.openSession();
//			tx = session.beginTransaction();
//			Query aQuery = session.createQuery("from Pasajero");
//			Collection<Pasajero> result = aQuery.list();
//			tx.commit();
//			session.close();

//			session = sessions.openSession();
//			PasajeroDAO dao = new PasajeroDAO(session); 
//			Collection<PasajeroDTO> pasajeros = dao.getPasajeros();
//			System.out.println(pasajeros);
//			session.close();
			

		} catch (Exception e) {
			System.out.println("------------------------FAIL.------------------------");
			e.printStackTrace();
		}
	}

	private static Muber cargarBase() throws Exception {
		Muber muber = new Muber();
		Calendar cal = Calendar.getInstance();

		Pasajero sergio = new Pasajero("sergio@muber.com", "column4", cal.getTime());
		Pasajero carlos = new Pasajero("carlos@muber.com", "column5", cal.getTime());
		Pasajero ale = new Pasajero("ale@muber.com", "radioGaga", cal.getTime());
		Conductor julian = new Conductor("julian@muber.com", "aguanteJava", cal.getTime());
		Viaje aCapital = new Viaje("La Plata", "Buenos Aires", 400, julian);
		aCapital.agregarPasajero(sergio);
		aCapital.agregarPasajero(ale);
		
		sergio.calificar(aCapital, 4, "Estuvo bien. No andaba el aire.");
		ale.calificar(aCapital, 2, "Estuvo maso. Imprudente y no me gusta radio Mitre.");

		muber.agregarPasajero(sergio);
		muber.agregarPasajero(ale);
		muber.agregarPasajero(carlos);
		muber.agregarConductor(julian);
		muber.agregarViaje(aCapital);
		aCapital.cerrarViaje();

		return muber;
	}

}