package com.senac.collaborator.dto;



public class TechnologyDTO {
	
	private Long idTechnology;
	private String nome;
	private String tipo;
	private String versao;
	
	
	public TechnologyDTO() {
	
	}
	
	
	public TechnologyDTO(Long idTechnology, String nome, String tipo, String versao) {
		super();
		this.idTechnology = idTechnology;
		this.nome = nome;
		this.tipo = tipo;
		this.versao = versao;
	}


	public Long getIdTechnology() {
		return idTechnology;
	}
	public void setIdTechnology(Long idTechnology) {
		this.idTechnology = idTechnology;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}


	

	
	
}
