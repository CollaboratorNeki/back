package com.senac.collaborator.model;

import com.senac.collaborator.dto.EventReasonDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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

	public EventReason() {
	}

	public EventReason(EventReasonDTO eventReasonDto) {
		this.idEventReason = eventReasonDto.getIdEventReason();
		this.nome = eventReasonDto.getNome();
		this.descricao = eventReasonDto.getDescricao();
		this.status = eventReasonDto.isStatus();
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

	// Getters and Setters
}
