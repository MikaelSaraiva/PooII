package Aula_XI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LinesRectsOvalsJpanel extends JPanel {

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(Color.WHITE);
		
		g.setColor(Color.RED);
		g.drawLine(5, 30, 380, 30);
		
		g.setColor(Color.BLUE);
		g.drawRect(5, 40, 90, 55);
		g.fillRect(100, 40, 90, 55);
		
		g.setColor(Color.GREEN);
		g.drawRect(5, 100, 90, 55);
		g.fillRect(100, 100, 90, 55);

		
		g.setColor(Color.BLACK);
		g.fillRoundRect(200, 40, 90, 55, 50, 50);
		g.drawRoundRect(300, 40, 90, 55, 30, 30);
		
		g.setColor(Color.MAGENTA);
		g.drawOval(200, 100, 90, 55);
		g.fillOval(300, 100, 90, 55);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Desenhando linhas, retangulo e ovais");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LinesRectsOvalsJpanel linesRectsOvalsJpanel = new LinesRectsOvalsJpanel(); 
		frame.add(linesRectsOvalsJpanel); //adiciona o linesRectsOvalsJpanel no Frame
		frame.setSize(510, 240); //configura tamanho do frame
		frame.setVisible(true); //exibe o frame
	}
}
