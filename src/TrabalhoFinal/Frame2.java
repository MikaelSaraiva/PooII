package TrabalhoFinal;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame2 extends JFrame {

	private BoxLayout boxLayout;
	private JLabel processos;
	private JLabel level;
	private JLabel labelClick;
	private JLabel labelAuto;
	private JButton acumular;
	private JButton clickUp;
	private JButton autoClick;
	private Clicker jogo;
	private Upgrade upgradeJogo;

	public Frame2() {
		super("Pulando cadeiras");

		jogo = new Clicker();
		upgradeJogo = new Upgrade();

		boxLayout = new BoxLayout(this, BoxLayout.LINE_AXIS);
		setLayout(boxLayout);

//		processos = new JLabel("Processos: " + jogo.getAcumulador());
//		add(processos);

		level = new JLabel("Level: " + jogo.getLevel());
		boxLayout.addLayoutComponent("Level",level);

//		labelClick = new JLabel("Quantidade de cadeiras" + (upgradeJogo.getMulti() - 1));
//		add(labelClick);
//
//		labelAuto = new JLabel("Quantidade de alunos fazendo Artigos : 0");
//		add(labelAuto);
//
//		acumular = new JButton("Click para pular");
//		add(acumular);

	}

//	private void addComponent(Component component, int row, int column, int width, int height) {
//		constraints.gridx = column;
//		constraints.gridy = row;
//		constraints.gridwidth = width;
//		constraints.gridheight = height;
//		boxLayout.setConstraints(component, constraints);
//		add(component);
//	}
}
