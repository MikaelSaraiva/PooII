package Exercicio_2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
	private JLabel pangramas;
	private Color buttonColor = null;
	private Reconhecimento[] reconhecimento;

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

		textArea = new JTextArea(18, 90);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("MONOSPACED", Font.PLAIN, 12));
		textPanel.add(textArea);
		textArea.addKeyListener(this);

		try (BufferedReader reader = new BufferedReader(
				new FileReader(new File("/home/saraiva/eclipse-workspace/PooII/src/Exercicio_2/pangramas.txt")))) {
			String linha = reader.readLine();
			pangramas = new JLabel("<html>Please write the text below, at the end press Enter:<br> <html>" + linha);
			textPanel.add(pangramas);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

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

	}

	@Override
	public void keyTyped(KeyEvent e) {
		int key = e.getKeyCode();

		JButton button = null;

		switch (key) {
		// TODO Eventos da primeira linha de botoes
		case KeyEvent.VK_DEAD_TILDE:
			button = botoesLinha1[0];
			break;
		case KeyEvent.VK_1:
			button = botoesLinha1[1];
			break;

		case KeyEvent.VK_2:
			button = botoesLinha1[2];
			break;

		case KeyEvent.VK_3:
			button = botoesLinha1[3];
			break;

		case KeyEvent.VK_4:
			button = botoesLinha1[4];
			break;

		case KeyEvent.VK_5:
			button = botoesLinha1[5];
			break;

		case KeyEvent.VK_6:
			button = botoesLinha1[6];
			break;

		case KeyEvent.VK_7:
			button = botoesLinha1[7];
			break;

		case KeyEvent.VK_8:
			button = botoesLinha1[8];
			break;

		case KeyEvent.VK_9:
			button = botoesLinha1[9];
			break;

		case KeyEvent.VK_0:
			button = botoesLinha1[10];
			break;

		case KeyEvent.VK_MINUS:
			button = botoesLinha1[11];
			break;

		case KeyEvent.VK_EQUALS:
			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0) {
				button = botoesLinha1[12];
			}
			break;

		case KeyEvent.VK_BACK_SPACE:
			button = botoesLinha1[13];
			break;

		// TODO Eventos da segunda linha de botoes
		case KeyEvent.VK_TAB:
			button = botoesLinha2[0];
			break;

		case KeyEvent.VK_Q:
			button = botoesLinha2[1];
			break;

		case KeyEvent.VK_W:
			button = botoesLinha2[2];
			break;

		case KeyEvent.VK_E:
			button = botoesLinha2[3];
			break;

		case KeyEvent.VK_R:
			button = botoesLinha2[4];
			break;

		case KeyEvent.VK_T:
			button = botoesLinha2[5];
			break;

		case KeyEvent.VK_Y:
			button = botoesLinha2[6];
			break;

		case KeyEvent.VK_U:
			button = botoesLinha2[7];
			break;

		case KeyEvent.VK_I:
			button = botoesLinha2[8];
			break;

		case KeyEvent.VK_O:
			button = botoesLinha2[9];
			break;

		case KeyEvent.VK_P:
			button = botoesLinha2[10];
			break;

		case KeyEvent.VK_OPEN_BRACKET:
			button = botoesLinha2[11];
			break;

		case KeyEvent.VK_CLOSE_BRACKET:
			button = botoesLinha2[12];
			break;

		case KeyEvent.VK_SLASH:
			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0) {
				button = botoesLinha4[10];
			} else {
				button = botoesLinha2[13];
			}
			break;

		// TODO Eventos da terceira linha
		case KeyEvent.VK_CAPS_LOCK:
			button = botoesLinha3[0];
			break;

		case KeyEvent.VK_A:
			button = botoesLinha3[1];
			break;

		case KeyEvent.VK_S:
			button = botoesLinha3[2];
			break;

		case KeyEvent.VK_D:
			button = botoesLinha3[3];
			break;

		case KeyEvent.VK_F:
			button = botoesLinha3[4];
			break;

		case KeyEvent.VK_G:
			button = botoesLinha3[5];
			break;

		case KeyEvent.VK_H:
			button = botoesLinha3[6];
			break;

		case KeyEvent.VK_J:
			button = botoesLinha3[7];
			break;

		case KeyEvent.VK_K:
			button = botoesLinha3[8];
			break;

		case KeyEvent.VK_L:
			button = botoesLinha3[9];
			break;

		case KeyEvent.VK_SEMICOLON:
			button = botoesLinha3[10];
			break;

		case KeyEvent.VK_QUOTE:
			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0)
				button = botoesLinha3[11];
			break;

		case KeyEvent.VK_ENTER:
			button = botoesLinha3[12];
			break;

		// TODO Eventos da quarta linha de botoes
		case KeyEvent.VK_SHIFT:
			button = botoesLinha4[0];
			break;

		case KeyEvent.VK_Z:
			button = botoesLinha4[1];
			break;

		case KeyEvent.VK_X:
			button = botoesLinha4[2];
			break;

		case KeyEvent.VK_C:
			button = botoesLinha4[3];
			break;

		case KeyEvent.VK_V:
			button = botoesLinha4[4];
			break;

		case KeyEvent.VK_B:
			button = botoesLinha4[5];
			break;

		case KeyEvent.VK_N:
			button = botoesLinha4[6];
			break;

		case KeyEvent.VK_M:
			button = botoesLinha4[7];
			break;

		case KeyEvent.VK_COMMA:
			button = botoesLinha4[8];
			break;

		case KeyEvent.VK_PERIOD:
			button = botoesLinha4[9];
			break;

		case KeyEvent.VK_UP:
			button = botoesLinha4[11];
			break;

		// TODO Eventos da quinta linha de botoes
		case KeyEvent.VK_SPACE:
			button = botoesLinha5[0];
			break;

		case KeyEvent.VK_LEFT:
			button = botoesLinha5[1];
			break;

		case KeyEvent.VK_DOWN:
			button = botoesLinha5[2];
			break;

		case KeyEvent.VK_RIGHT:
			button = botoesLinha5[3];
			break;
		default:
			e.consume();
		}

		if (button != null) {
			button.setBackground(buttonColor);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// Reconhecimento[] reconhecimento = new Reconhecimento[teclasLinha1.length];
		// botoesLinha1 = new JButton[teclasLinha1.length];
		// for(int i = 0; i < teclasLinha1.length; i++) {
		// reconhecimento[i].tc(e, botoesLinha1[i], Color.GRAY);
		// }

		int key = e.getKeyCode();

		JButton button = null;

		// TODO Eventos da primeira linha de botoes
		switch (key) {
		case KeyEvent.VK_DEAD_TILDE:
			button = botoesLinha1[0];
			break;
		case KeyEvent.VK_1:
			button = botoesLinha1[1];
			break;

		case KeyEvent.VK_2:
			button = botoesLinha1[2];
			break;

		case KeyEvent.VK_3:
			button = botoesLinha1[3];
			break;

		case KeyEvent.VK_4:
			button = botoesLinha1[4];
			break;

		case KeyEvent.VK_5:
			button = botoesLinha1[5];
			break;

		case KeyEvent.VK_6:
			button = botoesLinha1[6];
			break;

		case KeyEvent.VK_7:
			button = botoesLinha1[7];
			break;

		case KeyEvent.VK_8:
			button = botoesLinha1[8];
			break;

		case KeyEvent.VK_9:
			button = botoesLinha1[9];
			break;

		case KeyEvent.VK_0:
			button = botoesLinha1[10];
			break;

		case KeyEvent.VK_MINUS:
			button = botoesLinha1[11];
			break;

		case KeyEvent.VK_EQUALS:
			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0) {
				button = botoesLinha1[12];
			}
			break;

		case KeyEvent.VK_BACK_SPACE:
			button = botoesLinha1[13];
			break;

		// TODO Eventos da segunda linha de botoes
		case KeyEvent.VK_TAB:
			button = botoesLinha2[0];
			break;

		case KeyEvent.VK_Q:
			button = botoesLinha2[1];
			break;

		case KeyEvent.VK_W:
			button = botoesLinha2[2];
			break;

		case KeyEvent.VK_E:
			button = botoesLinha2[3];
			break;

		case KeyEvent.VK_R:
			button = botoesLinha2[4];
			break;

		case KeyEvent.VK_T:
			button = botoesLinha2[5];
			break;

		case KeyEvent.VK_Y:
			button = botoesLinha2[6];
			break;

		case KeyEvent.VK_U:
			button = botoesLinha2[7];
			break;

		case KeyEvent.VK_I:
			button = botoesLinha2[8];
			break;

		case KeyEvent.VK_O:
			button = botoesLinha2[9];
			break;

		case KeyEvent.VK_P:
			button = botoesLinha2[10];
			break;

		case KeyEvent.VK_OPEN_BRACKET:
			button = botoesLinha2[11];
			break;

		case KeyEvent.VK_CLOSE_BRACKET:
			button = botoesLinha2[12];
			break;

		case KeyEvent.VK_SLASH:
			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0) {
				button = botoesLinha4[10];
			} else {
				button = botoesLinha2[13];
			}
			break;

		// TODO Eventos da terceira linha
		case KeyEvent.VK_CAPS_LOCK:
			button = botoesLinha3[0];
			break;

		case KeyEvent.VK_A:
			button = botoesLinha3[1];
			break;

		case KeyEvent.VK_S:
			button = botoesLinha3[2];
			break;

		case KeyEvent.VK_D:
			button = botoesLinha3[3];
			break;

		case KeyEvent.VK_F:
			button = botoesLinha3[4];
			break;

		case KeyEvent.VK_G:
			button = botoesLinha3[5];
			break;

		case KeyEvent.VK_H:
			button = botoesLinha3[6];
			break;

		case KeyEvent.VK_J:
			button = botoesLinha3[7];
			break;

		case KeyEvent.VK_K:
			button = botoesLinha3[8];
			break;

		case KeyEvent.VK_L:
			button = botoesLinha3[9];
			break;

		case KeyEvent.VK_SEMICOLON:
			button = botoesLinha3[10];
			break;

		case KeyEvent.VK_QUOTE:
			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0)
				button = botoesLinha3[11];
			break;

		case KeyEvent.VK_ENTER:
			button = botoesLinha3[12];
			break;

		// TODO Eventos da quarta linha de botoes
		case KeyEvent.VK_SHIFT:
			button = botoesLinha4[0];
			break;

		case KeyEvent.VK_Z:
			button = botoesLinha4[1];
			break;

		case KeyEvent.VK_X:
			button = botoesLinha4[2];
			break;

		case KeyEvent.VK_C:
			button = botoesLinha4[3];
			break;

		case KeyEvent.VK_V:
			button = botoesLinha4[4];
			break;

		case KeyEvent.VK_B:
			button = botoesLinha4[5];
			break;

		case KeyEvent.VK_N:
			button = botoesLinha4[6];
			break;

		case KeyEvent.VK_M:
			button = botoesLinha4[7];
			break;

		case KeyEvent.VK_COMMA:
			button = botoesLinha4[8];
			break;

		case KeyEvent.VK_PERIOD:
			button = botoesLinha4[9];
			break;

		case KeyEvent.VK_UP:
			button = botoesLinha4[11];
			break;

		// TODO Eventos da quinta linha de botoes
		case KeyEvent.VK_SPACE:
			button = botoesLinha5[0];
			break;

		case KeyEvent.VK_LEFT:
			button = botoesLinha5[1];
			break;

		case KeyEvent.VK_DOWN:
			button = botoesLinha5[2];
			break;

		case KeyEvent.VK_RIGHT:
			button = botoesLinha5[3];
			break;
		default:
			e.consume();
			JOptionPane.showMessageDialog(null, "Tecla invalida");
		}

		if (button != null) {
			button.setBackground(buttonColor);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Reconhecimento[] reconhecimento = new Reconhecimento[teclasLinha1.length];
		// botoesLinha1 = new JButton[teclasLinha1.length];
		// for(int i = 0; i < teclasLinha1.length; i++) {
		// reconhecimento[i].tc(e, botoesLinha1[i], Color.GRAY);
		// }

		int key = e.getKeyCode();

		JButton button = null;

		switch (key) {

		// TODO Eventos da primeira linha de botoes
		case KeyEvent.VK_DEAD_TILDE:
			button = botoesLinha1[0];
			break;

		case KeyEvent.VK_1:
			button = botoesLinha1[1];
			break;

		case KeyEvent.VK_2:
			button = botoesLinha1[2];
			break;

		case KeyEvent.VK_3:
			button = botoesLinha1[3];
			break;

		case KeyEvent.VK_4:
			button = botoesLinha1[4];
			break;

		case KeyEvent.VK_5:
			button = botoesLinha1[5];
			break;

		case KeyEvent.VK_6:
			button = botoesLinha1[6];
			break;

		case KeyEvent.VK_7:
			button = botoesLinha1[7];
			break;

		case KeyEvent.VK_8:
			button = botoesLinha1[8];
			break;

		case KeyEvent.VK_9:
			button = botoesLinha1[9];
			break;

		case KeyEvent.VK_0:
			button = botoesLinha1[10];
			break;

		case KeyEvent.VK_MINUS:
			button = botoesLinha1[11];
			break;

		case KeyEvent.VK_EQUALS:
			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0) {
				button = botoesLinha1[12];
			}
			break;

		case KeyEvent.VK_BACK_SPACE:
			button = botoesLinha1[13];
			break;

		// TODO Eventos da segunda linha de botoes
		case KeyEvent.VK_TAB:
			button = botoesLinha2[0];
			break;

		case KeyEvent.VK_Q:
			button = botoesLinha2[1];
			break;

		case KeyEvent.VK_W:
			button = botoesLinha2[2];
			break;

		case KeyEvent.VK_E:
			button = botoesLinha2[3];
			break;

		case KeyEvent.VK_R:
			button = botoesLinha2[4];
			break;

		case KeyEvent.VK_T:
			button = botoesLinha2[5];
			break;

		case KeyEvent.VK_Y:
			button = botoesLinha2[6];
			break;

		case KeyEvent.VK_U:
			button = botoesLinha2[7];
			break;

		case KeyEvent.VK_I:
			button = botoesLinha2[8];
			break;

		case KeyEvent.VK_O:
			button = botoesLinha2[9];
			break;

		case KeyEvent.VK_P:
			button = botoesLinha2[10];
			break;

		case KeyEvent.VK_OPEN_BRACKET:
			button = botoesLinha2[11];
			break;

		case KeyEvent.VK_CLOSE_BRACKET:
			button = botoesLinha2[12];
			break;

		case KeyEvent.VK_SLASH:
			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0) {
				button = botoesLinha4[10];
			} else {
				button = botoesLinha2[13];
			}
			break;

		// TODO Eventos da terceira linha de botoes
		case KeyEvent.VK_CAPS_LOCK:
			button = botoesLinha3[0];
			break;

		case KeyEvent.VK_A:
			button = botoesLinha3[1];
			break;

		case KeyEvent.VK_S:
			button = botoesLinha3[2];
			break;

		case KeyEvent.VK_D:
			button = botoesLinha3[3];
			break;

		case KeyEvent.VK_F:
			button = botoesLinha3[4];
			break;

		case KeyEvent.VK_G:
			button = botoesLinha3[5];
			break;

		case KeyEvent.VK_H:
			button = botoesLinha3[6];
			break;

		case KeyEvent.VK_J:
			button = botoesLinha3[7];
			break;

		case KeyEvent.VK_K:
			button = botoesLinha3[8];
			break;

		case KeyEvent.VK_L:
			button = botoesLinha3[9];
			break;

		case KeyEvent.VK_SEMICOLON:
			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0)
				button = botoesLinha3[10];
			break;

		case KeyEvent.VK_QUOTE:
			if ((e.getModifiers() & KeyEvent.SHIFT_MASK) > 0)
				button = botoesLinha3[11];
			break;

		case KeyEvent.VK_ENTER:
			button = botoesLinha3[12];
			break;

		// TODO Eventos da quarta linha de botoes
		case KeyEvent.VK_SHIFT:
			button = botoesLinha4[0];
			break;

		case KeyEvent.VK_Z:
			button = botoesLinha4[1];
			break;

		case KeyEvent.VK_X:
			button = botoesLinha4[2];
			break;

		case KeyEvent.VK_C:
			button = botoesLinha4[3];
			break;

		case KeyEvent.VK_V:
			button = botoesLinha4[4];
			break;

		case KeyEvent.VK_B:
			button = botoesLinha4[5];
			break;

		case KeyEvent.VK_N:
			button = botoesLinha4[6];
			break;

		case KeyEvent.VK_M:
			button = botoesLinha4[7];
			break;

		case KeyEvent.VK_COMMA:
			button = botoesLinha4[8];
			break;

		case KeyEvent.VK_PERIOD:
			button = botoesLinha4[9];
			break;

		case KeyEvent.VK_UP:
			button = botoesLinha4[11];
			break;

		// TODO Eventos da quinta linha de botoes
		case KeyEvent.VK_SPACE:
			button = botoesLinha5[0];
			break;

		case KeyEvent.VK_LEFT:
			button = botoesLinha5[1];
			break;

		case KeyEvent.VK_DOWN:
			button = botoesLinha5[2];
			break;

		case KeyEvent.VK_RIGHT:
			button = botoesLinha5[3];
			break;
		default:
			e.consume();
		}

		if (button != null) {
			button.setBackground(Color.GRAY);
		}
	}

}
