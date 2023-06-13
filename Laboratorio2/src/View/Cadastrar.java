package View;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
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
	private String inome;
	private String icpf;
	private String imatricula;
	private String ivertente;
	protected ListaClientes lista;
	public Cadastrar(ListaClientes lista) {
		this.lista = lista;
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
		bCadastrar.addActionListener(new salvarCadastro());
		
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
	
	private class salvarCadastro implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			inome = inpNome.getText();
			icpf = inpCpf.getText();
			imatricula = inpMatricula.getText();
			ivertente = inpVertente.getText();
			Cliente cliente = new Cliente(inome, icpf, imatricula, ivertente);
			lista.addCliente(cliente);
			/*Dados dados = new Dados();
			dados.escrever("Controller/Clientes.txt", lista.formatarDados());*/
		}
		
	}
}
