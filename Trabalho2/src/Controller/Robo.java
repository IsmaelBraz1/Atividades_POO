package Controller;

public class Robo{

	private int id;
	private int pontos;
	private int nAlu;
	private int nBug;
	
	public Robo(int id) {
		this.id = id;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public int getnAlu() {
		return nAlu;
	}
	public void setnAlu(int nAlu) {
		this.nAlu = nAlu;
	}
	public int getnBug() {
		return nBug;
	}
	public void setnBug(int nBug) {
		this.nBug = nBug;
	}
	public int getId() {
		return id;
	}
	
}
