package com.senac.collaborator.dto;


public class RoleDTO {

	private Long idRole;
	
	private String nome;

	private String descricao;

	private boolean status;

	
	public RoleDTO(Long idRole, String nome, String descricao, boolean status) {
		super();
		this.idRole = idRole;
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

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	

	
	
	
}
