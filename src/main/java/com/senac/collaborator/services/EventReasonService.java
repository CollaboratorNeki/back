package com.senac.collaborator.services;

import java.util.ArrayList;
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
	EventReasonRepository eventReasonRepository;

	public List<EventReason> listarEventReasons() {

		return eventReasonRepository.findAll();
	}
	
	public List<EventReasonDTO> listarEventReasonsDTO() {
		List<EventReason> eventReasonList = eventReasonRepository.findAll();
		List<EventReasonDTO> eventReasonListDTO = new ArrayList<>();
		for(EventReason eventReason : eventReasonList) {
			EventReasonDTO eventReasonDTO = new EventReasonDTO(); 
			eventReasonDTO.setDescricao(eventReason.getDescricao());
			eventReasonDTO.setNome(eventReason.getNome());
			eventReasonListDTO.add(eventReasonDTO);
		}
		return eventReasonListDTO;
	}

//	public EventReason getEventReasonById(Long idEventReason) {
//		return eventReasonRepository.findById(idEventReason)
//				.orElseThrow(() -> new ResourceNotFoundException("Evento não encontrado"));
//	}

	public EventReason createEventReason(EventReason eventReason) {
		return eventReasonRepository.save(eventReason);
	}

	public boolean updateEventReason(Long id_event_reason, EventReason eventReasonDetails) {
		Optional<EventReason> eventReasonOptional = eventReasonRepository.findById(id_event_reason);
		if (eventReasonOptional.isPresent()) {
			EventReason antigoEventReason = eventReasonOptional.get();
			antigoEventReason.setIdEventReason(id_event_reason);
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

	public Boolean deleteEventReason(Long id_event_reason) {
		Optional<EventReason> eventReasonOptional = eventReasonRepository.findById(id_event_reason);
		if (eventReasonOptional.isPresent()) {
			EventReason eventReason = eventReasonOptional.get();
			eventReason.setStatus(false);
			eventReasonRepository.save(eventReason);
			return true;
		}
		return false;
	}

	public EventReason getEventReasonById(Long id_event_reason) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Metodo não implementado 'getEventReasonById'");
	}
}