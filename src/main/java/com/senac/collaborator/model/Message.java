package com.senac.collaborator.model;
import jakarta.persistence.*;
import java.time.*;


@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMessage;
	
	@Column(nullable = false)
	private String conteudo;
	@Column(nullable = false)
	private LocalDateTime dataEnvio;
	
//	confirmar otm
	@OneToMany
	@JoinColumn(name = "idRemetente", nullable = false)
	private User remetente;
	
	
	
	@ManyToOne
	@JoinColumn(name = "idRemetente", nullable = false)
	private User destinatario;
	
	
    @ManyToOne
    @JoinColumn(name = "idTask")
	private Task task;


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


	public LocalDateTime getDataEnvio() {
		return dataEnvio;
	}


	public void setDataEnvio(LocalDateTime dataEnvio) {
		this.dataEnvio = dataEnvio;
	}


	public User getRemetente() {
		return remetente;
	}


	public void setRemetente(User remetente) {
		this.remetente = remetente;
	}


	public User getDestinatario() {
		return destinatario;
	}


	public void setDestinatario(User destinatario) {
		this.destinatario = destinatario;
	}


	public Task getTask() {
		return task;
	}


	public void setTask(Task task) {
		this.task = task;
	}
	
	
	

}
