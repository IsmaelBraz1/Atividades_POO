package View;

import Controller.*;
import Model.*;
public class Main {
public static void main(String[] args) {
	
	Dados dados = new Dados();
	dados.ler("Controller/Clientes.txt");
	
	ListaClientes lista = new ListaClientes();
	lista.setLista(dados.lista);
	lista.addCliente(new Cliente("ze","900","123","CC"));
	
	dados.escrever("Controller/Clientes.txt", lista.formatarDados());
	//new Principal(lista);

}
}
