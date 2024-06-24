package com.senac.collaborator.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senac.collaborator.dto.ClientDTO;
import com.senac.collaborator.model.Client;
import com.senac.collaborator.repositores.ClientRepository;

@Service
public class ClientService {

	
	@Autowired
	ClientRepository ClientRepository;
	
	
	public List<ClientDTO> listarClient() {
		List<Client> listClient = ClientRepository.findAll();
		List<ClientDTO> arrayClient = new ArrayList<>();
		for (Client itemClient : listClient) {
			ClientDTO clientDTO = new ClientDTO();
			clientDTO.setIdClient(itemClient.getIdClient());
			clientDTO.setNome(itemClient.getNome());
			clientDTO.setTelefone(itemClient.getTelefone());
			clientDTO.setEmail(itemClient.getEmail());
			clientDTO.setDocumento(itemClient.getDocumento());
			clientDTO.setCodigoExterno(itemClient.getCodigoExterno());
			arrayClient.add(clientDTO);
		}
		return arrayClient;
	}
	
	public boolean salvarClient(ClientDTO clientDTO) {
		Client client = new Client(clientDTO);
		Client clientTest = ClientRepository.save(client);

		if (clientTest != null) {
			return true;
		}
		return false;
	}
	

	public boolean deletarClient(Long idClient) {
		if (ClientRepository.existsById(idClient)) {
			ClientRepository.deleteById(idClient);
			return true;
		}
		return false;

	}

	public boolean atualizarClient(Long idClient, ClientDTO newClient) {
		Optional<Client> optionalClient = ClientRepository.findById(idClient);
		if (optionalClient.isPresent()) {

			Client antigoClient = optionalClient.get();
			antigoClient.setIdClient(idClient);

			if (newClient.getNome() != null) {
				antigoClient.setNome(newClient.getNome());
			}
			
			if(newClient.getIdClient() != null) {
				antigoClient.setIdClient(newClient.getIdClient());
			}
			
			if(newClient.getTelefone() != null) {
				antigoClient.setTelefone(newClient.getTelefone());
			}
			
			if (newClient.getEmail() != null) {
				antigoClient.setEmail(newClient.getEmail());
			}
			if (newClient.getDocumento() != null) {
				antigoClient.setDocumento(newClient.getDocumento());
			}
			if (newClient.getCodigoExterno() != null) {
				antigoClient.setCodigoExterno(newClient.getCodigoExterno());
			}

			ClientRepository.save(antigoClient);
			return true;

		}

		return false;

	}
	
	
}
