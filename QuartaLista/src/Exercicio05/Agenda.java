package Exercicio05;

import java.util.ArrayList;

public class Agenda {
	
	private String nome;
	private String descricao;
	public ArrayList<Contato> lista = new ArrayList<Contato>();
	
	public void addContato(Contato contato) {
		lista.add(contato);
	}
	
	public void duplicarContato(Contato contato){
		lista.add(contato);
	}
	public Contato buscarContato(int codigo) {
		for (Contato contato : lista) {
			if (contato.getCodigo() == codigo) {
				return contato;
			}
			
		}
		return null;
	}
}
