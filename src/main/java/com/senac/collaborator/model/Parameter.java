package com.senac.collaborator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/* Esta classe serve somente para alterar parametros do banco de dados 
 * sem a necessidade de alterar as entidade diretamente no banco.
 * 
*/

@Entity
public class Parameter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParameter;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = false)
	private String valor;

	public Long getIdParameter() {
		return idParameter;
	}

	public void setIdParameter(Long idParameter) {
		this.idParameter = idParameter;
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
