package SegundaLista;
import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i=1, number = 0;
		System.out.println("digite um numero");
		number = ler.nextInt();
		
		while(i<=10) {
			System.out.println(number + " x " + i + " = " + number*i);
			i++;
		}

	}

}
