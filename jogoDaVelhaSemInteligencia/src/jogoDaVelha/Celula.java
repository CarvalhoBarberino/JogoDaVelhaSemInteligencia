package jogoDaVelha;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Celula extends JButton implements ActionListener{
	public static char ch;//Esta variavel determina quem vai jogar entre X e O
	public Celula(){
		ch = 'X';
		this.setText(" ");
		this.addActionListener(this);
		this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(this.getText().equals(" ")){
			this.setText("" + ch);
			System.out.println("marquei um Xis");
		}
		if(ch == 'X'){
			ch = 'O';
		}else{ch = 'X';}
	}
	
}
