package com.senac.collaborator.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.collaborator.dto.MessageDTO;
import com.senac.collaborator.model.Message;
import com.senac.collaborator.repositores.MessageRepository;
@Service
public class MessageService {
	@Autowired
	MessageRepository messageRepository;

	public List<MessageDTO> listMessages() {
		List<Message> message = messageRepository.findAll();
		List<MessageDTO> messagesDto = new ArrayList<>();

		for (Message messageDtoItem : message) {
			MessageDTO messageDto = new MessageDTO();
			messageDto.setConteudo(messageDtoItem.getConteudo());
			messageDto.setDataInicio(messageDtoItem.getDataInicio());
			messageDto.setDataFim(messageDtoItem.getDataFim());
			messageDto.setTipo(messageDtoItem.getTipo());
		

			messagesDto.add(messageDto);

		}

		return messagesDto;

	}

	public boolean saveMessages(MessageDTO messageDto) {
		Message message = new Message(messageDto);
		Message mTest = messageRepository.save(message);

		if (mTest != null) {
			return true;
		}

		return false;
	}

}
