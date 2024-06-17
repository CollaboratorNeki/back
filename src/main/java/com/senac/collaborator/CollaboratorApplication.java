package com.senac.collaborator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollaboratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollaboratorApplication.class, args);
	}

}

/*
 * public Boolean deleteEventReason(Long id_event_reason) {
 * Optional<EventReason> eventReasonOptional =
 * eventReasonRepository.findById(id_event_reason); if
 * (eventReasonOptional.isPresent()) { EventReason eventReason =
 * eventReasonOptional.get(); eventReason.setStatus(false);
 * eventReasonRepository.save(eventReason); return true; } return false; }
 */
/*
 * public boolean updateEventReason(Long id_event_reason, EventReason
 * eventReasonDetails) { Optional<EventReason> eventReasonOptional =
 * eventReasonRepository.findById(id_event_reason); if
 * (eventReasonOptional.isPresent()) { EventReason antigoEventReason =
 * eventReasonOptional.get();
 * antigoEventReason.setIdEventReason(id_event_reason); if
 * (eventReasonDetails.getNome() != null) ; {
 * antigoEventReason.setNome(eventReasonDetails.getNome()); } if
 * (eventReasonDetails.getDescricao() != null) ; {
 * antigoEventReason.setDescricao(eventReasonDetails.getDescricao()); }
 * eventReasonRepository.save(antigoEventReason); return true; } return false;
 * 
 * }
 */
