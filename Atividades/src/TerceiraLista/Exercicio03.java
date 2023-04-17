package TerceiraLista;

public class Exercicio03 {

	public static float medPonderada(float nota[], float peso[]) {
		 float soma=0, pesoT=0;
		 
		 for(int i=0;i<nota.length;i++) {
			 soma+=nota[i]*peso[i];
			 pesoT+=peso[i];
		 }
		 return soma/pesoT;
		}
		
		public static void main(String[] args) {
			
			float nota[] = {7,8,6};
			float peso[] = {2,3,1};
			
			
			System.out.println(medPonderada(nota,peso));

		}

}
