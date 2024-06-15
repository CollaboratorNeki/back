package com.senac.collaborator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name ="parameter")
public class Parameter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_parameter;

	@Column(name ="nome")
	private String nome;

	@Column(name="valor")
	private String valor;

	public Parameter () {}

public Parameter(Long id_parameter, String nome, String valor) {
	super();
	this.id_parameter = id_parameter;
	this.nome = nome;
	this.valor = valor;
}

public Long getId_parameter() {
	return id_parameter;
}

public void setId_parameter(Long id_parameter) {
	this.id_parameter = id_parameter;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getValor() {
	return valor;
}

public void setValor(String valor) {
	this.valor = valor;
}
	
	

}
