package Aula_XII;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.Box.Filler;

public class DesktopFrame extends JFrame {

	private JDesktopPane theDesktop;

	public DesktopFrame() {
		super("Using a JDesktopPane");
		JMenuBar bar = new JMenuBar(); // create menu bar
		JMenu addMenu = new JMenu("Adicione"); // create Add menu
		JMenuItem newFrame = new JMenuItem("Frame interno");

		addMenu.add(newFrame); // add new frame item to Add menu
		bar.add(addMenu); // add Add menu to menu bar
		setJMenuBar(bar); // set menu bar for this application

		theDesktop = new JDesktopPane(); // create desktop pane
		add(theDesktop); // add desktop pane to frame

		// set up listener for newFrame menu item
		newFrame.addActionListener(new ActionListener() // anonymous inner class
				{
					// display new internal window
					public void actionPerformed(ActionEvent event) {
						// create internal frame JInternalFrame(String title,boolean resizable,boolean closable,
	                    //  boolean maximizable,boolean iconifiable)
						JInternalFrame frame = new JInternalFrame("Internal Frame", true, true, true, true);
						MyJPanel panel = new MyJPanel(); // create new panel
						frame.add(panel, BorderLayout.CENTER); // add panel
						frame.setSize(200, 100);
						theDesktop.add(frame); // attach internal frame
						frame.setVisible(true); // show internal frame
					}
				});
	}
	
	public static void main(String[] args) {
		DesktopFrame desktopFrame = new DesktopFrame();
		desktopFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		desktopFrame.setSize( 600, 480 ); // set frame size
		desktopFrame.setVisible( true ); // display frame

	}
}
	 class MyJPanel extends JPanel {

		private static Random generator = new Random();
		public MyJPanel() {
			JLabel label = new JLabel();
			label.setText("Teste " + generator.nextInt(100));
			this.add(label);
		} // end MyJPanel constructor
		
	 }
	
	

