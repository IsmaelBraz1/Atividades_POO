package TecProg;

import java.util.ArrayList;

public abstract class Cliente  implements Desconto{
	public int matricula;
	public String nome;
	public double tps;
	public int qtdPubli;
	public ArrayList<RegistroEmprestimo> emprestimos;
	public String tipo;
	public Cliente(int matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
		this.tps = 0;
		this.qtdPubli = 0;
		this.emprestimos = new ArrayList<RegistroEmprestimo>();
	}
	
	public void newEmprestimo(RegistroEmprestimo registroEmprestimo) {
		emprestimos.add(registroEmprestimo);
	}
	public String retornarEmprestimos() {
		String obras="";
		for(RegistroEmprestimo obra : emprestimos) {
			obras += obra.publicacao.titulo+"; ";
		}
		return obras;
	}
	
	public String dadosCliente() {
		return "Nome: " + this.nome +"\nMatricula: "+this.matricula+ "\nObras emprestadas:\n"+this.retornarEmprestimos()+"\nTps: "+this.tps;
	}
}
