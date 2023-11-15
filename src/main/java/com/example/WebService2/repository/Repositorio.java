package com.example.WebService2.repository;

import org.springframework.stereotype.Repository;

@Repository
public class Repositorio implements IRepositorio{
	
	public String metodoRepositorio() {
		
		System.out.println("Aqui entramos al servicio");
		
		return "Mensaje del metodo Repositorio 2";
		
	}

}
