package com.senac.collaborator.dto;

import jakarta.persistence.Column;

public class RoleDTO {

	private String nome;

	private String descricao;

	private boolean status;

	public RoleDTO(String nome, String descricao, boolean status) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
	}
	
	public RoleDTO() {}

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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
