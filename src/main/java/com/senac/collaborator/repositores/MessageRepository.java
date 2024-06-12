package com.senac.collaborator.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senac.collaborator.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}
