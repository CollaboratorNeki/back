package com.senac.collaborator.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.collaborator.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
