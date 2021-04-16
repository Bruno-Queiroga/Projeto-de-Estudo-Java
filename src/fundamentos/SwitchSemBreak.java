package fundamentos;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		// Switch sem break, uma forma pouco usual sem o metodo break
		
		// Switch é diferente dos dos metodos (if, else if, else, while e for a qual recebe um valor verdadeiro ou falso {boolean} e sim recebe um valor direto)
		
		String faixa = "preta"; // ao informar a cor de faixa conforme abaixo, o sistema retorna o texto da faixa e caso houver faixa abaixo à selecionada, retornará também as demais
								  // ao informa uma cor não existente o sistema retorna apenas o "default" não sei de nada e caso selecione a preta retorna todas as demais
								  // caso inserimos o break, o sistema só vai executar o bloco determinado até o break aqual está comentado para exemplo / default
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");	
			break;             
		default:
			System.out.println("Não sei nada");
		}
			
		System.out.println("______________________________________________________________________________");
			// Outro exemplo
			
			int idade = 3;
			
			switch (idade) {
			case 3:
				System.out.println("Sabe programar");
			case 2:
				System.out.println("Sabe falar");
			case 1:
				System.out.println("Sabe andar");
			case 0:
				System.out.println("Sabe respirar");
			}
		}
	}


