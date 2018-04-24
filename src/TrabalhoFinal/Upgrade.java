package TrabalhoFinal;

import java.util.Timer;
import java.util.TimerTask;

public class Upgrade {

	private int upgrade;

	public void upgradeUp() {
		upgrade++;
	}

	public int getUpgrade() {
		return upgrade;
	}

	public void upgrade() {
		Timer time = new Timer();
		if (upgrade == 1) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {

				}
			}, 0, 10000);
		} else if (upgrade == 2) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {

				}
			}, 0, 9000);
		} else if (upgrade == 3) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {

				}
			}, 0, 8000);
		} else if (upgrade == 4) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {

				}
			}, 0, 7000);
		} else if (upgrade == 5) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {

				}
			}, 0, 6000);
		} else if (upgrade == 6) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {

				}
			}, 0, 5000);
		} else if (upgrade == 7) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {

				}
			}, 0, 4000);
		} else if (upgrade == 8) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {

				}
			}, 0, 3000);
		} else if (upgrade == 9) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {

				}
			}, 0, 2000);
		} else if (upgrade == 10) {
			time.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run() {

				}
			}, 0, 1000);
		}
	}
}
