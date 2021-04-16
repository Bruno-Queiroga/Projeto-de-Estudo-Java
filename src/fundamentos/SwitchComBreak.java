package fundamentos;

import java.util.Scanner;

public class SwitchComBreak {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String conceito = "";
		System.out.println("informe a nota: ");
		int nota = entrada.nextInt();                   // Este exemplo poderia utilizar o metodo If Else utilizado na classe de mesmo nome sendo mais pratico 
	
		
		switch(nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
			
		default:
			conceito = "Não encontrado!";
			
		}	
			
		System.out.println("Conceito é " + conceito);
		entrada.close();
			
	}

}
