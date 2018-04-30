package TrabalhoFinal;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame2 extends JFrame {

	private GridBagConstraints constraints;
	private GridBagLayout gridLayout;
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

		gridLayout = new GridBagLayout();
		constraints = new GridBagConstraints();
		setLayout(gridLayout);

		processos = new JLabel("Processos: " + jogo.getAcumulador());
		addComponent(processos, 0, 0, 3, 1);

		level = new JLabel("Level: " + jogo.getLevel());
		addComponent(level, 1, 0, 3, 1);

		labelClick = new JLabel("Quantidade de cadeiras" + (upgradeJogo.getMulti() - 1));
		addComponent(labelClick, 2, 0, 7, 1);

		labelAuto = new JLabel("Quantidade de alunos fazendo Artigos : 0");
		addComponent(labelAuto, 3, 0, 9, 1);

		acumular = new JButton("Click para pular");
		addComponent(acumular, 0, 4, 2, 2);

	}

	private void addComponent(Component component, int row, int column, int width, int height) {
		constraints.gridx = column;
		constraints.gridy = row;
		constraints.gridwidth = width;
		constraints.gridheight = height;
		gridLayout.setConstraints(component, constraints);
		add(component);
	}
}
