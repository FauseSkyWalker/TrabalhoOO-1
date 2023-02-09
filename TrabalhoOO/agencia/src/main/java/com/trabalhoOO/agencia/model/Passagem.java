package com.trabalhoOO.agencia.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

public class Passagem {
	
	@Id
	private int númeroPedido;
	
	private Usuário usuário;
	private Voo voo;
	private int acento;
	private float preço;
	private LocalDate dia;
	
	public int getNúmeroPedido() {
		return númeroPedido;
	}
	public void setNúmeroPedido(int númeroPedido) {
		this.númeroPedido = númeroPedido;
	}
	public Usuário getUsuário() {
		return usuário;
	}
	public void setUsuário(Usuário usuário) {
		this.usuário = usuário;
	}
	public Voo getVoo() {
		return voo;
	}
	public void setVoo(Voo voo) {
		this.voo = voo;
	}
	public int getAcento() {
		return acento;
	}
	public void setAcento(int acento) {
		this.acento = acento;
	}
	public float getPreço() {
		return preço;
	}
	public void setPreço(float preço) {
		this.preço = preço;
	}
	public LocalDate getDia() {
		return dia;
	}
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}


}
