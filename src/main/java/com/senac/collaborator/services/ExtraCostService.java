package com.senac.collaborator.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.senac.collaborator.dto.ExtraCostDTO;
import com.senac.collaborator.model.ExtraCost;
import com.senac.collaborator.repositores.ExtraCostRepository;



@Service
public class ExtraCostService {

	@Autowired
	private ExtraCostRepository extraCostRepository;
	
	public List<ExtraCostDTO> listarExtraCost() {
		List<ExtraCost> listExtra = extraCostRepository.findAll();
		List<ExtraCostDTO> arrayExtraCost = new ArrayList<>();
		for (ExtraCost itemExtraCost : listExtra) {
			ExtraCostDTO extraCostDto = new ExtraCostDTO();
			extraCostDto.setIdExtraCost(itemExtraCost.getIdExtraCost());
			extraCostDto.setNome(itemExtraCost.getNome());
			extraCostDto.setDescricao(itemExtraCost.getDescricao());
			extraCostDto.setStatus(itemExtraCost.getStatus());
			extraCostDto.setPercentual(itemExtraCost.getPercentual());
		

			arrayExtraCost.add(extraCostDto);
		}
		return arrayExtraCost;
	}

	
	

	
	public boolean salvarExtraCost(ExtraCostDTO extraCostDto) {
	ExtraCost extraCost= new ExtraCost(extraCostDto);
		ExtraCost eTest = extraCostRepository.save(extraCost);

		if (eTest != null) {
			return true;
		}
		return false;
	}

	




	public boolean deletarExtra(Long idExtraCost) {
		if (extraCostRepository.existsById(idExtraCost)) {
			extraCostRepository.deleteById(idExtraCost);
			return true;
		}
		return false;

	}

	public boolean atualizarExtra(Long idExtraCost, ExtraCostDTO newExtra) {
		Optional<ExtraCost> optionalExtra = extraCostRepository.findById(idExtraCost);
		if (optionalExtra.isPresent()) {

			ExtraCost antigoExtra = optionalExtra.get();
			antigoExtra.setIdExtraCost(idExtraCost);

			if (newExtra.getNome() != null) {
				antigoExtra.setNome(newExtra.getNome());
			}
			
			if(newExtra.getIdExtraCost() != null) {
				antigoExtra.setIdExtraCost(idExtraCost);
			}
			
			if(newExtra.getDescricao() != null) {
				antigoExtra.setDescricao(newExtra.getDescricao());
			}
			
			if (newExtra.getStatus() != null) {
				antigoExtra.setStatus(newExtra.getStatus());
			}
			if (newExtra.getPercentual() != null) {
				antigoExtra.setPercentual(newExtra.getPercentual());
			}
			

			extraCostRepository.save(antigoExtra);
			return true;

		}
	
		return false;

	}
	
}
