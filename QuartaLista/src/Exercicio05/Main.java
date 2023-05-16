package Exercicio05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int op;
		String nome;
		int codigo;
		String endereco;
		String email;
		String telefone;
		String observacao;
		Cliente cliente = new Cliente("nome");

		do {
			System.out.println("Escolha uma opção: \n1 - Adicionar Contato\n2 - Ver contato\n3 - Duplicar contato");
			op = input.nextInt();
			if (op == 1) {
				System.out.println();
				System.out.println("Digite o codigo: ");
				codigo = input.nextInt();
				System.out.println("Digite o nome: ");
				nome = input.next();
				System.out.println("Digite o email: ");
				email = input.next();
				System.out.println("Digite o telefone: ");
				telefone = input.next();
				System.out.println("Digite uma observaçaõ: ");
				observacao = input.next();
				cliente.agenda.addContato(new Contato(codigo, nome));
			}
			if (op == 2) {
				System.out.println("Digite o codigo do contato: ");
				codigo = input.nextInt();
				cliente.agenda.buscarContato(codigo).mostrarDados();
				
			}
			if (op == 3) {
				System.out.println("Digite o codigo do contato: ");
				codigo = input.nextInt();
				cliente.agenda.duplicarContato(cliente.agenda.buscarContato(codigo));
				
			}
		} while (true);
		/*
		 * cliente.agenda.duplicarContato(cliente.agenda.lista.get(0)); for(int i=0 ;
		 * i<cliente.agenda.lista.size();i++) {
		 * cliente.agenda.lista.get(i).mostrarDados(cliente.agenda.lista.get(i)); }
		 * System.out.println("\n\n");
		 * cliente.agenda.lista.get(0).verifica(cliente.agenda.lista.get(0));
		 */
	}

}
