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
import java.util.List;

@Entity
@Table(name = "task")
public class Task {

	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id_task")
	private long id_task;
	
	@Column(name ="nome")
	private String nome;
	
	@Column(name ="descricao")
	private String descricao;
	
	@Column(name ="data_inicio")
	private int data_inicio;
	
	@Column(name ="dat_fim")
	private int data_fim;
	
	@Column(name ="status")
	private String status;
	
	@Column(name ="esforco_estimado")
	private String esforco_estimado;
	
	@Column(name ="esforco_real")
	private String esforco_real;
	

	@ManyToOne
	@JoinColumn(name = "idResponsavel")
	private User  idResponsavel;
	
	
	@ManyToOne
	@JoinColumn(name = "id_project")
	private Project project;
	
	
	@ManyToOne
	@JoinColumn(name = "id_almtool")
	private ALMTool id_almtool;
	
	@OneToMany
	(mappedBy="id_task")
	private List<Task> id_taskList;
	
	
	public Task () {}


	public Task(long id_task, String nome, String descricao, int data_inicio, int data_fim, String status,
			String esforco_estimado, String esforco_real) {
		super();
		this.id_task = id_task;
		this.nome = nome;
		this.descricao = descricao;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.status = status;
		this.esforco_estimado = esforco_estimado;
		this.esforco_real = esforco_real;
	}


	public long getId_task() {
		return id_task;
	}


	public void setId_task(long id_task) {
		this.id_task = id_task;
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


	public int getData_inicio() {
		return data_inicio;
	}


	public void setData_inicio(int data_inicio) {
		this.data_inicio = data_inicio;
	}


	public int getData_fim() {
		return data_fim;
	}


	public void setData_fim(int data_fim) {
		this.data_fim = data_fim;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getEsforco_estimado() {
		return esforco_estimado;
	}


	public void setEsforco_estimado(String esforco_estimado) {
		this.esforco_estimado = esforco_estimado;
	}


	public String getEsforco_real() {
		return esforco_real;
	}


	public void setEsforco_real(String esforco_real) {
		this.esforco_real = esforco_real;
	}


	

	

	
	
}
