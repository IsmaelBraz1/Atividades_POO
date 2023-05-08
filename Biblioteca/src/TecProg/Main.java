package TecProg;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.addCliente(new Aluno(1333, "Ismael"));
		biblioteca.addCliente(new Aluno(2355,"Jose"));
		biblioteca.addCliente(new Professor(3213, "Fisher"));
		biblioteca.addCliente(new Professor(2445, "Fernando"));
		biblioteca.addCliente(new Servidor(3233, "Mario"));
		biblioteca.addCliente(new Servidor(6212, "Rita"));
		
		biblioteca.addPubli(new Livros("Java", "Jose", 2004, 10));
		biblioteca.addPubli(new Tcc("Jogos", "Ismael", 2022, 12));
		biblioteca.addPubli(new Artigos("Java vs C", "Maria", 2023, 15));
		biblioteca.addPubli(new Revistas("HTML", "Guanabara", 2017, 20));
		biblioteca.addPubli(new Livros("PHP", "Joao", 2016, 10));
		
		biblioteca.emprestar("Java", 1333);
		biblioteca.emprestar("Jogos", 1333);
		biblioteca.emprestar("HTML", 3233);
		biblioteca.relatorioEmprestimo();
		System.out.println("\n\n");
		System.out.println(biblioteca.listarAcervo());
		
		System.out.println("\n"+biblioteca.consultarClinte(1333));
		System.out.println("\n"+biblioteca.buscarLivro("Java"));
		System.out.println("\nRelatorio de emprestimos: ");
		biblioteca.relatorioEmprestimo();
	}

}
