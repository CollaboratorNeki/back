package com.senac.collaborator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.senac.collaborator.dto.AlmDTO;
import com.senac.collaborator.model.ALMTool;
import com.senac.collaborator.repositores.ALMToolRepository;

@Service
public class ALMToolService {

	@Autowired
	ALMToolRepository repositoryAlm;

	public List<AlmDTO> listarALMTool() {
		List<ALMTool> listAlm = repositoryAlm.findAll();
		List<AlmDTO> arrayAlm = new ArrayList<>();
		for (ALMTool itemAlm : listAlm) {
			AlmDTO almDto = new AlmDTO();
			almDto.setNome(itemAlm.getNome());
			almDto.setUrl(itemAlm.getUrl());
			almDto.setLogin(itemAlm.getLogin());
			almDto.setSenha(itemAlm.getSenha());
			almDto.setTipo(itemAlm.getTipo());
			almDto.setVpn(itemAlm.getVpn());
			almDto.setStatus(itemAlm.getStatus());
			almDto.setTaskStatus(itemAlm.getTaskStatus());
			almDto.setClosureStatus(itemAlm.getClosureStatus());

			arrayAlm.add(almDto);
		}
		return arrayAlm;
	}

//    public Optional<ALMTool> findById(Long id) {
//        return repository.findById(id);
//    }
//
//    public ALMTool save(ALMTool almTool) {
//        return repository.save(almTool);
//    }
//
//    public void deleteById(Long id) {
//        repository.deleteById(id);
//    }
}
