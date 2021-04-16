package fundamentos;

public class BreakRotulado {
	
	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				if(i == 1) {
					break externo;                    // Exemplo de break com dois laços for interno e externo (procedimentop pouco recomendado) mas server de exemplo 
										             // para entender o comportamento e a possibilidade de identificar dos laços (break rotulado externo)
													// desta maneira o break é execuado APENAS sobre o break rotulado, removendo o break finaliza um laço e acaba executando 
												   // também o laço mais interno.
				}
				
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}

}
