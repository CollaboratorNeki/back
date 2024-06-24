package com.senac.collaborator.dto;


public class ClientDTO {
	
	private Long idClient;
	private String nome;
	private String telefone;
	private String email;
	private String documento;
	private String codigoExterno;
	public ClientDTO(Long idClient, String nome, String telefone, String email, String documento, String codigoExterno) {
		super();
		this.idClient = idClient;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.documento = documento;
		this.codigoExterno = codigoExterno;
	}
	public ClientDTO() {
	
	}
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getCodigoExterno() {
		return codigoExterno;
	}
	public void setCodigoExterno(String codigoExterno) {
		this.codigoExterno = codigoExterno;
	}
	
	
	
}

