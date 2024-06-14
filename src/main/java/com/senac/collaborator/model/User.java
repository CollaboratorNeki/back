
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
@Table(name = "usuario")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private long id_user;

	@Column(name = "nome")
	private String nome;

	@Column(name = "email")
	private String email;

	@Column(name = "senha")
	private long senha;

	
	  @ManyToOne
	  @JoinColumn
	  (name ="id_event_reason")
	  private EventReason id_event_reason;
	 
	@ManyToOne
	@JoinColumn(name = "id_role")
	private Role id_role;

	
	  @OneToMany (mappedBy ="idResponsavel") 
	  private List<Task> id_responsavel;
	  
	  
	  @OneToMany (mappedBy ="id_remetente") 
	  private List<Message> message;
	  
	  
	  @OneToMany (mappedBy ="id_destinatario") 
	  private List<Message> id_destinatario;
	 

	public User() {}

	public User(long id_user, String nome, String email, long senha) {
		super();
		this.id_user = id_user;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public long getId_user() {
		return id_user;
	}

	public void setId_user(long id_user) {
		this.id_user = id_user;
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
	
	




}