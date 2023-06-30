package View.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MostrarRelatorio implements ActionListener {
	JPanel central, tabela;
	public MostrarRelatorio(JPanel central, JPanel tabela) {
		this.central = central;
		this.tabela = tabela;
	}

	public void actionPerformed(ActionEvent e) {
		central.setVisible(false);
		tabela.setVisible(true);

	}

}

