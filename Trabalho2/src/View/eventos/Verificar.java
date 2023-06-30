package View.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Controller.Rodadas;
import View.Tabuleiro;

public class Verificar implements ActionListener {
	JLabel pontos;
	JLabel rob1pts, rob2pts, rob3pts,nbug,nalu;
	Rodadas rodada;
	public Verificar(JLabel pontos, JLabel rob1pts, JLabel rob2pts, JLabel rob3pts, JLabel nbug, JLabel nalu,Rodadas rodada) {
		this.pontos = pontos;
		this.rob1pts = rob1pts;
		this.rob2pts = rob2pts;
		this.rob3pts = rob3pts;
		this.nalu = nalu;
		this.nbug = nbug;
		this.rodada = rodada;
	}

	public void actionPerformed(ActionEvent e) {
		rodada.verificarCelula();
		pontos.setText(""+rodada.relatorio.pontosJogador());
		rob1pts.setText(""+rodada.relatorio.pontosRobo1());
		rob2pts.setText(""+rodada.relatorio.pontosRobo2());
		rob3pts.setText(""+rodada.relatorio.pontosRobo3());
		nalu.setText(""+rodada.relatorio.qtdAluno());
		nbug.setText(""+rodada.relatorio.qtdBugs());
		if(rodada.fimDeJogo()) {
			JOptionPane.showMessageDialog(null, "Parabens! Você conseguiu resgatar todos os alunos!");
		}
	}
}
