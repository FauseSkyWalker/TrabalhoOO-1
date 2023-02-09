package com.trabalhoOO.agencia.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class Hotel {
	
	@Id
	private int id;
	
	private String nome;
	private LocalDate dataentrada;
	private LocalDate dataSaida;
	private int estrelas;
	
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
	public LocalDate getDataentrada() {
		return dataentrada;
	}
	public void setDataentrada(LocalDate dataentrada) {
		this.dataentrada = dataentrada;
	}
	public LocalDate getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}
	public int getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}
	
	

}
