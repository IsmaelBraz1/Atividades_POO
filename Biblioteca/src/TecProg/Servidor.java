package TecProg;

public class Servidor extends Cliente{

	public Servidor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo = "Servidor";
	}
	public void desconto(Publicacoes publi) {
		if (publi instanceof Livros) {
			this.tps += (15 - 15 * 0);
		}
		if (publi instanceof Revistas) {
			this.tps += (15 - 15 * 0);
		}
		if (publi instanceof Artigos) {
			this.tps += (15 - 15 * 0);
		}
		if (publi instanceof Tcc) {
			this.tps += (15 - 15 * 0);
		}
		
	}



}
