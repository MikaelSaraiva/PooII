package Exercicio_1;

public class FuncionarioCom extends Funcionario {

	private int percentualComissão;
	private int totalvendas;

	public int getPercentualComissão() {
		return percentualComissão;
	}

	public int getTotalvendas() {
		return totalvendas;
	}

	public void setPercentualComissão(int percentualComissão) {
		this.percentualComissão = percentualComissão;
	}

	public void setTotalvendas(int totalvendas) {
		this.totalvendas = totalvendas;
	}
	
	public double salarioComissionado() {
		double salariofinal = calculoSalario() + (percentualComissão * totalvendas);
		
		
		return salariofinal;
	}
}
