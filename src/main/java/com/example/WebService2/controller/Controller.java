package com.example.WebService2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.WebService2.service.IServicio;
import com.example.WebService2.service.Servicio;

@RestController

public class Controller {
	
	@Autowired
	IServicio objetoservicio;
	
	@GetMapping("/WebService2")
	public String metodoController2() {
		System.out.println("Aqui entramos al controller");
		
		System.out.println("dfdfMiPrimeraRama");
		return objetoservicio.metodoService();
	}

}
