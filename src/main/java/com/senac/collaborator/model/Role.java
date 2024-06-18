package com.senac.collaborator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;


import com.senac.collaborator.dto.RoleDTO;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_role")
	private Long idRole;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "status")
	private boolean status;

//    @OneToMany(mappedBy = "idRole") 
//    private List<User> users;

	
	public Long getIdRole() {
		return idRole;
	}

	public Role() {}
	
	public Role(Long idRole, String nome, String descricao, boolean status) {
		super();
		this.idRole = idRole;
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;

	}

	public Role(RoleDTO roleDto) {
	this.nome = roleDto.getDescricao();
	this.descricao = roleDto.getDescricao();
	this.status = roleDto.isStatus();
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

}