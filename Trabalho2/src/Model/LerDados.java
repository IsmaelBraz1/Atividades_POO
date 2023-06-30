package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import Controller.Jogador;

public class LerDados {
	private ArrayList<Jogador> lista;

	public LerDados() {
		lista = new ArrayList<Jogador>();

		try {
			FileReader arquivo = new FileReader("Dados/dados.txt");
			BufferedReader leitura = new BufferedReader(arquivo);
			while (leitura.ready()) {
				lista.add(separarDados(leitura.readLine()));
			}

		} catch (Exception e) {
		}
	}

	public ArrayList<String> getLinha() {
		ArrayList<String> dados = new ArrayList<>();
		try {
			FileReader arquivo = new FileReader("Dados/dados.txt");
			BufferedReader leitura = new BufferedReader(arquivo);
			String linha = leitura.readLine();
			while (linha != null) {
				dados.add(linha);
				linha = leitura.readLine();
			}
			arquivo.close();
		} catch (Exception e) {
		}
		return dados;
	}

	public String nome() {
		String nome = "";
		try {
			FileReader arquivo = new FileReader("Dados/nome.txt");
			BufferedReader leitura = new BufferedReader(arquivo);
			while (leitura.ready()) {
				nome = leitura.readLine();
			}
			arquivo.close();
		} catch (Exception e) {
		}
		return nome;
	}

	private Jogador separarDados(String linha) {
		String dados[] = linha.split(";");
		Jogador jogador = new Jogador(dados[0], Integer.parseInt(dados[1]), Integer.parseInt(dados[2]),
				Integer.parseInt(dados[3]), Integer.parseInt(dados[4]), Integer.parseInt(dados[5]),
				Integer.parseInt(dados[6]), Integer.parseInt(dados[7]), Integer.parseInt(dados[8]));
		return jogador;
	}

	public ArrayList<Jogador> getLista() {
		return lista;
	}

}
