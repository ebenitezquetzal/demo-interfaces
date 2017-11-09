package com.qualitas.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.qualitas.dao.ClienteDAO;
import com.qualitas.dao.PolizaDAO;
import com.qualitas.entities.Cliente;
import com.qualitas.entities.Poliza;

public class ClienteDAOImpl implements ClienteDAO{
	private PolizaDAO polizaDAO;
		
	public ClienteDAOImpl(PolizaDAO polizaDAO) {
		super();
		this.polizaDAO = polizaDAO;
	}

	public int insertar(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int borrar(Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Cliente actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	public Cliente consultar(String nombre, String direccion, Poliza poliza) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cliente> consultar() {
		//Personas
	    List<Cliente> lista = new ArrayList<>();// Creo lista vacia
				
		//Personas
		String[] nombres = dameNombres();
				
		List<Poliza> listaCreada = polizaDAO.damePolizas();
				
		//Regresa Personas
		for(int i=0;i<listaCreada.size();i++)
		{
			int valor = (int)(Math.random()*100);
			Cliente instancia =  new Cliente(nombres[i], 
					"calle "+valor, 
					listaCreada.get(i));
			lista.add(instancia); //Agrego instancia a la lista
		}
		
		return lista; //Regreso la lista
	}
		
	public List<Cliente> consultar(int inicio, int fin) {
		// TODO Auto-generated method stub
		return null;
	}

	public String[] dameNombres(){
		String[] nombres = new String[] {"Victor","Edgar","Griselda","Isora","Eduardo","Gonzalo",
			    "Hugo","Irma","Erick","Israel"};
		
		return nombres;
	}	
}
