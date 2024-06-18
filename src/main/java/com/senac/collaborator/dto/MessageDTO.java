package com.senac.collaborator.dto;



import com.senac.collaborator.model.Message;

public class MessageDTO {

	private String conteudo;

	private Long dataInicio;
	
	private Long dataFim;

	private String tipo;



	
	public MessageDTO() {}
	
	public MessageDTO(String conteudo, Long dataInicio, Long dataFim, String tipo) {
		super();
		this.conteudo = conteudo;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.tipo = tipo;
	}



	public String getConteudo() {
		return conteudo;
	}



	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}



	public Long getDataInicio() {
		return dataInicio;
	}



	public void setDataInicio(Long dataInicio) {
		this.dataInicio = dataInicio;
	}



	public Long getDataFim() {
		return dataFim;
	}



	public void setDataFim(Long dataFim) {
		this.dataFim = dataFim;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
}
 





