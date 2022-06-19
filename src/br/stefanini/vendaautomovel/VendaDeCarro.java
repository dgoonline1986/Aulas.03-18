package br.stefanini.vendaautomovel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import br.stefanini.aulalambdastream.Pessoa;
import br.stefanini.carros.Importado;
import br.stefanini.carros.Popular;

public class VendaDeCarro {

	public static void main(String[] args) {
		
		Popular compra01= new Popular();
		compra01.setMarca("Hyunday");
		compra01.setModelo("HB20");
		compra01.setPreco(70.000);
		compra01.setPotencia("105 cv");
			
		
		Importado compra02= new Importado();
		compra02.setMarca("Audi");
		compra02.setModelo("TT RS");
		compra02.setOrigem("Alemanha");
		compra02.setPreco(424.990);
		compra02.setPotencia("405 cv");

		
		
		
		List<String> vendas=Arrays.asList(compra01.getMarca(), compra02.getMarca());
		System.out.println("Foi vendido");
		vendas.forEach((n) -> System.out.println(n));
		

		
		
		
		
		
		
		

	}

}
