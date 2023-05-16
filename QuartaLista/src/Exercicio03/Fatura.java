package Exercicio03;

public class Fatura {

	private int numero;
	private String descricao;
	private int qtdComprada;
	private double valorUni;
	private double faturaTotal;
	
	public Fatura(int numero, String descricao, int qtdComprada, double valorUni) {
		this.setNumero(numero);
		this.setDescricao(descricao); 
		this.setQtdComprada(qtdComprada); 
		this.setValorUni(valorUni); 
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdComprada() {
		return qtdComprada;
	}

	public void setQtdComprada(int qtdComprada) {
		if(qtdComprada < 0) {
			this.qtdComprada = 0;
		}else {
			this.qtdComprada = qtdComprada;
		}
	}

	public double getValorUni() {
		return valorUni;
	}

	public void setValorUni(double valorUni) {
		if(valorUni < 0) {
			this.valorUni = 0.0;
		}else {
			this.valorUni = valorUni;
		}
		
	}

	public void setFaturaTotal(double faturaTotal) {
		this.faturaTotal = faturaTotal;
	}
	
	public double getValorFatura(int qtdComprada, double valorUni) {
		this.faturaTotal = (qtdComprada*valorUni);
		return this.faturaTotal;
	}
	
	public void Desconto(int desconto) {
		setValorUni(this.valorUni - this.valorUni*(desconto/100));
	}
}

