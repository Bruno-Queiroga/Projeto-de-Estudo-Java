package fundamentos;

public class For2 {
	
	public static void main(String[] args) {
		
		// Pós incremento i++ = O valor será incrementado antes da instrução e sua expressão
		// Pré decremento ++i = O valor será decrementado após a execução da expressão
		
		for(int contador = 10; contador >= 0; contador += -2) {
			System.out.printf("contador= %d\n", contador);
			
		}
		
	
	}

}
