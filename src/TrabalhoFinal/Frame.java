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

public class Frame extends JFrame {

	private Clicker clicker;
	private JLabel telaAcumulador;
	private JLabel labelLevel;
	private JLabel telaUpgrade;
	private JLabel upgradeClick;
	private JButton botaoAcumulador;
	private JButton multCompras;
	private fibonacci fibo;
	private Upgrade[] upgrades;
	private Upgrade upgrade;
	private final int QTDUPGRADE = 500;
	private int multiplicador = 1;
	private int j = 0;
	private int i = 0;
	private int cont = 0;
	private final int CUSTO = 1;
	private final int TEMPO = 1;

	public Frame() {
		super("Joguinho muito louco");

		fibo = new fibonacci();
		clicker = new Clicker();

		setLayout(new FlowLayout());
		telaAcumulador = new JLabel("Processinhos: " + clicker.getAcumulador());
		add(telaAcumulador);

		upgradeClick = new JLabel("Upgrade Click: " + (multiplicador - 1));
		add(upgradeClick);
		
		labelLevel = new JLabel("Level: " + clicker.getLevel());
		add(labelLevel);

		telaUpgrade = new JLabel("Upgrade: 0");
		add(telaUpgrade);

		botaoAcumulador = new JButton("Clique para pular mais");
		botaoAcumulador.setSize(100, 100);
		add(botaoAcumulador);
		botaoAcumulador.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				clicker.acumular(multiplicador);
				telaAcumulador.setText("Processos: " + clicker.getAcumulador());

			}
		});
		upgrades = new Upgrade[QTDUPGRADE];
		for (int j = 0; j < QTDUPGRADE; j++) {
			upgrades[j] = new Upgrade(clicker, fibo.fib(j), 5000 - (j * 2));
		}

		JButton[] buttons = new JButton[QTDUPGRADE];
		for (int i = 0; i < QTDUPGRADE; i++) {
			Upgrade upgrade = upgrades[i];
			buttons[i] = new JButton(String.format("Upgrade %d (%d processos)", i + 1, upgrade.getCusto()));
			JButton btnUpgrade = buttons[i];
			btnUpgrade.setSize(100, 100);
			btnUpgrade.setVisible(false);
			add(btnUpgrade);
			btnUpgrade.addActionListener((e) -> {
				int custo = CUSTO * upgrade.getCusto();
				if (clicker.getAcumulador() >= custo) {
					btnUpgrade.setEnabled(true);
					clicker.setAcumulador(clicker.getAcumulador() - custo);
					Timer time = new Timer();
					time.scheduleAtFixedRate(new TimerTask() {
						@Override
						public void run() {
							clicker.acumular(upgrade.getMulti());
							telaAcumulador.setText("Processos: " + clicker.getAcumulador());
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
					if (cont == 9) {
						clicker.levelUp();
						labelLevel.setText("Level: " + clicker.getLevel());
						cont = 0;
						JOptionPane.showMessageDialog(null, "Level Up");
					}
					cont++;
				} else
					JOptionPane.showMessageDialog(null, "Você não possui processos suficiente");
			});
		}
		buttons[0].setVisible(true);

		JButton[] buttonsClick = new JButton[QTDUPGRADE];
		for (int j = 0; j < QTDUPGRADE; j++) {
			Upgrade upgrade = upgrades[j];
			buttonsClick[j] = new JButton(
					String.format("Upgrade do Click %d (%d processos)", i + 1, upgrade.getCusto()));
			JButton btnUpgrade = buttonsClick[j];
			btnUpgrade.setSize(100, 100);
			btnUpgrade.setVisible(false);
			add(btnUpgrade);
			btnUpgrade.addActionListener((e) -> {
				int custo = CUSTO * upgrade.getCusto();
				if (clicker.getAcumulador() >= custo) {
					btnUpgrade.setEnabled(true);
					multiplicador++;
					upgradeClick.setText("Upgrade Click :" + (multiplicador - 1));
					clicker.setAcumulador(clicker.getAcumulador() - custo);
					if (this.j == upgrades.length - 1) {
						buttonsClick[this.j].setEnabled(false);
					} else {
						buttonsClick[this.j].setVisible(false);
						buttonsClick[this.j + 1].setVisible(true);
						this.j++;
					}
				} else
					JOptionPane.showMessageDialog(null, "Você não possui processos suficiente");
				System.out.println(multiplicador);
			});
		}
		buttonsClick[0].setVisible(true);
		
		multCompras = new JButton("1x");
		multCompras.setSize(10, 10);
		add(multCompras);
		multCompras.addActionListener(
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						
					}
				});
	}

	private class fibonacci {

		public int fib(int n) {
			long numb = 0;
			long[] numbAux = new long[n + 3];

			numbAux[0] = 1;
			numbAux[1] = 1;

			for (int i = 2; i < n + 3; i++) {
				numbAux[i] = numbAux[i - 1] + numbAux[i - 2];
			}
			numb = numbAux[n];

			return (int) numb;
		}

	}

}
