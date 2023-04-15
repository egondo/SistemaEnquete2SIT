package br.com.fiap.app;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

import br.com.fiap.model.Enquete;
import br.com.fiap.model.ItemEscolha;
import br.com.fiap.model.Pergunta;
import br.com.fiap.model.Resposta;

public class Aplicacao {

	public static void main(String[] args) {
		Enquete enq = new Enquete("Kraft-Heinz", "2SIT");
		String s = "Qual sua marca preferida";
		Pergunta p1 = new Pergunta(s, 1, 1);
		
		s = "Qual dos produtos da Heinz, você já usou";
		Pergunta p2 = new Pergunta(s, 2, 2);
		
		s = "Qual o produto da Heinz que vem na sua mente?";
		Pergunta p3 = new Pergunta(s, 3, 0);

		enq.addPergunta(p1);
		enq.addPergunta(p2);
		enq.addPergunta(p3);
		
		ItemEscolha ie1 = new ItemEscolha(1, "Heinz");
		ItemEscolha ie2 = new ItemEscolha(2, "Hemmer");
		ItemEscolha ie3 = new ItemEscolha(3, "Quero");
		p1.addItemEscolha(ie1);
		p1.addItemEscolha(ie2);
		p1.addItemEscolha(ie3);
		
		p2.addItemEscolha(new ItemEscolha(1, "catchup"));
		p2.addItemEscolha(new ItemEscolha(2, "mostarda"));
		p2.addItemEscolha(new ItemEscolha(3, "maionese"));
		p2.addItemEscolha(new ItemEscolha(4, "barbecue"));
		
		
		System.out.println("Aplicação da enquete " + enq.getNome());
		//recuperando as perguntas da enquete
		Pergunta[] questoes = enq.getPerguntas();
		Scanner tec = new Scanner(System.in);
		
		//Criando o vetor de resposta
		Resposta[] answers = new Resposta[enq.size()];
		
		for (int i = 0; i < enq.size(); i++) {
			Pergunta pergunta = questoes[i];
			System.out.println(pergunta.aplicacao());
			System.out.print("Resp: ");
			String resp = tec.nextLine();
			
			//instanciando objeto resposta e 
			//colocando os valores e guardando
			//a resposta
			Resposta r = new Resposta(resp);
			r.setPergunta(pergunta);
			answers[i] = r;
		}
		System.out.println("Fim da enquete!");
		gravaRespostas(answers, "d:/saida.txt");		
	}

	
	private static void gravaRespostas(Resposta[] answers, String arquivo) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));
			for (int i = 0; i < answers.length; i++) {
				Resposta r = answers[i];
				bw.write(r.getPergunta().getQuestao());
				bw.write(";");
				bw.write(r.getValor());
				bw.write(";");
				bw.write(r.getTimestamp().toString());
				bw.write("\n");
			}
			bw.close();
		}
		catch (Exception e) {
			System.out.println("XII, deu ruim!");
		}
	}
	
	
	
	
	
	
	
	

}
