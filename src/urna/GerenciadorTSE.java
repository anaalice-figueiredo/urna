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
		qtdEleitores++;
		
		titulo = new TituloEleitor("234", "4", "São Miguel");
		nome = "Ana Alice";
		eleitor = new Eleitor(nome, titulo);
		cadastroEleitor(eleitor);
		qtdEleitores++;
		
		titulo = new TituloEleitor("256", "4", "São Miguel");
		nome = "Fernando Haddad";
		eleitor = new Eleitor(nome, titulo);
		candidato1 = new Candidato(nome, titulo, "PT", "13", "Presidente");
		cadastroEleitor(eleitor);
		qtdEleitores++;
		
		titulo = new TituloEleitor("278", "4", "São Miguel");
		nome = "Bolsonaro";
		eleitor = new Eleitor(nome, titulo);
		candidato2 = new Candidato(nome, titulo, "PSL", "17", "Presidente");
		cadastroEleitor(eleitor);
		qtdEleitores++;

		Urna urna = new Urna(candidato1, candidato2, "4");
		qtdUrnas++;
		
	}

	public boolean votar(String numTitulo, String numCandidato) {
		boolean verifica = verificarTituloEleitor(numTitulo);
		//System.out.println(verifica);
		if (verifica) {
			for (int i = 0; i < qtdEleitores; i++) {
				System.out.println(qtdEleitores);
				if (eleitores[i].getTituloEleitor().getNumeroTitulo().equals(numTitulo)) {
					System.out.println("Entrou aqq");
					String numeroUrna = eleitores[i].getTituloEleitor().getNumeroUrna();
					System.out.println("numero urna deve vir dps disso");
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
			urnas[i].emitirBoletimUrna();
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
	
	public void apurarResultadoFinal(){
		
	}
	
}
