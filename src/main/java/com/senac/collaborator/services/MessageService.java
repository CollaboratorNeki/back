package com.senac.collaborator.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.senac.collaborator.dto.MessageDTO;
import com.senac.collaborator.model.Message;
import com.senac.collaborator.repositores.MessageRepository;

public class MessageService {
	@Autowired
	MessageRepository messageRepository;

	public List<MessageDTO> listMessages() {
		List<Message> message = messageRepository.findAll();
		List<MessageDTO> messagesDto = new ArrayList<>();

		for (Message messageDtoItem : message) {
			MessageDTO messageDto = new MessageDTO();
			messageDto.setConteudo(messageDtoItem.getConteudo());
			messageDto.setDataEnvio(messageDtoItem.getDataEnvio());
			messageDto.setTipo(messageDtoItem.getTipo());
			messageDto.setAcao(messageDtoItem.getAcao());

			messagesDto.add(messageDto);

		}

		return messagesDto;

	}
	
//	public MessageDTO saveMessages(MessageDTO messageDto) {
//		Message message = new Message(messageDto);
//		messageRepository.save(message);
//		return messageDto;
//	}

}
