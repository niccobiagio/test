package com.nicco.openshift.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nicco.openshift.model.Contatto;

@RestController
public class ServiceRestController {

	@RequestMapping("test")
	public List<Contatto> servicetTest(){
		List<Contatto> lista = new ArrayList<Contatto>();
		lista.add(new Contatto("Mario", "Rossi", "mario"));
		lista.add(new Contatto("Maria", "Rossa", "maria"));
		lista.add(new Contatto("Paolo", "Rosa", "paolo"));
		return lista;
	}
	
}
