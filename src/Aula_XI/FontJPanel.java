package Aula_XI;


import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FontJPanel extends JPanel {
	
	public void paintComponent(Graphics g){
		super.paintComponent(g); //chama o paintComponent da superclasse
		
		//fonte configurada como Serifa (Times), negrito, 12 pt e desenha uma string
		g.setFont(new Font("Serif", Font.BOLD, 12));
		g.drawString("Serif 12 point bold.", 20, 30);
		
		//ADICIONE O C�DIGO PARA MOSTRAR AS FONTES
		
		//1. Monospaced (Courier), italico, 24 pt
		g.setFont(new Font("Courier", Font.ITALIC, 24));
		
		
		//2. SansSerif (Helvetica), simples, 14 pt 
		
		//3. Serifa (Times), negrito/italico, 18 pt na cor vermelha.
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FontJPanel fontJPanel = new FontJPanel(); //cria o FontJPanel (JPanel)
		frame.add(fontJPanel); //adiciona o fontJpanel no Frame
		frame.setSize(420, 150); //configura tamanho do frame
		frame.setVisible(true); //exibe o frame
	}
}
