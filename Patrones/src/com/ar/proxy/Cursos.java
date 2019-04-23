package com.ar.proxy;

public class Cursos {

	private String nombreCurso;
	private int duracion;
	private float nota;
	
	
	public Cursos(){}
	
	public Cursos(String name, int hours, float note){
		this.nombreCurso=name;
		this.duracion=hours;
		this.nota=note;
	}
	
	public String getNombreCurso() {
		return nombreCurso;
	}
	
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public float getNota() {
		return nota;
	}
	
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	
}
