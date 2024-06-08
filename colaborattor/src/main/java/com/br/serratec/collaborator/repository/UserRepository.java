
//VERIFICAR E CORRIGIR SE NECESSARIO

package com.br.serratec.collaborator.repository;

// import org.apache.el.stream.Optional;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.br.serratec.collaborator.model.User;

public interface UserRepository extends JpaRepository <User, Long> {
    Optional<User> findByUsername(String username);
    
}
