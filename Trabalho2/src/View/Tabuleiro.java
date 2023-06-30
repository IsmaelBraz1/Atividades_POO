package View;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import Controller.*;
public class Tabuleiro extends JPanel{
	
	public ArrayList<JButton> celulas;
	Rodadas rodada;
	public Tabuleiro(Rodadas rodada) {
		this.rodada = rodada;
		this.setSize(600,600);
		this.setLayout(new GridLayout(8,8));
		
		celulas = new ArrayList<JButton>();
		for (int i = 0; i < 8; i++) {
		    for (int j = 0; j < 8; j++) {
		    	celulas.add(criarCelula(i,j));
		    }
		}	
		for(int i = 0;i<64;i++) {
			celulas.get(i).addActionListener(new escolherCelula(i));
			this.add(celulas.get(i));
		}
		this.setVisible(true);
	}
	
	public JButton criarCelula(int i, int j) {
		JButton celula = new JButton();
		celula.setEnabled(false);
		if((i+j)%2 == 0) 
			celula.setBackground(Color.white);
		else
			celula.setBackground(Color.darkGray);
		return celula;
		
	}
	
	private class escolherCelula implements ActionListener{
		int cel;
		public escolherCelula(int celula) {
			cel = celula;
		}
		public void actionPerformed(ActionEvent e) {
			for(int i = 0;i<64;i++) {
				celulas.get(i).setEnabled(false);	
			}
			celulas.get(cel).setBackground(Color.LIGHT_GRAY);
			rodada.setCelula(cel);
		}
	}
}
