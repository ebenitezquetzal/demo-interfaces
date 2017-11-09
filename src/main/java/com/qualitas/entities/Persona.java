package com.qualitas.entities;

public class Persona {

	private String nombre; // propiedad
	private String direccion; // propiedad
		
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public void setNombre(String nombre ){
	   this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccion() {
		return direccion;
	}

}
