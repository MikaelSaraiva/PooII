package Aula_XII;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class JTabbedPaneFrame extends JFrame {
	// set up GUI
	public JTabbedPaneFrame() {
		super("JTabbedPane Demo ");
		JTabbedPane tabbedPane = new JTabbedPane(); // create JTabbedPane
		// set up pane11 and add it to JTabbedPane
		JLabel label1 = new JLabel( "panel um");
		JPanel panel1 = new JPanel(); // create first panel
		panel1.add( label1 ); // add label to panel
		tabbedPane.addTab( "Tab Um", null, panel1, "Primeiro Panel" );
		
		//CRIE O TAB PANEL2 COM O LABEL PANEL DOIS E BACKGROUND COM COR DIFERENTE � PADR�O MOSTRADA NA ABA
		
		// set up panel3 and add it to JTabbedPane
		JLabel label3 = new JLabel( "panel tres" );
		JPanel panel3 = new JPanel(); // create third panel
		panel3.setLayout( new BorderLayout() ); // use borderlayout
		panel3.add( new JButton( "North" ), BorderLayout.NORTH );
		panel3.add( new JButton( "West" ), BorderLayout.WEST );
		panel3.add( new JButton( "East" ), BorderLayout.EAST );
		panel3.add( new JButton( "South" ), BorderLayout.SOUTH );
		panel3.add( label3, BorderLayout.CENTER );
		tabbedPane.addTab( "Tab tres", null, panel3, "Terceiro Panel" );
		
		add( tabbedPane ); // add JTabbedPane to frame
	}

	public static void main(String[] args) {
		JTabbedPaneFrame tabbedPaneFrame = new JTabbedPaneFrame();
		tabbedPaneFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		tabbedPaneFrame.setSize( 250, 200 ); // set frame size
		tabbedPaneFrame.setVisible( true ); // display frame
	}
}
