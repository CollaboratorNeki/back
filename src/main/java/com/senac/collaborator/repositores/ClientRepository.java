package com.senac.collaborator.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.senac.collaborator.model.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
