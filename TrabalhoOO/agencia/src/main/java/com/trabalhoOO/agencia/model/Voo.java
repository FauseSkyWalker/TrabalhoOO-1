package com.trabalhoOO.agencia.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class Voo {
	
	@Id
	private int id;
	
	private LocalDate saida;
	private LocalDate chegada;
	private Aeroporto origem;
	private Aeroporto destino;
	private String empresa;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getSaida() {
		return saida;
	}
	public void setSaida(LocalDate saida) {
		this.saida = saida;
	}
	public LocalDate getChegada() {
		return chegada;
	}
	public void setChegada(LocalDate chegada) {
		this.chegada = chegada;
	}
	public Aeroporto getOrigem() {
		return origem;
	}
	public void setOrigem(Aeroporto origem) {
		this.origem = origem;
	}
	public Aeroporto getDestino() {
		return destino;
	}
	public void setDestino(Aeroporto destino) {
		this.destino = destino;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

}
