package com.trabalhoOO.agencia.model;

import org.springframework.data.annotation.Id;

public class Aeroporto {
	
	@Id
	private int id;
	
	private String nome;
	private String endereço;
	private String oioi;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	

}
