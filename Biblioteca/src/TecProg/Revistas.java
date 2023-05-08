package TecProg;

public class Revistas extends Publicacoes{

	public Revistas(String titulo, String autor, int anoPubli, int quantidade) {
		super(titulo, autor, anoPubli, quantidade);
		this.tipo = "Revista";
	}

}
