package br.stefanini.carros;

import br.com.stefanini.automovel.Automovel;

public class Importado extends Automovel implements Compacto, SUV {
	
	private String origem;

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	@Override
	public void hatch() {
		System.out.println("Você comprou um modelo hach");
		
	}

	@Override
	public void sedan() {
		
		System.out.println("Você comprou um modelo Sedan");
		
		
	}
	
	
	
	
	
	
	
	

}
