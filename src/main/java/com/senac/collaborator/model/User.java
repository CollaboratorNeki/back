package com.senac.collaborator.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.GenerationType;
 

@Entity 
public class User {

	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "idRole")
	private Role role;
	
	
	
	@ManyToOne
	@JoinColumn(name ="idRole")
	private EventReason eventReason;
	

	public User() {}
	

	public User(long id, String name, String email,String role, String eventReason ) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.eventReason = eventReason;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public EventReason getEventReason() {
		return eventReason;
	}

	public void setEventReason(EventReason eventReason) {
		this.eventReason = eventReason;
	}*/
	  
	
}
