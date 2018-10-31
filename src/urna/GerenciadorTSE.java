package urna;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class GerenciadorTSE {

	private Urna urnas[] = new Urna[10];
	private Eleitor eleitores[] = new Eleitor[10];
	private TituloEleitor titulos[] = new TituloEleitor[10];
	private Candidato candidato1;
	private Candidato candidato2;
	private int qtdUrnas = 0;
	private int qtdTitulos = 0;
	private int qtdEleitores = 0;
	int totalBrancos = 0;
	int totalNulos = 0;
	int totalCandidatos1 = 0;
	int totalCandidatos2 = 0;

	public GerenciadorTSE() {
		inicializaDados();
	}

	public void inicializaDados() {
		String nome;
		TituloEleitor titulo;

		titulo = new TituloEleitor("123", "9", "São Miguel");
		nome = "Felipe Gabriel";
		Eleitor eleitor = new Eleitor(nome, titulo);
		cadastroEleitor(eleitor);

		titulo = new TituloEleitor("234", "5", "São Miguel");
		nome = "Ana Alice";
		eleitor = new Eleitor(nome, titulo);
		cadastroEleitor(eleitor);

		titulo = new TituloEleitor("256", "5", "São Miguel");
		nome = "Fernando Haddad";
		eleitor = new Eleitor(nome, titulo);
		candidato1 = new Candidato(nome, titulo, "PT", "13", "Presidente");
		cadastroEleitor(eleitor);

		titulo = new TituloEleitor("278", "5", "São Miguel");
		nome = "Bolsonaro";
		eleitor = new Eleitor(nome, titulo);
		candidato2 = new Candidato(nome, titulo, "PSL", "17", "Presidente");
		cadastroEleitor(eleitor);

		Urna urna = new Urna(candidato1, candidato2, "4");
		cadastroUrnas(urna);

		urna = new Urna(candidato1, candidato2, "5");
		cadastroUrnas(urna);
	}

	public boolean votar(String numTitulo, String numCandidato) {
		boolean verifica = verificarTituloEleitor(numTitulo);
		if (verifica) {
			for (int i = 0; i < qtdEleitores; i++) {
				if (eleitores[i].getTituloEleitor().getNumeroTitulo().equals(numTitulo)) {
					String numeroUrna = eleitores[i].getTituloEleitor().getNumeroUrna();
					for (int j = 0; j < qtdUrnas; j++) {
						if (urnas[j].getNumeroUrna().equals(numeroUrna)) {
							urnas[j].votar(numCandidato);
							//eleitores[i].setVotou(true);
							break;
						}
					}

				}
			}
			return true;
		} else {
			System.out.println("Eleitor com titulo inválido ou eleitor ja votou");
			return false;
		}

	}

	public int getQtdUrnas() {
		return qtdUrnas;
	}

	public void setQtdUrnas(int qtdUrnas) {
		this.qtdUrnas = qtdUrnas;
	}

	public int getQtdEleitores() {
		return qtdEleitores;
	}

	public void setQtdEleitores(int qtdEleitores) {
		this.qtdEleitores = qtdEleitores;
	}

	public void setUrnas(Urna[] urnas) {
		this.urnas = urnas;
	}

	public void cadastroUrnas(Urna urna) {
		urnas[qtdUrnas] = urna;
		qtdUrnas++;
	}

	public void cadastroEleitor(Eleitor eleitor) {
		eleitores[qtdEleitores] = eleitor;
		qtdEleitores++;
	}

	public void exibirBoletimUrnas() {
		for (int i = 0; i < qtdUrnas; i++) {
			urnas[i].emitirBoletimUrna();
		}
	}

	public boolean verificarTituloEleitor(String numeroTitulo) {
		for (int i = 0; i < qtdEleitores; i++) {
			if (numeroTitulo.equals(eleitores[i].getTituloEleitor().getNumeroTitulo())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean votou(String numeroTitulo) {
		for (int i = 0; i < qtdEleitores; i++) {
			if (numeroTitulo.equals(eleitores[i].isVotou())) {
				return true;
			}
		}
		return false;
	}

	public Urna[] getUrnas() {
		return urnas;
	}

	public Eleitor[] getEletores() {
		return eleitores;
	}

	public void apurarResultadoFinal() {
//		for(todas as urnas){ totalvotosBrancos+=urnas[i].votosBrancos; fazer pra todos}

		for (int i = 0; i < qtdUrnas; i++) {
			totalBrancos += urnas[i].getQtdVotosBrancos();
			totalNulos += urnas[i].getQtdVotosNulos();
			totalCandidatos1 += urnas[i].getQtdVotosCandidato1();
			totalCandidatos2 += urnas[i].getQtdVotosCandidato2();
		}

		int totalVotacao = totalBrancos + totalNulos + totalCandidatos1 + totalCandidatos2;

		float totalBranco = (totalBrancos / totalVotacao) * 100;
		float totalNulo = (totalNulos / totalVotacao) * 100;
		float totalCandidato1 = (totalCandidatos1 / totalVotacao) * 100;
		float totalCandidato2 = (totalCandidatos2 / totalVotacao) * 100;
		
		System.out.println("_____________APURAÇÃO____________");
		System.out.println("_________________________________");
		System.out.println("Votos brancos: " + totalBranco + "% \n");
		System.out.println("_________________________________");
		System.out.println("Votos nulos: " + totalNulo + "% \n");
		System.out.println("_________________________________");
		System.out.println("Votos no candidato 1 (Haddad): " + totalCandidato1 + "% \n");
		System.out.println("_________________________________");
		System.out.println("Votos no candidato 2 (Bolsonaro): " + totalCandidato2 + "% \n");
		System.out.println("_________________________________");
	}
	
	public void cadastroUrnaMain(String numUrna) {
		Urna urna = new Urna(candidato1, candidato2, numUrna);
		cadastroUrnas(urna);
	}
	
	

}
