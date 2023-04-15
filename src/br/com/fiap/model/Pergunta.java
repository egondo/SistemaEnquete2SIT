package br.com.fiap.model;

public class Pergunta {
	
	private long id;
	private String questao;
	private int ordem;
	private int tipo;
	private boolean obrigatoria;
	
	private ItemEscolha[] itens;
	private int topo = -1;
	
	public Pergunta(String questao, int ordem, int tipo) {
		this.questao = questao;
		this.ordem = ordem;
		this.tipo = tipo;
		this.itens = new ItemEscolha[6];
	}

	public void addItemEscolha(ItemEscolha ie) {
		topo++;
		itens[topo] = ie;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestao() {
		return questao;
	}

	public void setQuestao(String questao) {
		this.questao = questao;
	}

	public int getOrdem() {
		return ordem;
	}

	public void setOrdem(int ordem) {
		this.ordem = ordem;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public boolean isObrigatoria() {
		return obrigatoria;
	}

	public void setObrigatoria(boolean obrigatoria) {
		this.obrigatoria = obrigatoria;
	}

	public ItemEscolha[] getItens() {
		return itens;
	}

	public void setItens(ItemEscolha[] itens) {
		this.itens = itens;
	}

	public String aplicacao() {
		String s = ordem + ") " + questao + "\n";
		if (tipo == 1 || tipo == 2) {
			for(int i = 0; i <= topo; i++) {
				ItemEscolha ie = itens[i];
				s = s + ie.getOrdem() + " - " + ie.getDescricao() + "\n";
			}
		}
		return s;
	}

	
}
