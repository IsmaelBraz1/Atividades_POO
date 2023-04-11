package SegundaLista;
import java.util.Scanner;
public class Exercicio06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][];
		int matrizT[][];
		int linha = 0, coluna =0, simetrica = 0;
		
		System.out.println("digite o numero de linhas: ");
		linha = ler.nextInt();
		System.out.println("digite o numero de colunas: ");
		coluna = ler.nextInt();
		
		matriz = new int[linha][coluna];
		matrizT = new int[coluna][linha];
		
		
		if (linha == coluna) {
			for(int i = 0; i < linha; i ++) {
				for(int j = 0; j < coluna; j++) {
					System.out.println("diite o numero da posição ("+i+","+j+")");
					matriz[i][j] = ler.nextInt();
					matrizT[j][i] = matriz[i][j];
				}
			}
			for(int i = 0; i < linha; i ++) {
				for(int j = 0; j < coluna; j++) {
					if(matriz[i][j] == matrizT[i][j]) {
						simetrica++;
					}
				}
			}
			if(simetrica == (linha*coluna)) {
				System.out.println("A matriz é simétrica");
			}else {
				System.out.println("A matriz é Assimétrica");
			}
		}else {
			System.out.println("A matriz é Assimétrica");
		}
	}
}
