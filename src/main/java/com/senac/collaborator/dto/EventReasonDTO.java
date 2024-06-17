package com.senac.collaborator.dto;

public class EventReasonDTO {

	private Long idEventReason;
	private String nome;
	private String descricao;

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
}
