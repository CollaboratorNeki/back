package com.senac.collaborator.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senac.collaborator.dto.MessageDTO;
import com.senac.collaborator.services.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {

	MessageService messageService = new MessageService(); // @Autowired dando problema, foi necessário instanciar na mão

	@GetMapping("/list_message")
	public List<MessageDTO> listandoMensagens() {
		return messageService.listMessages();
	}
	
	
	

}
