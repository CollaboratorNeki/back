package com.senac.collaborator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.senac.collaborator.dto.MessageDTO;
import com.senac.collaborator.dto.RoleDTO;
import com.senac.collaborator.model.Role;
import com.senac.collaborator.services.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    // Listagem geral
    @GetMapping("/listar")
    public List<Role> listarRoles() {
        return roleService.listarRoles();
    }
    
    // Listar roles ativos
   @GetMapping("/active")
   public List<RoleDTO> findActivRoles() {
         return roleService.findActiveRoles();
}
   
    
    // listando atributos nome, descricao e status
    @GetMapping("/listar_atributos")
    public List<RoleDTO> listarRole() {
        return roleService.listarRole();
    }
    
    // Buscar por ID
   /* @GetMapping("/buscar/{id_role}")
    public ResponseEntity<Role> getRoleById(@PathVariable Long id_role) {
        Role role = roleService.findById(id_role)
                .orElseThrow(() -> new IllegalArgumentException("Role com ID " + id_role + " não encontrado."));
        return ResponseEntity.ok(role);
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
    public ResponseEntity<String> updateRole(@PathVariable Long idRole, @RequestBody Role role) {
        boolean roleAtualizado = roleService.updateRole(idRole, role);
        if (roleAtualizado) {
            return ResponseEntity.status(HttpStatus.OK).body("Role atualizado com sucesso!");
        }
            else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao atualizar o role!");
        }
    }

    // Alternar status
    @PutMapping("/toggle-status/{id_role}")
    public ResponseEntity<Role> toggleStatus(@PathVariable Long idRole) {
        Role role = roleService.toggleStatus(idRole);
        return ResponseEntity.ok(role);
    }


    // Deletar por ID
    @DeleteMapping("/deletar/{id_role}")
    public ResponseEntity<String> deleteRole(@PathVariable Long id_role) {
        try {
            roleService.deleteById(id_role);
            return ResponseEntity.status(HttpStatus.OK).body("Role deletado com sucesso!");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao deletar o role!");
        }
    }

   
   
}
