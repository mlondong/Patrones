package bd2.web;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.google.gson.Gson;

import bd2.Muber.dao.*;
import bd2.Muber.dto.*;
import bd2.Muber.model.*;

@ControllerAdvice
@RequestMapping("/services")
@ResponseBody
@EnableWebMvc
public class MuberRestController {
	protected Session getSession() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}

	@RequestMapping(value = "/pasajeros", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String pasajeros() {
		Session session = this.getSession();
		PasajeroDAO dao = new PasajeroDAO(session);
		Collection<Pasajero> pasajeros = dao.getPasajeros();
		Collection<PasajeroDTO> dtos = new ArrayList<PasajeroDTO>();
		for (Pasajero pasajero : pasajeros)
			dtos.add(new PasajeroDTO(pasajero));

		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "OK");
		aMap.put("pasajeros", dtos);
		return new Gson().toJson(aMap);
	}

	@RequestMapping(value = "/conductores", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String conductores() {
		Session session = this.getSession();
		ConductorDAO dao = new ConductorDAO(session);
		Collection<Conductor> conductores = dao.getConductores();

		Collection<ConductorDTO> dtos = new ArrayList<ConductorDTO>();
		for (Conductor conductor : conductores)
			dtos.add(new ConductorDTO(conductor));

		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "OK");
		aMap.put("conductores", dtos);
		return new Gson().toJson(aMap);
	}

	@RequestMapping(value = "/viajes", method = RequestMethod.GET, produces = "application/json", headers = "Accept=application/json")
	public String viajes() {
		Session session = this.getSession();
		ViajeDAO dao = new ViajeDAO(session);
		Collection<Viaje> viajes = dao.getViajes();

		Collection<ViajeDTO> dtos = new ArrayList<ViajeDTO>();
		for (Viaje viaje : viajes)
			dtos.add(new ViajeDTO(viaje));

		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "OK");
		aMap.put("viajes", dtos);
		return new Gson().toJson(aMap);

	}

	@RequestMapping(value = "/pasajeros/new", method = RequestMethod.POST, produces = "application/json", headers = "Accept=application/json")
	public String crearPasajero(@RequestParam("email") String email, @RequestParam("contrasenha") String contrasenha) {

		Session session = this.getSession();
		Transaction transaction = session.beginTransaction();

		MuberDAO muberDAO = new MuberDAO(session);
		Muber muber = muberDAO.obtenerMuber();
		Pasajero pasajero = new Pasajero(email, contrasenha);
		muber.agregarPasajero(pasajero);
		PasajeroDTO dto = new PasajeroDTO(pasajero);

		transaction.commit();
		session.close();

		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "OK");
		aMap.put("pasajero", dto);
		return new Gson().toJson(aMap);
	}

	@RequestMapping(value = "/viajes/new", method = RequestMethod.POST, produces = "application/json", headers = "Accept=application/json")
	public String crearViaje(@RequestParam("origen") String origen, @RequestParam("destino") String destino,
			@RequestParam("conductorId") long conductorId, @RequestParam("costoTotal") long costoTotal,
			@RequestParam("cantidadPasajeros") int cantidadPasajeros) {

		Session session = this.getSession();
		Transaction transaction = session.beginTransaction();

		MuberDAO muberDAO = new MuberDAO(session);
		Muber muber = muberDAO.obtenerMuber();
		ConductorDAO conductorDAO = new ConductorDAO(session);
		Conductor conductor = conductorDAO.obtenerConductor(conductorId);
		Viaje viaje = new Viaje(origen, destino, costoTotal, conductor);
		muber.agregarViaje(viaje);

		ViajeDTO dto = new ViajeDTO(viaje);

		transaction.commit();
		session.close();

		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "OK");
		aMap.put("viaje", dto);
		return new Gson().toJson(aMap);
	}

	@RequestMapping(value = "/pasajeros/cargarCredito", method = RequestMethod.POST, produces = "application/json", headers = "Accept=application/json")
	public String cargarCredito(@RequestParam("pasajeroId") int pasajeroId, @RequestParam("monto") int monto) {

		Session session = this.getSession();
		Transaction transaction = session.beginTransaction();

		PasajeroDAO dao = new PasajeroDAO(session);
		Pasajero pasajero = dao.obtenerPasajero(pasajeroId);
		pasajero.agregarCredito(monto);
		PasajeroDTO dto = new PasajeroDTO(pasajero);

		transaction.commit();
		session.close();

		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "OK");
		aMap.put("pasajero", dto);
		return new Gson().toJson(aMap);
	}

	@RequestMapping(value = "/viajes/agregarPasajero", method = RequestMethod.POST, produces = "application/json", headers = "Accept=application/json")
	public String agregarPasajero(@RequestParam("pasajeroId") int pasajeroId, @RequestParam("viajeId") int viajeId) {

		Session session = this.getSession();
		Transaction transaction = session.beginTransaction();

		ViajeDAO viajeDAO = new ViajeDAO(session);
		PasajeroDAO pasajeroDAO = new PasajeroDAO(session);

		Viaje viaje = viajeDAO.obtenerViaje(viajeId);
		Pasajero pasajero = pasajeroDAO.obtenerPasajero(pasajeroId);
		viaje.agregarPasajero(pasajero);

		transaction.commit();
		session.close();

		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "OK");
		return new Gson().toJson(aMap);
	}

	@RequestMapping(value = "/viajes/calificar", method = RequestMethod.POST, produces = "application/json", headers = "Accept=application/json")
	public String calificarViaje(@RequestParam("pasajeroId") int pasajeroId, @RequestParam("viajeId") int viajeId,
			@RequestParam("puntaje") int puntaje, @RequestParam("comentario") String comentario) {

		Session session = this.getSession();
		Transaction transaction = session.beginTransaction();

		ViajeDAO viajeDAO = new ViajeDAO(session);
		PasajeroDAO pasajeroDAO = new PasajeroDAO(session);
		Viaje viaje = viajeDAO.obtenerViaje(viajeId);
		Pasajero pasajero = pasajeroDAO.obtenerPasajero(pasajeroId);
		pasajero.calificar(viaje, puntaje, comentario);

		transaction.commit();
		session.close();

		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "OK");
		return new Gson().toJson(aMap);
	}

	@RequestMapping(value = "/viajes/finalizar", method = RequestMethod.POST, produces = "application/json", headers = "Accept=application/json")
	public String finalizarViaje(@RequestParam("viajeId") int viajeId) {

		Session session = this.getSession();
		Transaction transaction = session.beginTransaction();

		ViajeDAO viajeDAO = new ViajeDAO(session);
		Viaje viaje = viajeDAO.obtenerViaje(viajeId);
		viaje.cerrarViaje();

		transaction.commit();
		session.close();

		Map<String, Object> aMap = new HashMap<String, Object>();
		aMap.put("result", "OK");
		return new Gson().toJson(aMap);
	}

}
