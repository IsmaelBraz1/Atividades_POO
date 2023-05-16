package Exercicio06;

public class IngressoVIP extends Ingresso{
	protected int valorAdicional;
	
	public IngressoVIP() {
		super();
		tipo = "vip";
		this.valorAdicional = 5;
		this.valor = valor + this.valorAdicional;
	}

	public String toString() {
		return "valor do ingresso Vip:"+this.valor;
	}


	
}
