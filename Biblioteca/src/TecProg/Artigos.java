package TecProg;

public class Artigos extends Publicacoes{

	public Artigos(String titulo, String autor, int anoPubli, int quantidade) {
		super(titulo, autor, anoPubli, quantidade);
		this.tipo = "Artigo";
	}

}
