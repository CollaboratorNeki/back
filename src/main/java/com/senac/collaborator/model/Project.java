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
@Table(name = "Project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProject")
	private long idProject;

	@Column(name = "nome")
	private String nome;

	@Column(name = "Descricao")
	private String Descricao;

	@Column(name = "dataInicio")
	private int dataInicio;

	@Column(name = "dataFim")
	private int dataFim;

	@Column(name = "statusCustoExtra")
	private boolean statusCustoExtra;

	@Column(name = "custoEstimado")
	private int custoEstimado;

	@Column(name = "custoReal")
	private int custoReal;

	@Column(name = "esforçoEstimado")
	private String esforçoEstimado;

	@Column(name = "esforçoReal")
	private String esforçoReal;

	@OneToMany(mappedBy = "IdProject")
	private List<Task> projectTask;

	@OneToMany(mappedBy = "idProject")
	private List<ExtraCost> idproject;

	@OneToMany(mappedBy = "idTechnology")
	private List<Technology> technology;

	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "idALMTool")
	private ALMTool almtool;

	public Project() {
	}

	public Project(long idProject, String nome, String descricao, int dataInicio, int dataFim, boolean statusCustoExtra,
			int custoEstimado, int custoReal, String esforçoEstimado, String esforçoReal, List<Task> projectTask,
			List<ExtraCost> idproject2, List<Technology> technology, Client client, ALMTool almtool) {
		super();
		this.idProject = idProject;
		this.nome = nome;
		Descricao = descricao;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.statusCustoExtra = statusCustoExtra;
		this.custoEstimado = custoEstimado;
		this.custoReal = custoReal;
		this.esforçoEstimado = esforçoEstimado;
		this.esforçoReal = esforçoReal;
		this.projectTask = projectTask;
//		idroject = idproject2; // CONFIRMAR  - 
		this.technology = technology;
		this.client = client;
		this.almtool = almtool;
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
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
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

	public boolean isStatusCustoExtra() {
		return statusCustoExtra;
	}

	public void setStatusCustoExtra(boolean statusCustoExtra) {
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

	public List<ExtraCost> getIdproject() {
		return idproject;
	}

	public void setIdproject(List<ExtraCost> idproject) {
		this.idproject = idproject;
	}

	public List<Technology> getTechnology() {
		return technology;
	}

	public void setTechnology(List<Technology> technology) {
		this.technology = technology;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ALMTool getAlmtool() {
		return almtool;
	}

	public void setAlmtool(ALMTool almtool) {
		this.almtool = almtool;
	}
}
