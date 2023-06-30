package View;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import Controller.ListaJogadores;
import Model.LerDados;

import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Tabela extends JPanel {
	JButton voltar;

	public Tabela(JPanel painel) {
		this.setLayout(new BorderLayout());
		String[] colunas = { "Jogador", "Quant. Rodadas", "Bugs encontrados", "Alunos resgatados", "Celuas Vazias",
				"bb8", "C3po", "R2d2", "Pontuação" };
		DefaultTableModel model = new DefaultTableModel(colunas,0);
		JTable table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		this.add(scrollPane, BorderLayout.CENTER);
		ListaJogadores lista = new ListaJogadores();
		preencherTabela(lista, model);
		voltar = new JButton("Voltar");
		voltar.addActionListener(new voltar(this));
		this.add(voltar, BorderLayout.SOUTH);
	}

	public void preencherTabela(ListaJogadores lista, DefaultTableModel model) {
		int i = 0;
		boolean verifica = false;
		do {
			if (lista.dadosParaTabela(i) != null) {
				model.addRow(lista.dadosParaTabela(i));
				i++;
				verifica = true;
			} else {
				verifica = false;
			}
		} while (verifica);
	}

	private class voltar implements ActionListener {
		JPanel este;
		public voltar(JPanel este) {
			this.este = este;
		}
		public void actionPerformed(ActionEvent e) {
			este.setVisible(false);
		}

	}

}
