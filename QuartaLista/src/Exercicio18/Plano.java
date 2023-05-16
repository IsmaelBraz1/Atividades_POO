package Exercicio18;

import java.util.ArrayList;
import java.util.Random;

public class Plano {

	public ArrayList<Celula> listaCelulas;
	public int tamanhoX;
	public int tamanhoY;

	public Plano(int tamanhoX, int tamanhoY) {
		listaCelulas = new ArrayList<Celula>();
		this.tamanhoX = tamanhoX;
		this.tamanhoY = tamanhoY;
		int contador = 1;
		for (int j = 1; j <= tamanhoY; j++) {
			for (int i = 1; i <= tamanhoX; i++) {
				Celula celula = new Celula(contador, i, j);
				listaCelulas.add(celula);
				contador++;
			}
		}
	}

	public void sortearMoeda() {
		Random random = new Random();
		int posicaoSorteada = random.nextInt(listaCelulas.size());
		listaCelulas.get(posicaoSorteada).moeda = "$";
		listaCelulas.get(posicaoSorteada).icone = "$";
	}

	public void mapa() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			System.out.print("  " + listaCelulas.get(i).icone + "  ");
			if (listaCelulas.get(i).posicaoX == tamanhoX)
				System.out.println("\n");
		}
	}
	
	public boolean VerificarMoeda(Celula posicao) {
		if (posicao.robo != null) {
			if (posicao.moeda != null) {
				posicao.robo.moeda++;
				return true;
			}
		}
		return false;
	}

}
