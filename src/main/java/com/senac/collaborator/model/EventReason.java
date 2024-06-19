 package com.senac.collaborator.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "event_reason")
public class EventReason {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEventReason;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "status")
	private boolean status;

	/*corrigir relacionamento*/
	@OneToMany(mappedBy = "idEventReason")
	private List<User> users;

	public EventReason() {
	}

	public EventReason(Long idEventReason, String nome, String descricao, boolean status, List<User> users) {
		super();
		this.idEventReason = idEventReason;
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
		this.users = users;
	}

	
	public Long getIdEventReason() {
		return idEventReason;
	}

	public void setIdEventReason(Long idEventReason) {
		this.idEventReason = idEventReason;
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