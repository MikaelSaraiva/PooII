package Aula_VI;
public class Quadrados implements Interface{
	
	
	private double lado;
	
	public Quadrados(double lado){
		this.lado = lado;
	}

	public double calculaPerimetro() {
		return lado * 4;
	}

	public double calculaArea() {
		return lado * lado;
	}
}
