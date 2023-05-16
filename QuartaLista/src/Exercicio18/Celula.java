package Exercicio18;


public class Celula {

	public int posicaoX;
	public int posicaoY;
	public int id;
	public String moeda;
	public Robo robo;	
	public String icone;
	
	public Celula(int id, int x , int y) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		robo = null;
		moeda = null;
		icone = "*";
	}
}


