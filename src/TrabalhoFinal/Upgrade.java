package TrabalhoFinal;

import java.util.Timer;
import java.util.TimerTask;

public class Upgrade {

	private int custo = 1;
	private int periodo = 1000;
	private Clicker clicker;
	

	public Upgrade(Clicker clicker, int custo) {
		this.clicker = clicker;
		this.custo = custo;
	}
	
	public Upgrade(Clicker clicker, int custo, int periodo) {
		this(clicker, custo);
		this.periodo = periodo;
	}

	public void custo() {
		custo += custo;
	}

	public int getCusto() {
		return custo;
	}
	
	public int getPeriodo() {
		return periodo;
	}
}
