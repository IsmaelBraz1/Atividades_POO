package Controller;

import java.util.ArrayList;

import Model.*;

public class ListaJogadores {
	private ArrayList<Jogador> listaJogadores;
	private String nomeJogador;
	private LerDados ler;

	public ListaJogadores() {
		ler = new LerDados();
		listaJogadores = ler.getLista();
		this.nomeJogador = ler.nome();
	}

	public void addJogador(Jogador jogador) {
		listaJogadores.add(jogador);
		Salvar save = new Salvar();
		save.SalvarDados("Dados/dados.txt", formatarDados(), true);
	}
	public void SalvarNome(String nome) {
		Salvar save = new Salvar();
		save.SalvarDados("Dados/nome.txt", nome, false);
	}

	public String[] dadosParaTabela(int i) {
		String[] dados;
		try {
			dados = ler.getLinha().get(i).split(";");
			return dados;
		} catch (Exception e) {
			
		}
		return null;
		
	}

	public String formatarDados() {
		String saida = "";
		for (Jogador jogador : listaJogadores) {
			saida += jogador.getNome() + "; " + jogador.getnRodadas() + "; " + jogador.getnBugs() + "; "
					+ jogador.getnAlunos() + "; " + jogador.getCelVazias() + "; " + jogador.getPtsRobo1() + "; "
					+ jogador.getPtsRobo2() + "; " + jogador.getPtsRobo3() + "; " + jogador.getPontos() + "\n";
		}
		return saida;
	}

	public ArrayList<Jogador> getListaJogadores() {
		return listaJogadores;
	}

}
