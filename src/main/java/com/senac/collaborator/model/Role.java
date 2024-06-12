package com.senac.collaborator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name ="Role")

public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idRole")
	private Long idRole;
	
	@Column(name ="nome")
	private String nome;
	
	@Column(name ="descricao")
	private String descricao;
	
	@Column(name ="status")
	private boolean status;
	
	@OneToMany(mappedBy="idRole")
	private List<User> users;
	
	
	public Role () {}


	public Role(Long idRole, String nome, String descricao, boolean status, List<User> users) {
		super();
		this.idRole = idRole;
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
		this.users = users;
	}


	public Long getIdRole() {
		return idRole;
	}


	public void setIdRole(Long idRole) {
		this.idRole = idRole;
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


	public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


}