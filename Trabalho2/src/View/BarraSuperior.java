package View;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Controller.*;
import Model.*;
import View.eventos.Jogar;
import View.eventos.MostrarRelatorio;

public class BarraSuperior extends JPanel {
	JLabel LabNome;
	JTextField inputNome;
	String nome = null;
	JButton jogar;
	JButton relatorio;

	public BarraSuperior(JPanel painel, JPanel tabela) {
		this.setLayout(new GridLayout(1, 3, 20, 1));
		LabNome = new JLabel("Nome do Jogador: ");
		inputNome = new JTextField();
		jogar = new JButton("Jogar");
		jogar.addActionListener(new Jogar(inputNome, nome, painel, tabela));
		relatorio = new JButton("Relatorio do jogo");
		relatorio.addActionListener(new MostrarRelatorio(painel, tabela));
		this.add(LabNome);
		this.add(inputNome);
		this.add(jogar);
		this.add(relatorio);
	}

}
