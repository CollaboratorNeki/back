package com.senac.collaborator.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
			messageDto.setIdMessage(messageDtoItem.getIdMessage());
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
		return mTest != null;
	}

	public boolean deletarMessage(Long idMessage) {
		if (messageRepository.existsById(idMessage)) {
			messageRepository.deleteById(idMessage);
			return true;
		}
		return false;
	}

	public boolean atualizarMessage(Long idMessage, MessageDTO newMessage) {
		Optional<Message> optionalMessage = messageRepository.findById(idMessage);
		if (optionalMessage.isPresent()) {
			Message antigoMessage = optionalMessage.get();
			if (newMessage.getConteudo() != null) {
				antigoMessage.setConteudo(newMessage.getConteudo());
			}
			if (newMessage.getDataInicio() != null) {
				antigoMessage.setDataInicio(newMessage.getDataInicio());
			}
			if (newMessage.getDataFim() != null) {
				antigoMessage.setDataFim(newMessage.getDataFim());
			}
			if (newMessage.getTipo() != null) {
				antigoMessage.setTipo(newMessage.getTipo());
			}
			messageRepository.save(antigoMessage);
			return true;
		}
		return false;
	}
}
