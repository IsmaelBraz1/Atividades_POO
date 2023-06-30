package Controller;

import java.util.ArrayList;

public class Rodadas {
	public Plano plano;
	public ArrayList<Robo> listaRobos;
	public Robo robo1;
	public Robo robo2;
	public Robo robo3;
	public ArrayList<Integer> celulasDaRodada;
	public ArrayList<Integer> robosRodada;
	public Relatorio relatorio;
	public int numRodadas = 1;

	public Rodadas() {
		plano = new Plano();
		celulasDaRodada = new ArrayList<Integer>();
		robosRodada = new ArrayList<Integer>();
		listaRobos = new ArrayList<Robo>();
		relatorio = new Relatorio(this);
		robo1 = new Robo(1);
		robo2 = new Robo(2);
		robo3 = new Robo(3);
		listaRobos.add(robo1);
		listaRobos.add(robo2);
		listaRobos.add(robo3);
	}

	public void setRobo(int robo) {
		robosRodada.add(robo);
	}

	public void setCelula(int celula) {
		celulasDaRodada.add(celula);
	}

	public void proximaRodada() {
		numRodadas++;
		robosRodada.clear();
		celulasDaRodada.clear();
	}

	public void verificarCelula() {
		for (int i = 0; i < robosRodada.size(); i++) {
			Robo roboAux = listaRobos.get(robosRodada.get(i));
			Celula celulaAux = plano.getListaCelulas().get(celulasDaRodada.get(i));
			temAluno(celulaAux, roboAux);
			temBug(celulaAux, roboAux);
			celulaAux.setCelulaVisitada(true);
		}
	}

	public void temAluno(Celula celula, Robo robo) {
		if (celula.getAluno()) {
			robo.setnAlu(robo.getnAlu() + 1);
			robo.setPontos(robo.getPontos() + 10);
			celula.setAluno(false);
		}
	}

	public void temBug(Celula celula, Robo robo) {
		if (celula.getBug()) {
			robo.setnBug(robo.getnBug() + 1);
			robo.setPontos(robo.getPontos() - 15);
			celula.setBug(false);
		}
	}
	
	public boolean fimDeJogo() {
		for(Celula cel:plano.getListaCelulas()) {
			if(cel.getAluno()) 
				return false;
		}
		return true;
	}

	public void salvarRodadas() {
		relatorio.salvarJogador();
	}

}
