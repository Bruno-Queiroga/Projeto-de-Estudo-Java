package fundamentos;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook",4356.89, 0.25); 
		//p1.nome = "Notebook";        // instanciando contrutores da classe Produto para a classe atual ProdutoTeste pelo metodo main
		//p1.preco = 4356.89;         // No caso (Produto p1) é a classe =  e (new Produto()); é um construtor padrão um vez que não recebe nenhum parametro entre os
		//p1.desconto = 0.25;        // parenteses ()
		
		var p2 = new Produto(); // intanciando construtores da classe produto através de variavel Exemplo construtor padrao**
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		//double precoFinal1 = p1.preco * (1 -p1.desconto);  Logica alternativa porem logica (REFATORADA SEGUE ABAIXO), utilizando chamada de metodo 
		//double precoFinal2 = p2.preco * (1 -p2.desconto);  precoComDesconto da Classe Produto 
		//double mediaCarrinho =(precoFinal1 + precoFinal2) / 2 ;
		
		double precoFinal1 = p1.precoComDesconto(0); // o metodo deve sempre ser inserido com parantese  = precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1); // valor de 0.1 ou seja 10% descontoDoGerente sobre o produto p2
		double mediaCarrinho =(precoFinal1 + precoFinal2) / 2 ;
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	}

}
