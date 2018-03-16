
public class AulaII_OperacoesNumeros {

	private int n1;
	private int n2;
	private int n3;

	public AulaII_OperacoesNumeros(){
		super();
		
	}
	
	public AulaII_OperacoesNumeros(int n1, int n2, int n3) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	public int positivoOuNao(int n1) {
		int resposta = 0;
		if (n1 < 0)
			resposta = 0;
		else
			resposta = 1;

		return resposta;

	}

	public int soma(int n1, int n2) {
		int soma = 0;

		if (n1 < n2) {
			for (int i = n1 + 1; i < n2; i++) {
				soma += i;

			}

		} else
			for (int i = n2 + 1; i < n1; i++) {
				soma += i;

			}
		return soma;
	}

	public int somaDivisao(int n1, int n2, int n3){
    	int soma = 0;
    
    	if(n1 > 1){	    		
    	
    		if( n2 < n3){
		        for( int i = n2 + 1; i < n3; i++){
		        	if(n1 % i == 0)
		        		soma += i;
		        }
    		}
		        
	    }else 
        	for( int i = n3 + 1; i < n2; i++){
        		if(n2 % i == 0)
	        		soma += i;
    	}
	    
    	
    	return soma;
    }
    
    public String conversao(int n1){
    
    	String resultado = null;
    	
    	int segundos = n1 % 60;
    	int restoHoras = n1 % 3600;
    	int minutos = (n1/60) + restoHoras;
    	int horas = n1/3600;
    	  	
    	resultado = String.valueOf(horas) + ":" + String.valueOf(minutos) + ":" + String.valueOf(segundos);
    	
    	return resultado;
    }
}


