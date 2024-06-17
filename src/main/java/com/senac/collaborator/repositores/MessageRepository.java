package com.senac.collaborator.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.collaborator.model.Message;
@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {

}