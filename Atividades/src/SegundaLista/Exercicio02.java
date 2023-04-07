package SegundaLista;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		int number = 0, soma = 0;
		Scanner ler = new Scanner(System.in);
		while(number >=0) {
			soma = soma+number;
			System.out.println("digite um número: ");
			number = ler.nextInt();
		}
		System.out.println("A soma dos numeros é: "+soma);
	}
}
