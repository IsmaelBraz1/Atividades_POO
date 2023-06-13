package Controller;

public class Cliente {
	private String nome;
	private String cpf;
	private String matricula;
	private String vertente;
	
	public Cliente(String nome, String cpf, String matricula, String vertente) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.vertente = vertente;
	}
	
	public void alterarVertente(String vertente) {
		this.vertente = vertente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getVertente() {
		return vertente;
	}

	public void setVertente(String vertente) {
		this.vertente = vertente;
	}
	
	
}
