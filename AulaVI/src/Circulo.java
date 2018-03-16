public class Circulo implements Interface { 
	
	private double raio;
	
	
	public Circulo(double raio){
		this.raio = raio;
	}


	public double calculaPerimetro() {
		return 2 * 3.14 * raio;
	}


	public double calculaArea() {
		return 3.14 * raio * raio;
	}

}
