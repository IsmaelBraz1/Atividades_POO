package Laboratorio2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Atualizar extends JPanel{
	private JTextField inpMatricula;
	private JTextField inpVertente;
	private JLabel matricula;
	private JLabel vertente;
	private JButton bAtualizar;
	public Atualizar() {
		this.setLayout(new GridLayout(5,3));
		inpMatricula = new JTextField();
		inpVertente = new JTextField();
		matricula =  new JLabel("Matricula: ");
		vertente = new JLabel("Vertente: ");
		bAtualizar = new JButton("ATUALIZAR");
		
		this.add(matricula);
		this.add(inpMatricula);
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(vertente);
		this.add(inpVertente);
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(bAtualizar);
		this.setVisible(false);
	}
}
