package Exercicio02;

public class Main {

	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("Jose", "da Silva", 1200.34);
		Empregado empregado2 = new Empregado("Francisco", "Gomes", 3300.34);
		
		System.out.println("O salario anual de "+empregado1.getNome()+" é: "+ empregado1.getSalarioMes()*12);
		System.out.println("O salario anual de "+empregado2.getNome()+" é: "+ empregado2.getSalarioMes()*12);
		
		empregado1.setSalarioMes((empregado1.getSalarioMes()*1.1));
		empregado2.setSalarioMes((empregado2.getSalarioMes()*1.1));
		
		System.out.println("O salario anual reajustado em 10% de "+empregado1.getNome()+" é: "+ empregado1.getSalarioMes()*12);
		System.out.println("O salario anual reajustado em 10% de "+empregado2.getNome()+" é: "+ empregado2.getSalarioMes()*12);
	}

}
