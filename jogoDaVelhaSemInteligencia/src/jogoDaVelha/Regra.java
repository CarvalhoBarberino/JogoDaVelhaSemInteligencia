package jogoDaVelha;

public class Regra {
	private static boolean testLin(char[][] matriz, int i){
		int conta = 0;
		for(int c = 0; c < 5; c++){
			if((matriz[i][c] == matriz[i][0]) && (matriz[i][0] != ' ')){conta++;}
		}
		if(conta >= 5){System.out.println("testLin "+i); return(true);}
		else{return(false);}
	}
	
	
	
	private static boolean testCol(char[][] matriz, int i){
		int conta = 0;
		for(int l = 0; l < 5; l++){
			if((matriz[l][i] == matriz[0][i]) && (matriz[0][i] != ' ')){conta++;}
		}
		if(conta >= 5){System.out.println("testCol "+i); return(true);}
		else{return(false);}
	}
	
	
	
	private static boolean testDiagonal1(char[][] matriz){
		int conta = 0;
		for(int i = 0; i < 5; i++){
			if((matriz[2][2] == matriz[i][i]) && (matriz[2][2] != ' ')){conta++;}
		}
		if(conta >= 5){System.out.println("d1 "); return(true);}
		else{return(false);}
	}
	
	
	
	private static boolean testDiagonal2(char[][] matriz){
		int conta = 0;
		for(int i = 0; i < 5; i++){
			if((matriz[2][2] == matriz[i][4 - i]) && (matriz[2][2] != ' ')){conta++;}
		}
		if(conta >= 5){System.out.println("d2"); return(true);}
		else{return(false);}
	}
	
	
	
	
	public static char testCampeao(char[][] matriz){
		for(int i = 0; i < 5; i++){
			if(testCol(matriz, i) || testLin(matriz, i)){
				return(matriz[i][i]);
			}
		}
		if(testDiagonal1(matriz) || testDiagonal2(matriz)){return(matriz[2][2]);}
		return(' ');
	}
}
