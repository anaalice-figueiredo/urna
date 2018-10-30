package urna;

public class TituloEleitor {
	
	private String numeroTitulo;
	private String numeroUrna;
	private String cidade;
	
	public TituloEleitor(String numeroTitulo, String numeroUrna, String cidade) {
		this.numeroTitulo = numeroTitulo;
		this.numeroUrna = numeroUrna;
		this.cidade = cidade;
	}

	public String getNumeroTitulo() {
		return numeroTitulo;
	}

	public void setNumeroTitulo(String numeroTitulo) {
		this.numeroTitulo = numeroTitulo;
	}

	public String getNumeroUrna() {
		return numeroUrna;
	}

	public void setNumeroUrna(String numeroUrna) {
		this.numeroUrna = numeroUrna;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String toString() {
		return "Numero do titulo: " + numeroTitulo +
				"Numero da Urna: " + numeroUrna +
				"Cidade: " + cidade;
	}

}
