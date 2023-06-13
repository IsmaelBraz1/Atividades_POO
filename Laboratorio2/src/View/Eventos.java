package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Eventos {
	JPanel menu;
	JPanel cadastro;
	public Eventos(JPanel menu, JPanel cadastro) {
		this.menu = menu;
		this.cadastro = cadastro;
		
	}
	
	public class showCadastro implements ActionListener{
		JPanel painel;
		public showCadastro(JPanel panel) {
			painel = panel;
		}
		public void actionPerformed(ActionEvent e) {
			painel.setVisible(true);
		}
		
	}
}
