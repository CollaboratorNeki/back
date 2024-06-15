package com.senac.collaborator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.collaborator.dto.EventReasonDTO;
import com.senac.collaborator.model.EventReason;
import com.senac.collaborator.services.EventReasonService;

@RestController
@RequestMapping("/event_reason")
public class EventReasonController {
    
    @Autowired
    private EventReasonService eventReasonService;

    // Listagem geral
    @GetMapping("/listar")
    public List<EventReason> listarEventReasons() {
        return eventReasonService.listarEventReasons();
    }
    
    @GetMapping("/listarReasonEvent")
    public List<EventReasonDTO> listarEventReasonsDTO() {
        return eventReasonService.listarEventReasonsDTO();
    }
    
    
    
    
    
    

    // Buscar por ID
    @GetMapping("/buscar/{idEventReason}")
    public ResponseEntity<EventReason> getEventReasonById(@PathVariable Long id_event_reason) {
        EventReason eventReason = eventReasonService.getEventReasonById(id_event_reason);
        if (eventReason != null) {
            return new ResponseEntity<>(eventReason, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Salvar novo
    @PostMapping("/salvar")
    public ResponseEntity<EventReason> createEventReason(@RequestBody EventReason eventReason) {
        EventReason newEventReason = eventReasonService.createEventReason(eventReason);
        if (newEventReason != null) {
            return new ResponseEntity<>(newEventReason, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    // Atualizar existente
    @PutMapping("/atualizar/{idEventReason}")
    public ResponseEntity<String> updateEventReason(@PathVariable Long id_event_reason, @RequestBody EventReason eventReason) {
        boolean eventReasonAtualizado = eventReasonService.updateEventReason(id_event_reason, eventReason);
        if (eventReasonAtualizado) {
            return ResponseEntity.status(HttpStatus.OK).body("Evento atualizado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao atualizar o evento!");
        }
    }

    // Deletar por ID
    @DeleteMapping("/deletar/{idEventReason}")
    public ResponseEntity<String> deleteEventReason(@PathVariable Long id_event_reason) {
        Boolean eventReasonDeletado = eventReasonService.deleteEventReason(id_event_reason);
        if (eventReasonDeletado) {
            return ResponseEntity.status(HttpStatus.OK).body("Evento deletado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha ao deletar o Evento!");
        }
    }
}