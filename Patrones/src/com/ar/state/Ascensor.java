package com.ar.state;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/*MI CLASE ASCENSOR ES MI CLASE CONTROLES*/
public class Ascensor {

	private int level;
	private String direction;
	private _StateAscensor state=null;
	private ArrayList<Pedido> pedidos = new  ArrayList<Pedido>();


	
	
	/*METODO QUE INICIALIZA EL ASCENSOR*/
	/*************************************************************************************/
	public void cargarPedidos(){
		this.calcularDistancia();
	}


	/*METODO DE CALCULAR DISTANCIA ESTE METODO CALCULA LA DISTANCIA  DE CADA PEDIDO 
	 * TOMO COMO REFERENCIA DE DISTANCIA EL PRIMER PEDIDO QUE INGRESO A LOS PEDIDOS DEL ASCENSOR*/	
	/*************************************************************************************/
	public void calcularDistancia(){
		// VALOR DE REFERENCIA PARA CALCULAR LA DISTANCIA Y LUEGO EL ORDEN DE PEDIDOS
		//PEDIDOS [0].GETPISO
		int ini = pedidos.get(0).getPiso(); 
		int i=0;
		
		for(Pedido p: pedidos){
			i = p.getPiso() - ini;
			p.setDistancia(i);
		}
		this.ordenarAsc();
	}



	/*METODO DE ORDEN ASCENDENTE*/
	/*************************************************************************************/
	public void ordenarAsc(){
		ArrayList<Pedido> aux= new  ArrayList<Pedido>();
		Pedido tmp;

		for (int x = 0; x < pedidos.size(); x++) {
			for (int i = 0; i < pedidos.size()-x-1; i++) {
				if(pedidos.get(i).getDistancia() > pedidos.get(i+1).getDistancia()){
					tmp= pedidos.get(i);
					pedidos.set(i, pedidos.get(i+1));
					pedidos.set(i+1, tmp);
				}
			}
		}

	}

	/*METODO DE ORDEN DESCENDENTE*/
	/*************************************************************************************/
	public void ordenarDesc(){
		ArrayList<Pedido> aux= new  ArrayList<Pedido>();
		Pedido tmp;

		for (int x = 0; x < pedidos.size(); x++) {
			for (int i = 0; i < pedidos.size()-x-1; i++) {
				if(pedidos.get(i).getDistancia() < pedidos.get(i+1).getDistancia()){
					tmp= pedidos.get(i+1);
					pedidos.set(i+1, pedidos.get(i));
					pedidos.set(i, tmp);
				}
			}
		}

	}


	/*************************************************************************************/
	/*Peticiones*/
	public void addPedidos(int piso, String dir){
		Pedido p = new Pedido(piso, dir);
		pedidos.add(p);
	}

	public ArrayList<Pedido> getPedidos(){
		return pedidos;
	}

	/*************************************************************************************/
	/*SETER Y GETTER ATRIBUTOS EN ASCENSOR*/
	
	public void setLevel(int i) {
		this.level=i;
	}
	
	public void setDirection(String g) {
		this.direction=g;
	}

	public void setState(_StateAscensor s){
		this.state=s;
	}

	public _StateAscensor getState(){
		return this.state;
	}

	
	
	
	/*METODO PARA INICIAR LOS PEDIDOS DEL ASECENSOR*/
	/*************************************************************************************/

	public void start(){

		/*EL ASCENSOR DEBE MANEJAR EN PISO DIRECCION ESTADO A PARTIR DE LOS PEDIDOS*/
		for(Pedido p: pedidos){
			/*SETEO LOS VALORES DECADA PEDIDO EN EL ASCENSOR*/
			//System.out.println(p.toString() +" " + p.getDireccion() +" "+ p.getPiso() +" "+p.getDistancia() );
			if(p.getDireccion().equals("Up")){ 
				this.uP(p);
			}else if(p.getDireccion().equals("Down")){
				this.doWn(p);
			}else{
				this.idle(p);
			}
		}
	}


	public void idle(Pedido p){
		this.setState(new IdleState());
		this.state.idle(this,p);
		
	}

	public void uP(Pedido p){
		this.setState(new UpState());
		this.state.uP(this,p);
	}
	
	public void doWn(Pedido p){
		this.setState(new DownState());
		this.state.doWn(this,p);
	}


	@Override
	public String toString() {
		return "Ascensor [state=" + state + ", level=" + level + ", direction=" + direction + ", pedidos=" + pedidos +"]";
	}




}
