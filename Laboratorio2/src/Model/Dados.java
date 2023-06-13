package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import Controller.Cliente;

public class Dados {

	public ArrayList<Cliente> lista;
	
	public void ler(String file) {
		try {
			FileReader arq = new FileReader(file);
			BufferedReader leitura = new BufferedReader(arq);
			
			while(leitura.ready()) {
				lista.add(formatar(leitura.readLine()));
			}
			
		} catch (Exception e) {
			System.out.println("ERRO: Leitura");
		}
		
	}
	
	public void escrever(String file, String texto) {
		try {
			FileWriter arq = new FileWriter(file);
			arq.write(texto);
			arq.close();

		} catch (Exception e) {
			System.out.println("ERRO: Escrever");
		}
	}
	
	private Cliente formatar(String linha) {
			String dados[] = linha.split(";");
			Cliente cliente = new Cliente(dados[0],dados[1], dados[2], dados[3]);
			
			return cliente;
	}
}
