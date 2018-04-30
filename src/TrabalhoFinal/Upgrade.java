package TrabalhoFinal;


public class Upgrade {

	private int custo = 1;
	private int periodo = 1000;
	private int multiplicador = 1;
	private int multCompras = 1;
	private Clicker clicker = new Clicker();
	
	public Upgrade() {
		
	}

	public Upgrade(Clicker clicker, int custo, int multiplicador) {
		this.clicker = clicker;
		this.custo = custo;
		this.multiplicador = multiplicador;
	}
	
	public Upgrade(Clicker clicker, int custo, int periodo, int multiplicador, int multCompras) {
		this(clicker, custo, multiplicador);
		this.periodo = periodo;
		this.multiplicador = multiplicador;
		this.multCompras = multCompras;
	}

	public void custo() {
		custo += custo;
	}

	public int getCusto() {
		return custo;
	}
	
	public void setCusto(int custo) {
		this.custo = custo;
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
	
	public int multCompras(int vezes) {
		custo = custo*vezes;
		return custo;
	}
}
