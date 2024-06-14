package com.senac.collaborator.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ALMTool {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idALMTool;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = true)
    private String url;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String senha;

    @Column(nullable = false)
    private String tipo;

    @Column(nullable = false)
    private String vpn; // ativo - inativo

    @Column(nullable = false)
    private String status; // ativo - inativo

    @Column(nullable = true)
    private String task_status; // status de tarefas disponiveis

    @Column(nullable = true)
    private String closure_status; // status fechamento de tarefas

    // Getters e Setters
    public Long getIdALMTool() {
        return idALMTool;
    }

    public void setIdALMTool(Long idALMTool) {
        this.idALMTool = idALMTool;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVpn() {
        return vpn;
    }

    public void setVpn(String vpn) {
        this.vpn = vpn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTask_status() {
        return task_status;
    }

    public void setTask_status(String task_status) {
        this.task_status = task_status;
    }

    public String getClosure_status() {
        return closure_status;
    }

    public void setClosure_status(String closure_status) {
        this.closure_status = closure_status;
    }
}
