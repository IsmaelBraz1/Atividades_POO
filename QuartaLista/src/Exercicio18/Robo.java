package Exercicio18;

public class Robo {

	public int id;
	public String nome;
	public int posicaox;
	public int posicaoy;
	public Plano plano;
	public int moeda;
	public int passosNorte, passosSul, passosOeste, passosLeste, passosNordeste, passosSudeste, passosNoroeste,
			passosSudoeste;

	public Robo(int id, String nome, Plano plano) {
		this.id = id;
		this.nome = nome;
		this.plano = plano;

		if (plano.tamanhoX % 2 != 0 && plano.tamanhoY % 2 != 0) {
			this.posicaox = ((plano.tamanhoX - 1) / 2) + 1;
			this.posicaoy = ((plano.tamanhoY - 1) / 2) + 1;
		} else {
			this.posicaox = (plano.tamanhoX / 2);
			this.posicaoy = (plano.tamanhoY / 2);
		}
		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			aux = plano.listaCelulas.get(i);
			if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
				aux.robo = this;
				aux.icone = aux.robo.nome;
			}
		}
	}
	public void moverOeste() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if (plano.listaCelulas.get(i).posicaoX > 1) {
					plano.listaCelulas.get(i - 1).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i - 1).icone = plano.listaCelulas.get(i).robo.nome;
					plano.listaCelulas.get(i).robo = null;
					plano.listaCelulas.get(i).icone = "@";
					this.passosOeste++;
					plano.VerificarMoeda(plano.listaCelulas.get(i - 1));
				}
				i = plano.listaCelulas.size();
			}
		}

	}

	public void moverLeste() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if (plano.listaCelulas.get(i).posicaoX < plano.tamanhoX) {
					plano.listaCelulas.get(i + 1).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i + 1).icone = plano.listaCelulas.get(i).robo.nome;
					plano.listaCelulas.get(i).robo = null;
					plano.listaCelulas.get(i).icone = "@";
					this.passosLeste++;
					plano.VerificarMoeda(plano.listaCelulas.get(i + 1));
				}
				i = plano.listaCelulas.size();
			}
		}
	}

	public void moverNorte() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if (plano.listaCelulas.get(i).posicaoY < plano.tamanhoY) {
					plano.listaCelulas.get(i + plano.tamanhoX).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i + plano.tamanhoX).icone = plano.listaCelulas.get(i).robo.nome;
					plano.listaCelulas.get(i).robo = null;
					plano.listaCelulas.get(i).icone = "@";
					this.passosNorte++;
					plano.VerificarMoeda(plano.listaCelulas.get(i + plano.tamanhoX));
				}
				i = plano.listaCelulas.size();
			}
		}

	}

	public void moverSul() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if (plano.listaCelulas.get(i).posicaoY > 1) {
					plano.listaCelulas.get(i - plano.tamanhoX).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i - plano.tamanhoX).icone = plano.listaCelulas.get(i).robo.nome;
					plano.listaCelulas.get(i).robo = null;
					plano.listaCelulas.get(i).icone = "@";
					this.passosSul++;
					plano.VerificarMoeda(plano.listaCelulas.get(i - plano.tamanhoX));
				}
				i = plano.listaCelulas.size();
			}
		}
	}

	public void moverNordeste() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if (plano.listaCelulas.get(i).posicaoY < plano.tamanhoY) {
					plano.listaCelulas.get(i + plano.tamanhoX + 1).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i + plano.tamanhoX + 1).icone = plano.listaCelulas.get(i).robo.nome;
					plano.listaCelulas.get(i).robo = null;
					plano.listaCelulas.get(i).icone = "@";
					this.passosNordeste++;
					plano.VerificarMoeda(plano.listaCelulas.get(i + plano.tamanhoX + 1));
				}
				i = plano.listaCelulas.size();
			}
		}
	}

	public void moverSudeste() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if (plano.listaCelulas.get(i).posicaoY > 1) {
					plano.listaCelulas.get(i - plano.tamanhoX + 1).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i - plano.tamanhoX + 1).icone = plano.listaCelulas.get(i).robo.nome;
					plano.listaCelulas.get(i).robo = null;
					plano.listaCelulas.get(i).icone = "@";
					this.passosSudeste++;
					plano.VerificarMoeda(plano.listaCelulas.get(i - plano.tamanhoX + 1));
				}
				i = plano.listaCelulas.size();
			}
		}
	}

	public void moverSudoeste() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if (plano.listaCelulas.get(i).posicaoY > 1) {
					plano.listaCelulas.get(i - plano.tamanhoX - 1).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i - plano.tamanhoX - 1).icone = plano.listaCelulas.get(i).robo.nome;
					plano.listaCelulas.get(i).robo = null;
					plano.listaCelulas.get(i).icone = "@";
					this.passosSudoeste++;
					plano.VerificarMoeda(plano.listaCelulas.get(i - plano.tamanhoX - 1));
				}
				i = plano.listaCelulas.size();
			}
		}
	}

	public void moverNoroeste() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if (plano.listaCelulas.get(i).posicaoY < plano.tamanhoY) {
					plano.listaCelulas.get(i + plano.tamanhoX - 1).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i + plano.tamanhoX - 1).icone = plano.listaCelulas.get(i).robo.nome;
					plano.listaCelulas.get(i).robo = null;
					plano.listaCelulas.get(i).icone = "@";
					this.passosNoroeste++;
					plano.VerificarMoeda(plano.listaCelulas.get(i + plano.tamanhoX - 1));
				}
				i = plano.listaCelulas.size();
			}
		}
	}

	public void movimentoA() {
		boolean loop;
		if (plano.tamanhoY % 2 != 0)
			loop = true;
		else
			loop = false;
		for (int k = 0; k < plano.listaCelulas.size(); k++) {
			if (plano.listaCelulas.get(k).robo != null) {
				plano.listaCelulas.get(k).robo = null;
				plano.listaCelulas.get(k).icone = "*";
				plano.listaCelulas.get(0).robo = this;
				plano.listaCelulas.get(0).icone = plano.listaCelulas.get(0).robo.nome;
			}
		}
		for (int i = 0; i < (plano.tamanhoY / 2); i++) {
			for (int j = 0; j < plano.tamanhoX - 1; j++) {
				plano.mapa();
				System.out.println("\n\n");
				moverLeste();
			}
			moverNorte();

			for (int j = 0; j < plano.tamanhoX - 1; j++) {
				plano.mapa();
				System.out.println("\n\n");
				moverOeste();
			}
			moverNorte();
		}
		if (loop) {
			for (int j = 0; j < plano.tamanhoX - 1; j++) {
				plano.mapa();
				System.out.println("\n\n");
				moverLeste();
			}
		}
	}

	public void movimentoB() {
		for (int k = 0; k < plano.listaCelulas.size(); k++) {
			if (plano.listaCelulas.get(k).robo != null) {
				plano.listaCelulas.get(k).robo = null;
				plano.listaCelulas.get(k).icone = "*";
				plano.listaCelulas.get(0).robo = this;
				plano.listaCelulas.get(0).icone = plano.listaCelulas.get(0).robo.nome;
			}
		}
		plano.mapa();
		for (int j = 0; j < plano.tamanhoX - 1; j++) {
			System.out.println("\n\n");
			moverNordeste();
			plano.mapa();
		}
		for (int j = 0; j < plano.tamanhoY - 1; j++) {
			System.out.println("\n\n");
			moverSul();
			plano.mapa();
		}

		for (int j = 0; j < (plano.tamanhoX - 1); j++) {
			System.out.println("\n\n");
			moverNoroeste();
			plano.mapa();
		}
		for (int j = 0; j < plano.tamanhoY - 1; j++) {
			System.out.println("\n\n");
			moverSul();
			plano.mapa();
		}

	}

	public void movimentoC() {
		boolean loop;
		if (plano.tamanhoY % 2 != 0)
			loop = true;
		else
			loop = false;
		plano.mapa();
		for (int i = 0; i < plano.tamanhoX; i++) {
			if (i % 2 == 0) {
				System.out.println("\n\n");
				for (int k = 0; k < i; k++) {
					moverOeste();
					plano.mapa();
					System.out.println("\n\n");
				}
				for (int k = 0; k < i; k++) {
					moverSul();
					plano.mapa();
					System.out.println("\n\n");
				}
			} else {
				for (int k = 0; k < i; k++) {
					moverLeste();
					plano.mapa();
					System.out.println("\n\n");
				}
				for (int k = 0; k < i; k++) {
					moverNorte();
					plano.mapa();
					System.out.println("\n\n");
				}
			}
		}
		if (loop) {
			for (int k = 0; k < plano.tamanhoX - 1; k++) {
				moverLeste();
				plano.mapa();
				System.out.println("\n\n");
			}
		} else {
			for (int k = 0; k < plano.tamanhoX - 1; k++) {
				moverOeste();
				plano.mapa();
				System.out.println("\n\n");
			}
		}
	}
}

