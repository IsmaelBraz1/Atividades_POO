package View.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import Controller.Rodadas;

public class Sair implements ActionListener {
	JFrame janela;
	Rodadas rodada;
	public Sair(JFrame janela, Rodadas rodada) {
		this.janela = janela;
		this.rodada = rodada;
	}
	public void actionPerformed(ActionEvent e) {
		rodada.salvarRodadas();
		janela.dispose();
	}

}
