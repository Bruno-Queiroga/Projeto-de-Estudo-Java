package fundamentos;

public class For1 {
	
	public static void main(String[] args) {
		
		// Estrutura mais adequada para o for, dentro da sua própria estrutura
		
		for(int contador = 1; contador <= 20; contador++) {
			System.out.printf("i= %d\n", contador);
			
		}
		
		// Outra maneira, porém não é usual  
		
		int x = 2;
		for(; x <10;) {
			System.out.println("x = " + x);
			x++;
			
			
		}
		
		// Laço infinito
		
//		for(;;) {
//			System.out.println("Fim");
		
		}
	}


