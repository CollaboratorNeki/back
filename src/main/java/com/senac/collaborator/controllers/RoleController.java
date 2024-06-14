package com.senac.collaborator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    // Buscar por ID
    @GetMapping("/buscar/{id_role}")
    public ResponseEntity<Role> getRoleById(@PathVariable Long id_role) {
        Role role = roleService.findById(id_role)
                .orElseThrow(() -> new IllegalArgumentException("Role com ID " + id_role + " não encontrado."));
        return ResponseEntity.ok(role);
    }

    // Salvar novo
    @PostMapping("/salvar")
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        Role newRole = roleService.save(role);
        return ResponseEntity.ok(newRole);
    }

    // Atualizar existente
    @PutMapping("/atualizar/{id_role}")
    public ResponseEntity<String> updateRole(@PathVariable Long id_role, @RequestBody Role role) {
        boolean roleAtualizado = roleService.updateRole(id_role, role);
        if (roleAtualizado) {
            return ResponseEntity.status(HttpStatus.OK).body("Role atualizado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao atualizar o role!");
        }
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

    // Alternar status
    @PutMapping("/toggle-status/{id_role}")
    public ResponseEntity<Role> toggleStatus(@PathVariable Long id_role) {
        Role role = roleService.toggleStatus(id_role);
        return ResponseEntity.ok(role);
    }

    // Listar roles ativos
    @GetMapping("/active")
    public ResponseEntity<List<Role>> findActiveRoles() {
        List<Role> roles = roleService.findActiveRoles();
        return ResponseEntity.ok(roles);
    }
}
