package com.trabalhoOO.agencia.model;

import org.springframework.data.annotation.Id;

public class Pagamento {
	
	@Id
	private int id;
	
	private float Valor;
	private Passagem passagem;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getValor() {
		return Valor;
	}
	public void setValor(float valor) {
		Valor = valor;
	}
	public Passagem getPassagem() {
		return passagem;
	}
	public void setPassagem(Passagem passagem) {
		this.passagem = passagem;
	}
	
	
}
