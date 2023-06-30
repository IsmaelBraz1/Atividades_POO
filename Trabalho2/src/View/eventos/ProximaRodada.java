package View.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Controller.Rodadas;

public class ProximaRodada  implements ActionListener {
	JButton robo1, robo2, robo3;
	Rodadas rodada;
	public ProximaRodada(JButton robo1, JButton robo2, JButton robo3, Rodadas rodada) {
		this.robo1 = robo1;
		this.robo2 = robo2;
		this.robo3 = robo3;
		this.rodada = rodada;
	}

	public void actionPerformed(ActionEvent e) {
		rodada.proximaRodada();
		robo1.setEnabled(true);
		robo2.setEnabled(true);
		robo3.setEnabled(true);
	}
}
