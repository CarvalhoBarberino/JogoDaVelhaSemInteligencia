package jogoDaVelha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class Celula extends JButton implements ActionListener{
	private static char vez;//Esta variavel determina quem vai jogar entre X e O
	private int lin, col;
	private char[][] matRef;
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
	public void actionPerformed(ActionEvent e) {
		if(matRef[lin][col] == ' '){
			matRef[lin][col] = vez;
			this.setText("" + vez);
		}
		if(vez == 'X'){vez = 'O';}
		else{vez = 'X';}
		char t = Regra.testCampeao(matRef);
		if(t != ' '){
			JOptionPane.showMessageDialog(null, t + "Foi o vencedor");
		}
	}
	
}
