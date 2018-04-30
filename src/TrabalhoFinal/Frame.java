package TrabalhoFinal;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ButtonGroup;
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
	private JButton multCompras1;
	private JButton multCompras10;
	private JButton multCompras100;
	private fibonacci fibo;
	private Upgrade[] upgrades;
	private Upgrade upgrade;
	private final int QTDUPGRADE = 500;
	private int repeticoes;
	private int multicompras;
	private int multiplicador = 1;
	private int j = 0;
	private int i = 0;
	private int cont = 0;
	private int custoPadrao = 1;
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
			buttons[i] = new JButton(String.format("Upgrade %d (%d processos)", (i + 1) ,
					(custoPadrao * upgrade.getCusto())));
			JButton btnUpgrade = buttons[i];
			btnUpgrade.setSize(100, 100);
			btnUpgrade.setVisible(false);
			add(btnUpgrade);
			btnUpgrade.addActionListener((e) -> {
				int custo = custoPadrao * upgrade.getCusto();
				if (clicker.getAcumulador() >= custo) {
					btnUpgrade.setEnabled(true);
					clicker.setAcumulador(clicker.getAcumulador() - custo);
					telaAcumulador.setText("Processos: " + clicker.getAcumulador());
					while (repeticoes < multicompras) {
						Timer time = new Timer();
						time.scheduleAtFixedRate(new TimerTask() {
							@Override
							public void run() {
								clicker.acumular(upgrade.getMulti());
								telaAcumulador.setText("Processos: " + clicker.getAcumulador());
							}
						}, 0, TEMPO * upgrade.getPeriodo());
						repeticoes++;
					}
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
			buttonsClick[j] = new JButton(String.format("Upgrade do Click %d (%d processos)", (j + 1) * multicompras,
					(custoPadrao * upgrade.getCusto())));
			JButton btnUpgrade = buttonsClick[j];
			btnUpgrade.setSize(100, 100);
			btnUpgrade.setVisible(false);
			add(btnUpgrade);
			btnUpgrade.addActionListener((e) -> {
				int custo = custoPadrao * upgrade.getCusto();
				if (clicker.getAcumulador() >= custo) {
					btnUpgrade.setEnabled(true);
					multiplicador++;
					upgradeClick.setText("Upgrade Click :" + (multiplicador - 1));
					clicker.setAcumulador(clicker.getAcumulador() - custo);
					telaAcumulador.setText("Processos: " + clicker.getAcumulador());
					if (this.j == upgrades.length - 1) {
						buttonsClick[this.j].setEnabled(false);
					} else {
						buttonsClick[this.j].setVisible(false);
						buttonsClick[this.j + 1].setVisible(true);
						this.j++;
					}
				} else
					JOptionPane.showMessageDialog(null, "Você não possui processos suficiente");
			});
		}
		buttonsClick[0].setVisible(true);

		multCompras1 = new JButton("1x");
		multCompras1.setEnabled(false);
		multCompras1.setSize(10, 10);
		add(multCompras1);
		multCompras1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				custoPadrao = 1;
				multicompras = 1;
				multCompras1.setEnabled(false);
				multCompras10.setEnabled(true);
				multCompras100.setEnabled(true);

			}
		});
		multCompras10 = new JButton("10x");
		multCompras10.setSize(10, 10);
		add(multCompras10);
		multCompras10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				custoPadrao = 10;
				multicompras = 10;
				multCompras1.setEnabled(true);
				multCompras10.setEnabled(false);
				multCompras100.setEnabled(true);
			}
		});
		multCompras100 = new JButton("100x");
		multCompras100.setSize(10, 10);
		add(multCompras100);
		multCompras100.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				custoPadrao = 100;
				multicompras = 100;
				multCompras1.setEnabled(true);
				multCompras10.setEnabled(true);
				multCompras100.setEnabled(false);
			}
		});

		// ButtonGroup multiplicadoresCompra = new ButtonGroup();
		// multiplicadoresCompra.add(multCompras1);
		// multiplicadoresCompra.add(multCompras10);
		// multiplicadoresCompra.add(multCompras100);

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
