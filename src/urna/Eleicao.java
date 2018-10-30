package urna;

import java.util.Scanner;

public class Eleicao {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		TituloEleitor tituloEleitor1 = new TituloEleitor("543214", "90", "São Miguel");
		TituloEleitor tituloEleitor2 = new TituloEleitor("122345", "10", "São Miguel");
		TituloEleitor tituloEleitor3 = new TituloEleitor("456677", "14", "São Miguel");
		TituloEleitor tituloEleitor4 = new TituloEleitor("126745", "18", "São Miguel");

		Eleitor eleitor1 = new Eleitor("Felipe Gabriel", tituloEleitor1);
		eleitor1.setTituloEleitor(tituloEleitor1);

		Eleitor eleitor2 = new Eleitor("Ana Alice", tituloEleitor2);
		eleitor2.setTituloEleitor(tituloEleitor2);

		Eleitor eleitor3 = new Eleitor("Haddad", tituloEleitor3);
		eleitor3.setTituloEleitor(tituloEleitor3);

		Eleitor eleitor4 = new Eleitor("Bolsonaro", tituloEleitor4);
		eleitor4.setTituloEleitor(tituloEleitor4);

		Candidato candidato1 = new Candidato("Bolsonaro", tituloEleitor4, "Presidente", "PSL", "17");
		Candidato candidato2 = new Candidato("Haddad", tituloEleitor3, "Presidente", "PT", "13");
		
		Urna urna1 = new Urna(candidato1, candidato2, "1");
		Urna urna2 = new Urna(candidato1, candidato2, "2");
		
		
		GerenciadorTSE gerenciadorTSE = new GerenciadorTSE();
		gerenciadorTSE.cadastroEleitor(eleitor1);
		gerenciadorTSE.cadastroEleitor(eleitor2);
		gerenciadorTSE.cadastroEleitor(eleitor3);
		gerenciadorTSE.cadastroEleitor(eleitor4);
		
		gerenciadorTSE.cadastroUrnas(urna1);
		gerenciadorTSE.cadastroUrnas(urna2);
		
		
		
		
		
	}
}
