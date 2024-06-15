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
	private long idProject;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "data_inicio")
	private int dataInicio;

	@Column(name = "data_fim")
	private int dataFim;

	@Column(name = "status_custo_extra")
	private String statusCustoExtra;

	@Column(name = "custo_estimado")
	private int custoEstimado;

	@Column(name = "custoReal")
	private int custoReal;

	@Column(name = "esforçoEstimado")
	private String esforçoEstimado;

	@Column(name = "esforçoReal")
	private String esforçoReal;

	@OneToMany(mappedBy = "project")
	private List<Task> projectTask;

	@OneToMany(mappedBy = "project")
	private List<ExtraCost> project;

	@OneToMany(mappedBy = "project")
	private List<Technology> technologies;

	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "id_almtool")
	private ALMTool idAlmtool;

	public Project() {}

	public Project(long idProject, String nome, String descricao, int dataInicio, int dataFim, String statusCustoExtra,
			int custoEstimado, int custoReal, String esforçoEstimado, String esforçoReal, List<Task> projectTask,
			List<ExtraCost> project, List<Technology> technologies, Client client, ALMTool idAlmtool) {
		super();
		this.idProject = idProject;
		this.nome = nome;
		this.descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.statusCustoExtra = statusCustoExtra;
		this.custoEstimado = custoEstimado;
		this.custoReal = custoReal;
		this.esforçoEstimado = esforçoEstimado;
		this.esforçoReal = esforçoReal;
		this.projectTask = projectTask;
		this.project = project;
		this.technologies = technologies;
		this.client = client;
		this.idAlmtool = idAlmtool;
	}

	public long getIdProject() {
		return idProject;
	}

	public void setIdProject(long idProject) {
		this.idProject = idProject;
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

	public int getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(int dataInicio) {
		this.dataInicio = dataInicio;
	}

	public int getDataFim() {
		return dataFim;
	}

	public void setDataFim(int dataFim) {
		this.dataFim = dataFim;
	}

	public String getStatusCustoExtra() {
		return statusCustoExtra;
	}

	public void setStatusCustoExtra(String statusCustoExtra) {
		this.statusCustoExtra = statusCustoExtra;
	}

	public int getCustoEstimado() {
		return custoEstimado;
	}

	public void setCustoEstimado(int custoEstimado) {
		this.custoEstimado = custoEstimado;
	}

	public int getCustoReal() {
		return custoReal;
	}

	public void setCustoReal(int custoReal) {
		this.custoReal = custoReal;
	}

	public String getEsforçoEstimado() {
		return esforçoEstimado;
	}

	public void setEsforçoEstimado(String esforçoEstimado) {
		this.esforçoEstimado = esforçoEstimado;
	}

	public String getEsforçoReal() {
		return esforçoReal;
	}

	public void setEsforçoReal(String esforçoReal) {
		this.esforçoReal = esforçoReal;
	}

	public List<Task> getProjectTask() {
		return projectTask;
	}

	public void setProjectTask(List<Task> projectTask) {
		this.projectTask = projectTask;
	}

	public List<ExtraCost> getProject() {
		return project;
	}

	public void setProject(List<ExtraCost> project) {
		this.project = project;
	}

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ALMTool getIdAlmtool() {
		return idAlmtool;
	}

	public void setIdAlmtool(ALMTool idAlmtool) {
		this.idAlmtool = idAlmtool;
	}

	

	
}
