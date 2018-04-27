package TrabalhoFinal;


public class Upgrade {

	private int custo = 1;
	private int periodo = 1000;
	private int multiplicador = 1;
	private Clicker clicker;
	
	public Upgrade(Clicker clicker) {
		this.clicker = clicker;
	}

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
	
	public void upgradeClick() {
		multiplicador++;
	}
	
	public int getMulti() {
		return multiplicador;
	}
}
