package TecProg;

public class Publicacoes {

	public String titulo;
	public String autor;
	public int anoPubli;
	public int quantidade;
	public String tipo;
	public Publicacoes(String titulo, String autor, int anoPubli, int quantidade) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPubli = anoPubli;
		this.quantidade = quantidade;
	}
	
	public String dadosPubli() {
		return "Titulo: "+this.titulo+"\nAno de publicação: "+this.anoPubli+"\nAutor: "+this.autor+"\nQuantidade disponivel: "+this.quantidade;
	}
}
