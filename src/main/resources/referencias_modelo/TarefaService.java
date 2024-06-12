package com.br.serratec.colaborattor.service;

import com.br.serratec.colaborattor.dto.TarefaDTO;
import com.br.serratec.colaborattor.model.Tarefa;
import com.br.serratec.colaborattor.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    public List<TarefaDTO> getAllTarefas() {
        List<Tarefa> tarefas = tarefaRepository.findAll();
        return tarefas.stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public TarefaDTO criarTarefa(TarefaDTO tarefaDTO) {
        Tarefa tarefa = convertToEntity(tarefaDTO);
        Tarefa savedTarefa = tarefaRepository.save(tarefa);
        return convertToDTO(savedTarefa);
    }

    public TarefaDTO getTarefaById(Long id) {
        Tarefa tarefa = tarefaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Tarefa não encontrada"));
        return convertToDTO(tarefa);
    }

    public TarefaDTO updateTarefa(Long id, TarefaDTO tarefaDTO) {
        Tarefa tarefa = tarefaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Tarefa não encontrada"));
        tarefa.setNome(tarefaDTO.getNome());
        tarefa.setDescricao(tarefaDTO.getDescricao());
        tarefa.setDataInicio(tarefaDTO.getDataInicio());
        tarefa.setDataFim(tarefaDTO.getDataFim());
        tarefa.setStatus(tarefaDTO.getStatus());
        tarefa.setEsforcoEstimado(tarefaDTO.getEsforcoEstimado());
        tarefa.setEsforcoReal(tarefaDTO.getEsforcoReal());
        // Atualize outras relações conforme necessário
        Tarefa updatedTarefa = tarefaRepository.save(tarefa);
        return convertToDTO(updatedTarefa);
    }

    public void deleteTarefa(Long id) {
        tarefaRepository.deleteById(id);
    }

    private TarefaDTO convertToDTO(Tarefa tarefa) {
        TarefaDTO tarefaDTO = new TarefaDTO();
        tarefaDTO.setNome(tarefa.getNome());
        tarefaDTO.setDescricao(tarefa.getDescricao());
        tarefaDTO.setDataInicio(tarefa.getDataInicio());
        tarefaDTO.setDataFim(tarefa.getDataFim());
        tarefaDTO.setStatus(tarefa.getStatus());
        tarefaDTO.setEsforcoEstimado(tarefa.getEsforcoEstimado());
        tarefaDTO.setEsforcoReal(tarefa.getEsforcoReal());
        // Adicione outros campos conforme necessário
        return tarefaDTO;
    }

    private Tarefa convertToEntity(TarefaDTO tarefaDTO) {
        Tarefa tarefa = new Tarefa();
        tarefa.setNome(tarefaDTO.getNome());
        tarefa.setDescricao(tarefaDTO.getDescricao());
        tarefa.setDataInicio(tarefaDTO.getDataInicio());
        tarefa.setDataFim(tarefaDTO.getDataFim());
        tarefa.setStatus(tarefaDTO.getStatus());
        tarefa.setEsforcoEstimado(tarefaDTO.getEsforcoEstimado());
        tarefa.setEsforcoReal(tarefaDTO.getEsforcoReal());
        // Adicione outros campos conforme necessário
        return tarefa;
    }
}
