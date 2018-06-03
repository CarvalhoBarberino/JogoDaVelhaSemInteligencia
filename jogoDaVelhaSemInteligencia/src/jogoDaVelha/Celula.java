package jogoDaVelha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class Celula extends JButton implements ActionListener{
	private static char vez;//Esta variavel determina quem vai jogar entre X e O
	private int lin, col;
	private static char[][] matRef;
	private static ArrayList<JButton> vec;
	
	public Celula(char[][] matriz, int linha, int coluna){
		vez = 'X';
		matRef = matriz;
		lin = linha;
		col = coluna;
		matriz[lin][col] = ' ';
		this.setText(" ");
		this.addActionListener(this);
		this.setVisible(true);
	}
	
	private static void zerarJogo(){
		for(int l = 0; l < 5; l++){
			for(int c = 0; c < 5; c++){
				matRef[l][c] = ' ';
			}
		}
		for(int i = 0; i < vec.size(); i++){
			vec.get(i).setText(" ");
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if((matRef[lin][col] == ' ') && ((lin == 4) || (matRef[lin + 1][col] != ' '))){
			matRef[lin][col] = vez;
			this.setText("" + vez);
			if(vez == 'X'){vez = 'O';}
			else{vez = 'X';}
		}
		char t = Regra.testCampeao(matRef);
		System.out.println("Vencedor: " + t);
		if(t != ' '){
			JOptionPane.showMessageDialog(null, "\"" + t + "\"" + " foi o vencedor");
			zerarJogo();
		}
	}
	
	public static void informarVec(ArrayList vecArg){
		vec = vecArg;
	}
}
