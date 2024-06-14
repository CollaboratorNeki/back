package com.senac.collaborator.model;
import jakarta.persistence.*;
import java.time.*;


@Entity
@Table(name ="message")
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_message;
	
	@Column(name ="conteudo")
	private String conteudo;
	
	@Column(name ="data_envio")
	private LocalDateTime data_envio;
	

    @ManyToOne
	@JoinColumn(name = "id_remetente")
	private User id_remetente;
	

	@ManyToOne
	@JoinColumn(name = "id_destinatario")
	private User id_destinatario;
	
	
   @ManyToOne
    @JoinColumn(name = "id_task")
	private Task id_task;


	
	
	
	public Message () {}


	public Long getId_message() {
		return id_message;
	}


	public void setId_message(Long id_message) {
		this.id_message = id_message;
	}


	public String getConteudo() {
		return conteudo;
	}


	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}


	public LocalDateTime getData_envio() {
		return data_envio;
	}


	public void setData_envio(LocalDateTime data_envio) {
		this.data_envio = data_envio;
	}


	public Message(Long id_message, String conteudo, LocalDateTime data_envio) {
		super();
		this.id_message = id_message;
		this.conteudo = conteudo;
		this.data_envio = data_envio;
	}
	
	
	
	
	

}
