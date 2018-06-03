package jogoDaVelha;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
public class JogoDaVelhaSemInteligencia {
	public static void main(String[] args) {
		JFrame j1 = new JFrame("Jogo da velha 5x5");
		j1.getContentPane().setLayout(new GridLayout(5, 5));
		j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j1.setBounds(200, 200, 300, 300);
		j1.setResizable(false);
		ArrayList vec = new ArrayList();
		for(int i = 0; i < 25; i++){
			Celula celula = new Celula();
			vec.add(celula);
			j1.getContentPane().add(celula);
			System.out.println("vec.size() = " + vec.size());
		}
		j1.setVisible(true);
	}
}
