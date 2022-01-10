package com.nicco.openshift.model;

import java.io.Serializable;

public class Contatto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2737769139399456822L;
	private String nome;
	private String cognome; 
	private String username;
	public Contatto(String string, String string2, String string3) {
		this.nome=string;
		this.cognome=string2;
		this.username=string3;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
}
