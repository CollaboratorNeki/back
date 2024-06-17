package com.senac.collaborator.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senac.collaborator.model.ALMTool;

@Repository
public interface ALMToolRepository extends JpaRepository<ALMTool, Long> {
}
