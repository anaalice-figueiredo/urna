package urna;

public class Urna {

	private Candidato candidato1;
	private Candidato candidato2;
	private int qtdVotosNulos;
	private int qtdVotosBrancos;
	private int qtdVotosCandidato1;
	private int qtdVotosCandidato2;
	private String numeroUrna;

	public Urna(Candidato candidato1, Candidato candidato2, String numeroUrna) {
		this.candidato1 = candidato1;
		this.candidato2 = candidato2;
		this.numeroUrna = numeroUrna;
	}

	public String getNumeroUrna() {
		return numeroUrna;
	}

	public void setNumeroUrna(String numeroUrna) {
		this.numeroUrna = numeroUrna;
	}

	public void votar(String numeroCandidato) {
		if(numeroCandidato.equals("13")) {
			qtdVotosCandidato1++;
		} else if(numeroCandidato.equals("17")) {
			qtdVotosCandidato2++;
		}else if(numeroCandidato.equals("branco")) {
			qtdVotosBrancos++;
		}else {
			qtdVotosNulos++;
		}
	}
	
	public void emitirBoletimUrna() {
		System.out.println("_____________________Início Urna_______________________");
		System.out.println("_______________________________________________________");
		System.out.println("Votos em Fernando Haddad : " + qtdVotosCandidato1 + "\n");
		System.out.println("_______________________________________________________");
		System.out.println("Votos em Bolsonaro : " + qtdVotosCandidato2 + "\n");
		System.out.println("_______________________________________________________");
		System.out.println("Votos em Branco : " + qtdVotosBrancos + "\n");
		System.out.println("_______________________________________________________");
		System.out.println("Votos em Nulos : " + qtdVotosNulos + "\n");
		System.out.println("_______________________________________________________");
		System.out.println("_____________________Fim Urna__________________________");
		System.out.println(" ");
	}
	
	public int getQtdVotosNulos() {
		return qtdVotosNulos;
	}

	public void setQtdVotosNulos() {
		qtdVotosNulos++;
	}

	public int getQtdVotosBrancos() {
		return qtdVotosBrancos;
	}

	public void setQtdVotosBrancos() {
		qtdVotosBrancos++;
	}

	public int getQtdVotosCandidato1() {
		return qtdVotosCandidato1;
	}

	public void setQtdVotosCandidato1() {
		qtdVotosCandidato1++;
	}

	public int getQtdVotosCandidato2() {
		return qtdVotosCandidato2;
	}

	public void setQtdVotosCandidato2() {
		qtdVotosCandidato2++;
	}

}
