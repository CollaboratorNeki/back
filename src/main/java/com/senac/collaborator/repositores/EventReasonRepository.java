package com.senac.collaborator.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senac.collaborator.model.EventReason;

public interface EventReasonRepository extends JpaRepository<EventReason, Long> {

}
