package View.eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.ListaJogadores;
import Model.Salvar;

public class Jogar implements ActionListener {
	String nome;
	JPanel panel, tabela;
	JTextField inputNome;
	public Jogar(JTextField inputNome,String nome, JPanel painel, JPanel tabela) {
		this.panel = painel;
		this.tabela = tabela;
		this.nome = nome;
		this.inputNome = inputNome;
	}

	public void actionPerformed(ActionEvent e) {
		this.nome = inputNome.getText();
		if (nome.length() > 0) {
			ListaJogadores lista = new ListaJogadores();
			lista.SalvarNome(nome);
			tabela.setVisible(false);
			panel.setVisible(true);
		}
	}
}