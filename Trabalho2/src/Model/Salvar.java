package Model;

import java.io.FileWriter;

public class Salvar {
	public void SalvarDados(String file, String mensagem, boolean contatenar) {
		try {
			FileWriter arquivo = new FileWriter(file, contatenar);
			arquivo.write(mensagem);
			arquivo.close();
		} catch (Exception e) {
		}
	}
}
