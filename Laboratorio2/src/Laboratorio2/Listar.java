package Laboratorio2;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
public class Listar extends JPanel{
	JButton label;
	JTable tabela;
	JScrollPane scrollPane;
	public Listar() {
		
		label = new JButton("Listar");
		String[] colunas = {"Nome", "CPF", "Matricula", "Vertente"};
		Object[][] dados = {{"Nome", "CPF", "Matricula", "Vertente"}, {"Linha 2", "Linha 2", "Linha 2", "Linha 2"}, {"Linha 2", "Linha 2", "Linha 2", "Linha 2"}, {"Linha 2", "Linha 2", "Linha 2", "Linha 2"}};
		tabela = new JTable(dados, colunas);
		scrollPane = new JScrollPane(tabela);
		this.add(tabela);
		//this.add(label);
		this.setVisible(false);
	}
}
