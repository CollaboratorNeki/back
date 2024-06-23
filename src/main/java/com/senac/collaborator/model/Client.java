package com.senac.collaborator.model;

import java.util.List;

import com.senac.collaborator.dto.ClientDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;

	@Column(name ="nome")
	private String nome;

	@Column(name="telefone")
	private Long telefone;

	@Column(name="email")
	private String email;
	
	@Column(name="documento")
	private String documento;
	
	@Column(name="codigo_externo")
	private String codigoExterno;
	

	
	
	
	 @OneToMany
	(mappedBy ="idProject")
	private List<Project> project;
	
	
	public Client () {}



	public Client(Long idClient, String nome, Long telefone, String email, String documento, String codigoExterno,
			List<Project> project) {
		super();
		this.idClient = idClient;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.documento = documento;
		this.codigoExterno = codigoExterno;
		this.project = project;
	}



	public Client(ClientDTO clientDto) {
		this.nome = clientDto.getNome();
		this.telefone = clientDto.getTelefone();
		this.email = clientDto.getEmail();
		this.documento = clientDto.getDocumento();
		this.codigoExterno = clientDto.getCodigoExterno();
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



	public Long getTelefone() {
		return telefone;
	}



	public void setTelefone(Long telefone) {
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



	public List<Project> getProject() {
		return project;
	}



	public void setProject(List<Project> project) {
		this.project = project;
	}



	


}
