package View;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Controller.*;
public class TelaPrincipal extends JFrame{
	Rodadas rodada;
	public TelaPrincipal() {
		this.setSize(1000, 700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.rodada =  new Rodadas();
		JPanel Central = new JPanel();
		Central.setLayout(new BorderLayout());
		JPanel subCentral = new JPanel();
		subCentral.setLayout(new BorderLayout());
		Tabuleiro tabuleiro = new Tabuleiro(this.rodada);
		Menu menu = new Menu(this.rodada, tabuleiro, this);
		subCentral.add(menu, BorderLayout.EAST);
		subCentral.add(tabuleiro, BorderLayout.CENTER);
		subCentral.setVisible(false);
		Tabela table = new Tabela(subCentral);
		table.setVisible(false);
		Central.add(subCentral);
		Central.add(table);
		Central.setLayout(new BoxLayout(Central,1));
		Central.setVisible(true);
		BarraSuperior barraSup = new BarraSuperior(subCentral, table);
		this.add(barraSup, BorderLayout.NORTH);
		this.add(Central, BorderLayout.CENTER);
		this.setVisible(true);
	}
}
