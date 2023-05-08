package TecProg;

public class Livros extends Publicacoes{

	public Livros(String titulo, String autor, int anoPubli, int quantidade) {
		super(titulo, autor, anoPubli, quantidade);
		this.tipo = "Livro";
	}

}
