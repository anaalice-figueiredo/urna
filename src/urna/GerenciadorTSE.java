package urna;

public class GerenciadorTSE {

	private Urna urnas[] = new Urna[10];
	private Eleitor eleitores[] = new Eleitor[10];
	private TituloEleitor titulos[] = new TituloEleitor[10];
	private Candidato candidato1;
	private Candidato candidato2;
	private int qtdUrnas = 0;
	private int qtdTitulos = 0;
	private int qtdEleitores = 0;

	public GerenciadorTSE() {
		String nome;
		TituloEleitor titulo;

		titulo = new TituloEleitor("123", "4", "São Miguel");
		nome = "Felipe Gabriel";
		Eleitor eleitor = new Eleitor(nome, titulo);
		cadastroEleitor(eleitor);

		titulo = new TituloEleitor("234", "4", "São Miguel");
		nome = "Ana Alice";
		eleitor = new Eleitor(nome, titulo);
		cadastroEleitor(eleitor);

		titulo = new TituloEleitor("256", "4", "São Miguel");
		nome = "Fernando Haddad";
		eleitor = new Eleitor(nome, titulo);
		candidato1 = new Candidato(nome, titulo, "PT", "13", "Presidente");
		cadastroEleitor(eleitor);

		titulo = new TituloEleitor("278", "4", "São Miguel");
		nome = "Bolsonaro";
		eleitor = new Eleitor(nome, titulo);
		candidato2 = new Candidato(nome, titulo, "PSL", "17", "Presidente");
		cadastroEleitor(eleitor);

		Urna urna = new Urna(candidato1, candidato2, "4");
			 urna = new Urna(candidato1, candidato2, "1");
			 urna = new Urna(candidato1, candidato2, "2");

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
							break;
						}
					}

				}
			}
			return true;
		} else {
			System.out.println("Amigo, você não pode votar, ta ok?");
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
			System.out.println("oi");
		}
	}

	public boolean verificarTituloEleitor(String numeroTitulo) {
		for (int i = 0; i < qtdEleitores; i++) {
			if (numeroTitulo.equals(eleitores[i].getTituloEleitor().getNumeroTitulo())) {
				return true;
			} else {
				return false;
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

	}

}
