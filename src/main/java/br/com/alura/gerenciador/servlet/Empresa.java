package br.com.alura.gerenciador.servlet;

public class Empresa {
	
	private Long id;
	private String nome;
	
	
	public Empresa(String nome) {
		this.nome = nome;
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
	
	

}
