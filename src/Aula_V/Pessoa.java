package Aula_V;

public class Pessoa {

	// Attributes
	private String name;
	private int cpf;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	// Constructor
	public Pessoa(String name, int cpf) {
		this.name = name;
		this.cpf = cpf;
	}
}
