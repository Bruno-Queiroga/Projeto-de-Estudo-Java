package fundamentos;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println();
		
		String texto = "";
		
		while(!texto.equalsIgnoreCase("Sair")) {
			System.out.print("Você diz: "); // retorna "você diz" até que seja digitado sair, repetindo de uma maneira indeterminada
			texto = entrada.nextLine();
		}
		
		
		
		entrada.close();
	}

}
