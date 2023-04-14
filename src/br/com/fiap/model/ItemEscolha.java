package br.com.fiap.model;

public class ItemEscolha {

	private long id;
	
	private int ordem;
	
	private String descricao;

	public ItemEscolha(int ordem, String descricao) {
		this.ordem = ordem;
		this.descricao = descricao;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
