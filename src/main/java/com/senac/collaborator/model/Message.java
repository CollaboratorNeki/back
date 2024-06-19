package com.senac.collaborator.model;

import jakarta.persistence.*;

import java.time.LocalDate;

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
	private LocalDate dataInicio;
	
	@Column(name = "data_fim")
	private LocalDate dataFim;

	
	@ManyToOne
	@JoinColumn(name = "id_task")
	private Task idTask;

	public Message() {
	}


	public Message(Long idMessage, String conteudo, String tipo, LocalDate dataInicio, LocalDate dataFim, Task idTask) {
		super();
		this.idMessage = idMessage;
		this.conteudo = conteudo;
		this.tipo = tipo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.idTask = idTask;
	}

	public Message(MessageDTO messageDto) {
		this.idMessage = messageDto.getIdMessage();
		this.conteudo = messageDto.getConteudo();
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

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public Task getIdTask() {
		return idTask;
	}

	public void setIdTask(Task idTask) {
		this.idTask = idTask;
	}

	
	


	


}
