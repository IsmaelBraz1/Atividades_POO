package Exercicio18;

import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int opcao, controle = 0;
		boolean sair = false;
		
		Plano plano = new Plano(10, 10);
		Robo robo = new Robo(1, "R", plano);
		System.out.print("1 - Executar Movimento A\n2 - Executar Movimento B\n3 - Executar Movimento C\n4 - Caça moeda\n =>");
		opcao = input.nextInt();
		System.out.println("\n\n");
		if(opcao == 1) {
			robo.movimentoA();
		}
		if(opcao == 2) {
			robo.movimentoB();
		}
		if(opcao == 3) {
			robo.movimentoC();
		}
		if(opcao == 4) {
			int i = 0;
			plano.sortearMoeda();
			do {
				plano.mapa();
				System.out.print("Escolha uma opacao de movimento: \n1-Norte\n2-Sul\n3-Leste\n4-Oeste\n5-Nordeste"
						+ "\n6-Sudeste\n7-Noroeste\n8-Sudoeste\n0-Sair\n=>");
				opcao = input.nextInt();
				if(opcao ==0 ) {
					sair = true;
				}
				if(i<1 || opcao!=controle) {
					if(opcao == 1 ) 
						robo.moverNorte();
					if(opcao == 2) 
						robo.moverSul();
					if(opcao == 3) 
						robo.moverLeste();
					if(opcao == 4)
						robo.moverOeste();
					if(opcao == 5) 
						robo.moverNordeste();
					if(opcao == 6) 
						robo.moverSudeste();
					if(opcao == 7) 
						robo.moverNoroeste();
					if(opcao == 8) 
						robo.moverSudoeste();
				}
				
				i++;
				controle = opcao;
			}while(!sair);
			System.out.println("Movimentos ao norte: "+robo.passosNorte+"\nMovimentos ao sul: "+robo.passosSul
					+"\nMovimentos ao leste: "+robo.passosLeste+"\nMovimentos ao oeste: "+robo.passosOeste
					+"\nMovimentos ao nordeste: "+robo.passosNordeste+"\nMovimentos ao Sudeste: "+robo.passosSudeste
					+"\nMovimentos ao noroeste: "+robo.passosNoroeste+"\nMovimentos ao sudoeste: "+robo.passosSudoeste);
			System.out.println("Voce encontrou "+robo.moeda+" moeda(s).");
		}
	}
}

