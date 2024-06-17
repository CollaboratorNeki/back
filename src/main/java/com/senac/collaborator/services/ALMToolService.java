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
			almDto.setStatus(itemAlm.isStatus());
			almDto.setTaskStatus(itemAlm.getTaskStatus());
			almDto.setClosureStatus(itemAlm.getClosureStatus());

			arrayAlm.add(almDto);
		}
		return arrayAlm;
	}

	public boolean salvarAlm(AlmDTO almDto) {
		ALMTool almTool = new ALMTool(almDto);
		ALMTool almTest = repositoryAlm.save(almTool);

		if (almTest != null) {
			return true;
		}
		return false;
	}

	public boolean deletarAlm(Long idAlm) {
		if (repositoryAlm.existsById(idAlm)) {
			repositoryAlm.deleteById(idAlm);
			return true;
		}
		return false;

	}

	public boolean atualizarAlm(Long idAlm, AlmDTO newAlm) {
		Optional<ALMTool> optionalAlm = repositoryAlm.findById(idAlm);
		if (optionalAlm.isPresent()) {

			ALMTool antigoAlm = optionalAlm.get();
			antigoAlm.setIdAlmTool(idAlm);

			if (newAlm.getNome() != null) {
				antigoAlm.setNome(newAlm.getNome());
			}

			if (newAlm.getUrl() != null) {
				antigoAlm.setUrl(newAlm.getUrl());
			}
			if (newAlm.getSenha() != null) {
				antigoAlm.setSenha(newAlm.getSenha());
			}
			if (newAlm.getTipo() != null) {
				antigoAlm.setTipo(newAlm.getTipo());
			}
			if (newAlm.getVpn() != null) {
				antigoAlm.setVpn(newAlm.getVpn());
			}
			if (newAlm.isStatus()) {
				antigoAlm.setStatus(newAlm.isStatus());
			}
			if (newAlm.getTaskStatus() != null) {
				antigoAlm.setTaskStatus(newAlm.getTaskStatus());
			}
			if (newAlm.getClosureStatus() != null) {
				antigoAlm.setClosureStatus(newAlm.getClosureStatus());
			}

			repositoryAlm.save(antigoAlm);
			return true;

		}

		return false;

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
