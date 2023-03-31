package br.com.fiap.model;

import java.time.LocalDate;

public class Enquete {
	
	private long id;	
	private String nome;	
	private String descricao;	
	private LocalDate dataCriacao;
	private String criador;
	
	//para resolver a agregação
	private Pergunta[] perguntas;

}
