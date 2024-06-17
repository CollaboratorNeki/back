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
          

    public boolean deletarRole(Long idRole) {
		if (roleRepository.existsById(idRole)) {
			roleRepository.deleteById(idRole);
			return true;
		}
		return false;

	}

   /* public List<RoleDTO> findActiveRoles() {
        return roleRepository.findByStatus(true);
    }*/
    
  
    
    public Role toggleStatus(Long id_role) {
        Role role = roleRepository.findById(id_role)
                .orElseThrow(() -> new IllegalArgumentException("Role com ID " + id_role + " não encontrado."));
        role.setStatus(!role.isStatus());
        return roleRepository.save(role);
    }

    
    
  public boolean updateRole(Long idRole, RoleDTO  newRole) {
	  Optional<Role> optionalRole = roleRepository.findById(idRole);
	  if(optionalRole.isPresent()) {
		  
		  Role antigoRole = optionalRole.get();		  
		  antigoRole.setIdRole(idRole);
		  
		  if (newRole.getNome() != null) {
		      antigoRole.setNome(newRole.getNome());
		  }
		      
		   if (newRole.getDescricao() != null) {
			   antigoRole.setDescricao(newRole.getDescricao());
		   }
		  
		   if (newRole.isStatus()) {
			   antigoRole.setStatus(newRole.isStatus());
		   }
		 
		   roleRepository.save(antigoRole);
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
