package fundamentos;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do dia da semana: ");
			
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
			
		} else if(dia.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		
		} else if(dia.equalsIgnoreCase("Terça") 
			|| "terca".equalsIgnoreCase(dia)) {
			System.out.println(3);
		
		} else if(dia.equalsIgnoreCase("Quarta")) {
			System.out.println(4);
		
		} else if(dia.equalsIgnoreCase("Quinta")) {
			System.out.println(5);
		
		} else if(dia.equalsIgnoreCase("Sexta")) {
			System.out.println(6);
		
		} else if(dia.equalsIgnoreCase("Sabádo")
			|| "sabado".equalsIgnoreCase(dia)) {
			System.out.println(7);
		
		} else {
			System.out.println("Dia Inválido!");
		}
		
		entrada.close();
		
		// Outro forma de declarar:  literal primeiro "sabado etc.."  EXEMPLO: else if("xxxxx".equalsIgnoreCase(dia)){
		//|| "xxxxx".equalsIgnoreCase(dia)) {
		//System.out.println(X);
		
		//ou a variavel dia EXEMPLO :  else if(dia.equalsIgnoreCase("xxxxx")
		//|| "xxxxx".equalsIgnoreCase(dia)) {
		//System.out.println(X);
			
				
	}

}
