package fundamentos;

public class Continue {
	
	public static void main(String[] args) { // Continue – O comando continue é usado somente em laços de repetição. Quando ele é executado,  
											//  o laço volta imediatamente para o teste de condição do laço de repetição. 
										   //   Normalmente, usamos o comando continue em um teste if.
		for(int i = 0; i < 10; i++ ) {
			if(i % 2 == 1) {           // Expressão if(i % 2 == 1) ira retornar apenas valores pares, caso contrario continua até que seja i < 10 
				continue;
				
			}
			System.out.println(i);
		}
	}

}
