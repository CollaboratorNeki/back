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

import com.senac.collaborator.dto.AlmDTO;
import com.senac.collaborator.dto.ClientDTO;
import com.senac.collaborator.services.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping("/listar_client")
	public List<ClientDTO> listAllClient() {
		return clientService.listarClient();
	}
	
	@PostMapping("/cadastrar_client")
	public ResponseEntity<String> saveClient(@RequestBody ClientDTO clientDTO) {
		boolean cDto = clientService.salvarClient(clientDTO);
		if (cDto) {
			return ResponseEntity.status(HttpStatus.OK).body("Cliente cadastrado com sucesso.");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao cadastrar o Cliente.");
		}
	}
	
	
	@DeleteMapping("/deletar_client/{idClient}")
	public ResponseEntity<String> deleteClient(@PathVariable Long idClient) {
		boolean clientDelete = clientService.deletarClient(idClient);
		if (clientDelete) {
			return ResponseEntity.status(HttpStatus.OK).body("Cliente excluído com sucesso.");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao excluir Cliente.");
		}

	}
	
	
	@PatchMapping("/alterar_client/{idClient}")
	public ResponseEntity<String> alterarClient(@PathVariable Long idClient, @RequestBody ClientDTO newClient){
		boolean ClientUpdate = clientService.atualizarClient(idClient, newClient);
		if(ClientUpdate) {
			return ResponseEntity.status(HttpStatus.OK).body("Cliente atualizado com sucesso.");
		}else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao atualizar o Client");
		}
		
	}
}

	