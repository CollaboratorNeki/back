/*package com.senac.collaborator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.senac.collaborator.model.ALMTool;
import com.senac.collaborator.repositores.ALMToolRepository;

@Service
public class ALMToolService {

    @Autowired
    private ALMToolRepository repository;

    public List<ALMTool> findAll() {
        return repository.findAll();
    }

    public Optional<ALMTool> findById(Long id) {
        return repository.findById(id);
    }

    public ALMTool save(ALMTool almTool) {
        return repository.save(almTool);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}

*/