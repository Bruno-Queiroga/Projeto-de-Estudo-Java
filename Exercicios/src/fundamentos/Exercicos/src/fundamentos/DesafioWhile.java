package fundamentos;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota !=-1) {
			System.out.print("Informe a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();    //Recebe o valor de entrada "Scanner e converte de string para o tipo primitivo Double
			
			if (nota <= 10 && nota >= 0 ) { // variavel nota deve ser igual ou menor que 10 e maior ou igual a 0  
				
				total += nota;              // variavel nota recebe o valor digitado e atribui a variavel total
				quantidadeDeNotas++;        // variavel quantidadeDeNotas é incrementada ao inserir valor na variavel nota, para a divisão de " total / quantidade de notas
				
			} else if(nota != -1 ){         // Se a nota digitada não for da condição if (nota <= 10 && nota >= 0 ) ou igual a -1 (para finalizar) a nota diferente  será inválida
				System.out.println("Nota inválida!!!");
			}
		}
		
		//Calcular nota
		
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		
		
		
		entrada.close();
		
	}

}
