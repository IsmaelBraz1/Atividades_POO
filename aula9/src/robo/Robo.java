package robo;

public class Robo {

	public int id;
	public String nome;
	public int posicaox;
	public int posicaoy;
	public Plano plano;
	public int moeda;
	public int passosNorte, passoSul, passosOeste, passosLeste, passosNordeste,passosSudeste,passosNoroeste, passosSudoeste;
	public Robo(int id, String nome, Plano plano) {
		this.id = id;
		this.nome = nome;
		this.plano = plano;
		
		if(plano.tamanhoX%2 != 0 && plano.tamanhoY%2!= 0) {
			this.posicaox = ((plano.tamanhoX-1)/2)+1;
			this.posicaoy = ((plano.tamanhoY-1)/2)+1;
		}else {
			this.posicaox = (plano.tamanhoX/2);
			this.posicaoy = (plano.tamanhoY/2);
		}
		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			aux = plano.listaCelulas.get(i);
			if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
				aux.robo = this;
			}
		}
	}

	public void moverOeste() {	
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if(plano.listaCelulas.get(i).posicaoX > 1) {
					plano.listaCelulas.get(i - 1).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i).robo = null;
					this.passosOeste++;
					if(plano.listaCelulas.get(i - 1).moeda != null) {
						this.moeda++;
						plano.listaCelulas.get(i - 1).moeda = null;
					}
					
				}
				i = plano.listaCelulas.size();
			}
		}

	}

	public void moverLeste() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if(plano.listaCelulas.get(i).posicaoX < plano.tamanhoX) {
					plano.listaCelulas.get(i+1).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i).robo = null;
					this.passosLeste++;
					if(plano.listaCelulas.get(i+1).moeda != null) {
						this.moeda++;
						plano.listaCelulas.get(i+1).moeda = null;
					}
				}
				i = plano.listaCelulas.size();
			}
		}
	}
	
	public void moverNorte() {	
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if(plano.listaCelulas.get(i).posicaoY < plano.tamanhoY) {
					plano.listaCelulas.get(i + plano.tamanhoX).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i).robo = null;
					this.passosNorte++;
					if(plano.listaCelulas.get(i + plano.tamanhoX).moeda != null) {
						this.moeda++;
						plano.listaCelulas.get(i + plano.tamanhoX).moeda = null;
					}
				}
				i = plano.listaCelulas.size();
			}
		}

	}
	

	public void moverSul() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if(plano.listaCelulas.get(i).posicaoY > 1) {
					plano.listaCelulas.get(i-plano.tamanhoX).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i).robo = null;
					this.passoSul++;
					if(plano.listaCelulas.get(i - plano.tamanhoX).moeda != null) {
						this.moeda++;
						plano.listaCelulas.get(i - plano.tamanhoX).moeda = null;
					}
				}
				i = plano.listaCelulas.size();
			}
		}
	}
	
	public void moverNordeste() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if((plano.listaCelulas.get(i).posicaoX > 1)&&(plano.listaCelulas.get(i).posicaoY < plano.tamanhoY)) {
					moverNorteAux();
					moverLesteAux();
					i=plano.listaCelulas.size();
					this.passosNordeste++;
					for (int k = 0; k < plano.listaCelulas.size(); k++) {
						if (plano.listaCelulas.get(k).robo != null) {
							if(plano.listaCelulas.get(k).moeda != null) {
								this.moeda++;
								plano.listaCelulas.get(k).moeda = null;
							}
						}
					}
				}
			}
		}
	}
	
	public void moverSudeste() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if((plano.listaCelulas.get(i).posicaoY > 1)&&(plano.listaCelulas.get(i).posicaoY < plano.tamanhoY)) {
					moverSulAux();
					moverLesteAux();
					i=plano.listaCelulas.size();
					this.passosSudeste++;
					for (int k = 0; k < plano.listaCelulas.size(); k++) {
						if (plano.listaCelulas.get(k).robo != null) {
							if(plano.listaCelulas.get(k).moeda != null) {
								this.moeda++;
								plano.listaCelulas.get(k).moeda = null;
							}
						}
					}
				}
			}
		}
	}
	
	public void moverSudoeste() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if((plano.listaCelulas.get(i).posicaoY > 1)&&(plano.listaCelulas.get(i).posicaoX > 1)) {
					moverSulAux();
					moverOesteAux();
					i=plano.listaCelulas.size();
					this.passosSudoeste++;
					for (int k = 0; k < plano.listaCelulas.size(); k++) {
						if (plano.listaCelulas.get(k).robo != null) {
							if(plano.listaCelulas.get(k).moeda != null) {
								this.moeda++;
								plano.listaCelulas.get(k).moeda = null;
							}
						}
					}
				}
			}
		}
	}
	public void moverNoroeste() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if((plano.listaCelulas.get(i).posicaoX > 1)&&(plano.listaCelulas.get(i).posicaoY < plano.tamanhoY)) {
					moverNorteAux();
					moverOesteAux();
					i=plano.listaCelulas.size();
					this.passosNoroeste++;
					for (int k = 0; k < plano.listaCelulas.size(); k++) {
						if (plano.listaCelulas.get(k).robo != null) {
							if(plano.listaCelulas.get(k).moeda != null) {
								this.moeda++;
								plano.listaCelulas.get(k).moeda = null;
							}
						}
					}
				}
			}
		}
	}
	
	//METODOS AUXILIARES PRIVADOS PARA MOVIMENTOS NA DIRECAO DOS PONTOS COLATERAIS 
	private void moverNorteAux() {	
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if(plano.listaCelulas.get(i).posicaoY < plano.tamanhoY) {
				plano.listaCelulas.get(i + plano.tamanhoX).robo = plano.listaCelulas.get(i).robo;
				plano.listaCelulas.get(i).robo = null;
				i = plano.listaCelulas.size();
				}
			}
		}

	}
	private void moverSulAux() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if(plano.listaCelulas.get(i).posicaoY > 1) {
				//System.out.println(i);
				plano.listaCelulas.get(i-plano.tamanhoX).robo = plano.listaCelulas.get(i).robo;
				plano.listaCelulas.get(i).robo = null;
				i = plano.listaCelulas.size();
				}
			}
		}
	}
	private void moverOesteAux() {	
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if(plano.listaCelulas.get(i).posicaoX > 1) {
					plano.listaCelulas.get(i - 1).robo = plano.listaCelulas.get(i).robo;
					plano.listaCelulas.get(i).robo = null;
					i = plano.listaCelulas.size();
				}
			}
		}

	}

	private void moverLesteAux() {
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			if (plano.listaCelulas.get(i).robo != null) {
				if(plano.listaCelulas.get(i).posicaoX < plano.tamanhoX) {
				//System.out.println(i);
				plano.listaCelulas.get(i+1).robo = plano.listaCelulas.get(i).robo;
				plano.listaCelulas.get(i).robo = null;
				i = plano.listaCelulas.size();
				}
			}
		}
	}
	
}

