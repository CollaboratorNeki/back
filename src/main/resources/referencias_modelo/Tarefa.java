package com.br.serratec.colaborattor.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String status;
    private Double esforcoEstimado;
    private Double esforcoReal;

    @ManyToOne
    @JoinColumn(name = "idResponsavel")
    private Usuario responsavel;

    @ManyToOne
    @JoinColumn(name = "idProjeto")
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name = "idFerramentaALM")
    private FerramentaALM ferramentaALM;

    // Adicionar Getters e Setters
}
