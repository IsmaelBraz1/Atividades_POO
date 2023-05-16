package Exercicio17;

import java.util.Scanner;

public class Jogador {
	private String letra;
	public Jogo jogo;
	public Jogador( String letra, Jogo jogo) {
		this.letra = letra;
		this.jogo = jogo;
	}

	public String getLetra() {
		return letra;
	}	
	
	public void jogar() {
		Scanner input = new Scanner(System.in);
		int i, j;
		boolean validar;
		do {
			System.out.println("Vez de "+this.letra+"\ndigite a linha:");
			i = input.nextInt();
			System.out.println("Digite a coluna: ");
			j = input.nextInt();
			if(jogo.verficarPosicaoVazia(i, j)) {
				jogo.grade[i][j] = this.letra;		
				validar = true;
			}else {
				validar = false;
				System.out.println("Posicao prenchida ou inexistente");
			}
		}while(validar==false);	
			
	}
}
