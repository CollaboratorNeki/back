package com.senac.collaborator.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_project")
	private long id_project;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "data_inicio")
	private int data_inicio;

	@Column(name = "data_fim")
	private int data_fim;

	@Column(name = "status_custo_extra")
	private String status_custo_extra;

	@Column(name = "custo_estimado")
	private int custo_estimado;

	@Column(name = "custoReal")
	private int custo_real;

	@Column(name = "esforçoEstimado")
	private String esforçoEstimado;

	@Column(name = "esforçoReal")
	private String esforço_real;

	@OneToMany(mappedBy = "project")
	private List<Task> project_task;

	@OneToMany(mappedBy = "project")
	private List<ExtraCost> project;

	@OneToMany(mappedBy = "project")
	private List<Technology> technologies;


	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "id_almtool")
	private ALMTool id_almtool;

	public Project() {
	}

	public Project(long id_project, String nome, String descricao, int data_inicio, int data_fim,
			String status_custo_extra, int custo_estimado, int custo_real, String esforçoEstimado,
			String esforço_real) {
		super();
		this.id_project = id_project;
		this.nome = nome;
		this.descricao = descricao;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.status_custo_extra = status_custo_extra;
		this.custo_estimado = custo_estimado;
		this.custo_real = custo_real;
		this.esforçoEstimado = esforçoEstimado;
		this.esforço_real = esforço_real;
	}

	public long getId_project() {
		return id_project;
	}

	public void setId_project(long id_project) {
		this.id_project = id_project;
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

	public String getStatus_custo_extra() {
		return status_custo_extra;
	}

	public void setStatus_custo_extra(String status_custo_extra) {
		this.status_custo_extra = status_custo_extra;
	}

	public int getCusto_estimado() {
		return custo_estimado;
	}

	public void setCusto_estimado(int custo_estimado) {
		this.custo_estimado = custo_estimado;
	}

	public int getCusto_real() {
		return custo_real;
	}

	public void setCusto_real(int custo_real) {
		this.custo_real = custo_real;
	}

	public String getEsforçoEstimado() {
		return esforçoEstimado;
	}

	public void setEsforçoEstimado(String esforçoEstimado) {
		this.esforçoEstimado = esforçoEstimado;
	}

	public String getEsforço_real() {
		return esforço_real;
	}

	public void setEsforço_real(String esforço_real) {
		this.esforço_real = esforço_real;
	}

	
}
