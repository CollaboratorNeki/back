package com.senac.collaborator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.collaborator.model.EventReason;
import com.senac.collaborator.services.EventReasonService;

@RestController
@RequestMapping("/api/event-reasons")
public class EventReasonController {
	@Autowired
	private EventReasonService eventReasonService;

	@GetMapping
	public List<EventReason> getAllEventReasons() {
		return eventReasonService.getAllEventReasons();
	}

//	@GetMapping("/{id}")
//	public EventReason getEventReasonById(@PathVariable Long id) {
//		return eventReasonService.getEventReasonById(id);
//	}

	@PostMapping
	public EventReason createEventReason(@RequestBody EventReason eventReason) {
		return eventReasonService.createEventReason(eventReason);
	}

//	@PutMapping("/{id}")
//	public EventReason updateEventReason(@PathVariable Long id, @RequestBody EventReason eventReason) {
//		return eventReasonService.updateEventReason(id, eventReason);
//	}

	@DeleteMapping("/{id}")
	public void deleteEventReason(@PathVariable Long id) {
		eventReasonService.deleteEventReason(id);
	}
}
