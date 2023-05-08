package TecProg;

public class Professor extends Cliente{

	public Professor(int matricula, String nome) {
		super(matricula, nome);
		this.tipo = "Professor";
	}

	public void desconto(Publicacoes publi) {
		if (publi instanceof Livros) {
			this.tps += (25 - 25 * 0) ;
		}
		if (publi instanceof Revistas) {
			this.tps += (25 - 25 * 0) ;
		}
		if (publi instanceof Artigos) {
			this.tps += (25 - 25 * 0) ;
		}
		if (publi instanceof Tcc) {
			this.tps += (25 - 25 * 0) ;
		}
		
	}

	

}
