package com.senac.collaborator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class EventReason {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEventReason;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String descricao;
	
	@Column(name = "status")
	private Boolean status;

	public Long getIdEventReason() {
		return idEventReason;
	}

	
	// gets e sets***************************
	
	
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}}