package TerceiraLista;
import java.util.Scanner;
public class Exercicio01 {
	
	public static int somatorio(int vet[]) {
		int soma = 0;
		for(int i = 2; i < vet.length -2; i++) {
		soma = vet[i]+soma;
		}
		return soma;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size;
		int vet[];
		System.out.println("Digite o tamanho do vetor");
		size = input.nextInt();
		vet = new int[size];
		for(int i = 0; i < vet.length; i++) {
			System.out.println(i+"º posição: ");
			vet[i] = input.nextInt();
		}
		
		System.out.println(somatorio(vet));
	}

}
