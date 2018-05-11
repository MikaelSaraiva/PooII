package Exercicio_2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends JFrame {

	private String[] teclas = { "~", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "+", "Q", "W", "E", "R",
			"T", "Y", "U", "I", "O", "P,", "[", "]","/", "A","S","D","F","G","H","J","K","L",":","Z", "X","C","V","B","N","M","?" };
	private JButton[] teclasQuadradas;

	public Frame() {
		super("Typing Applicatiom");

		setLayout(null);
		
		teclasQuadradas = new JButton[teclas.length];
		for(int i = 0; i < teclas.length; i++) {
			teclasQuadradas[i] = new JButton(teclas[i]);
			teclasQuadradas[i].setBounds((200*i), (10), 100,100);
			add(teclasQuadradas[i]);
		}
	}

}
