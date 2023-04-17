package TerceiraLista;

public class Exercicio04 {
	public static int contagemDeElementeos(int vetA[],  int vetB[], int contador) {
		int quantidade=0;
		for(int i=0;i<vetA.length;i++) {
			if(vetA[i]==contador) {
				quantidade++;
			}
		}
		for(int i=0;i<vetB.length;i++) {
			if(vetB[i]==contador) {
				quantidade++;
			}
		}
		return quantidade;
	}
	
	public static void main(String[] args) {
		int vetA[] = new int[4];
		int vetB[] = new int[4];
		for(int i = 0; i < vetA.length; i++) {
			vetA[i] = i*2;
			vetB[i] = i*3;
		}
		int contador=2;
		
		System.out.println("O numero " + contador + " se repete " + contagemDeElementeos(vetA, vetB, contador) + " vezes");
	}
}
