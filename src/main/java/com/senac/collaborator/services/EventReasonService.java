package com.senac.collaborator.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.collaborator.dto.EventReasonDTO;
import com.senac.collaborator.model.EventReason;
import com.senac.collaborator.repositores.EventReasonRepository;

@Service
public class EventReasonService {

	@Autowired
	private EventReasonRepository eventReasonRepository;

	public List<EventReason> listarEventReasons() {
		return eventReasonRepository.findAll();
	}

	public EventReason getEventReasonById(Long idEventReason) {
		Optional<EventReason> optional = eventReasonRepository.findById(idEventReason);
		return optional.orElse(null);
	}

	public EventReason createEventReason(EventReason eventReason) {
		return eventReasonRepository.save(eventReason);
	}

	public boolean updateEventReason(Long idEventReason, EventReasonDTO eventReasonDetails) {
		Optional<EventReason> eventReasonOptional = eventReasonRepository.findById(idEventReason);
		if (eventReasonOptional.isPresent()) {
			EventReason antigoEventReason = eventReasonOptional.get();
			if (eventReasonDetails.getNome() != null) {
				antigoEventReason.setNome(eventReasonDetails.getNome());
			}
			if (eventReasonDetails.getDescricao() != null) {
				antigoEventReason.setDescricao(eventReasonDetails.getDescricao());
			}
			eventReasonRepository.save(antigoEventReason);
			return true;
		}
		return false;
	}

	public boolean deleteEventReason(Long idEventReason) {
		if (eventReasonRepository.existsById(idEventReason)) {
			eventReasonRepository.deleteById(idEventReason);
			return true;
		}
		return false;
	}
}
