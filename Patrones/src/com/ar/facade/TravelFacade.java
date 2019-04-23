package com.ar.facade;

import java.util.ArrayList;
import java.util.Date;

public class TravelFacade {


	private HotelBooker hotelBooker;  
	private FlightBooker flightBooker;  

	
	public TravelFacade(){
		hotelBooker = new HotelBooker();
		flightBooker = new FlightBooker();
	}
	
	public void getFlightsAndHotels(Date from, Date to)  { 
		ArrayList<Flight> flights = flightBooker.getFlightsFor(from, to);        
		ArrayList<Hotel> hotels = hotelBooker.getHotelsFor(from, to);        
		
	}
}
