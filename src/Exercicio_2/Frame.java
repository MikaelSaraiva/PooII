package Exercicio_2;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame.JDesktopIcon;
import javax.swing.border.Border;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Frame extends JFrame {

	private String[] teclasLinha1 = { "~", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "+",
			"<html>Backspace<html>" };
	private String[] teclasLinha2 = { "Tab", "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", "/" };
	private String[] teclasLinha3 = { "Caps", "A", "S", "D", "F", "G", "H", "J", "K", "L", ":", "\"", "Enter" };
	private String[] teclasLinha4 = { "Shift", "Z", "X", "C", "V", "B", "N", "M", ",", ".", "?", "/\\" };
	private String[] teclasLinha5 = { "", "<", "\\/", ">" };
	private JButton[] botoesLinha1;
	private JButton[] botoesLinha2;
	private JButton[] botoesLinha3;
	private JButton[] botoesLinha4;
	private JButton[] botoesLinha5;
	private GridLayout layout;

	public Frame() {
		super("Typing Applicatiom");

		JPanel mainPanel = new JPanel();
		JPanel textPanel = new JPanel();
		JPanel keybordPanel = new JPanel();
		layout = new GridLayout(3, 14, 2, 2);

		keybordPanel.setLayout(null);

		mainPanel.setLayout(new GridLayout(2, 1));

		add(mainPanel);
		mainPanel.add(textPanel);
		mainPanel.add(keybordPanel);

		keybordPanel.setBackground(Color.BLACK);

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

		// botoesLinha2 = new JButton[teclasLinha2.length];
		// for (int i = 0; i < teclasLinha2.length; i++) {
		// botoesLinha2[i] = new JButton(teclasLinha2[i]);
		// botoesLinha2[i].setHorizontalTextPosition(SwingConstants.RIGHT);
		// botoesLinha2[i].setBounds((espacamento * i), entreLinha * 2, larguraAltura,
		// larguraAltura);
		// keybordPanel.add(botoesLinha2[i]);
		// }
		// botoesLinha3 = new JButton[teclasLinha3.length];
		// for (int i = 0; i < teclasLinha3.length; i++) {
		// botoesLinha3[i] = new JButton(teclasLinha3[i]);
		// botoesLinha3[i].setHorizontalTextPosition(SwingConstants.RIGHT);
		// botoesLinha3[i].setBounds((espacamento * i), entreLinha * 3, larguraAltura,
		// larguraAltura);
		// keybordPanel.add(botoesLinha3[i]);
		// }

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
			botoesLinha4[ultimoBotao].setBounds((espacamento * (ultimoBotao + 1) - 2), entreLinha * 4, larguraAltura,
					larguraAltura);
			botoesLinha4[0].setBounds(espacamento * 0, entreLinha * 4, larguraAltura * 2, larguraAltura);
			keybordPanel.add(botoesLinha4[i]);
			keybordPanel.add(botoesLinha4[0]);
			keybordPanel.add(botoesLinha4[ultimoBotao]);

		}

	}

}
