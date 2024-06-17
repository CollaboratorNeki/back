package com.senac.collaborator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import com.senac.collaborator.dto.AlmDTO;
import com.senac.collaborator.model.ALMTool;
import com.senac.collaborator.services.ALMToolService;

@RestController
@RequestMapping("/almtools")
public class ALMToolController {

	@Autowired
	private ALMToolService almToolService;

	@GetMapping("/listar_alm")
	public List<AlmDTO> listAllAlm() {
		return almToolService.listarALMTool();
	}

	@PostMapping("/cadastrar_alm")
	public ResponseEntity<String> saveAlm(@RequestBody AlmDTO amlDto) {
		boolean aDto = almToolService.salvarAlm(amlDto);
		if (aDto) {
			return ResponseEntity.status(HttpStatus.OK).body("ALM cadastrado com sucesso.");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao cadastrar o ALM.");
		}
	}

	@DeleteMapping("/deletar_alm/{idAlm}")
	public ResponseEntity<String> deleteAlm(@PathVariable Long idAlm) {
		boolean almDelete = almToolService.deletarAlm(idAlm);
		if (almDelete) {
			return ResponseEntity.status(HttpStatus.OK).body("ALM excluído com sucesso.");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao excluir ALM.");
		}

	}
	
	@PutMapping("/alterar_alm/{idAlm}")
	public ResponseEntity<String> alterarAlm(@PathVariable Long idAlm, @RequestBody AlmDTO newAlm){
		boolean almUpdate = almToolService.atualizarAlm(idAlm, newAlm);
		if(almUpdate) {
			return ResponseEntity.status(HttpStatus.OK).body("ALM atualizado com sucesso.");
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao atualizar o ALM");
		}
		
		
	}

}
