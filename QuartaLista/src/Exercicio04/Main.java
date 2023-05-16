package Exercicio04;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int quantidade = 0;
		Produto produto = new Produto("Fone", 25.0, 450);
		System.out.println("digite a quantidade que deseja comprar: ");
		quantidade = input.nextInt();
		produto.ComprarProduto(quantidade);
	}

}
