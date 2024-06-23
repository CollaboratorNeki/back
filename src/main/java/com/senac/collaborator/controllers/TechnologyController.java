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


import com.senac.collaborator.dto.TechnologyDTO;
import com.senac.collaborator.services.TechnologyService;

@RestController
@RequestMapping("/technology")
public class TechnologyController {

	
	@Autowired
	private TechnologyService technologyService;
	
	@GetMapping("/listar_technology")
	public List<TechnologyDTO> listAllTechnology() {
		return technologyService.listarTechnology();
	}
	
	@PostMapping("/cadastrar_technology")
	public ResponseEntity<String> saveTechnology(@RequestBody TechnologyDTO TechnologyDTO) {
		boolean tDto = technologyService.salvarTechnology(TechnologyDTO);
		if (tDto) {
			return ResponseEntity.status(HttpStatus.OK).body("Cliente cadastrado com sucesso.");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao cadastrar o Cliente.");
		}
	}
	
	
	
	@DeleteMapping("/deletar_technology/{idTechnology}")
	public ResponseEntity<String> deleteTechnology(@PathVariable Long idTechnology) {
		boolean technologyDelete = technologyService.deletarTechnology(idTechnology);
		if (technologyDelete) {
			return ResponseEntity.status(HttpStatus.OK).body("Cliente excluído com sucesso.");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao excluir Cliente.");
		}

	}
	

	@PatchMapping("/alterar_Technology/{idTechnology}")
	public ResponseEntity<String> alterarTechnology(@PathVariable Long idTechnology, @RequestBody TechnologyDTO newTechnology){
		boolean TechnologyUpdate = technologyService.atualizarTechnology(idTechnology, newTechnology);
		if(TechnologyUpdate) {
			return ResponseEntity.status(HttpStatus.OK).body("Tecnologia atualizado com sucesso.");
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao atualizar o tecnologia");
		}
		
	}
	
	

}
