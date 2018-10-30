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
		if(numeroCandidato == "13") {
			qtdVotosCandidato1++;
		} else if(numeroCandidato == "17") {
			qtdVotosCandidato2++;
		}else if(numeroCandidato == "branco") {
			qtdVotosBrancos++;
		}else {
			qtdVotosNulos++;
		}
	}
	
	public void emitirBoletimUrna() {
		System.out.println("_______________________________________________________");
		System.out.println("Votos em Fernando Haddad : " + qtdVotosCandidato1 + "\n");
		System.out.println("_______________________________________________________");
		System.out.println("Votos em Bolsonaro : " + qtdVotosCandidato2 + "\n");
		System.out.println("_______________________________________________________");
		System.out.println("Votos em Branco : " + qtdVotosBrancos + "\n");
		System.out.println("_______________________________________________________");
		System.out.println("Votos em Nulos : " + qtdVotosNulos + "\n");
		System.out.println("_______________________________________________________");
	}
	
	public void contabilizarVotosBranco() {
		System.out.println("_______________________________________________________");
		System.out.println("Votos em Branco : " + qtdVotosBrancos + "\n");
		System.out.println("_______________________________________________________");
	}
	
	public void contabilizarVotosNulos() {
		System.out.println("_______________________________________________________");
		System.out.println("Votos em Nulos : " + qtdVotosNulos + "\n");
		System.out.println("_______________________________________________________");
	}
	
	public void contabilizarVotosCandidato1() {
		System.out.println("_______________________________________________________");
		System.out.println("Votos em Fernando Haddad : " + qtdVotosCandidato1 + "\n");
		System.out.println("_______________________________________________________");
	}
	
	public void contabilizarVotosCandidato2() {
		System.out.println("_______________________________________________________");
		System.out.println("Votos em Bolsonaro : " + qtdVotosCandidato2 + "\n");
		System.out.println("_______________________________________________________");
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

	public int getQtdVotosNulos() {
		return qtdVotosNulos;
	}

	public void setQtdVotosNulos(int qtdVotosNulos) {
		this.qtdVotosNulos = qtdVotosNulos;
	}

	public int getQtdVotosBrancos() {
		return qtdVotosBrancos;
	}

	public void setQtdVotosBrancos(int qtdVotosBrancos) {
		this.qtdVotosBrancos = qtdVotosBrancos;
	}

	public int getQtdVotosCandidato1() {
		return qtdVotosCandidato1;
	}

	public void setQtdVotosCandidato1(int qtdVotosCandidato1) {
		this.qtdVotosCandidato1 = qtdVotosCandidato1;
	}

	public int getQtdVotosCandidato2() {
		return qtdVotosCandidato2;
	}

	public void setQtdVotosCandidato2(int qtdVotosCandidato2) {
		this.qtdVotosCandidato2 = qtdVotosCandidato2;
	}
	
//	public String toString() {
//		não encontrei necessidade desse metodo, então nao usei
//	}

}
