package com.example.WebService2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.WebService2.repository.IRepositorio;
import com.example.WebService2.repository.Repositorio;

@Service
public class Servicio implements IServicio{
	
	@Autowired
	IRepositorio repositorio;
	
	public String metodoService() {
		
		System.out.println("Aqui entro a Servicio");
		
		
 		
		
		return repositorio.metodoRepositorio();
	}

}
