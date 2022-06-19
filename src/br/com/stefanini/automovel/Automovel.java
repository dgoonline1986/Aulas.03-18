package br.com.stefanini.automovel;

public abstract class Automovel {
	
	private String marca;
	private String modelo;
	private double preco;
	private String potencia;
	
	
	public Automovel() {
		
	}
	
	public Automovel(int potencia) {
		
	}
	
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

}
