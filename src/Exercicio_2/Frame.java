package Exercicio_2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Frame extends JFrame implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String[] teclasLinha1 = { "~", "1", "2", "3", "4", "5", "6", "7",
			"8", "9", "0", "-", "+", "Backspace" }; // 14 botoes
	private String[] teclasLinha2 = { "Tab", "Q", "W", "E", "R", "T", "Y", "U",
			"I", "O", "P", "[", "]", "/" }; // 14 botoes
	private String[] teclasLinha3 = { "Caps", "A", "S", "D", "F", "G", "H", "J",
			"K", "L", ":", "\"", "Enter" }; // 13 botoes
	private String[] teclasLinha4 = { "Shift", "Z", "X", "C", "V", "B", "N",
			"M", ",", ".", "?", "/\\" }; // 12 botoes
	private String[] teclasLinha5 = { " ", "<", "\\/", ">" }; // 4 botoes
	private JButton[] botoesLinha1;
	private JButton[] botoesLinha2;
	private JButton[] botoesLinha3;
	private JButton[] botoesLinha4;
	private JButton[] botoesLinha5;
	private JTextArea textArea;
	private JLabel informacao;
	private JLabel pangramas;
	private Color buttonColor = null;
	private Reconhecimento texto = new Reconhecimento();

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
				"<html>Type some text using your keyboard. The keys you press will be highlighted and the text will be displayed.<br>" +
						"Note: Clicking the buttons with your mouse will not perform any action.<html>");
		textPanel.add(informacao);

		textArea = new JTextArea(18, 90);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("MONOSPACED", Font.PLAIN, 12));
		textPanel.add(textArea);
		textArea.addKeyListener(this);

		pangramas = new JLabel(
				"<html>Please write the text below, at the end press Enter:<br> <html> " +
						texto.getTexto());
		textPanel.add(pangramas);

		int larguraAltura = 50;
		int espacamento = larguraAltura + 2;
		int entreLinha = larguraAltura + 2;

		botoesLinha1 = new JButton[teclasLinha1.length];
		for (int i = 0; i < teclasLinha1.length; i++) {
			botoesLinha1[i] = new JButton(teclasLinha1[i]);
			botoesLinha1[i].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha1[i].setBounds((espacamento * i), entreLinha,
					larguraAltura, larguraAltura);
			keybordPanel.add(botoesLinha1[i]);
		}
		{
			int ultimoBotao = teclasLinha1.length - 1;
			botoesLinha1[ultimoBotao]
					.setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha1[ultimoBotao].setBounds((espacamento * ultimoBotao),
					entreLinha, larguraAltura * 2, larguraAltura);
			botoesLinha1[ultimoBotao].setMargin(new Insets(0, 0, 0, 0));
		}

		botoesLinha2 = new JButton[teclasLinha2.length];
		for (int i = 1; i < teclasLinha2.length; i++) {
			botoesLinha2[i] = new JButton(teclasLinha2[i]);
			botoesLinha2[0] = new JButton(teclasLinha2[0]);
			botoesLinha2[i].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha2[0].setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha2[i].setBounds((espacamento * i + 25), entreLinha * 2,
					larguraAltura, larguraAltura);
			botoesLinha2[0].setBounds((espacamento * 0), entreLinha * 2,
					(larguraAltura + (larguraAltura / 2)), larguraAltura);
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
			botoesLinha3[ultimoBotao]
					.setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha3[i].setBounds((espacamento * i + 25), entreLinha * 3,
					larguraAltura, larguraAltura);
			botoesLinha3[0].setBounds((espacamento * 0), entreLinha * 3,
					(larguraAltura + (larguraAltura / 2)), larguraAltura);
			botoesLinha3[ultimoBotao].setBounds(
					(espacamento * ultimoBotao + 25), entreLinha * 3,
					larguraAltura * 2, larguraAltura);
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
			botoesLinha4[ultimoBotao]
					.setFont(new Font("Serif", Font.PLAIN, 14));
			botoesLinha4[i].setBounds(espacamento * (i + 1) - 2, entreLinha * 4,
					larguraAltura, larguraAltura);
			botoesLinha4[ultimoBotao].setBounds((espacamento * 12 + 25),
					entreLinha * 4, larguraAltura, larguraAltura);
			botoesLinha4[0].setBounds(espacamento * 0, entreLinha * 4,
					larguraAltura * 2, larguraAltura);
			keybordPanel.add(botoesLinha4[i]);
			keybordPanel.add(botoesLinha4[0]);
			keybordPanel.add(botoesLinha4[ultimoBotao]);

		}

		botoesLinha5 = new JButton[teclasLinha5.length];
		botoesLinha5[0] = new JButton(teclasLinha5[0]);
		botoesLinha5[0].setBounds(espacamento * (3 + 1) - 2, entreLinha * 5,
				larguraAltura * 6, larguraAltura);
		keybordPanel.add(botoesLinha5[0]);

		botoesLinha5[1] = new JButton(teclasLinha5[1]);
		botoesLinha4[1].setFont(new Font("Serif", Font.PLAIN, 14));
		botoesLinha5[1].setBounds((espacamento * 11 + 25), entreLinha * 5,
				larguraAltura, larguraAltura);
		keybordPanel.add(botoesLinha5[1]);

		botoesLinha5[2] = new JButton(teclasLinha5[2]);
		botoesLinha4[2].setFont(new Font("Serif", Font.PLAIN, 14));
		botoesLinha5[2].setBounds((espacamento * 12 + 25), entreLinha * 5,
				larguraAltura, larguraAltura);
		keybordPanel.add(botoesLinha5[2]);
		botoesLinha5[3] = new JButton(teclasLinha5[3]);
		botoesLinha4[3].setFont(new Font("Serif", Font.PLAIN, 14));
		botoesLinha5[3].setBounds((espacamento * 13 + 25), entreLinha * 5,
				larguraAltura, larguraAltura);
		keybordPanel.add(botoesLinha5[3]);

		try {
			textArea.setText(texto.carrega());
		} catch (IOException | ClassNotFoundException e) {
			System.out.println();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		Reconhecimento reconhecimento1 = new Reconhecimento(teclasLinha1);
		Reconhecimento reconhecimento2 = new Reconhecimento(teclasLinha2);
		Reconhecimento reconhecimento3 = new Reconhecimento(teclasLinha3);
		Reconhecimento reconhecimento4 = new Reconhecimento(teclasLinha4);
		Reconhecimento reconhecimento5 = new Reconhecimento(teclasLinha5);

		if (!(reconhecimento1.tc(e, botoesLinha1, Color.GRAY) ||
				reconhecimento2.tc(e, botoesLinha2, Color.GRAY) ||
				reconhecimento3.tc(e, botoesLinha3, Color.GRAY) ||
				reconhecimento4.tc(e, botoesLinha4, Color.GRAY) ||
				reconhecimento5.tc(e, botoesLinha5, Color.GRAY))) {
			e.consume();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		Reconhecimento reconhecimento1 = new Reconhecimento(teclasLinha1);
		Reconhecimento reconhecimento2 = new Reconhecimento(teclasLinha2);
		Reconhecimento reconhecimento3 = new Reconhecimento(teclasLinha3);
		Reconhecimento reconhecimento4 = new Reconhecimento(teclasLinha4);
		Reconhecimento reconhecimento5 = new Reconhecimento(teclasLinha5);

		if (!(reconhecimento1.tc(e, botoesLinha1, buttonColor) ||
				reconhecimento2.tc(e, botoesLinha2, buttonColor) ||
				reconhecimento3.tc(e, botoesLinha3, buttonColor) ||
				reconhecimento4.tc(e, botoesLinha4, buttonColor) ||
				reconhecimento5.tc(e, botoesLinha5, buttonColor))) {
			JOptionPane.showMessageDialog(null, "Tecla Invalida");
			e.consume();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		Reconhecimento reconhecimento1 = new Reconhecimento(teclasLinha1);
		Reconhecimento reconhecimento2 = new Reconhecimento(teclasLinha2);
		Reconhecimento reconhecimento3 = new Reconhecimento(teclasLinha3);
		Reconhecimento reconhecimento4 = new Reconhecimento(teclasLinha4);
		Reconhecimento reconhecimento5 = new Reconhecimento(teclasLinha5);

		if (!(reconhecimento1.tc(e, botoesLinha1, Color.GRAY) ||
				reconhecimento2.tc(e, botoesLinha2, Color.GRAY) ||
				reconhecimento3.tc(e, botoesLinha3, Color.GRAY) ||
				reconhecimento4.tc(e, botoesLinha4, Color.GRAY) ||
				reconhecimento5.tc(e, botoesLinha5, Color.GRAY))) {
			e.consume();
			JOptionPane.showMessageDialog(null, "Tecla Invalida");
		}
		int[] acertosErros = texto.precisao(textArea.getText(), e);

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			JOptionPane.showMessageDialog(null,	String.format("Acertos: %d, Erros: %d\n", acertosErros[0], acertosErros[1]));
			botoesLinha3[12].setBackground(buttonColor);
			pangramas.setText(
				"<html>Please write the text below, at the end press Enter:<br> <html> " +
						texto.geraTexto());;
			texto.setAcertosErros(0, 0);
		}

		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			texto.salvar(textArea.getText());
		}
	}
}
