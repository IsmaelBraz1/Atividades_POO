package Exercicio05;

public class Contato {
	private String nome;
	private int codigo;
	private String endereco;
	private String email;
	private String telefone;
	private String Observaçao;
	private Agenda agenda;
	
	
	public Contato() {
	}
	public Contato(int codigo) {
		setCodigo(codigo);
		
	}
	
	public Contato(int codigo, String nome) {
		setCodigo(codigo);
		setNome(nome);
	}
	
	public Contato(int codigo, String nome, String email) {
		setCodigo(codigo);
		setNome(nome);
		setEmail(email);
	}
	
	public Contato(String telefone) {
		setTelefone(telefone);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if(codigo >= 1000 && codigo <= 9999) {
			this.codigo = codigo;
		}else {
			System.out.println("Codigo inválido.");
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if(telefone.length() == 8)
			this.telefone = telefone;
	}

	public String getObservaçao() {
		return Observaçao;
	}

	public void setObservaçao(String observaçao) {
		this.Observaçao = observaçao;
	}

	public String getEmail() {
		return email;
	}
	
	private void setEmail(String email) {
		this.email = email;
	}

	public void mostrarDados(Contato this) {
		if(this.getCodigo() != 0) {
			System.out.println(getCodigo());
		}
		if(this.getNome() != null) {
			System.out.println(getNome());
		}
		if(this.getEmail() != null) {
			System.out.println(getEmail());
		}
		if(this.getTelefone() != null) {
			System.out.println(getTelefone());
		}
		if(this.getEndereco() != null) {
			System.out.println(getEndereco());
		}
		if(this.getObservaçao() != null) {
			System.out.println(getObservaçao());
		}
		
		//System.out.println("Nome: " + this.nome + "\nEndereco: " + this.endereco + "\ne-mail: "+this.email+"\ntelefone: "+ this.telefone+"\nObservação: "+ this.Observaçao);
	}
	
	
	
	public void verifica(Contato contato) {
		if(contato.getCodigo() == 0) {
			System.out.println("codigo vazio");
		}
		if(contato.getNome() == null) {
			System.out.println("nome vazio");
		}
		if(contato.getEmail() == null) {
			System.out.println("email vazio");
		}
		if(contato.getTelefone() == null) {
			System.out.println("telefone vazio");
		}
		if(contato.getEndereco() == null) {
			System.out.println("endereço vazio");
		}
		if(contato.getObservaçao() == null) {
			System.out.println("observaçao vazio");
		}
		
	}
}
