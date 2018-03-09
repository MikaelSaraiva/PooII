public class VIP extends Ingresso {

	private int valorAdicional;

	public int getvalorTotal() {
		return getValorReais() + valorAdicional;
	}

	public int getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(int valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

}
