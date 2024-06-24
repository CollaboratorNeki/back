package com.senac.collaborator.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.collaborator.dto.AlmDTO;
import com.senac.collaborator.model.ALMTool;
import com.senac.collaborator.services.ALMToolService;

@RestController
@RequestMapping("/almtools")
public class ALMToolController {

	@Autowired
	private ALMToolService service;

	@PostMapping("/cadastrar_alm")
	public ResponseEntity<ALMTool> createAlm(@RequestBody AlmDTO almDTO) {
		ALMTool savedAlm = service.saveAlm(almDTO);
		return ResponseEntity.ok(savedAlm);
	}

	@GetMapping("/listar_alm")
	public ResponseEntity<List<AlmDTO>> getAllAlms() {
		List<AlmDTO> alms = service.getAllAlms();
		return ResponseEntity.ok(alms);
	}

	@PatchMapping("/alterar_alm/{id}")
	public ResponseEntity<ALMTool> updateAlm(@PathVariable Long id, @RequestBody AlmDTO almDTO) {
		Optional<ALMTool> updatedAlm = service.updateAlm(id, almDTO);
		return updatedAlm.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@DeleteMapping("/deletar_alm/{id}")
	public ResponseEntity<Void> deleteAlm(@PathVariable Long id) {
		service.deleteAlm(id);
		return ResponseEntity.noContent().build();
	}
}
