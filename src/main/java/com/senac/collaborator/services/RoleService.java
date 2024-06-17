package com.senac.collaborator.services;


import com.senac.collaborator.dto.RoleDTO;
import com.senac.collaborator.model.Role;
import com.senac.collaborator.repositores.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> listarRoles() {
        return roleRepository.findAll();
    }
    
    public List<Role> findById(long idRole) {
		return roleRepository.findById);
	}
    
    public List<RoleDTO> listarRole(){
    	List<Role> listRole = roleRepository.findAll();
    	List<RoleDTO> listRoleDTO = new ArrayList<>();
    	for(Role itemRole : listRole) {
    		RoleDTO roleDTO = new RoleDTO();
    		roleDTO.setDescricao(itemRole.getDescricao());
    		roleDTO.setNome(itemRole.getNome());
    		roleDTO.setStatus(itemRole.isStatus());
    		listRoleDTO.add(roleDTO);	
    	}
    	return listRoleDTO;
    	
    }

    public void deleteById(Long idRole) {
        roleRepository.deleteById(idRole);
    }

    public List<RoleDTO> findActiveRoles() {
        return roleRepository.findByStatus(true);
    }
    
  
    
    public Role toggleStatus(Long id_role) {
        Role role = roleRepository.findById(id_role)
                .orElseThrow(() -> new IllegalArgumentException("Role com ID " + id_role + " não encontrado."));
        role.setStatus(!role.isStatus());
        return roleRepository.save(role);
    }

    public Boolean updateRole(Long id_role, Role roleDetails) {
        Optional<Role> roleOptional = roleRepository.findById(id_role);
        if (roleOptional.isPresent()) {
            Role existingRole = roleOptional.get();
            existingRole.setIdRole(id_role); // 
            if (roleDetails.getNome() != null) {
                existingRole.setNome(roleDetails.getNome());
            }
            if (roleDetails.getDescricao() != null) {
                existingRole.setDescricao(roleDetails.getDescricao());
            }
            roleRepository.save(existingRole);
            return true;
        }
        return false;
    }


	public boolean saveRoles(RoleDTO roleDto) {
		Role role = new Role(roleDto);
		Role rTest = roleRepository.save(role);
		
		if (rTest != null) {
			
		}
		
		return true;
	}
	
	
}
