package com.br.serratec.colaborattor.controller;

import com.br.serratec.colaborattor.dto.TarefaDTO;
import com.br.serratec.colaborattor.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<TarefaDTO> getAllTarefas() {
        return tarefaService.getAllTarefas();
    }

    @PostMapping
    public TarefaDTO criarTarefa(@RequestBody TarefaDTO tarefaDTO) {
        return tarefaService.criarTarefa(tarefaDTO);
    }

    @GetMapping("/{id}")
    public TarefaDTO getTarefaById(@PathVariable Long id) {
        return tarefaService.getTarefaById(id);
    }

    @PutMapping("/{id}")
    public TarefaDTO updateTarefa(@PathVariable Long id, @RequestBody TarefaDTO tarefaDTO) {
        return tarefaService.updateTarefa(id, tarefaDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTarefa(@PathVariable Long id) {
        tarefaService.deleteTarefa(id);
    }
}
