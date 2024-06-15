package com.senac.collaborator.dto;

import jakarta.persistence.Column;

public class EventReasonDTO {

	
	private String nome;

	private String descricao;
	
	
	public EventReasonDTO () {
		
	}
	public EventReasonDTO(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
