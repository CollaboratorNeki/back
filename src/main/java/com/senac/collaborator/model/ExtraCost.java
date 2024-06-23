package com.senac.collaborator.model;

import com.senac.collaborator.dto.ExtraCostDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "extra_cost")
public class ExtraCost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idExtraCost;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "status")
    private Boolean status;

    @Column(name = "percentual")
    private Double percentual;

    @ManyToOne
    @JoinColumn(name = "id_project")
    private Project project;

    public ExtraCost() {
    }

    public ExtraCost(Long idExtraCost, String nome, String descricao, Boolean status, Double percentual,
                     Project project) {
        this.idExtraCost = idExtraCost;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.percentual = percentual;
        this.project = project;
    }

    public ExtraCost(ExtraCostDTO extraCostDto) {
        this.nome = extraCostDto.getNome();
        this.descricao = extraCostDto.getDescricao();
        this.status = extraCostDto.getStatus(); // Use getStatus() instead of isStatus()
        this.percentual = extraCostDto.getPercentual();
    }

    public Long getIdExtraCost() {
        return idExtraCost;
    }

    public void setIdExtraCost(Long idExtraCost) {
        this.idExtraCost = idExtraCost;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getStatus() { // Use Boolean instead of boolean
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
