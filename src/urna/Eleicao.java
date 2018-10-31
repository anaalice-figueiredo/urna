package urna;

import java.util.Scanner;

public class Eleicao {
	public static void main(String[] args) {
		
		int opc = 0;
		
		Scanner leitor = new Scanner(System.in);
		GerenciadorTSE gerenciador = new GerenciadorTSE();
		
		
		boolean votAberta = true;
		
		while (opc != 5) {
			System.out.println("--------------------------------------");
			System.out.println("MENU 1 DO MESARIO");
			System.out.println("--------------------------------------");
			System.out.println("1- Novo Voto");
			System.out.println("2- Contabilizar Votação");
			System.out.println("3- Cadastrar Titulo de Eleitor e Eleitor");
			System.out.println("4- Cadastrar Urna");
			opc = leitor.nextInt();

			switch (opc) {
				case 1:
					System.out.println("--------------------------------------");
					System.out.println("MENU 2 DO MESARIO");
					System.out.println("--------------------------------------");
					System.out.println("1- Informar titulo de eleitor");
					System.out.println("2- Voltar ao Menu anterior");
					opc = leitor.nextInt();
				if(opc == 1) {
						System.out.println("Digite o titulo de eleitor: ");
						String tituloEleitor = leitor.next();
						if(gerenciador.verificarTituloEleitor(tituloEleitor)) {
							System.out.println("--------------------------------------");
							System.out.println("MENU DE VOTAÇÃO");
							System.out.println("--------------------------------------");
							System.out.println("1- Informar o número do candidato");
							System.out.println("2- Votar em Branco");
							opc = leitor.nextInt();
							if(opc == 1) {
								System.out.println("Digite o numero do candidato: ");
								String voto = leitor.next();
								if(voto.equals("13") ^ voto.equals("17")) {									
									gerenciador.votar(tituloEleitor, voto);
								}else {
									
								}
							}else if(opc == 2) {
								gerenciador.votar(tituloEleitor, "branco");
							}
						}else {
							System.out.println("Titulo inválido!");
						}
					}
				break;
				case 2:
					System.out.println("1- Ver Boletin das Urnas: ");
					System.out.println("2- Ver Resultado Geral: ");
					opc = leitor.nextInt();
					if(opc == 1) {
						gerenciador.exibirBoletimUrnas();
					} else if (opc == 2) {
						gerenciador.apurarResultadoFinal();
					}
				break;
				case 3:
					System.out.println("________CADASTRO TITULO_________");
					System.out.println("Digite o nome do eleitor: ");
					String nome = leitor.nextLine();
					String teste = leitor.nextLine();
					
					//verificar se ja nao existe
					System.out.println("Digite um numero do titulo de Eleitor: ");
					String numTitulo = leitor.nextLine();
					
					
					//listagem de urna se der tempo
					System.out.println("Digite um numero da Urna: ");
					String numUrna = leitor.nextLine();
					
					
					System.out.println("Digite a cidade: ");
					String cidade = leitor.nextLine();
					
					
					TituloEleitor titulo = new TituloEleitor(numTitulo, numUrna, cidade);
					Eleitor eleitor = new Eleitor(nome, titulo);
					gerenciador.cadastroEleitor(eleitor);
					
				break;
				case 4:
					System.out.println("________CADASTRO URNA_________");
					System.out.println("Digite o numero da Urna: ");
					String numeroUrna = leitor.next();
					
					gerenciador.cadastroUrnaMain(numeroUrna);
				break;
			}
		}

	}
}
