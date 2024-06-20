
package com.senac.collaborator.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private long idUser;

	@Column(name = "nome")
	private String nome;

	@Column(name = "email")
	private String email;

	@Column(name = "senha")
	private long senha;

	/*@ManyToOne
	@JoinColumn(name = "id_event_reason")
	private EventReason idEventReason;*/

//	@ManyToOne
//	@JoinColumn(name = "id_role")
	@ManyToMany
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "usuario", referencedColumnName = "id_user"), inverseJoinColumns = @JoinColumn(name = "role", referencedColumnName = "id_role"))
	private List<Role> idRoles;

	@OneToMany(mappedBy = "idResponsavel")
	private List<Task> id_responsavel;



	public User() {
	}

	public User(long idUser, String nome, String email, long senha) {
		super();
		this.idUser = idUser;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
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

}