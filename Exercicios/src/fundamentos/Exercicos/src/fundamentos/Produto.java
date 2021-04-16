package fundamentos;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	
	Produto(){
		
	}
	
	Produto(String nomeIncial, double precoInicial, double descontoInicial){                                               
		nome = nomeIncial;
		preco = precoInicial;
		desconto = descontoInicial;
		
	}
	

	double precoComDesconto() {
		return preco * (1- desconto);
	}
	double precoComDesconto(double descontoDoGerente) {		
		return preco * (1 - desconto + descontoDoGerente);	} // metodo para aplicar desconto na Classe ProdutoTeste, junto ao descontoDoGerente a qual
	                                                         //possibilita ainda aplicar mais um segundo desconto dentro do mesmo metodo onde
															// este segundo metodo ou seja o desntoDoGerente deve ser inserido entre paratenses () do
															// metodo precoComDesconto Exemplo na classe ProdutoTeste, possibilitando ser aplicado o desconto
														 // do gerente manualmente entre os mesmo parenteses
}
