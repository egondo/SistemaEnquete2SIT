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
	private int topo = -1;
	
	public Enquete(String nome, String criador) {
		this.nome = nome;
		this.criador = criador;
		this.perguntas = new Pergunta[10];
	}

	public void addPergunta(Pergunta p) {
		topo++;
		this.perguntas[topo] = p;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getCriador() {
		return criador;
	}

	public void setCriador(String criador) {
		this.criador = criador;
	}

	public Pergunta[] getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(Pergunta[] perguntas) {
		this.perguntas = perguntas;
	}

	public int size() {
		return topo + 1;
	}

	
}
