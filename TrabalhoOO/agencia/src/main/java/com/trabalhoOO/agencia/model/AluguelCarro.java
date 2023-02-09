package com.trabalhoOO.agencia.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class AluguelCarro {
	
	@Id
	private int númeroPedido;
	
	private Carro carro;
	private LocalDate dataInício;
	private LocalDate dataFinal;
	
	public int getNúmeroPedido() {
		return númeroPedido;
	}
	public void setNúmeroPedido(int númeroPedido) {
		this.númeroPedido = númeroPedido;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public LocalDate getDataInício() {
		return dataInício;
	}
	public void setDataInício(LocalDate dataInício) {
		this.dataInício = dataInício;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}

}
