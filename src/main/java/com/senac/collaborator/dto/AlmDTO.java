package com.senac.collaborator.dto;

import jakarta.persistence.Column;

public class AlmDTO {

	private String nome;

	private String url;

	private String login;

	private String senha;

	private String tipo;

	private String vpn;

	private boolean status;

	private String taskStatus;

	private String closureStatus;

	public AlmDTO(String nome, String url, String login, String senha, String tipo, String vpn, boolean status,
			String taskStatus, String closureStatus) {
		super();
		this.nome = nome;
		this.url = url;
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
		this.vpn = vpn;
		this.status = status;
		this.taskStatus = taskStatus;
		this.closureStatus = closureStatus;
	}
	
	public AlmDTO() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getVpn() {
		return vpn;
	}

	public void setVpn(String vpn) {
		this.vpn = vpn;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public String getClosureStatus() {
		return closureStatus;
	}

	public void setClosureStatus(String closureStatus) {
		this.closureStatus = closureStatus;
	}
	
	
	
}
