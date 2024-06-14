
package com.senac.collaborator.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
@Entity
@Table(name = "alm_tool")
public class ALMTool {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_alm_tool;

	@Column(name = "nome")
	private String nome;

	@Column(name = "url")
	private String url;

	@Column(name = "login")
	private String login;

	@Column(name = "senha")
	private String senha;

	@Column(name = "tipo")
	private String tipo;

	@Column(name = "vpn")
	private String vpn; 
	
	@Column(name="status" )
	private String status; 
	
	@Column(name="task_status")
	private String task_status; 
	
	@Column(name="closure_status")
	private String closure_status; 


	@OneToMany
	(mappedBy ="id_task")
	private List<Task> task;
	
	
	
	@OneToMany
	(mappedBy ="id_project")
	private List<Project> project;
	

	public ALMTool () {}
	
	public ALMTool(Long id_alm_tool, String nome, String url, String login, String senha, String tipo, String vpn,
			String status, String task_status, String closure_status) {
		super();
		this.id_alm_tool = id_alm_tool;
		this.nome = nome;
		this.url = url;
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
		this.vpn = vpn;
		this.status = status;
		this.task_status = task_status;
		this.closure_status = closure_status;
		
		
	}


	public Long getId_alm_tool() {
		return id_alm_tool;
	}


	public void setId_alm_tool(Long id_alm_tool) {
		this.id_alm_tool = id_alm_tool;
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


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getTask_status() {
		return task_status;
	}


	public void setTask_status(String task_status) {
		this.task_status = task_status;
	}


	public String getClosure_status() {
		return closure_status;
	}


	public void setClosure_status(String closure_status) {
		this.closure_status = closure_status;
	}

	
}

