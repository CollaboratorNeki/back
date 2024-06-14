/*package com.senac.collaborator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.senac.collaborator.model.Role;
import com.senac.collaborator.services.RoleService;

@RestController
@RequestMapping("/api/collaborator/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PutMapping("/{id}/toggle-status")
    public ResponseEntity<Role> toggleStatus(@PathVariable Long id) {
        Role role = roleService.toggleStatus(id);
        return ResponseEntity.ok(role);
    }


    
    @GetMapping("/{id}")
    public ResponseEntity<Role> findById(@PathVariable Long id) {
        Role role = roleService.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Role com ID " + id + " não encontrado."));
        return ResponseEntity.ok(role);
    }

    @GetMapping("/active")
    public ResponseEntity<List<Role>> findActiveRoles() {
        List<Role> roles = roleService.findActiveRoles();
        return ResponseEntity.ok(roles);
    }
   
    
    @PostMapping("/")
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        Role createdRole = roleService.save(role);
        return ResponseEntity.ok(createdRole);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRole(@PathVariable Long id) {
        roleService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}*/
