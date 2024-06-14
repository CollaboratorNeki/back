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
@Table(name ="extra_cost")
public class ExtraCost {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExtraCost;

	@Column(name="nome")
	private String nome;

	@Column(name="descricao")
	private String descricao;

	@Column(name="valor")
	private Double valor;

	@ManyToOne
	@JoinColumn(name = "id_project")
	private Project project;

	public ExtraCost () {}

	public ExtraCost(Long idExtraCost, String nome, String descricao, Double valor) {
		super();
		this.idExtraCost = idExtraCost;
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
	}

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
	
	
}
