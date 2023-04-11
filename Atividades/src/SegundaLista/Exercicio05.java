package SegundaLista;
import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int limiteE, limiteD;
		System.out.println("Insira um numero para o limite superior direito: ");
		limiteD = ler.nextInt();
		System.out.println("Insira um numero para o limite superior esquerdo: ");
		limiteE = ler.nextInt();
		
		for(int E = 0; E <= limiteE ;E++) {
			for(int D = 0; D <= limiteD ;D++) {
				System.out.println(E+" - "+D);
			}
		}
	}

}
