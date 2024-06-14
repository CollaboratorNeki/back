package com.senac.collaborator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senac.collaborator.model.Role;
import com.senac.collaborator.repositores.RoleRepository;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

	
	@Autowired
	private RoleRepository roleRepository;
	
	public List<Role> findAll() {
		return  roleRepository.findAll();
		
	}
	
	public Optional<Role> findById(long id){
		return roleRepository.findById(id);
	}
	
	public Role save(Role role) {
		return roleRepository.save(role);
	}
	
	public void deleteById(long id) {
		roleRepository.deleteById(id);
	}
	
	/*public List<Role> findActiveRoles() {
		return roleRepository.findByStatus(id);
	}
		*/

	 
		
	}
	

	

