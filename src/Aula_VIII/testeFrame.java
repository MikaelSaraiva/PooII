package Aula_VIII;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class testeFrame extends JFrame{
		
	private JLabel teste1;
	private JLabel teste2;
	private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;
	private JTextField texto4;
	private JTextField texto5;

	public testeFrame(){
		super("teste");
		
		setLayout(new FlowLayout());
		teste1 = new JLabel("Exercicio");
		teste1.setHorizontalAlignment(SwingConstants.CENTER);
		teste1.setVerticalAlignment(SwingConstants.TOP);
		add(teste1);
		
		Icon Imageteste2  = new ImageIcon(getClass().getResource("top5.jpg"));
		teste2 = new JLabel(Imageteste2);
		teste2.setHorizontalAlignment(SwingConstants.LEFT);
		teste2.setVerticalAlignment(SwingConstants.TOP);
		add(teste2);
		
		texto1 = new JTextField(5);
		add(texto1);
		
		texto2 = new JTextField(15);
		add(texto2);

		texto3 = new JTextField("Texto padrão");
		add(texto3);

		texto4 = new JTextField("Não editável");
		texto4.setEditable(false);
		add(texto4);

		texto5 = new JPasswordField("Password");
		add(texto5);

		TextFieldHandler handler = new TextFieldHandler();
		texto1.addActionListener(handler);
		texto2.addActionListener(handler);
		texto3.addActionListener(handler);
		texto4.addActionListener(handler);
		texto5.addActionListener(handler);

		JButton plainJButton = new JButton("Botão com texto");
		add(plainJButton);
		JButton fancyJButton = new JButton("Botão fancy", Imageteste2);
		add(fancyJButton);
		
		ButtonHandler handlerB = new ButtonHandler();
		plainJButton.addActionListener(handlerB);
		fancyJButton.addActionListener(handlerB);

		
	}
	private class TextFieldHandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			String string = "";
			
			if (event.getSource() == texto1)
				string = String.format("Campo de texto 1: Parabéns", event.getActionCommand());
			else if (event.getSource() == texto2)
				string = String.format("Campo de texto 2: Parabéns", event.getActionCommand());
			else if (event.getSource() == texto3)
				string = String.format("Campo de texto 3: Parabéns", event.getActionCommand());
			else if (event.getSource() == texto4)
				string = String.format("Campo de texto 4: Não faz nada certo em", event.getActionCommand());
			else if (event.getSource() == texto5)
				string = String.format("Campo de texto 5: Parabéns", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
		}
		
		
	}
	
	private class ButtonHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent event) {
			
			JOptionPane.showMessageDialog(testeFrame.this,String.format("Você pressionou: %s", event.getActionCommand()));
			
		}
	}
	
	
}
