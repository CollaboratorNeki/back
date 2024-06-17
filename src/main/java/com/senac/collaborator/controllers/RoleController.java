package com.senac.collaborator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.senac.collaborator.dto.RoleDTO;

import com.senac.collaborator.services.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    // Listagem geral
    @GetMapping("/listar")
    public List<RoleDTO> listAllRolesDtos() {
        return roleService.listarRole();
    }
    
    /* // Listar roles ativos
   @GetMapping("/active")
   public List<RoleDTO> findActiveRoles() {
         return roleService.findActiveRoles();
}
  */
    // Salvar novo
    @PostMapping("/cadastro_role")
    public ResponseEntity<String> cadastroRole(@RequestBody RoleDTO roleDto) {
       boolean rDto = roleService.saveRoles(roleDto);
       if(rDto) {
        return ResponseEntity.status(HttpStatus.OK).body("Cadastro de Funcoes realizado com sucesso");
    }else{
    	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cadastro de Funcoes falhou");
    	
    }
    }    
    // Atualizar existente
    @PutMapping("/atualizar/{id_role}")
    public ResponseEntity<String> updateRole(@PathVariable Long idRole, @RequestBody RoleDTO newRole) {
        boolean roleAtualizado = roleService.updateRole(idRole, newRole);
        if (roleAtualizado) {
            return ResponseEntity.status(HttpStatus.OK).body("Role atualizado com sucesso!");
        }
            else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao atualizar o role!");
        }
    }

    
    
    
    

    // Alternar status
   /* @PutMapping("/toggle-status/{id_role}")
    public ResponseEntity<Role> toggleStatus(@PathVariable Long idRole) {
        Role role = roleService.toggleStatus(idRole);
        return ResponseEntity.ok(role);
    }*/


    // Deletar por ID
    @DeleteMapping("/deletar/{id_role}")
    public ResponseEntity<String> deleteRole(@PathVariable Long idRole) {
      boolean roleDelete = roleService.deletarRole(idRole);
      if(roleDelete) {
    	  return ResponseEntity.status(HttpStatus.OK).body("Função excluida com sucesso.");
      }else {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao excluir Role");
	}
    }

   
}
