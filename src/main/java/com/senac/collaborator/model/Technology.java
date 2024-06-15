
package com.senac.collaborator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "technology")
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTechnology;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	/* conecta com project */

	@ManyToOne
	@JoinColumn(name = "id_project")
	private Project project;

	public Technology() {
	}

	public Technology(long idTechnology, String nome, String descricao, Project project) {
		super();
		this.idTechnology = idTechnology;
		this.nome = nome;
		this.descricao = descricao;
		this.project = project;
	}

	public long getIdTechnology() {
		return idTechnology;
	}

	public void setIdTechnology(long idTechnology) {
		this.idTechnology = idTechnology;
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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
