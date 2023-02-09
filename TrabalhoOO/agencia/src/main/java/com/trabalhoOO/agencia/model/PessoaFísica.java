package com.trabalhoOO.agencia.model;

import java.time.LocalDate;

public class PessoaFísica extends Usuário {
	
	private String CPF;
	private LocalDate nascimento;
	private String RG;
	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	
	

}
