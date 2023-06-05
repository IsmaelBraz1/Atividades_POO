package Laboratorio2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class Principal extends JFrame{
	public JPanel Menu;
	public JPanel exibir;
	public JPanel cadastro;
	
	public Principal() {
		this.setSize(700, 700);
		this.setLocationRelativeTo(null);
		this.setTitle("Cadastro");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(2,1));
		
		Menu = newPainel(Color.white);
		//exibir = newPainel(Color.red);
		cadastro = newPainel(Color.white);
		cadastro.setVisible(false);
		JButton bCadastro = newBotao(Color.cyan, "CADASTRAR");
		JButton bListar = newBotao(Color.cyan, "LISTAR");
		JButton bAtualizar = newBotao(Color.cyan, "ATUALIZAR");
		JButton bDeletar = newBotao(Color.cyan, "DELETAR");
		
		Menu.add(bCadastro);
		Menu.add(bListar);
		Menu.add(bAtualizar);
		Menu.add(bDeletar);
		
		//exibir.add(new JLabel("vazio"));
		cadastro.add(new JLabel("cad"));
		
		bCadastro.addActionListener(new Cadastrar(cadastro));
		
		this.add(Menu, BorderLayout.NORTH);
		this.add(cadastro, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	public JPanel newPainel(Color c) {
		JPanel painel = new JPanel();
		painel.setBackground(c);
		return painel;
	}
	
	public JButton newBotao(Color c, String nome) {
		JButton botao = new JButton(nome);
		botao.setBackground(c);
		return botao;
	}
	
	private class Ocultar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
		}
	}
	
	private class Cadastrar implements ActionListener{
		
		JPanel painel;
		
		public Cadastrar(JPanel cadastro) {
			painel = cadastro;
		}
		
		public void actionPerformed(ActionEvent e) {
			painel.setVisible(true);
		}
	}
	private class Listar implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}
}
