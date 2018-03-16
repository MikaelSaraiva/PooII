
public class Retangulo extends Quadrilatero implements Interface  {
	
	private double base;
	private double altura;
	
	
	public Retangulo(double base, double altura){
		this.altura = altura;
		this.base = base;
		
	}
	
	public double calculaPerimetro(){
		double perimetro = 0;
		
		perimetro = (base + base) + (altura + altura);
		
		return perimetro;
	}
	
	public double calculaArea(){
		double area = 0;
		
		area = base * altura;
		
		return area;
	}

	public void quadrilatero(int lado1, int lado2, int lado3, int lado4) {
				
	}

}
