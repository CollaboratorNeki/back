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
    @GetMapping("/listar_role")
    public List<RoleDTO> listAllRolesDtos() {
        return roleService.listarRole();
    }
    
   
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
    @PutMapping("/atualizar/{idRole}")
    public ResponseEntity<String> updateRole(@PathVariable Long idRole, @RequestBody RoleDTO newRole) {
        boolean roleAtualizado = roleService.atualizarRole(idRole, newRole);
        if (roleAtualizado) {
            return ResponseEntity.status(HttpStatus.OK).body("Role atualizado com sucesso!");
        }
            else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao atualizar o role!");
        }
    }

    
    // Deletar por ID
    @DeleteMapping("/deletar/{idRole}")
    public ResponseEntity<String> deleteRole(@PathVariable Long idRole) {
      boolean roleDelete = roleService.deletarRole(idRole);
      if(roleDelete) {
    	  return ResponseEntity.status(HttpStatus.OK).body("Função excluida com sucesso.");
      }else {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao excluir Role");
	}
    }

   
}
