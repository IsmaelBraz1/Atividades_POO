package TecProg;

import java.util.ArrayList;

public class Biblioteca {

	public ArrayList<Publicacoes> acervo;
	public ArrayList<Cliente> clientes;
	public ArrayList<RegistroEmprestimo> emprestimo;

	public Biblioteca() {
		clientes = new ArrayList<Cliente>();
		acervo = new ArrayList<Publicacoes>();
		emprestimo = new ArrayList<RegistroEmprestimo>();
	}

	public void addPubli(Publicacoes publi) {
		acervo.add(publi);
	}

	public void addCliente(Cliente cliente) {
		clientes.add(cliente);
	}

	public void emprestar(String titulo, int matricula) {
		int i = 0;
		for (Publicacoes publi : acervo) {
			if (publi.titulo == titulo && publi.quantidade > 0) {
				for (Cliente cliente : clientes) {
					if (cliente.matricula == matricula) {
						i++;
						emprestimo.add(new RegistroEmprestimo(cliente, publi, i));
						cliente.newEmprestimo(new RegistroEmprestimo(publi, i));
						cliente.qtdPubli ++;
						cliente.desconto(publi);
						publi.quantidade --;
					}
				}
			}
		}
	}

	public void relatorioEmprestimo() {
		for (RegistroEmprestimo registro : emprestimo) {
				System.out.println(registro.retornarDadosEmprestimo());
		}
	}

	public String listarAcervo() {
		String livros = "Livros (Título, ano, autor, quantidade de exemplares disponíveis):", artigos="\nArtigos (Título, ano, autor, quantidade de exemplares disponíveis):", 
		revistas="\nRevistas (Título, ano, autor, quantidade de exemplares disponíveis):", tcc="\nTCCs (Título, ano, autor, quantidade de exemplares disponíveis):"; 
		for (Publicacoes publicacao : acervo) {
			if (publicacao instanceof Livros)
				livros += "\n- " + publicacao.dadosPubli();
			if (publicacao instanceof Revistas)
				revistas += "\n- " + publicacao.dadosPubli();
			if (publicacao instanceof Artigos) 
				artigos += "\n- " + publicacao.dadosPubli();
			if (publicacao instanceof Tcc) 
				tcc += "\n- " + publicacao.dadosPubli();
		}
		return (livros+"\n"+revistas+"\n"+artigos+"\n"+tcc);
	}

	
	public String consultarClinte(int matricula) {
		for (Cliente cliente : clientes) {
			if (cliente.matricula == matricula) {
				return cliente.dadosCliente();
			}
		}
		return null;
	}
	
	public String buscarLivro(String titulo) {
		for(Publicacoes publicacao: acervo) {
			if(publicacao.titulo == titulo) {
				return publicacao.dadosPubli();
			}
		}
		return null;
	}
}
