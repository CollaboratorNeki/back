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
	
	@Column(name ="tipo")
	private String tipo;
	
	@Column(name ="acao")
	private String acao;
	
	@Column(name ="data_envio")
	private LocalDateTime dataEnvio;
	

    @ManyToOne
	@JoinColumn(name = "id_remetente")
	private User idRemetente;
	

	@ManyToOne
	@JoinColumn(name = "id_destinatario")
	private User idDestinatario;
	
	
   @ManyToOne
    @JoinColumn(name = "id_task")
	private Task idTask;


	public Message() {}


	public Message(Long idMessage, String conteudo, String tipo, String acao, LocalDateTime dataEnvio, User idRemetente,
			User idDestinatario, Task idTask) {
		super();
		this.idMessage = idMessage;
		this.conteudo = conteudo;
		this.tipo = tipo;
		this.acao = acao;
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


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getAcao() {
		return acao;
	}


	public void setAcao(String acao) {
		this.acao = acao;
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
