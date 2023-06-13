package Controller;

import java.util.ArrayList;

public class ListaClientes {
	public ArrayList<Cliente> lista;
	
	public ListaClientes() {
		lista = new ArrayList<Cliente>();
	}
	
	public void addCliente(Cliente c) {
		lista.add(c);
	}
	public String dados() {
		return lista.get(0).getNome();
	}

	public void setLista(ArrayList<Cliente> lista) {
		this.lista = lista;
	}
	
	public String formatarDados() {
		String dados = null;
		for(Cliente lista : lista) {
			dados += lista.getNome()+";"+lista.getCpf()+";"+lista.getMatricula()+";"+lista.getVertente()+"\n";
		}
		return dados;
	}
	
}
