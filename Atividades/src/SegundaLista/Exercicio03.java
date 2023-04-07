package SegundaLista;
import java.util.Scanner;
public class Exercicio03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int number = 0;
		
		while(number != 77) {
			System.out.println("Adivinhe um numero entre 1 e 100: ");
			number = ler.nextInt();
			if(number > 77) {
				System.out.println("O numero correto é menor que "+ number);
			}else if(number < 77) {
				System.out.println("O numero correto é maior que "+ number);
			}
		
		}
		System.out.println("Parabens voce acertou!");
	}
}
