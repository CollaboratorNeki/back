package com.senac.collaborator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ALMTool {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAlmTool;

	private String nome;
	private String url;
	private String login;
	private String senha;
	private String tipo;
	private String vpn;
	private Boolean status;
	private String taskStatus; // Adicione os campos corretamente
	private String closureStatus;

	public Long getIdAlmTool() {
		return idAlmTool;
	}

	public void setIdAlmTool(Long idAlmTool) {
		this.idAlmTool = idAlmTool;
	}

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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
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

	// Getters and Setters
}
