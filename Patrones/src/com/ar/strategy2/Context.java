package com.ar.strategy2;

public class Context {

	private _Operacion op;
	private int a;
	private int b;
	
	
	public Context(int num1, int num2){
		this.a=num1;
		this.b=num2;
	}
	
	
	public void setChoseOperation(_Operacion operac){
		this.op=operac;
	}
	
	
	public int result(){
		return op.operacion(a, b);
	}
	
}
