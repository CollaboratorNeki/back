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

import com.senac.collaborator.dto.MessageDTO;
import com.senac.collaborator.services.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {
	@Autowired
	MessageService messageService;

	@GetMapping("/list_message")
	public List<MessageDTO> listandoMensagens() {
		return messageService.listMessages();
	}

	@PostMapping("/cadastro_message")
	public ResponseEntity<String> cadastroMensagem(@RequestBody MessageDTO messageDto) {
		boolean mDto = messageService.saveMessages(messageDto);
		if (mDto) {
			return ResponseEntity.status(HttpStatus.OK).body("Cadastro de mensagem realizado com sucesso.");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cadastro de mensagem falhou");
		}
	}

	@PatchMapping("/atualizar/{idMessage}")
	public ResponseEntity<String> updateMessage(@PathVariable Long idMessage, @RequestBody MessageDTO newMessage) {
		boolean messageAtualizado = messageService.atualizarMessage(idMessage, newMessage);
		if (messageAtualizado) {
			return ResponseEntity.status(HttpStatus.OK).body("Message atualizada com sucesso");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao atualizar message");
		}
	}

	@DeleteMapping("/deletar/{idMessage}")
	public ResponseEntity<String> deleteMessage(@PathVariable Long idMessage) {
		boolean messageDelete = messageService.deletarMessage(idMessage);
		if (messageDelete) {
			return ResponseEntity.status(HttpStatus.OK).body("Message excluida com sucesso");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao excluir Message");
		}
	}
}
