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
	private Long id_event_reason;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "status")
	private boolean status;

	@OneToMany(mappedBy = "id_event_reason")
	private List<User> users;

	public EventReason() {
	}

	public EventReason(Long id_event_reason, String nome, String descricao, Boolean status) {
		super();
		this.id_event_reason = id_event_reason;
		this.nome = nome;
		this.descricao = descricao;
		this.status = status;
	}

	public Long getId_event_reason() {
		return id_event_reason;
	}

	public void setId_event_reason(Long id_event_reason) {
		this.id_event_reason = id_event_reason;
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean descricao) {
		this.status = status;
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> d463f932cd488977f927ae3e0a705e467eda0d34
