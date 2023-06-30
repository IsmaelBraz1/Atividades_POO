package Controller;

import javax.swing.ImageIcon;

public class Celula {
	private int id;
	private boolean bug;
	private boolean aluno;
	private boolean celulaVisitada;
	public Celula(int id) {
		this.id = id;
		this.setAluno(false);
		this.setBug(false);
		this.setCelulaVisitada(false);
	}
	public int getId() {
		return id;
	}
	public boolean getBug() {
		return bug;
	}
	public void setBug(boolean bug) {
		this.bug = bug;
	}
	public boolean getAluno() {
		return aluno;
	}
	public void setAluno(boolean aluno) {
		this.aluno = aluno;
	}
	public boolean getCelulaVisitada() {
		return celulaVisitada;
	}
	public void setCelulaVisitada(boolean celulaVisitada) {
		this.celulaVisitada = celulaVisitada;
	}
}
