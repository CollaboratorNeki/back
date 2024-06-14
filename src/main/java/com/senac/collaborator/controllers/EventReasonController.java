package com.senac.collaborator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.collaborator.model.EventReason;
import com.senac.collaborator.services.EventReasonService;

@RestController
@RequestMapping("/event-reasons")
public class EventReasonController {
	
	
	@Autowired
	 EventReasonService eventReasonService;

	
//	***********************listagem geral
	
	@GetMapping("/listar")
	public List<EventReason> listarEventReasons() {
		return eventReasonService.listarEventReasons();
	}

	@GetMapping("/buscar/{idEventReason}")
	public ResponseEntity<EventReason>getEventReasonById(@PathVariable Long idEventReason) {
		return new ResponseEntity<>(eventReason, HttpStatus.OK);
	}

	@PostMapping("/salvar")
	public ResponseEntity<EventReason>creaResponseEntity(@RequestBody EventReason eventReason) {
		EventReason newEventReason = eventReasonService.createEventReason(eventReason);
		if (newEventReason != null) {
			return new ResponseEntity<>(newEventReason, HttpStatus.CREATED);
			
		}else {
			return new ResponseEntity<>(newEventReason, HttpStatus.BAD_REQUEST);
		}
		
		
		
	}

	@PutMapping("/atualizar/{idEventReason}")
	public ResponseEntity<String>updateEventReason(@PathVariable Long idEventReason, @RequestBody EventReason eventReason) {
		boolean EventReasonAtualizado = eventReasonService.updateEventReason(idEventReason, eventReason);  
		if (EventReasonAtualizado) {
			return ResponseEntity.status(HttpStatus.OK).body("Evento atualizado com sucesso!");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao atualizar o evento!");
		}
	}

	@DeleteMapping("/deletar/{idEventReason}")
	public ResponseEntity<String> deleteEventReason(@PathVariable Long idEventReason) {
		boolean eventReasonDeletado = eventReasonService.deleteEventReason(idEventReason);
		if (eventReasonDeletado) {
			return ResponseEntity.status(HttpStatus.OK).body("Evento deletado com sucesso!");
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao deletar o Evento!");
		}
	}}
