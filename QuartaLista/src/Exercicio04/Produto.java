package Exercicio04;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if(quantidade >= 0)
		this.quantidade = quantidade;
	}
	
	private double Desconto(double ValorCompra) {
		if(ValorCompra > 100.0 && ValorCompra <= 200.0) {
			return ValorCompra*0.1;
		}else
		if(ValorCompra > 200.0 && ValorCompra <= 500) {
			return ValorCompra*0.2;
		}
		if(ValorCompra > 500.0) {
			return ValorCompra*0.25;
		}else {
			return 0;
		}
	}
	
	public void ComprarProduto(int quantidade) {
		if(this.quantidade > 0 && quantidade >=0 && (this.quantidade - quantidade) >= 0) {
			setQuantidade(this.quantidade - quantidade);
			System.out.println("Produto: "+ getNome() + "\nValor da compra: "+ (quantidade*preco - Desconto(quantidade*preco)));
		}else {
			System.out.println("Não foi possivel realizar a compra.");
		}
	}
	
}
