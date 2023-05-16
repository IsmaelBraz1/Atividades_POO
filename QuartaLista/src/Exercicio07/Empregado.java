package Exercicio07;

public abstract class Empregado {
	
	protected String nome;
	protected int salario;
	public Empregado(String nome, int salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "Nome: "+this.nome+" Salario: "+this.salario;
	}
	
}
