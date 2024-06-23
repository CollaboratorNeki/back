 package com.senac.collaborator.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senac.collaborator.model.ExtraCost;

@Repository
public interface ExtraCostRepository extends JpaRepository<ExtraCost, Long> {

}
