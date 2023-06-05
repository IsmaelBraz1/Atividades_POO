package Laboratorio2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal extends JFrame {
	protected JButton bCad;
	protected JButton bList;
	protected JButton bAtl;
	protected JButton bDel;
	protected JPanel menu;
	protected JPanel cadastro;
	protected JPanel listar;
	protected JPanel atualizar;
	protected JPanel deletar;
	protected ArrayList<JPanel> paineis;
	protected JPanel painelGeral;
	public Principal() {
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(2, 1));
		
		menu = new JPanel();
		menu.setBackground(Color.gray);
		painelGeral = new JPanel();
		painelGeral.setLayout(new GridBagLayout());
		
		cadastro = new Cadastrar();
		listar = new Listar();
		atualizar = new Atualizar();
		deletar = new Deletar();
		
		painelGeral.add(cadastro);
		painelGeral.add(listar);
		painelGeral.add(atualizar);
		painelGeral.add(deletar);
		
		paineis = new ArrayList<JPanel>();
		paineis.add(0, cadastro);
		paineis.add(1, listar);
		paineis.add(2, atualizar);
		paineis.add(3, deletar);
		
		bCad = new JButton("Cadastrar");
		bCad.addActionListener(new showPaineis(0));
		bList = new JButton("Listar");
		bList.addActionListener(new showPaineis(1));
		bAtl = new JButton("Atualizar");
		bAtl.addActionListener(new showPaineis(2));
		bDel = new JButton("Deletar");
		bDel.addActionListener(new showPaineis(3));
		
		menu.add(bCad);
		menu.add(bList);
		menu.add(bAtl);
		menu.add(bDel);

		this.add(menu, BorderLayout.NORTH);
		this.add(painelGeral, BorderLayout.CENTER);
		
		this.setVisible(true);
	}

	private class showPaineis implements ActionListener {
		int indice;
		public showPaineis(int indice) {
			this.indice = indice;
		}
		public void actionPerformed(ActionEvent e) {
			for(int i = 0; i<paineis.size(); i++) {
				paineis.get(i).setVisible(false);
			}
			
			if(paineis.get(indice).isVisible())
				paineis.get(indice).setVisible(false);
			else
				paineis.get(indice).setVisible(true);
		}

	}

}
