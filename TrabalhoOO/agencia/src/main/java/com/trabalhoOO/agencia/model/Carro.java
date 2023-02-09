package com.trabalhoOO.agencia.model;

import org.springframework.data.annotation.Id;

public class Carro {
	
	@Id
	private String placa;
	
	private String modelo;
	private int ano;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	

}
