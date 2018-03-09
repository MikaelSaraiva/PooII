public class Novo extends Imovel{
	
	private int adicional;
	
	@Override
	public int getPreco(){
		return getPreco() + adicional;
	}

}
