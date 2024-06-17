package com.senac.collaborator.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.collaborator.model.EventReason;

@Repository
public interface EventReasonRepository extends JpaRepository<EventReason, Long> {
}
