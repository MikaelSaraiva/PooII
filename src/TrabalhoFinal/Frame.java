package TrabalhoFinal;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import Aula_VIII.testeFrame;

public class Frame extends JFrame {

	private Clicker clicker;
	private JLabel telaAcumulador;
	private JLabel labelLevel;
	private JButton botaoAcumulador;
	private JButton botaoCompra[];
	private final int QTDUPGRADE = 10;
	private JLabel telaUpgrade;
	private int i = 0;
	private final int CUSTO = 1;
	private final int TEMPO = 1;

	public Frame() {
		super("Joguinho muito louco");

		clicker = new Clicker();

		setLayout(new FlowLayout());
		telaAcumulador = new JLabel("Processinhos: " + clicker.getAcumulador());
		add(telaAcumulador);

		labelLevel = new JLabel("Level: " + clicker.getLevel());
		add(labelLevel);

		telaUpgrade = new JLabel("Upgrade: 0");
		add(telaUpgrade);

		botaoAcumulador = new JButton("Clique para processar mais");
		botaoAcumulador.setSize(100, 100);
		add(botaoAcumulador);
		botaoAcumulador.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				clicker.acumular();
				telaAcumulador.setText("Processinhos: " + clicker.getAcumulador());

			}
		});
		
		Upgrade[] upgrades = {
				new Upgrade(clicker, 1, 1000),
				new Upgrade(clicker, 2, 5000),
				new Upgrade(clicker, 4, 2500),
		};
		
		JButton[] buttons = new JButton[upgrades.length];
		for (int i = 0; i < upgrades.length; i++) {
			Upgrade upgrade = upgrades[i];
			buttons[i] = new JButton(
					String.format("Upgrade %d (%d processinhos)",
						      i + 1,
						      upgrade.getCusto()));
			JButton btnUpgrade = buttons[i];
			btnUpgrade.setSize(100, 100);
			btnUpgrade.setVisible(false);
			add(btnUpgrade);
			btnUpgrade.addActionListener((e) -> {
				int custo = CUSTO * upgrade.getCusto();
				if (clicker.getAcumulador() >= custo) {
					clicker.setAcumulador(clicker.getAcumulador() - custo);
					Timer time = new Timer();
					time.scheduleAtFixedRate(new TimerTask() {
						@Override
						public void run() {
							clicker.acumular();
							telaAcumulador.setText("Processinhos: " + clicker.getAcumulador());
						}
					}, 0, TEMPO * upgrade.getPeriodo());
					telaUpgrade.setText("Upgrade: " + (this.i + 1));
					if (this.i == upgrades.length - 1) {
						buttons[this.i].setEnabled(false);
					} else {
						buttons[this.i].setVisible(false);
						buttons[this.i + 1].setVisible(true);
						this.i++;
					}
				}
			});
		}
		buttons[0].setVisible(true);
	}

}
