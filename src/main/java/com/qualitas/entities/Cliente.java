package com.qualitas.entities;

import com.qualitas.entities.Persona;
import com.qualitas.entities.Poliza;

public class Cliente extends Persona {
    private Poliza poliza;
        
	 public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nombre, String direccion, Poliza poliza) {
		super(nombre, direccion);
		this.poliza = poliza;
		// TODO Auto-generated constructor stub
	}

	public Poliza getPoliza(){
		return poliza;
	 }
	 
	 @Override
	 public String toString(){
		 return"[Nombre = "+getNombre()+", Direccion = "+getDireccion()+", "+getPoliza()+"]";
	 }
	 
}
