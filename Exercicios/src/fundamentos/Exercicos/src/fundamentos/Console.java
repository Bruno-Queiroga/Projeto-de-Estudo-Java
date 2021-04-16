package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Bom ");
		System.out.println("Dia"); // System.out.print = é exibido no console similar ao println, porém, sem quebra de linha
		
		System.out.print("Bom");
		System.out.print(" dia!");
		
		System.out.printf(" Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); //exemplo já utilizado em caso anterior junto ao %n para realizar quebra de linha
		System.out.printf("Salário: %.1f%n", 1234.5678); // %.1f" = Usado para formatação de pontos flutuantes (float) evitando os decimais meniconados retornando
		//para o terminal apenas Salário: 1234,6
		
		Scanner entrada = new Scanner(System.in); // comando a qual permite o usuário digitar informações Scanner java util(ctrl + espaço) 
		
		System.out.print("Digite seu nome: "); //Exibe mensagem para usuário e string nome = entrada.nextline Retorna a string como o nome inserido
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: "); //mesmo processo para nome e sobrenome, mas com o tipo inteiro para informar idade
		int idade =  entrada.nextInt();
		
		
		
		System.out.printf("%s %s tem %d anos." + "", nome, sobrenome, idade); // concatenação utilizando formato da estrada %s string nome + sobrenome e %d double para
		// os tipos primitivo (int, double, float, etc..)
		
		entrada.close();
		
		// MAIS INFORMAÇÃO SOBRE MARCADORES DE INDICAÇÃO PRINTF : https://www.baeldung.com/java-printstream-printf
		
	}
}
