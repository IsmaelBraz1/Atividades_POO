package SegundaLista;
//import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio09 {
	
	public static int fatorial(int fat) {
		if(fat == 2) {
			return 2;
		}else {
			return fat*fatorial(fat-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int qtd;
		System.out.println("digite a quantidade de caracteres");
		qtd = ler.nextInt();
		char palavra[] = new char[qtd];
		char palavraX[] = new char[qtd];
		char aux1, aux2;
		
		System.out.println("digite um caracter por vez: ");
		for(int i = 0; i < palavra.length; i++) {
			palavra[i] = ler.next().charAt(0);
			palavraX[i] = palavra[i];
		}
		
		System.out.println("Todas as permutações possiveis são: ");
		System.out.println(fatorial(qtd));
		for(int a = 0; a < qtd; a++) {
		for(int i = 0, j = 1; i < palavra.length && j < palavra.length; i++, j++) {
			
				aux1 = palavra[a];
				aux2 = palavra[i];
				palavra[j] = aux1;
				palavra[i] = aux2;

				for(int k = 0; k < palavra.length; k++) {
					System.out.print(palavra[k]);
				}
				System.out.print("\n");
			}
		}
	}
}
