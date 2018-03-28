package Exercicio_1;

public class Funcionario extends Pessoa {

	private int horasTrabalhadas;
	private int valorHTrabalhadas;
	private int codigo;
	
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}


	public int getValorHTrabalhadas() {
		return valorHTrabalhadas;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}


	public void setValorHTrabalhadas(int valorHTrabalhadas) {
		this.valorHTrabalhadas = valorHTrabalhadas;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public double calculoSalario() {

		double salariofinal =  (horasTrabalhadas * valorHTrabalhadas);
		
		return salariofinal;
	}
}
