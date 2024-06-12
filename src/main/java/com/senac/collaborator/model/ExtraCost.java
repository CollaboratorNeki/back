package com.senac.collaborator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ExtraCost {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idExtraCost;

	@Column(nullable = false)
	String nome;

	@Column(nullable = false)
	String descricao;

	@Column(nullable = false)
	Double valor;

	@ManyToOne
	@JoinColumn(name = "idProject", nullable = false)
	private Project project;

	public Long getIdExtraCost() {
		return idExtraCost;
	}

	public void setIdExtraCost(Long idExtraCost) {
		this.idExtraCost = idExtraCost;
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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}
