package com.senac.collaborator.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.collaborator.dto.RoleDTO;
import com.senac.collaborator.model.Role;
import com.senac.collaborator.repositores.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;

	public List<RoleDTO> listarRole() {
		List<Role> listRole = roleRepository.findAll();
		List<RoleDTO> listRoleDTO = new ArrayList<>();
		for (Role itemRole : listRole) {
			RoleDTO roleDTO = new RoleDTO();
			roleDTO.setIdRole(itemRole.getIdRole());
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

	public boolean atualizarRole(Long idRole, RoleDTO newRole) {
		Optional<Role> optionalRole = roleRepository.findById(idRole);
		if (optionalRole.isPresent()) {
			Role antigoRole = optionalRole.get();
			if (newRole.getNome() != null) {
				antigoRole.setNome(newRole.getNome());
			}
			if (newRole.getDescricao() != null) {
				antigoRole.setDescricao(newRole.getDescricao());
			}
			antigoRole.setStatus(newRole.isStatus());
			roleRepository.save(antigoRole);
			return true;
		}
		return false;
	}

	public boolean saveRoles(RoleDTO roleDto) {
		Role role = new Role(roleDto);
		Role rTest = roleRepository.save(role);
		return rTest != null;
	}
}
