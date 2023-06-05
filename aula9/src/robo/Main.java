package robo;

public class Main {
	public static void main(String[] args){
		
		Plano plano = new Plano(5, 5);
		
		Robo robo = new Robo(1, "Delta", plano);
		
		plano.sortearMoeda();
		for (int i = 0; i < plano.listaCelulas.size(); i++) {
			Celula aux = plano.listaCelulas.get(i);
			if (plano.listaCelulas.get(i).moeda != null) {

				System.out.println(" x: " + aux.posicaoX + " y: " + aux.posicaoY);
			}
		}
		
		
	}
}
