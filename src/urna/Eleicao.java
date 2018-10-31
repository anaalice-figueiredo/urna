package urna;

import java.util.Scanner;

public class Eleicao {
	public static void main(String[] args) {
		
		int opc = 0;
		
		Scanner leitor = new Scanner(System.in);
		GerenciadorTSE gerenciador = new GerenciadorTSE();

		boolean votAberta = true;
		
		while (opc != 3) {
			System.out.println("--------------------------------------");
			System.out.println("MENU 1 DO MESARIO");
			System.out.println("--------------------------------------");
			System.out.println("1- Novo Voto");
			System.out.println("2- Contabilizar Votação");
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
								if(voto.equals("13")) {									
									gerenciador.votar(tituloEleitor, voto);
								}else if(voto.equals("17")){
									
								}else {
								}
									System.out.println("Votou nulo");
								}
							}else if(opc == 2) {
								
							}
						}else {
							System.out.println("Titulo inválido!");
						}
					}
				break;
				case 2:
					System.out.println("Total votação: ");
				break;
			}
		}

	}
}
