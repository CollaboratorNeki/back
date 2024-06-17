package com.senac.collaborator.dto;

import java.time.LocalDateTime;

import com.senac.collaborator.model.Message;

public class MessageDTO {

	private String conteudo;

	private LocalDateTime dataEnvio;

	private String tipo;

	private String acao;

	public MessageDTO(Message message) {
		super();
		this.conteudo = message.getConteudo();
		this.dataEnvio = message.getDataEnvio();
		this.tipo = message.getTipo();
		this.acao = message.getAcao();
	}

	public MessageDTO() {
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public LocalDateTime getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(LocalDateTime dataEnvio) {
		this.dataEnvio = dataEnvio;

	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;

	}
}
