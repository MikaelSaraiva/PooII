package TrabalhoFinal;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
				new Upgrade(clicker, 1, 3000),
				new Upgrade(clicker, 2, 2900),
				new Upgrade(clicker, 3, 2800),
				new Upgrade(clicker, 5, 2700),
				new Upgrade(clicker, 8, 2600),
				new Upgrade(clicker, 13, 2500),
				new Upgrade(clicker, 4, 2400),
				new Upgrade(clicker, 4, 2300),
				new Upgrade(clicker, 4, 2200),
				new Upgrade(clicker, 4, 2100),
				new Upgrade(clicker, 4, 2000),
				new Upgrade(clicker, 4, 1900),
				new Upgrade(clicker, 4, 1800),
				new Upgrade(clicker, 4, 1700),
				new Upgrade(clicker, 4, 1600),
				new Upgrade(clicker, 4, 1500),
				new Upgrade(clicker, 4, 1400),
				new Upgrade(clicker, 4, 1300),
				new Upgrade(clicker, 4, 1200),
				new Upgrade(clicker, 4, 1100),
				new Upgrade(clicker, 4, 1000),
				new Upgrade(clicker, 4, 900),
				new Upgrade(clicker, 4, 800),
				new Upgrade(clicker, 4, 700),
				new Upgrade(clicker, 4, 600),
				new Upgrade(clicker, 4, 500),
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
				else
					JOptionPane.showMessageDialog(null, "Você não possui processinhos suficiente");
			});
		}
		buttons[0].setVisible(true);
	}
	
	private class fibonacci {
		
		ArrayList<Integer> fibonacci;
		
		
		public int fib(int n) {
			int numb = 0;
			int[] numbAux = new int[n];
			
			numbAux[1] = 1;
			numbAux[2] = 1;

			
			for (int i = 4; i < n; i++) {
			}
			
			return numb;
		}
		
		public void gerarFibonacci() {
			
			ArrayList<Integer> numero = new ArrayList<>();
			
			for (int i = 0; i < numero.size(); i++) {
				fib.add(i);
			}
			
		}
		
		public ArrayList<Integer> getFibonacci(){
			return fibonacci;
		}
	}

}
