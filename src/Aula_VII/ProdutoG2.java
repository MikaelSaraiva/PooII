package Aula_VII;

public class ProdutoG2<T,U> {
	
	
	private T codigo;
	private String descricao;
	private U preco;
	
	
	public ProdutoG2(T codigo, String descricao, U preco){
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public T getCodigo(){
		return codigo;
	}
	
	public String getDescricao(){
		return descricao;
		
	}
	
	public U getPreco(){
		return preco;
	}
	
	@Override
	public String toString(){
		return "Produto {" + "codigo=" + codigo + ", descrição=" + descricao + ", preço=" + preco + "}";
	}
}
