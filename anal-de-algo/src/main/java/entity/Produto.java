package entity;

public class Produto {
	private String nome;
	private double valor;
	private String peso;
	
	
	public Produto() {
	}
	public Produto(String nome, double valor, String peso) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}
	
	

}
