package com.senac.collaborator.model;

import jakarta.persistence.*;


import com.senac.collaborator.dto.MessageDTO;

@Entity
@Table(name = "message")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMessage;

	@Column(name = "conteudo")
	private String conteudo;

	@Column(name = "tipo")
	private String tipo;


	@Column(name = "data_inicio")
	private Long dataInicio;
	
	@Column(name = "data_fim")
	private Long dataFim;

	@ManyToOne
	@JoinColumn(name = "id_remetente")
	private User idRemetente;

	@ManyToOne
	@JoinColumn(name = "id_destinatario")
	private User idDestinatario;

	@ManyToOne
	@JoinColumn(name = "id_task")
	private Task idTask;

	public Message() {
	}

	public Message(Long idMessage, String conteudo, String tipo, String acao, Long dataInicio, Long dataFim,
			User idRemetente, User idDestinatario, Task idTask) {
		super();
		this.idMessage = idMessage;
		this.conteudo = conteudo;
		this.tipo = tipo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.idRemetente = idRemetente;
		this.idDestinatario = idDestinatario;
		this.idTask = idTask;
	}

	public Message(MessageDTO messageDto) {
		super();
		this.conteudo = messageDto.getConteudo();
		this.tipo = messageDto.getTipo();
		this.tipo = messageDto.getTipo();
		this.dataInicio = messageDto.getDataInicio();
		this.dataFim = messageDto.getDataFim();
	
		}

	public Long getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(Long idMessage) {
		this.idMessage = idMessage;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Long dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Long getDataFim() {
		return dataFim;
	}

	public void setDataFim(Long dataFim) {
		this.dataFim = dataFim;
	}

	public User getIdRemetente() {
		return idRemetente;
	}

	public void setIdRemetente(User idRemetente) {
		this.idRemetente = idRemetente;
	}

	public User getIdDestinatario() {
		return idDestinatario;
	}

	public void setIdDestinatario(User idDestinatario) {
		this.idDestinatario = idDestinatario;
	}

	public Task getIdTask() {
		return idTask;
	}

	public void setIdTask(Task idTask) {
		this.idTask = idTask;
	}

	


	


}
