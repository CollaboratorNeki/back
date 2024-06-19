package com.senac.collaborator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_task")
	private long idTask;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "data_inicio")
	private LocalDate dataInicio;

	@Column(name = "dat_fim")
	private LocalDate dataFim;

	@Column(name = "status")
	private String status;

	@Column(name = "esforco_estimado")
	private String esforcoEstimado;

	@Column(name = "esforco_real")
	private String esforcoReal;

	@ManyToOne
	@JoinColumn(name = "id_responsavel")
	private User idResponsavel;

	@ManyToOne
	@JoinColumn(name = "id_project")
	private Project project;

	@ManyToOne
	@JoinColumn(name = "id_almtool")
	private ALMTool idAlmTool;

	@OneToMany(mappedBy = "idTask")
	private List<Task> idTaskList;

	public Task() {
	}



	public Task(long idTask, String nome, String descricao, LocalDate dataInicio, LocalDate dataFim, String status,
			String esforcoEstimado, String esforcoReal, User idResponsavel, Project project, ALMTool idAlmTool,
			List<Task> idTaskList) {
		super();
		this.idTask = idTask;
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.status = status;
		this.esforcoEstimado = esforcoEstimado;
		this.esforcoReal = esforcoReal;
		this.idResponsavel = idResponsavel;
		this.project = project;
		this.idAlmTool = idAlmTool;
		this.idTaskList = idTaskList;
	}



	public long getIdTask() {
		return idTask;
	}



	public void setIdTask(long idTask) {
		this.idTask = idTask;
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



	public LocalDate getDataInicio() {
		return dataInicio;
	}



	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}



	public LocalDate getDataFim() {
		return dataFim;
	}



	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getEsforcoEstimado() {
		return esforcoEstimado;
	}



	public void setEsforcoEstimado(String esforcoEstimado) {
		this.esforcoEstimado = esforcoEstimado;
	}



	public String getEsforcoReal() {
		return esforcoReal;
	}



	public void setEsforcoReal(String esforcoReal) {
		this.esforcoReal = esforcoReal;
	}



	public User getIdResponsavel() {
		return idResponsavel;
	}



	public void setIdResponsavel(User idResponsavel) {
		this.idResponsavel = idResponsavel;
	}



	public Project getProject() {
		return project;
	}



	public void setProject(Project project) {
		this.project = project;
	}



	public ALMTool getIdAlmTool() {
		return idAlmTool;
	}



	public void setIdAlmTool(ALMTool idAlmTool) {
		this.idAlmTool = idAlmTool;
	}



	public List<Task> getIdTaskList() {
		return idTaskList;
	}



	public void setIdTaskList(List<Task> idTaskList) {
		this.idTaskList = idTaskList;
	}





}
