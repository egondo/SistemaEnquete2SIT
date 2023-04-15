package br.com.fiap.model;

import java.time.LocalDateTime;

public class Resposta {

	private long id;
	
	private String valor;
	
	private LocalDateTime timestamp;
	
	private Pergunta pergunta;
	
	public Resposta(String valor) {
		this.valor = valor;
		timestamp = LocalDateTime.now();		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Pergunta getPergunta() {
		return pergunta;
	}

	public void setPergunta(Pergunta pergunta) {
		this.pergunta = pergunta;
	}
	
	
}
