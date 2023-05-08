package TecProg;

public class RegistroEmprestimo{
	public Cliente cliente;
	public Publicacoes publicacao;
	public int id;
	public RegistroEmprestimo(Cliente cliente, Publicacoes publicacao, int id) {
		this.cliente = cliente;
		this.publicacao = publicacao;
		this.id = id;
	}
	public RegistroEmprestimo(Publicacoes publicacao, int id) {
		this.publicacao = publicacao;
		this.id = id;
	}
	public String retornarDadosEmprestimo() {
		String saida = "";
		saida = this.cliente.tipo+":" + this.cliente.nome + " - " + publicacao.tipo + ": " + this.publicacao.titulo;
		return saida;
	}
	
}
