package Aula_IV;

public class CamaroteSuperior extends VIP{

	
	public int getValor(){
		return getValorAdicional() + getValorReais();
	}
}
