
package com.senac.collaborator.model;

import com.senac.collaborator.dto.TechnologyDTO;

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
	private Long idTechnology;

	@Column(name = "nome")
	private String nome;

	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "versao")
	private String versao;

	
	
	
	/* conecta com project */

	@ManyToOne
	@JoinColumn(name = "id_project")
	private Project project;

	public Technology() {
	}

	
	public Technology(TechnologyDTO technologyDTO) {
		this.idTechnology = technologyDTO.getIdTechnology();
		this.nome = technologyDTO.getNome();
		this.tipo = technologyDTO.getTipo();
		this.versao = technologyDTO.getVersao();
	
		
		
	}
	public Technology(Long idTechnology, String nome, String tipo, String versao, Project project) {
		super();
		this.idTechnology = idTechnology;
		this.nome = nome;
		this.tipo = tipo;
		this.versao = versao;
		this.project = project;
	}
	

	public long getIdTechnology() {
		return idTechnology;
	}

	public void setIdTechnology(Long idTechnology) {
		this.idTechnology = idTechnology;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	
}
