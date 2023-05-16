package Exercicio02;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salarioMes;
	
	public Empregado(String nome, String sobrenome, double SalarioMes) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMes = SalarioMes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public float getSalarioMes() {
		return (float) salarioMes;
	}

	public void setSalarioMes(double salarioMes) {
		if(salarioMes < 0) {
			this.salarioMes = 0;
		}else {
			this.salarioMes = salarioMes;
		}
	}
	
	
}
