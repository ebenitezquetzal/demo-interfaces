package com.qualitas.entities;

import java.time.LocalDate;

public class Poliza {
	
    private int numero;
    private LocalDate ini_vig;
    private LocalDate fin_vig;       
    
	public Poliza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Poliza(int numero, LocalDate ini_vig, LocalDate fin_vig) {
		super();
		this.numero = numero;
		this.ini_vig = ini_vig;
		this.fin_vig = fin_vig;
	}

	public LocalDate getFin_vig() {
		return fin_vig;
	}
	
	public void setFin_vig(LocalDate fin_vig) {
		this.fin_vig = fin_vig;
	}
	
	public LocalDate getIni_vig() {
		return ini_vig;
	}
	
	public void setIni_vig(LocalDate ini_vig) {
		this.ini_vig = ini_vig;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString(){
		return "Poliza = " + getNumero();
	}
	
}
