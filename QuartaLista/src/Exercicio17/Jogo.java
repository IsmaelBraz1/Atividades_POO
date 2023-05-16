package Exercicio17;

public class Jogo {
String grade[][] = new String[3][3];

public Jogo() {
	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			this.grade[i][j] = " ";
		}
	}
}

public void retornarGrade() {
	System.out.println("   0      1     2");
	System.out.println("0   "+grade[0][0]+"  |  "+grade[0][1]+"  |  "+grade[0][2]);
	System.out.println("   ---------------");
	System.out.println("1   "+grade[1][0]+"  |  "+grade[1][1]+"  |  "+grade[1][2]);
	System.out.println("   ---------------");
	System.out.println("2   "+grade[2][0]+"  |  "+grade[2][1]+"  |  "+grade[2][2]);
}

public boolean verficarPosicaoVazia(int i, int j) {
	if(i >=0 && i<=2 && j >=0 && j<=2) {
		if(this.grade[i][j] == " ") 
			return true;
		else
			return false;
	}
	return false;
}

public int verificarVencedor() {
   if(((grade[0][0] == "X") && (grade[0][1] == "X") && (grade[0][2] == "X")) || 
   	((grade[1][0] == "X") && (grade[1][1] == "X") && (grade[1][2] == "X")) ||
    ((grade[2][0] == "X") && (grade[2][1] == "X") && (grade[2][2] == "X")) ||
    ((grade[0][0] == "X") && (grade[1][0] == "X") && (grade[2][0] == "X")) ||
    ((grade[0][1] == "X") && (grade[1][1] == "X") && (grade[2][1] == "X")) ||
    ((grade[0][2] == "X") && (grade[1][2] == "X") && (grade[2][2] == "X")) ||
    ((grade[0][0] == "X") && (grade[1][1] == "X") && (grade[2][2] == "X")) ||
    ((grade[0][2] == "X") && (grade[1][1] == "X") && (grade[2][0] == "X"))) {
	   return 1;
   }else
   if(((grade[0][0] == "O") && (grade[0][1] == "O") && (grade[0][2] == "O")) || 
   	((grade[1][0] == "O") && (grade[1][1] == "O") && (grade[1][2] == "O")) ||
    ((grade[2][0] == "O") && (grade[2][1] == "O") && (grade[2][2] == "O")) ||
    ((grade[0][0] == "O") && (grade[1][0] == "O") && (grade[2][0] == "O")) ||
    ((grade[0][1] == "O") && (grade[1][1] == "O") && (grade[2][1] == "O")) ||
    ((grade[0][2] == "O") && (grade[1][2] == "O") && (grade[2][2] == "O")) ||
    ((grade[0][0] == "O") && (grade[1][1] == "O") && (grade[2][2] == "O")) ||
    ((grade[0][2] == "O") && (grade[1][1] == "O") && (grade[2][0] == "O"))) {
		 return 2;
	}	   
   int k=0;
   for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			if(this.grade[i][j] != " ")
				k++;
		}
	}
   if(k==9) {
	   return 3;
   }
   return 0;
}
}
