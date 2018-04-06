package Aula_IX;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Aula_VIII.testeFrame;

public class TesteFrame2 extends JFrame {

	private JLabel label;
	private JTextField campoT;
	private JButton botao;

	public TesteFrame2() {
		super("Meu Frame");

		setLayout(new FlowLayout());
		label = new JLabel("Escreva seu nome: ");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setVerticalAlignment(SwingConstants.TOP);
		add(label);

		campoT = new JTextField(15);
		campoT.setHorizontalAlignment(SwingConstants.CENTER);
		campoT.setAlignmentY(TOP_ALIGNMENT);
		add(campoT);

		botao = new JButton("Clique Aqui");
		botao.setHorizontalAlignment(SwingConstants.RIGHT);
		botao.setVerticalAlignment(SwingConstants.TOP);
		add(botao);

		
		OuvidorTexto ouvidorTexto = new OuvidorTexto();
		campoT.addActionListener(ouvidorTexto);
		
		OuvidorBotao ouvidorBotao = new OuvidorBotao();
		botao.addActionListener(ouvidorBotao);
	}

	private class OuvidorTexto implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			
			String string = "";
			
			if (event.getSource() == campoT)
				string = String.format("Nome: %s", campoT.getText());
			
			
			JOptionPane.showMessageDialog(null, string);
		}
	}
	private class OuvidorBotao implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent event) {
			
			JOptionPane.showMessageDialog(TesteFrame2.this,String.format("O seu nome é: %s", campoT.getText()));

		}
	}
}
