package Exercicio06;

public class Ingresso {
	protected int valor;
	protected String tipo;

	public Ingresso() {
		this.valor = 10;
		this.tipo = "padrao";
	}
	
	public String toString() {
		return "valor do ingresso:"+this.valor;
	}

}
