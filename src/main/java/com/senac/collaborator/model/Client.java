package com.senac.collaborator.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String contato;

	@Column(nullable = false)
	private String email;

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
