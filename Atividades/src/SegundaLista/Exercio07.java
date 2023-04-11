package SegundaLista;
import java.util.Scanner;
public class Exercio07 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int number, primo, aux,i=3;
		System.out.println("digite um numero: ");
		number = ler.nextInt();
		aux = number -1;
		while(aux >=2) {
			if(aux == 2) {
				primo = aux;
				aux = 0;
				System.out.println(primo);
			}else if(aux%2 != 0) {
					while(aux%i != 0) {
						i=i+2;
					}
					if(aux == i) {
						primo = aux;
						aux = 0;
						System.out.println(primo);
					}else {
						aux = aux-2;
					}
				}else {
					aux--;
				}
		}
	}
}
