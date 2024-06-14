/*package com.senac.collaborator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.senac.collaborator.model.ALMTool;
import com.senac.collaborator.services.ALMToolService;

@RestController
@RequestMapping("/api/almtools")
public class ALMToolController {

    @Autowired
    private ALMToolService service;

    @GetMapping
    public ResponseEntity<List<ALMTool>> getAll() {
        List<ALMTool> almTools = service.findAll();
        return new ResponseEntity<>(almTools, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ALMTool> getById(@PathVariable Long id) {
        Optional<ALMTool> almTool = service.findById(id);
        return almTool.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                      .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<ALMTool> create(@RequestBody ALMTool almTool) {
        ALMTool savedALMTool = service.save(almTool);
        return new ResponseEntity<>(savedALMTool, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ALMTool> update(@PathVariable Long id, @RequestBody ALMTool almTool) {
        Optional<ALMTool> existingALMTool = service.findById(id);
        if (existingALMTool.isPresent()) {
            almTool.setIdALMTool(id);
            ALMTool updatedALMTool = service.save(almTool);
            return new ResponseEntity<>(updatedALMTool, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        Optional<ALMTool> almTool = service.findById(id);
        if (almTool.isPresent()) {
            service.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}*/

