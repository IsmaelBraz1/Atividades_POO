package View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Deletar extends JPanel{
	private JTextField inpMatricula;
	private JLabel matricula;
	private JButton bDeletar;
	public Deletar() {
		this.setLayout(new GridLayout(2,2));
		inpMatricula = new JTextField();
		matricula =  new JLabel("Matricula: ");
		bDeletar = new JButton("DELETAR");

		this.add(matricula);
		this.add(inpMatricula);
		this.add(new JLabel(" "));
		this.add(new JLabel(" "));
		this.add(bDeletar);
		this.setVisible(false);
	}
}
