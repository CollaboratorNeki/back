package com.senac.collaborator.repositores;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.collaborator.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    
    List<Role> findByStatus(boolean status);
    
    Optional<Role> findById(Long id);
}
