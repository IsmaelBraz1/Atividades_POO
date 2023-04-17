package TerceiraLista;

import java.util.Scanner;

public class Exercicio02 {

	public static double media(int vetA[], int vetB[]) {
		int soma = 0;
		for(int i = 0; i < vetA.length; i++) {
		soma = vetA[i]+vetB[i]+soma;
		}
		return (soma/(vetA.length + vetB.length));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		int vetA[] = new int[4];
		int vetB[] = new int[4];
		
		for(int i = 0; i < vetA.length; i++) {
			vetA[i] = i*2;
			vetB[i] = i*3;
		}
		
		System.out.println(media(vetA, vetB));
	}

}
