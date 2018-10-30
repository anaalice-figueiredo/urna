package urna;

public class GerenciadorTSE {

	private Urna urnas[] = new Urna[10];
	private Eleitor eleitores[] = new Eleitor[10];
	private Candidato candidato1;
	private Candidato candidato2;
	private int qtdUrnas = 0;
	private int qtdEleitores = 0;

//	public GerenciadorTSE(Urna[] urnas, Eleitor[] eleitores, Candidato candidato1, Candidato candidato2) {
//		this.urnas = urnas;
//		this.eleitores = eleitores;
//		this.candidato1 = candidato1;
//		this.candidato2 = candidato2;
//	}

	public boolean votar(String numTitulo, String numCandidato) {
		boolean verifica = verificarTituloEleitor(numTitulo);

		if (verifica) {
			for (int i = 0; i < qtdEleitores; i++) {
				if (eleitores[i].getTituloEleitor().getNumeroTitulo() == numTitulo) {
					String numeroUrna = eleitores[i].getTituloEleitor().getNumeroUrna();

					for (int j = 0; j < qtdUrnas; j++) {
						if (urnas[j].getNumeroUrna().equals(numeroUrna)) {
							urnas[j].votar(numCandidato);
						}
					}

				}
			}
		} else {
			
		}

		return false;
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
		for (int i = 0; i < qtdEleitores; i++) {
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

	public Urna[] getUrnas() {
		return urnas;
	}

	public Eleitor[] getEletores() {
		return eleitores;
	}

	public Candidato getCandidato1() {
		return candidato1;
	}

	public void setCandidato1(Candidato candidato1) {
		this.candidato1 = candidato1;
	}

	public Candidato getCandidato2() {
		return candidato2;
	}

	public void setCandidato2(Candidato candidato2) {
		this.candidato2 = candidato2;
	}
	
}
