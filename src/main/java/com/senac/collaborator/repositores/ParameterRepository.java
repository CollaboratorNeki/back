package com.senac.collaborator.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senac.collaborator.model.Parameter;

public interface ParameterRepository extends JpaRepository<Parameter, Long>{

}
