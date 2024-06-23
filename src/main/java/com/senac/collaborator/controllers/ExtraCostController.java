package com.senac.collaborator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.collaborator.dto.ExtraCostDTO;
import com.senac.collaborator.dto.MessageDTO;
import com.senac.collaborator.services.ExtraCostService;
import com.senac.collaborator.services.MessageService;

@RestController
@RequestMapping("/extra_cost")
public class ExtraCostController {
	@Autowired
	ExtraCostService extraCostService;

	@GetMapping("/list_extra_cost")
	public List<ExtraCostDTO> listandoExtraCosts() {
		return extraCostService.listarExtraCost();
	}

	@PostMapping("/cadastro_extra_cost")
	public ResponseEntity<String> cadastroExtraCost(@RequestBody ExtraCostDTO extraCostDto) {
		boolean eDto = extraCostService.salvarExtraCost(extraCostDto);
		if (eDto) {
			return ResponseEntity.status(HttpStatus.OK).body("Cadastro de custo realizado com sucesso.");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cadastro de custo extra falhou");
		}
	}

	@PatchMapping("/atualizar/{idExtraCost}")
	public ResponseEntity<String> updateExtraCost(@PathVariable Long idExtraCost, @RequestBody ExtraCostDTO newExtraCost) {
		boolean extraCostAtualizado = extraCostService.atualizarExtra(idExtraCost, newExtraCost);
		if (extraCostAtualizado) {
			return ResponseEntity.status(HttpStatus.OK).body("Custo extra atualizada com sucesso");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao atualizar Custo extra");
		}
	}

	@DeleteMapping("/deletar/{idExtraCost}")
	public ResponseEntity<String> deleteExtraCost(@PathVariable Long idExtraCost) {
		boolean ExtraCostDelete = extraCostService.deletarExtra(idExtraCost);
		if (ExtraCostDelete) {
			return ResponseEntity.status(HttpStatus.OK).body("Custo extra excluida com sucesso");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao excluir Custo extra");
		}
	}
	
	
}
