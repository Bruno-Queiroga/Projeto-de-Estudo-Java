package fundamentos;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma nota de  0 a 10: ");
		
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) { // se a nota inserida for maior que 10 ou menor que 0 será apresentado nota inválida
			System.out.println("Nota inválida!");
		} else if(nota >= 8.1)  { //se não cair no conceito de nota acima ou seja se a mesma for entre em 0 e 10 a nota é valida, sendo a nota maior
			System.out.println("Conceito A!"); //que 8.1 a mesma será do conceito A
		} else if(nota >= 6.1) {// se não cair no conceito de nota acima ou seja se a mesma for entre em 0 e 10 a nota é valida, sendo a nota maior
			System.out.println("Conceito B!");//que 6.1 a mesma será do conceito B
		} else if(nota >= 4.1) {// se não cair no conceito de nota acima ou seja se a mesma for entre em 0 e 10 a nota é valida, sendo a nota maior
			System.out.println("Conceito C!");//que 4.1 a mesma será do conceito C
		} else if(nota >= 2.1) {// se não cair no conceito de nota acima ou seja se a mesma for entre em 0 e 10 a nota é valida, sendo a nota maior
			System.out.println("Conceito D!");//que 2.1 a mesma será do conceito D
		} else {
			System.out.println("Conceito E"); //E por ultimo caso a nota inserida for entre 0 e 2.1 a mesma será do conceito E
		
		}
		System.out.println("Fim!");
		
		entrada.close();
				
	}
}
