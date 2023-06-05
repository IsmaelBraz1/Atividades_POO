package robo;

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

	public void posicaoRobo() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			Celula aux = listaCelulas.get(i);
			if (listaCelulas.get(i).robo != null) {
				//return true;
				System.out.println(aux.robo.nome + " x: " + aux.posicaoX + " y: " + aux.posicaoY);
			}
		}
	}

	public int retornarCelula(int x, int y) {

		for (int i = 0; i < listaCelulas.size(); i++) {
			if (listaCelulas.get(i).posicaoX == x && listaCelulas.get(i).posicaoY == y) {
				return listaCelulas.get(i).id;
			}
		}
		return -1;
	}

	public void retornarCelulas() {
		for (int i = 0; i < listaCelulas.size(); i++) {
			System.out.println(listaCelulas.get(i).imprimir());
		}
	}
	
	public void sortearMoeda() {
		Random random = new Random();
		int posicaoSorteada = random.nextInt(listaCelulas.size());
		listaCelulas.get(posicaoSorteada).moeda = "$";
	}

}
