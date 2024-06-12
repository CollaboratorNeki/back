package com.senac.collaborator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ALMTool {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idALMTool;

	@Column(nullable = false)
	private String nome;

	@Column(nullable = true)
	private String url;

	@Column(nullable = false)
	private String login;

	@Column(nullable = false)
	private String senha;

	@Column(nullable = false)
	private String tipo;

	@Column(nullable = false)
	private String vpn; // ativo - inativo
	@Column(nullable = false)

	private String status; // ativo - inativo
	@Column(nullable = true)

	private String task_status; // status de tarefas disponiveis
	@Column(nullable = true)

	private String closure_status; // status fechamento de tarefas

}
