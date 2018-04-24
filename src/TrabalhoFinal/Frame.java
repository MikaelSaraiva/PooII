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
	private Upgrade upgrade;
	private JLabel telaAcumulador;
	private JLabel labelLevel;
	private JButton botaoAcumulador;
	private JButton botaoTeste;
	private JButton botaoCompra1;
	private JButton botaoCompra2;
	private JButton botaoCompra3;
	private JButton botaoCompra4;
	private JButton botaoCompra5;
	private JButton botaoCompra6;
	private JButton botaoCompra7;
	private JButton botaoCompra8;
	private JButton botaoCompra9;
	private JButton botaoCompra10;
	private JLabel telaUpgrade;
	private final int CUSTO = 1;
	private final int TEMPO = 1;

	public Frame() {
		super("Joguinho muito louco");

		clicker = new Clicker();
		upgrade = new Upgrade(clicker);

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

		botaoTeste = new JButton("Upgrade " + " (" + upgrade.getCusto() + " processinhos");
		add(botaoTeste);
		botaoTeste.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {

				if (clicker.getAcumulador() >= upgrade.getCusto()) {
					clicker.setAcumulador(clicker.getAcumulador() - upgrade.getCusto());
					upgrade.upgrade();
					telaUpgrade.setText("Upgrade: " + upgrade.getUpgrade());
				}

			}
		});

		// botaoCompra1 = new JButton("Upgrade 1 (" + CUSTO * 2 + " precessinhos)");
		// botaoCompra1.setSize(100, 100);
		// add(botaoCompra1);
		// botaoCompra1.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent event) {
		//
		// if (clicker.getAcumulador() >= CUSTO * 2) {
		// clicker.setAcumulador(clicker.getAcumulador() - CUSTO * 2);
		// Timer time = new Timer();
		// time.scheduleAtFixedRate(new TimerTask() {
		// @Override
		// public void run() {
		// clicker.acumular();
		// telaAcumulador.setText("Processinhos: " + clicker.getAcumulador());
		//
		// }
		// }, 0, 10000 * TEMPO);
		// telaUpgrade.setText("Upgrade: 1");
		// botaoCompra1.setVisible(false);
		// botaoCompra2.setVisible(true);
		// }
		//
		// }
		// });
		//
		// botaoCompra2 = new JButton("Upgrade 2 (" + CUSTO * 4 + " precessinhos)");
		// botaoCompra2.setSize(100, 100);
		// botaoCompra2.setVisible(false);
		// add(botaoCompra2);
		// botaoCompra2.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent event) {
		//
		// if (clicker.getAcumulador() >= CUSTO * 4) {
		// clicker.setAcumulador(clicker.getAcumulador() - CUSTO * 4);
		// Timer time = new Timer();
		// time.scheduleAtFixedRate(new TimerTask() {
		// @Override
		// public void run() {
		// clicker.acumular();
		// telaAcumulador.setText("Processinhos: " + clicker.getAcumulador());
		//
		// }
		// }, 0, 5000 * TEMPO);
		// telaUpgrade.setText("Upgrade: 2");
		// botaoCompra2.setVisible(false);
		// botaoCompra3.setVisible(true);
		//
		// }
		// }
		// });
		//
		// botaoCompra3 = new JButton("Upgrade 3 (" + CUSTO * 8 + " precessinhos)");
		// botaoCompra3.setSize(100, 100);
		// botaoCompra3.setVisible(false);
		// add(botaoCompra3);
		// botaoCompra3.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent event) {
		//
		// if (clicker.getAcumulador() >= CUSTO * 8) {
		// clicker.setAcumulador(clicker.getAcumulador() - CUSTO * 8);
		// Timer time = new Timer();
		// time.scheduleAtFixedRate(new TimerTask() {
		// @Override
		// public void run() {
		// clicker.acumular();
		// telaAcumulador.setText("Processinhos: " + clicker.getAcumulador());
		//
		// }
		// }, 0, 2500 * TEMPO);
		// telaUpgrade.setText("Upgrade: 3");
		// botaoCompra3.setVisible(false);
		// botaoCompra4.setVisible(true);
		// }
		// }
		// });
		//
		// botaoCompra4 = new JButton("Upgrade 4 (" + CUSTO * 16 + " precessinhos)");
		// botaoCompra4.setSize(100, 100);
		// botaoCompra4.setVisible(false);
		// add(botaoCompra4);
		// botaoCompra4.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent event) {
		//
		// if (clicker.getAcumulador() >= CUSTO * 16) {
		// clicker.setAcumulador(clicker.getAcumulador() - CUSTO * 16);
		// Timer time = new Timer();
		// time.scheduleAtFixedRate(new TimerTask() {
		// @Override
		// public void run() {
		// clicker.acumular();
		// telaAcumulador.setText("Processinhos: " + clicker.getAcumulador());
		//
		// }
		// }, 0, 1250 * TEMPO);
		// telaUpgrade.setText("Upgrade: 4");
		// botaoCompra4.setVisible(false);
		// botaoCompra5.setVisible(true);
		// }
		// }
		// });
		//
		// botaoCompra5 = new JButton("Upgrade 5 (" + CUSTO * 32 + " precessinhos)");
		// botaoCompra5.setSize(100, 100);
		// botaoCompra5.setVisible(false);
		// add(botaoCompra5);
		// botaoCompra5.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent event) {
		//
		// if (clicker.getAcumulador() >= CUSTO * 32) {
		// clicker.setAcumulador(clicker.getAcumulador() - CUSTO * 32);
		// Timer time = new Timer();
		// time.scheduleAtFixedRate(new TimerTask() {
		// @Override
		// public void run() {
		// clicker.acumular();
		// telaAcumulador.setText("Processinhos: " + clicker.getAcumulador());
		//
		// }
		// }, 0, 0625 * TEMPO);
		// telaUpgrade.setText("Upgrade: 5");
		// botaoCompra5.setVisible(false);
		// botaoCompra6.setVisible(true);
		//
		// }
		// }
		// });
		//
		// botaoCompra6 = new JButton("Upgrade 6 (" + CUSTO * 64 + " precessinhos)");
		// botaoCompra6.setSize(100, 100);
		// botaoCompra6.setVisible(false);
		// add(botaoCompra6);
		// botaoCompra6.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent event) {
		//
		// if (clicker.getAcumulador() >= CUSTO * 64) {
		// clicker.setAcumulador(clicker.getAcumulador() - CUSTO * 64);
		// Timer time = new Timer();
		// time.scheduleAtFixedRate(new TimerTask() {
		// @Override
		// public void run() {
		// clicker.acumular();
		// telaAcumulador.setText("Processinhos: " + clicker.getAcumulador());
		//
		// }
		// }, 0, 0312 * TEMPO);
		// telaUpgrade.setText("Upgrade: 6");
		// botaoCompra6.setVisible(false);
		// botaoCompra7.setVisible(true);
		//
		// }
		// }
		// });
		//
		// botaoCompra7 = new JButton("Upgrade 7 (" + CUSTO * 128 + " precessinhos)");
		// botaoCompra7.setSize(100, 100);
		// botaoCompra7.setVisible(false);
		// add(botaoCompra7);
		// botaoCompra7.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent event) {
		//
		// if (clicker.getAcumulador() >= CUSTO * 128) {
		// clicker.setAcumulador(clicker.getAcumulador() - CUSTO * 128);
		// Timer time = new Timer();
		// time.scheduleAtFixedRate(new TimerTask() {
		// @Override
		// public void run() {
		// clicker.acumular();
		// telaAcumulador.setText("Processinhos: " + clicker.getAcumulador());
		//
		// }
		// }, 0, 0156 * TEMPO);
		// telaUpgrade.setText("Upgrade: 7");
		// botaoCompra7.setVisible(false);
		// botaoCompra8.setVisible(true);
		//
		// }
		// }
		// });
		//
		// botaoCompra8 = new JButton("Upgrade 8 (" + CUSTO * 256 + " precessinhos)");
		// botaoCompra8.setSize(100, 100);
		// botaoCompra8.setVisible(false);
		// add(botaoCompra8);
		// botaoCompra8.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent event) {
		//
		// if (clicker.getAcumulador() >= CUSTO * 256) {
		// clicker.setAcumulador(clicker.getAcumulador() - CUSTO * 256);
		// Timer time = new Timer();
		// time.scheduleAtFixedRate(new TimerTask() {
		// @Override
		// public void run() {
		// clicker.acumular();
		// telaAcumulador.setText("Processinhos: " + clicker.getAcumulador());
		//
		// }
		// }, 0, (78 * TEMPO));
		// telaUpgrade.setText("Upgrade: 8");
		// botaoCompra8.setVisible(false);
		// botaoCompra9.setVisible(true);
		//
		// }
		// }
		// });
		//
		// botaoCompra9 = new JButton("Upgrade 9 (" + CUSTO * 512 + " precessinhos)");
		// botaoCompra9.setSize(100, 100);
		// botaoCompra9.setVisible(false);
		// add(botaoCompra9);
		// botaoCompra9.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent event) {
		//
		// if (clicker.getAcumulador() >= CUSTO * 512) {
		// clicker.setAcumulador(clicker.getAcumulador() - CUSTO * 512);
		// Timer time = new Timer();
		// time.scheduleAtFixedRate(new TimerTask() {
		// @Override
		// public void run() {
		// clicker.acumular();
		// telaAcumulador.setText("Processinhos: " + clicker.getAcumulador());
		//
		// }
		// }, 0, 39 * TEMPO);
		// telaUpgrade.setText("Upgrade: 9");
		// botaoCompra9.setVisible(false);
		// botaoCompra10.setVisible(true);
		// }
		// }
		// });
		//
		// botaoCompra10 = new JButton("Upgrade 10 (" + CUSTO * 1024 + "
		// precessinhos)");
		// botaoCompra10.setSize(100, 100);
		// botaoCompra10.setVisible(false);
		// add(botaoCompra10);
		// botaoCompra10.addActionListener(new ActionListener() {
		//
		// @Override
		// public void actionPerformed(ActionEvent event) {
		//
		// if (clicker.getAcumulador() >= CUSTO * 1024) {
		// clicker.setAcumulador(clicker.getAcumulador() - CUSTO * 1024);
		// Timer time = new Timer();
		// time.scheduleAtFixedRate(new TimerTask() {
		// @Override
		// public void run() {
		// clicker.acumular();
		// telaAcumulador.setText("Processinhos: " + clicker.getAcumulador());
		//
		// }
		// }, 0, 19 * TEMPO);
		// telaUpgrade.setText("Upgrade: 10");
		// botaoCompra10.setEnabled(false);
		// }
		// }
		// });

	}

}
