package Laboratorio2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Cadastrar extends JPanel{

	private JTextField inpNome;
	private JTextField inpCpf;
	private JTextField inpMatricula;
	private JTextField inpVertente;
	private JLabel nome;
	private JLabel cpf;
	private JLabel matricula;
	private JLabel vertente;
	private JButton bCadastrar;
	public Cadastrar() {
		
		this.setLayout(new GridLayout(9,3));
		inpNome = new JTextField();
		inpCpf = new JTextField();
		inpMatricula = new JTextField();
		inpVertente = new JTextField();
		nome = new JLabel("Nome: ");
		cpf = new JLabel("CPF: ");
		matricula =  new JLabel("Matricula: ");
		vertente = new JLabel("Vertente: ");
		bCadastrar = new JButton("CADASTRAR");
	
		this.add(nome);
		this.add(inpNome);
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(cpf);
		this.add(inpCpf);
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
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
		this.add(bCadastrar);
		this.setVisible(false);
	}
}
