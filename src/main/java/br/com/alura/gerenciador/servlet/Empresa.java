package br.com.alura.gerenciador.servlet;

import java.util.Date;

public class Empresa {
	
	private Long id;
	private String nome;
	private Date dataAbertura = new Date();
	
	
	public Empresa(String nome) {
		this.nome = nome;
		this.dataAbertura = new Date();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	
	public Date getDataAbertura() {
		return dataAbertura;
	}
	

}
