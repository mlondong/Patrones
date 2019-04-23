package com.ar.bridge;

public class Cliente {

	/*PATTER BRIDGE PERMITE SEPARAR LA ABSTRACCION DE LA IMPLEMENTACION CUANDO LA ABSTRACCION POSEE MUCHAS
	 * TAREAS A REALIZAR 
	 * LA IMPLEMENTACIN  DEMI PATRON ES RATIO Y TV QUE IMPLEMENTAN _DEVICE SON LAS CLASES CONCRETAS DE LA IMP
	 * 
	 * LA ABSTRACCION ES BASIC AND ADVANCED QUE IMPLEMENTA _REMOTE CONTIENE REFERENCIA A DEVICE
	 * */
	
	
		public static void main(String[] arg){
			
			TV tv = new TV();
			System.out.println("" + tv);
			
			BasicRemote br = new BasicRemote(tv);
			br.volumeUp();
			System.out.println("" + tv);
			br.volumeDown();
			System.out.println("" + tv);
			
			System.out.println();
				
			Radio ra = new  Radio();
			
			System.out.println("" + ra);
			BasicRemote br2 = new BasicRemote(ra);
			br2.volumeUp();
			System.out.println("" + ra);
			
			AdvancedRemote ad = new AdvancedRemote(ra);
			ad.volumeUp();
			System.out.println("" + ra);
			
			
		}
	
}
