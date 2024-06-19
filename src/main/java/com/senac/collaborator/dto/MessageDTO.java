package com.senac.collaborator.dto;




import java.time.LocalDate;

import com.senac.collaborator.model.Message;

public class MessageDTO {

	private Long idMessage; 
	
	private String conteudo;

	private LocalDate dataInicio;
	
	private LocalDate dataFim;

	private String tipo;



	

public MessageDTO() {}

	public MessageDTO(Long idMessage, String conteudo, LocalDate dataInicio, LocalDate dataFim, String tipo) {
		super();
		this.idMessage = idMessage;
		this.conteudo = conteudo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.tipo = tipo;
	}




	public Long getIdMessage() {
		return idMessage;
	}




	public void setIdMessage(Long idMessage) {
		this.idMessage = idMessage;
	}




	public String getConteudo() {
		return conteudo;
	}




	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
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




	public String getTipo() {
		return tipo;
	}




	public void setTipo(String tipo) {
		this.tipo = tipo;
	}




	
	
	
	
	
	
}
 





