package com.senac.collaborator.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.collaborator.model.EventReason;
import com.senac.collaborator.repositores.EventReasonRepository;

@Service

public class EventReasonService {

	@Autowired
	EventReasonRepository eventReasonRepository;

	public List<EventReason> listarEventReasons() {

		return eventReasonRepository.findAll();
	}

//	public EventReason getEventReasonById(Long idEventReason) {
//		return eventReasonRepository.findById(idEventReason)
//				.orElseThrow(() -> new ResourceNotFoundException("Evento não encontrado"));
//	}

	public EventReason createEventReason(EventReason eventReason) {
		return eventReasonRepository.save(eventReason);
	}

	public boolean updateEventReason(Long idEventReason, EventReason eventReasonDetails) {
		Optional<EventReason> eventReasonOptional = eventReasonRepository.findById(idEventReason);
		if (eventReasonOptional.isPresent()) {
			EventReason antigoEventReason = eventReasonOptional.get();
			antigoEventReason.setId_event_reason(idEventReason);
			if (eventReasonDetails.getNome() != null)
				;
			{
				antigoEventReason.setNome(eventReasonDetails.getNome());
			}
			if (eventReasonDetails.getDescricao() != null)
				;
			{
				antigoEventReason.setDescricao(eventReasonDetails.getDescricao());
			}
			eventReasonRepository.save(antigoEventReason);
			return true;
		}
		return false;

	}

	public Boolean deleteEventReason(Long idEventReason) {
		Optional<EventReason> eventReasonOptional = eventReasonRepository.findById(idEventReason);
		if (eventReasonOptional.isPresent()) {
			EventReason eventReason = eventReasonOptional.get();
			eventReason.setStatus(false);
			eventReasonRepository.save(eventReason);
			return true;
		}
		return false;
	}

	public EventReason getEventReasonById(Long idEventReason) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Metodo não implementado 'getEventReasonById'");
	}
}