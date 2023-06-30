package Controller;

import Model.*;

public class Relatorio {
	Rodadas rodadas;
	ListaJogadores jogadores;

	public Relatorio(Rodadas rodadas) {
		this.rodadas = rodadas;
		jogadores = new ListaJogadores();
	}

	public int qtdBugs() {
		int nbug = 0;
		for (int i = 0; i < rodadas.listaRobos.size(); i++) {
			nbug += rodadas.listaRobos.get(i).getnBug();
		}
		return nbug;
	}

	public int qtdAluno() {
		int nAlu = 0;
		for (int i = 0; i < rodadas.listaRobos.size(); i++) {
			nAlu += rodadas.listaRobos.get(i).getnAlu();
		}
		return nAlu;
	}

	public int pontosJogador() {
		int pts = 0;
		for (int i = 0; i < rodadas.listaRobos.size(); i++) {
			pts += rodadas.listaRobos.get(i).getPontos();
		}
		return pts;
	}

	public int pontosRobo1() {
		return rodadas.listaRobos.get(0).getPontos();
	}

	public int pontosRobo2() {
		return rodadas.listaRobos.get(1).getPontos();
	}

	public int pontosRobo3() {
		return rodadas.listaRobos.get(2).getPontos();
	}

	public int qtdRodadas() {
		return rodadas.numRodadas;
	}

	public int qtdCelulasVazias() {
		return ((3 * qtdRodadas()) - qtdAluno() - qtdBugs());
	}

	public void salvarJogador() {
		LerDados ler = new LerDados();
		String nome = ler.nome();
		Jogador jogador = new Jogador(nome, qtdRodadas(), qtdBugs(), qtdAluno(), qtdCelulasVazias(), pontosRobo1(),
				pontosRobo2(), pontosRobo3(), pontosJogador());
		jogadores.addJogador(jogador);
	}
}
