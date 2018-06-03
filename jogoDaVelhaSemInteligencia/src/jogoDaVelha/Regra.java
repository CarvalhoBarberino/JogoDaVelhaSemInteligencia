package jogoDaVelha;

public class Regra {
	public static boolean testCampeao(char[][] matriz){
		for(int i = 0; i < 5; i++){
			if(testCol(matriz, i)){
				return(matriz[i][i]);
			}
		}
	}
}
