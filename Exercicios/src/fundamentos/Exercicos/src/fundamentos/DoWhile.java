package fundamentos;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		// Breve revisão sobre estruturas
		
		// if(...) sentença; ou {}
		// while(...) sentença; ou {}
		// for(...; ...; ...) sentença; ou {}		
		//do sentença; ou {} while(...);
		
		
		Scanner entrada = new Scanner(System.in);
		
		String  texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
			} while(!texto.equalsIgnoreCase("por favor"));  //while = enquanto não for digitado por favor (Case sensitive)*, o sistema ira retornar 
															// System.out.println("Você precisa falar as palavras mágicas...");
															//System.out.print("Quer sair? ");
			
			System.out.println("Obrigado!");
		
		
		entrada.close();
			
		
	}

}
