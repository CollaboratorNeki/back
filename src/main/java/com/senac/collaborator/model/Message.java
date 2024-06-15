package com.senac.collaborator.model;
import jakarta.persistence.*;
import java.time.*;


@Entity
@Table(name ="message")
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMessage;
	
	@Column(name ="conteudo")
	private String conteudo;
	
	@Column(name ="data_envio")
	private LocalDateTime dataEnvio;
	

    @ManyToOne
	@JoinColumn(name = "idRemetente")
	private User idRemetente;
	

	@ManyToOne
	@JoinColumn(name = "idDestinatario")
	private User idDestinatario;
	
	
   @ManyToOne
    @JoinColumn(name = "id_task")
	private Task idTask;


	public Message() {}


	public Message(Long idMessage, String conteudo, LocalDateTime dataEnvio, User idRemetente, User idDestinatario,
			Task idTask) {
		super();
		this.idMessage = idMessage;
		this.conteudo = conteudo;
		this.dataEnvio = dataEnvio;
		this.idRemetente = idRemetente;
		this.idDestinatario = idDestinatario;
		this.idTask = idTask;
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


	public LocalDateTime getDataEnvio() {
		return dataEnvio;
	}


	public void setDataEnvio(LocalDateTime dataEnvio) {
		this.dataEnvio = dataEnvio;
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
