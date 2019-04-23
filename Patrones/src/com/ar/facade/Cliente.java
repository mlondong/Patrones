package com.ar.facade;

import java.util.Date;

public class Cliente {


		public static void main(String[] args)   {
			TravelFacade facade = new TravelFacade();       
			facade.getFlightsAndHotels(new Date(2018,12,23), new Date(2019, 12, 24)); 
		}
	
}
