package com.senac.collaborator.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senac.collaborator.model.Role;
import java.util.List;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    
	
	
}
