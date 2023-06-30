package View.eventos;
import View.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.Rodadas;

public class acionarRobo implements ActionListener{
	JButton roboButton;
	int roboId;
	Tabuleiro tabu;
	Rodadas rodada;
	public acionarRobo(JButton robo, int robId, Tabuleiro tabu, Rodadas rodada) {
		this.roboButton = robo;
		this.roboId = robId;
		this.tabu = tabu;
		this.rodada = rodada;
	}

	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 64; i++) {
			if (tabu.celulas.get(i).getBackground() == Color.LIGHT_GRAY)
				tabu.celulas.get(i).setEnabled(false);
			else
				tabu.celulas.get(i).setEnabled(true);
		}
		roboButton.setEnabled(false);
		rodada.setRobo(roboId);
	}
}

