/*package com.senac.collaborator.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.collaborator.model.EventReason;
import com.senac.collaborator.repositores.EventReasonRepository;

@Service

public class EventReasonService {

	@Autowired
	private EventReasonRepository eventReasonRepository;

	public List<EventReason> getAllEventReasons() {
		return eventReasonRepository.findAll();
	}

//	public EventReason getEventReasonById(Long id) {
//		return eventReasonRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("EventReason not found"));
//	}

	public EventReason createEventReason(EventReason eventReason) {
		return eventReasonRepository.save(eventReason);
	}

//	public EventReason updateEventReason(Long id, EventReason eventReasonDetails) {
//		EventReason eventReason = eventReasonRepository.findById(id)
//				.orElseThrow(() -> new ResourceNotFoundException("EventReason not found"));
//		eventReason.setNome(eventReasonDetails.getNome());
//		eventReason.setDescricao(eventReasonDetails.getDescricao());
//		return eventReasonRepository.save(eventReason);
//	}

	public void deleteEventReason(Long id) {
		eventReasonRepository.deleteById(id);
	}
}*/