
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
@Table(name ="technology")
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_technology;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="descricao")
	private String descricao;
	
   /* conecta com project */
    
	@ManyToOne
	@JoinColumn(name="id_project")
	private Project project;

	
	
	public Technology () {}

public Technology(long id_technology, String nome, String descricao) {
	super();
	this.id_technology = id_technology;
	this.nome = nome;
	this.descricao = descricao;
}

public long getId_technology() {
	return id_technology;
}

public void setId_technology(long id_technology) {
	this.id_technology = id_technology;
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
	
	
	
	
	
	
}
