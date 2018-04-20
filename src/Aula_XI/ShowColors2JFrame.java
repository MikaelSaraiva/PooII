package Aula_XI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ShowColors2JFrame extends JFrame{
	private JButton changeColorJButton;
	private Color color = Color.LIGHT_GRAY;
	private JPanel colorJPanel;
	private JButton voltarInicial;
	
	public ShowColors2JFrame() {
		super("Usando JColorChooser");
		
		//cria JPanel para exibir as cores
		colorJPanel = new JPanel();
		colorJPanel.setBackground(color);
	
		//configura changeColorButton e registra seu handler de evento
		changeColorJButton = new JButton("Mudar cor");
		changeColorJButton.addActionListener(
			new ActionListener() { //classe interna an�nima
			@Override //exibe JColorChooser quando o usu�rio clica no bot�o
			public void actionPerformed(ActionEvent arg0) {
				color = JColorChooser.showDialog(ShowColors2JFrame.this, "Escolhe uma cor", color); 
				//JColorChooser.showDialog(Component,T�tulo, Cor inicial) --> component � o componente que gera o dialog. 
				
				if (color == null) //configura a cor padr�o, se nenhuma cor for retornada
					color = Color.LIGHT_GRAY;
				
				colorJPanel.setBackground(color); //muda a cor de fundo do painel de conte�do
			} //fim action performed
			} //fim classe interna an�nima
		); //fim chamada addActionListener
		
		voltarInicial = new JButton("Voltar a cor inicial");
		voltarInicial.addActionListener(
			new ActionListener() { //classe interna an�nima
			@Override //exibe JColorChooser quando o usu�rio clica no bot�o
			public void actionPerformed(ActionEvent arg0) {
							
				colorJPanel.setBackground(Color.LIGHT_GRAY); //muda a cor de fundo do painel de conte�do
				
			} //fim action performed
			} //fim classe interna an�nima
		); //fim chamada addActionListener		
		add(voltarInicial, BorderLayout.NORTH);
		
		
		add(colorJPanel, BorderLayout.CENTER); //adiciona colorJPanel
		add(changeColorJButton, BorderLayout.SOUTH); //adiciona bot�o
		
		setSize(400, 130); // configura tamanho do frame
		setVisible(true); //exibe o frame
	}
	
	public static void main(String[] args) {
		ShowColors2JFrame application = new ShowColors2JFrame();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
