package Laboratorio2;

import java.awt.BorderLayout;
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
	protected JButton bDEl;
	protected JPanel menu;
	protected JPanel cadastro;
	protected JPanel listar;
	protected ArrayList<JPanel> paineis;
	protected JPanel painelGeral;
	public Principal() {
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout(2, 1));
		
		menu = new JPanel();
		cadastro = new Cadastrar();
		listar = new Listar();
		painelGeral = new JPanel();
		painelGeral.setLayout(new GridBagLayout());
		painelGeral.add(cadastro);
		painelGeral.add(listar);
		paineis = new ArrayList<JPanel>();
		paineis.add(0, cadastro);
		paineis.add(1, listar);
		
		bCad = new JButton("Cadastrar");
		bCad.addActionListener(new showPaineis(0));
		bList = new JButton("Listar");
		bList.addActionListener(new showPaineis(1));
		bAtl = new JButton("Atualizar");
		bDEl = new JButton("Deletar");
		
		menu.add(bCad);
		menu.add(bList);
		menu.add(bAtl);
		menu.add(bDEl);

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
