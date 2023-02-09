package com.trabalhoOO.agencia.model;

import org.springframework.data.annotation.Id;

public class Passageiro extends PessoaFísica{
	
	@Id
	private int id;
	
	private String acento;
	private String passaporte;
	private TipoPassageiro tipo;
	private Boolean querCarro;
	private Boolean querHops;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAcento() {
		return acento;
	}
	public void setAcento(String acento) {
		this.acento = acento;
	}
	public String getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
	public TipoPassageiro getTipo() {
		return tipo;
	}
	public void setTipo(TipoPassageiro tipo) {
		this.tipo = tipo;
	}
	public Boolean getQuerCarro() {
		return querCarro;
	}
	public void setQuerCarro(Boolean querCarro) {
		this.querCarro = querCarro;
	}
	public Boolean getQuerHops() {
		return querHops;
	}
	public void setQuerHops(Boolean querHops) {
		this.querHops = querHops;
	}
	

	

}
