package com.senac.collaborator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "Task")
public class Task {

    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="idTask")
    private long idTask;
    
    @Column(name ="nome")
    private String nome;
    
    @Column(name ="descricao")
    private String descricao;
    
    @Column(name ="dataInicio")
    private LocalDate dataInicio;
    
    @Column(name ="dataFim")
    private LocalDate dataFim;
    
    @Column(name ="status")
    private boolean status;
    
    @Column(name ="esforcoEstimado")
    private String esforcoEstimado;
    
    @Column(name ="esforcoReal")
    private String esforcoReal;
    
    @ManyToOne
    @JoinColumn(name = "idResponsavel")
    private User idResponsavel;
    
    @ManyToOne
    @JoinColumn(name = "idProject")
    private Project idProject;
    
    @ManyToOne
    @JoinColumn(name = "idALMTool")
    private ALMTool idalmtool;
    
    public Task() {}

    public Task(long idTask, String nome, String descricao, LocalDate dataInicio, LocalDate dataFim, boolean status,
            String esforcoEstimado, String esforcoReal, User idResponsavel, Project idProject, ALMTool idalmtool) {
        this.idTask = idTask;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.esforcoEstimado = esforcoEstimado;
        this.esforcoReal = esforcoReal;
        this.idResponsavel = idResponsavel;
        this.idProject = idProject;
        this.idalmtool = idalmtool;
    }

    // Getters and Setters

    public long getIdTask() {
        return idTask;
    }

    public void setIdTask(long idTask) {
        this.idTask = idTask;
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

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEsforcoEstimado() {
        return esforcoEstimado;
    }

    public void setEsforcoEstimado(String esforcoEstimado) {
        this.esforcoEstimado = esforcoEstimado;
    }

    public String getEsforcoReal() {
        return esforcoReal;
    }

    public void setEsforcoReal(String esforcoReal) {
        this.esforcoReal = esforcoReal;
    }

    public User getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(User idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public Project getIdProject() {
        return idProject;
    }

    public void setIdProject(Project idProject) {
        this.idProject = idProject;
    }

    public ALMTool getIdalmtool() {
        return idalmtool;
    }

    public void setIdalmtool(ALMTool idalmtool) {
        this.idalmtool = idalmtool;
    }
}
