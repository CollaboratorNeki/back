package com.senac.collaborator.dto;

public class ExtraCostDTO {
    private Long idExtraCost;
    private String nome;
    private String descricao;
    private Boolean status;
    private Double percentual;

    public ExtraCostDTO() {
    }

    public ExtraCostDTO(Long idExtraCost, String nome, String descricao, Boolean status, Double percentual) {
        this.idExtraCost = idExtraCost;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.percentual = percentual;
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

    public Boolean getStatus() { 
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
}

	
	
	
	

