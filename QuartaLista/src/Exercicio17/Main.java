package Exercicio17;
public class Main {
	
	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		Jogador jogador1 = new Jogador("X", jogo);
		Jogador jogador2 = new Jogador("O", jogo);
		int i=0, vencedor;
		jogo.retornarGrade();
		System.out.println("\n\n");
		do{
			if(i%2 == 0) {
				jogador1.jogar();
			}else if(i%2 != 0) {
				jogador2.jogar();
			}
			System.out.println("\n\n");
			jogo.retornarGrade();
			vencedor = jogo.verificarVencedor();
			
			if(vencedor == 1) {
				System.out.println(jogador1.getLetra()+ " Venceu!");
			}else if(vencedor == 2) {
				System.out.println(jogador2.getLetra()+ " Venceu!");
			}else if(vencedor == 3) {
				System.out.println("O jogo empatou");
			}
			
			i++;
		}while(vencedor == 0);
	}

	
}
