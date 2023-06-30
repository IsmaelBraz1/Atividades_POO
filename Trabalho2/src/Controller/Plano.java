package Controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Plano {
	private int nBugs;
	private int nAlunos;
	private ArrayList<Celula> listaCelulas;
	private ArrayList<Integer> celulasComBug;
	private ArrayList<Integer> celulasComAluno;

	public Plano() {
		nBugs = 20;
		nAlunos = 20;
		listaCelulas = new ArrayList<Celula>();
		celulasComBug = new ArrayList<Integer>();
		celulasComAluno = new ArrayList<Integer>();
		for (int i = 0; i < 64; i++) {
			listaCelulas.add(new Celula(i));
		}
		sortearAlunos(listaCelulas.size());
		sortearBugs(listaCelulas.size());
	}
	
	public ArrayList<Celula> getListaCelulas() {
		return listaCelulas;
	}

	private void sortearBugs(int tamanho) {
		Random random = new Random();
		int celulaSorteada;
		for (int i = 0; i < nBugs;) {
			celulaSorteada = random.nextInt(tamanho - 1);
			if (listaCelulas.get(celulaSorteada).getAluno() == false) {
				listaCelulas.get(celulaSorteada).setBug(true);
				celulasComBug.add(celulaSorteada);
				i++;
			}
		}
	}

	private void sortearAlunos(int tamanho) {
		Random random = new Random();
		int celulaSorteada;
		for (int i = 0; i < nAlunos;) {
			celulaSorteada = random.nextInt(tamanho - 1);
			if (listaCelulas.get(celulaSorteada).getBug() == false) {
				listaCelulas.get(celulaSorteada).setAluno(true);
				celulasComAluno.add(celulaSorteada);
				i++;
			}
		}
	}

	public ArrayList<Integer> getCelulasComBug() {
		return celulasComBug;
	}

	public ArrayList<Integer> getCelulasComAluno() {
		return celulasComAluno;
	}

	
}
