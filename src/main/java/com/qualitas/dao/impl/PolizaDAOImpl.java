package com.qualitas.dao.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.qualitas.dao.PolizaDAO;
import com.qualitas.entities.Poliza;

public class PolizaDAOImpl implements PolizaDAO {

	public List<Poliza> damePolizas() {
		List<Poliza> lista = new ArrayList<>();// Creo instancia de la lista
		for ( int i=0;i<10;i++){
			int valor=(int)(Math.random()*100000);
		
			Poliza instancia = new Poliza(valor, LocalDate.now(), LocalDate.now());
									
			lista.add(instancia);		
		}
		return lista;		
	}
}
