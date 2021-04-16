package fundamentos;

public class Break {     // Break  = Break – O comando break é usado em laços de repetição while, do/while, for e com os comandos switch/case. 
						// Quando usado em laço de repetição, causa uma interrupção imediata do mesmo, continuando a execução do programa na próxima linha após o laço.
						// Isso ocorre caso a condição imposta seja atendida.
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			 
			if(i== 5) {
				break;     // Executando o debug e ao colocar um breakpoint sobre o a linha 10, vemos ao executar pressionando F6 a variavel i sendo 
			}			  //  incrementada até o valor 5 e em seguida vai pra linha 11 no break finalizando o incremento antes  i < 10; exibindo a
						 //   mensagem da linha 19
			
			System.out.println(i);
		}
		
	
		System.out.println("Fim");
	}

}
