package com.senac.collaborator.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.collaborator.dto.AlmDTO;
import com.senac.collaborator.model.ALMTool;
import com.senac.collaborator.repositores.ALMToolRepository;

@Service
public class ALMToolService {

	@Autowired
	private ALMToolRepository repository;

	public ALMTool saveAlm(AlmDTO dto) {
		ALMTool almTool = new ALMTool();
		almTool.setNome(dto.getNome());
		almTool.setUrl(dto.getUrl());
		almTool.setLogin(dto.getLogin());
		almTool.setSenha(dto.getSenha());
		almTool.setTipo(dto.getTipo());
		almTool.setVpn(dto.getVpn());
		almTool.setStatus(dto.getStatus());
		almTool.setTaskStatus(dto.getTaskStatus()); // Adicione os campos
		almTool.setClosureStatus(dto.getClosureStatus());
		return repository.save(almTool);
	}

	public List<AlmDTO> getAllAlms() {
		return repository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
	}

	public Optional<ALMTool> updateAlm(Long id, AlmDTO dto) {
		Optional<ALMTool> optionalAlmTool = repository.findById(id);
		if (optionalAlmTool.isPresent()) {
			ALMTool almTool = optionalAlmTool.get();
			almTool.setNome(dto.getNome());
			almTool.setUrl(dto.getUrl());
			almTool.setLogin(dto.getLogin());
			almTool.setSenha(dto.getSenha());
			almTool.setTipo(dto.getTipo());
			almTool.setVpn(dto.getVpn());
			almTool.setStatus(dto.getStatus());
			almTool.setTaskStatus(dto.getTaskStatus()); // Adicione os campos
			almTool.setClosureStatus(dto.getClosureStatus());
			return Optional.of(repository.save(almTool));
		} else {
			return Optional.empty();
		}
	}

	public void deleteAlm(Long id) {
		repository.deleteById(id);
	}

	private AlmDTO convertToDto(ALMTool almTool) {
		AlmDTO dto = new AlmDTO();
		dto.setIdAlmTool(almTool.getIdAlmTool());
		dto.setNome(almTool.getNome());
		dto.setUrl(almTool.getUrl());
		dto.setLogin(almTool.getLogin());
		dto.setSenha(almTool.getSenha());
		dto.setTipo(almTool.getTipo());
		dto.setVpn(almTool.getVpn());
		dto.setStatus(almTool.getStatus());
		dto.setTaskStatus(almTool.getTaskStatus()); // Adicione os campos
		dto.setClosureStatus(almTool.getClosureStatus());
		return dto;
	}
}
