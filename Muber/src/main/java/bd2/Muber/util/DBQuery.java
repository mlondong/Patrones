package bd2.Muber.util;

import java.util.List;
import java.util.Collection;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import bd2.Muber.model.Conductor;
import bd2.Muber.model.Muber;
import bd2.Muber.model.Pasajero;
import bd2.Muber.model.Usuario;
import bd2.Muber.model.Viaje;

public class DBQuery {

	private static SessionFactory sessions;
	private static Session session;
	private static Query aQuery;

	public DBQuery() {
	}

	public static void main(String[] args) {
		consultaViajes();
		obtenerConductor(1);
		consultaViajes("La Plata", "Trelew");
	}
	
	
	private static void consultaViajes(){
		List<Viaje> result;
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate/hibernate.cfg.xml");
			
			sessions = cfg.buildSessionFactory();
			Session session = sessions.openSession();
			
			Query aQuery = session.createQuery("from Viaje");
			result = aQuery.list();
			System.out.println("--------------Consulta Viajes-----------------");
			System.out.println(result);
			
			Viaje viaje = result.get(0);
			System.out.println(viaje.getOrigen());
			session.disconnect();
			System.out.println("----------------------------------------------");
			
		} catch (Exception e) {
			System.out.println("----------------------FAIL-----------------------");
			e.printStackTrace();
		}
	}
	
	private static void consultaViajes(String origen, String destino){
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml");
		
		sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();
		
		Query aQuery = session.createQuery("from Viaje where origen=:origen and destino=:destino");
		aQuery.setParameter("origen", origen);
		aQuery.setParameter("destino", destino);
		List<Viaje> result = aQuery.list();
		System.out.println("--------------Obtener Viajes (desde,hasta)-----------------");
		System.out.println(result);
		System.out.println("-----------------------------------------------------------");
		session.disconnect();
	}
	
	private static void obtenerConductor(long id) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml");
		
		sessions = cfg.buildSessionFactory();
		Session session = sessions.openSession();
		
		Query aQuery = session.createQuery("from Conductor where id=:id");
		aQuery.setParameter("id", id);
		Conductor conductor = (Conductor) aQuery.list().get(0);
		System.out.println("--------------Obtener Conductor-----------------");
		System.out.println(conductor.getEmail());;
		System.out.println("----------------------------------------------");
		session.disconnect();
	}
}
