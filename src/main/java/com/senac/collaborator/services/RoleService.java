package com.senac.collaborator.services;

import com.senac.collaborator.model.Role;
import com.senac.collaborator.repositores.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> listarRoles() {
        return roleRepository.findAll();
    }
    
    
    
    
    
    
    
    
    
    public Optional<Role> findById(Long id_role) {
        return roleRepository.findById(id_role);
    }

    public Role save(Role role) {
        return roleRepository.save(role);
    }

    public void deleteById(Long idRole) {
        roleRepository.deleteById(idRole);
    }

    public List<Role> findActiveRoles() {
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
}
