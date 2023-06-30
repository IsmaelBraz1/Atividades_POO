package Controller;

public class Jogador {
	private String nome;
	private int nRodadas;
	private int nBugs;
	private int nAlunos;
	private int celVazias;
	private int ptsRobo1;
	private int ptsRobo2;
	private int ptsRobo3;
	private int pontos;
	
	public Jogador(String nome, int nRodadas, int nBugs, int nAlunos, int celVazias, int ptsRobo1, int ptsRobo2,int ptsRobo3, int pontos) {
		this.nome = nome;
		this.nRodadas = nRodadas;
		this.nBugs = nBugs;
		this.nAlunos = nAlunos;
		this.celVazias = celVazias;
		this.ptsRobo1 = ptsRobo1;
		this.ptsRobo2 = ptsRobo2;
		this.ptsRobo3 = ptsRobo3;
		this.pontos = pontos;
	}
	public Jogador(String nome) {
		this.nome = nome;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getnRodadas() {
		return nRodadas;
	}

	public void setnRodadas(int nRodadas) {
		this.nRodadas = nRodadas;
	}

	public int getnBugs() {
		return nBugs;
	}

	public void setnBugs(int nBugs) {
		this.nBugs = nBugs;
	}

	public int getnAlunos() {
		return nAlunos;
	}

	public void setnAlunos(int nAlunos) {
		this.nAlunos = nAlunos;
	}

	public int getCelVazias() {
		return celVazias;
	}

	public void setCelVazias(int celVazias) {
		this.celVazias = celVazias;
	}

	public String getNome() {
		return nome;
	}

	public int getPtsRobo1() {
		return ptsRobo1;
	}

	public void setPtsRobo1(int ptsRobo1) {
		this.ptsRobo1 = ptsRobo1;
	}

	public int getPtsRobo2() {
		return ptsRobo2;
	}

	public void setPtsRobo2(int ptsRobo2) {
		this.ptsRobo2 = ptsRobo2;
	}

	public int getPtsRobo3() {
		return ptsRobo3;
	}

	public void setPtsRobo3(int ptsRobo3) {
		this.ptsRobo3 = ptsRobo3;
	}
	
	
}
