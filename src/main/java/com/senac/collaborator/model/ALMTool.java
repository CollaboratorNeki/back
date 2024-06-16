
package com.senac.collaborator.model;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "alm_tool")
public class ALMTool {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAlmTool;

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
	private String taskStatus; 
	
	@Column(name="closure_status")
	private String closureStatus; 

	@OneToMany
	(mappedBy ="idTask") //id_task
	private List<Task> task;
	
	@OneToMany
	(mappedBy ="idProject")// id_project
	private List<Project> project;
	
	public ALMTool() {}

	public ALMTool(Long idAlmTool, String nome, String url, String login, String senha, String tipo, String vpn,
			String status, String taskStatus, String closureStatus, List<Task> task, List<Project> project) {
		super();
		this.idAlmTool = idAlmTool;
		this.nome = nome;
		this.url = url;
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
		this.vpn = vpn;
		this.status = status;
		this.taskStatus = taskStatus;
		this.closureStatus = closureStatus;
		this.task = task;
		this.project = project;
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
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

	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	
	

	
	
}

