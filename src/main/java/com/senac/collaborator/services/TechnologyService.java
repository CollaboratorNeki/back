package com.senac.collaborator.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.collaborator.dto.ClientDTO;
import com.senac.collaborator.dto.TechnologyDTO;
import com.senac.collaborator.model.Client;
import com.senac.collaborator.model.Technology;
import com.senac.collaborator.repositores.TechnologyRepository;

@Service
public class TechnologyService {

	
	@Autowired
	TechnologyRepository technologyRepository;
	
	
	public List<TechnologyDTO> listarTechnology() {
		List<Technology> listTechnology = technologyRepository.findAll();
		List<TechnologyDTO> arrayTechnology = new ArrayList<>();
		for (Technology itemTechnology : listTechnology) {
			TechnologyDTO TechnologyDTO = new TechnologyDTO();
			TechnologyDTO.setIdTechnology(itemTechnology.getIdTechnology());
			TechnologyDTO.setNome(itemTechnology.getNome());
			TechnologyDTO.setTipo(itemTechnology.getTipo());
			TechnologyDTO.setVersao(itemTechnology.getVersao());
			arrayTechnology.add(TechnologyDTO);
		}
		return arrayTechnology;
	}
	
	
	public boolean salvarTechnology(TechnologyDTO technologyDTO) {
		Technology technology = new Technology(technologyDTO);
		Technology technologyTest = technologyRepository.save(technology);

		if (technologyTest!= null) {
			return true;
		}
		return false;
	}
	
	public boolean deletarTechnology(Long idTechnology) {
		if (technologyRepository.existsById(idTechnology)) {
			technologyRepository.deleteById(idTechnology);
			return true;
		}
		return false;

	}
	
	public boolean atualizarTechnology(Long idTechnology, TechnologyDTO newTechnologyDTO) {
	    Optional<Technology> optionalTechnology = technologyRepository.findById(idTechnology);
	    if (optionalTechnology.isPresent()) {

	        Technology antigoTechnology = optionalTechnology.get();
	        antigoTechnology.setIdTechnology(idTechnology);

	        if (newTechnologyDTO.getNome() != null) {
	            antigoTechnology.setNome(newTechnologyDTO.getNome());
	        }

	        if (newTechnologyDTO.getIdTechnology() != null) {
	            antigoTechnology.setIdTechnology(newTechnologyDTO.getIdTechnology());
	        }

	        if (newTechnologyDTO.getTipo() != null) {
	            antigoTechnology.setTipo(newTechnologyDTO.getTipo());
	        }

	        if (newTechnologyDTO.getVersao() != null) {
	            antigoTechnology.setVersao(newTechnologyDTO.getVersao());
	        }

	        technologyRepository.save(antigoTechnology);
	        return true;
	    }

	    return false;
	}
	
	
	
	
	
}
