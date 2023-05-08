package TecProg;

public class Aluno extends Cliente{

	public Aluno(int matricula, String nome) {
		super(matricula, nome);
		this.tipo = "Aluno";
	}

	public void desconto(Publicacoes publi) {
		if (publi instanceof Livros) {
			this.tps += (10 - 10 * 0.1);
		}
		if (publi instanceof Revistas) {
			this.tps += (10 - 10 * 0.01);
		}
		if (publi instanceof Artigos) {
			this.tps += (10 - 10 * 0.5);
		}
		if (publi instanceof Tcc) {
			this.tps += (10 - 10 * 0);
		}
		
	}

}
