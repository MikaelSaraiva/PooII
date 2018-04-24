package TrabalhoFinal;

import java.util.Timer;
import java.util.TimerTask;

public class Upgrade {

	private int upgrade;
	private Clicker clicker;
	private int custo = 1;
	private String telaAcumulador;

	public Upgrade(Clicker clicker) {
		this.clicker = clicker;
	}

	public void upgradeUp() {
		upgrade++;
	}

	public int getUpgrade() {
		return upgrade;
	}

	public void custo() {
		custo += custo;
	}

	public int getCusto() {
		return custo;
	}

	public void upgrade() {
		upgrade++;
		Timer time = new Timer();
		if (upgrade == 1) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					clicker.acumular();
					telaAcumulador = "Processinhos: " + clicker.getAcumulador();
				}
			}, 0, 10000);
		} else if (upgrade == 2) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					clicker.acumular();
					telaAcumulador = "Processinhos: " + clicker.getAcumulador();
				}
			}, 0, 9000);
		} else if (upgrade == 3) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					clicker.acumular();
					telaAcumulador = "Processinhos: " + clicker.getAcumulador();
				}
			}, 0, 8000);
		} else if (upgrade == 4) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					clicker.acumular();
					telaAcumulador = "Processinhos: " + clicker.getAcumulador();
				}
			}, 0, 7000);
		} else if (upgrade == 5) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					clicker.acumular();
					telaAcumulador = "Processinhos: " + clicker.getAcumulador();
				}
			}, 0, 6000);
		} else if (upgrade == 6) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					clicker.acumular();
					telaAcumulador = "Processinhos: " + clicker.getAcumulador();
				}
			}, 0, 5000);
		} else if (upgrade == 7) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					clicker.acumular();
					telaAcumulador = "Processinhos: " + clicker.getAcumulador();
				}
			}, 0, 4000);
		} else if (upgrade == 8) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					clicker.acumular();
					telaAcumulador = "Processinhos: " + clicker.getAcumulador();
				}
			}, 0, 3000);
		} else if (upgrade == 9) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					clicker.acumular();
					telaAcumulador = "Processinhos: " + clicker.getAcumulador();
				}
			}, 0, 2000);
		} else if (upgrade == 10) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {
					clicker.acumular();
					telaAcumulador = "Processinhos: " + clicker.getAcumulador();
				}
			}, 0, 1000);
		}
	}
}
