package Exercicio_2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame extends JFrame implements KeyListener {

	private String[] teclasLinha1 = { "~", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "+",
			"<html>Backspace<html>" }; // 14 botoes
	private String[] teclasLinha2 = { "Tab", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "/" }; // 14
																												// botoes
	private String[] teclasLinha3 = { "Caps", "A", "S", "D", "F", "G", "H", "J", "K", "L", ":", "\"", "Enter" }; // 13
																													// botoes
	private String[] teclasLinha4 = { "Shift", "Z", "X", "C", "V", "B", "N", "M", ",", ".", "?", "/\\" }; // 12 botoes
	private String[] teclasLinha5 = { "", "<", "\\/", ">" }; // 4 botoes
	private JButton[] botoesLinha1;
	private JButton[] botoesLinha2;
	private JButton[] botoesLinha3;
	private JButton[] botoesLinha4;
	private JButton[] botoesLinha5;
	private JTextArea textArea;
	private JLabel informacao;
	private	Color buttonColor;
	
	
	public Frame() {
		super("Typing Applicatiom");

		JPanel mainPanel = new JPanel();
		JPanel textPanel = new JPanel();
		JPanel keybordPanel = new JPanel();

		keybordPanel.setLayout(null);
		textPanel.setLayout(new FlowLayout());

		mainPanel.setLayout(new GridLayout(2, 1));

		add(mainPanel);
		mainPanel.add(textPanel);
		mainPanel.add(keybordPanel);


		informacao = new JLabel(
				"<html>Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed. <br>Note: Clicking the buttons with your mouse will not perform any action.<html>");
		textPanel.add(informacao);

		textArea = new JTextArea(20, 60);
		textArea.setLineWrap(true);
		textPanel.add(textArea);
		textArea.addKeyListener(this);

		int larguraAltura = 50;
		int espacamento = larguraAltura + 2;
		int entreLinha = larguraAltura + 2;

		botoesLinha1 = new JButton[teclasLinha1.length];
		for (int i = 0; i < teclasLinha1.length - 1; i++) {
			int ultimoBotao = teclasLinha1.length - 1;
			botoesLinha1[i] = new JButton(teclasLinha1[i]);
			botoesLinha1[ultimoBotao] = new JButton(teclasLinha1[ultimoBotao]);
			botoesLinha1[i].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha1[ultimoBotao].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha1[i].setBounds((espacamento * i), entreLinha, larguraAltura, larguraAltura);
			botoesLinha1[ultimoBotao].setBounds((espacamento * ultimoBotao), entreLinha, larguraAltura * 2,
					larguraAltura);
			keybordPanel.add(botoesLinha1[i]);
			keybordPanel.add(botoesLinha1[ultimoBotao]);
		}

		botoesLinha2 = new JButton[teclasLinha2.length];
		for (int i = 1; i < teclasLinha2.length; i++) {
			botoesLinha2[i] = new JButton(teclasLinha2[i]);
			botoesLinha2[0] = new JButton(teclasLinha2[0]);
			botoesLinha2[i].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha2[0].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha2[i].setBounds((espacamento * i + 25), entreLinha * 2, larguraAltura, larguraAltura);
			botoesLinha2[0].setBounds((espacamento * 0), entreLinha * 2, (larguraAltura + (larguraAltura / 2)),
					larguraAltura);
			keybordPanel.add(botoesLinha2[i]);
			keybordPanel.add(botoesLinha2[0]);

		}
		botoesLinha3 = new JButton[teclasLinha3.length];
		for (int i = 1; i < teclasLinha3.length - 1; i++) {
			int ultimoBotao = teclasLinha3.length - 1;
			botoesLinha3[i] = new JButton(teclasLinha3[i]);
			botoesLinha3[0] = new JButton(teclasLinha3[0]);
			botoesLinha3[ultimoBotao] = new JButton(teclasLinha3[ultimoBotao]);
			botoesLinha3[i].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha3[0].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha3[ultimoBotao].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha3[i].setBounds((espacamento * i + 25), entreLinha * 3, larguraAltura, larguraAltura);
			botoesLinha3[0].setBounds((espacamento * 0), entreLinha * 3, (larguraAltura + (larguraAltura / 2)),
					larguraAltura);
			botoesLinha3[ultimoBotao].setBounds((espacamento * ultimoBotao + 25), entreLinha * 3, larguraAltura * 2,
					larguraAltura);
			keybordPanel.add(botoesLinha3[i]);
			keybordPanel.add(botoesLinha3[0]);
			keybordPanel.add(botoesLinha3[ultimoBotao]);
		}

		botoesLinha4 = new JButton[teclasLinha4.length];
		for (int i = 1; i < teclasLinha4.length - 1; i++) {
			int ultimoBotao = teclasLinha4.length - 1;
			botoesLinha4[i] = new JButton(teclasLinha4[i]);
			botoesLinha4[0] = new JButton(teclasLinha4[0]);
			botoesLinha4[ultimoBotao] = new JButton(teclasLinha4[ultimoBotao]);
			botoesLinha4[i].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha4[0].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha4[ultimoBotao].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha4[i].setBounds(espacamento * (i + 1) - 2, entreLinha * 4, larguraAltura, larguraAltura);
			botoesLinha4[ultimoBotao].setBounds((espacamento * 12 + 25), entreLinha * 4, larguraAltura, larguraAltura);
			botoesLinha4[0].setBounds(espacamento * 0, entreLinha * 4, larguraAltura * 2, larguraAltura);
			keybordPanel.add(botoesLinha4[i]);
			keybordPanel.add(botoesLinha4[0]);
			keybordPanel.add(botoesLinha4[ultimoBotao]);

		}

		botoesLinha5 = new JButton[teclasLinha5.length];
		botoesLinha5[0] = new JButton(teclasLinha5[0]);
		botoesLinha5[0].setBounds(espacamento * (3 + 1) - 2, entreLinha * 5, larguraAltura * 6, larguraAltura);
		keybordPanel.add(botoesLinha5[0]);

		botoesLinha5[1] = new JButton(teclasLinha5[1]);
		botoesLinha4[1].setFont(new Font("Serif", Font.PLAIN, 14));
		botoesLinha5[1].setBounds((espacamento * 11 + 25), entreLinha * 5, larguraAltura, larguraAltura);
		keybordPanel.add(botoesLinha5[1]);

		botoesLinha5[2] = new JButton(teclasLinha5[2]);
		botoesLinha4[2].setFont(new Font("Serif", Font.PLAIN, 14));
		botoesLinha5[2].setBounds((espacamento * 12 + 25), entreLinha * 5, larguraAltura, larguraAltura);
		keybordPanel.add(botoesLinha5[2]);

		botoesLinha5[3] = new JButton(teclasLinha5[3]);
		botoesLinha4[3].setFont(new Font("Serif", Font.PLAIN, 14));
		botoesLinha5[3].setBounds((espacamento * 13 + 25), entreLinha * 5, larguraAltura, larguraAltura);
		keybordPanel.add(botoesLinha5[3]);

		addKeyListener(this);
	}
			
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		// Eventos da primeira linha de botoes
		if (key == KeyEvent.CHAR_UNDEFINED) {
			botoesLinha1[0].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_1) {
			botoesLinha1[1].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_2) {
			botoesLinha1[2].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_3) {
			botoesLinha1[3].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_4) {
			botoesLinha1[4].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_5) {
			botoesLinha1[5].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_6) {
			botoesLinha1[6].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_7) {
			botoesLinha1[7].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_8) {
			botoesLinha1[8].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_9) {
			botoesLinha1[9].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_0) {
			botoesLinha1[10].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_MINUS) {
			botoesLinha1[11].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_PLUS) {
			botoesLinha1[12].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_BACK_SPACE ) {
			botoesLinha1[13].setBackground(buttonColor);
		}
		
		// Eventos da segunda linha de botoes
		if (key == KeyEvent.VK_TAB) {
			botoesLinha2[0].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_Q) {
			botoesLinha2[1].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_W) {
			botoesLinha2[2].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_E) {
			botoesLinha2[3].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_R) {
			botoesLinha2[4].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_T) {
			botoesLinha2[5].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_Y) {
			botoesLinha2[6].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_U) {
			botoesLinha2[7].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_I) {
			botoesLinha2[8].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_O) {
			botoesLinha2[9].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_P) {
			botoesLinha2[10].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_OPEN_BRACKET) {
			botoesLinha2[11].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_CLOSE_BRACKET) {
			botoesLinha2[12].setBackground(buttonColor);
		}
		if (key == KeyEvent.VK_SLASH) {
			botoesLinha2[13].setBackground(buttonColor);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();

		// Eventos da primeira linha de botoes
		if (key == KeyEvent.CHAR_UNDEFINED) {
			botoesLinha1[0].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_1) {
			botoesLinha1[1].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_2) {
			botoesLinha1[2].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_3) {
			botoesLinha1[3].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_4) {
			botoesLinha1[4].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_5) {
			botoesLinha1[5].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_6) {
			botoesLinha1[6].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_7) {
			botoesLinha1[7].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_8) {
			botoesLinha1[8].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_9) {
			botoesLinha1[9].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_0) {
			botoesLinha1[10].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_MINUS) {
			botoesLinha1[11].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_PLUS) {
			botoesLinha1[12].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_BACK_SPACE ) {
			botoesLinha1[13].setBackground(Color.GRAY);
		}

		// Eventos da segunda linha de botoes
		if (key == KeyEvent.VK_TAB) {
			botoesLinha2[0].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_Q) {
			botoesLinha2[1].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_W) {
			botoesLinha2[2].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_E) {
			botoesLinha2[3].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_R) {
			botoesLinha2[4].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_T) {
			botoesLinha2[5].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_Y) {
			botoesLinha2[6].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_U) {
			botoesLinha2[7].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_I) {
			botoesLinha2[8].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_O) {
			botoesLinha2[9].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_P) {
			botoesLinha2[10].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_OPEN_BRACKET) {
			botoesLinha2[11].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_CLOSE_BRACKET) {
			botoesLinha2[12].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_SLASH) {
			botoesLinha2[13].setBackground(Color.GRAY);
		}
		
		// Eventos da terceira linha de botoes
		if (key == KeyEvent.VK_TAB) {
			botoesLinha2[0].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_Q) {
			botoesLinha2[1].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_W) {
			botoesLinha2[2].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_E) {
			botoesLinha2[3].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_R) {
			botoesLinha2[4].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_T) {
			botoesLinha2[5].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_Y) {
			botoesLinha2[6].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_U) {
			botoesLinha2[7].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_I) {
			botoesLinha2[8].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_O) {
			botoesLinha2[9].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_P) {
			botoesLinha2[10].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_OPEN_BRACKET) {
			botoesLinha2[11].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_CLOSE_BRACKET) {
			botoesLinha2[12].setBackground(Color.GRAY);
		}
		if (key == KeyEvent.VK_SLASH) {
			botoesLinha2[13].setBackground(Color.GRAY);
		}
	}
}
