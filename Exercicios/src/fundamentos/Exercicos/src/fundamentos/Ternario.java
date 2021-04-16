package fundamentos;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.6;
		
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado"; // dois pontos " : " é utilizado para comparar   ? "verdadeiro : Falso" sobre a expressão  
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;
		
		//String resultado = media >= 7.0 ? "Aprovado" : "Em recuperação"; 
		// Caso a expressao for verdadeira  é apresentado  aprovado e caso contrario recuperação   "True : false" atribuição condicional;
		
		System.out.println("O aluno está " + resultadoFinal);
		
		
		boolean bomComportamento = true;
		boolean passouPorMedia = media >= 5;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String  resultado = temDesconto ?  "Sim." : "Não.";
 		
		System.out.println("Tem desconto ? " + resultado);
		
		
		
			
	}
}
