package com.senac.collaborator.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import java.util.List;

@Entity 
@Table(name = "User")
public class User {

	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUser")
	private long idUser;
	
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "email")
	private String email;
	
	@Column(name="senha")
	private long senha;
	
	@ManyToOne
	@JoinColumn(name ="idEventReason")
	private EventReason eventReason;
	
	
	@ManyToOne
    @JoinColumn(name ="idRole")
	private Role idRole;

	
	
	@OneToMany 
    (mappedBy ="idResponsavel")
	private List<Task> responsavel;
	
	
	@OneToMany
	(mappedBy ="Message")
	private List<Message> remetente;
	
	
	@OneToMany 
    (mappedBy ="Message")
	private  List<Message> destinatario;
	
	
	
	public User () {}



	public User(long idUser, String nome, String email, long senha, EventReason eventReason, Role idRole,
			List<Task> responsavel, List<Message> remetente, List<Message> destinatario) {
		super();
		this.idUser = idUser;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.eventReason = eventReason;
		this.idRole = idRole;
		this.responsavel = responsavel;
		this.remetente = remetente;
		this.destinatario = destinatario;
	}



	public long getIdUser() {
		return idUser;
	}



	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getSenha() {
		return senha;
	}



	public void setSenha(long senha) {
		this.senha = senha;
	}



	public EventReason getEventReason() {
		return eventReason;
	}



	public void setEventReason(EventReason eventReason) {
		this.eventReason = eventReason;
	}



	public Role getIdRole() {
		return idRole;
	}



	public void setIdRole(Role idRole) {
		this.idRole = idRole;
	}



	public List<Task> getResponsavel() {
		return responsavel;
	}



	public void setResponsavel(List<Task> responsavel) {
		this.responsavel = responsavel;
	}



	public List<Message> getRemetente() {
		return remetente;
	}



	public void setRemetente(List<Message> remetente) {
		this.remetente = remetente;
	}



	public List<Message> getDestinatario() {
		return destinatario;
	}



	public void setDestinatario(List<Message> destinatario) {
		this.destinatario = destinatario;
	}





}