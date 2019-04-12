package bd2.Muber.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import bd2.Muber.model.*;

public class DBLoader {

	private static SessionFactory sessions;

	public DBLoader() {
	}

	public static void main(String[] args) {
		try {
			System.out.println("----------------------- Setting up Hibernate -----------------------");
			Configuration cfg = new Configuration();
			cfg.configure("hibernate/hibernate.cfg.xml");

			System.out.println("Droping schema.........");
			new SchemaExport(cfg).drop(true, true);
			System.out.println("DONE.");

			System.out.println("Generating schema.........");
			new SchemaExport(cfg).create(true, true);
			System.out.println("DONE.");

			/*ACA INICIA EL PROCESO DE MAPEO DESPUES DE HABER BORRADO Y CREADO LAS TABLAS*/
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
				session.close();
			}
			session.disconnect();
			System.out.println("DONE.");
		} catch (Exception e) {
			System.out.println("------------------------FAIL.------------------------");
			e.printStackTrace();
		}
	}

	private static Muber cargarBase() throws Exception {
		Muber muber = new Muber();
		Calendar cal = Calendar.getInstance();
		/*
		Pasajero sergio = new Pasajero("mlondong@muber.com", "siete", cal.getTime());
		Pasajero ale = new Pasajero("ale@muber.com", "radioGaga", cal.getTime());
		Conductor julian = new Conductor("mlondono@muber.com", "siete", cal.getTime(), cal.getTime());
		Viaje aCapital = new Viaje("La Plata", "Buenos Aires", 400, julian);
		Viaje aTrelew = new Viaje("La Plata", "Trelew", 400, julian);
		aCapital.agregarPasajero(sergio);
		aCapital.agregarPasajero(ale);
		sergio.calificar(aCapital, 4, "Estuvo bien. No andaba el aire.");
		ale.calificar(aCapital, 2, "Estuvo maso. Imprudente y no me gusta radio Mitre.");

		muber.agregarPasajero(sergio);
		muber.agregarPasajero(ale);
		
		muber.agregarConductor(julian);
		muber.agregarViaje(aCapital);
		muber.agregarViaje(aTrelew);
		*/
		
		Conductor jairo = new Conductor("jairo@muber.com","13654", cal.getTime(), cal.getTime());
		muber.agregarConductor(jairo);
		
		return muber;
	}

}