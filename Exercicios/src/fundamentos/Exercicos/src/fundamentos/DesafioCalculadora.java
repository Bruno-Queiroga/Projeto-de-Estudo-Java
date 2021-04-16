package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro algarismo ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o segundo algarismo ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Qual operação a ser realizada: ");
		String operador = entrada.next();
		
		//lógica
		
		double resultado = "+".equals(operador) ? num1 + num2 : 0; // se o (operador) for + (equals) o sistema realiza a soma das variaveis (num1 + num2) caso contrario retorna 0
		resultado = "-".equals(operador) ? num1 - num2 : resultado; // similar ao exemplo acima e caso não for uma subtração o sistema volta o resultado para identificar a operação
		resultado = "*".equals(operador) ? num1 * num2 : resultado; // o sinal de dois pontos : ele verific se a condição e verdadeira ou falso caso contrario verifica resultado
		resultado = "/".equals(operador) ? num1 / num2 : resultado;
		resultado = "%".equals(operador) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operador, num2, resultado); // site com marcadores https://www.devmedia.com.br/system-out-objeto-de-saida-em-java/25240
		//double digito1 = Double.parseDouble(num1);
		//double digito2 = Double.parseDouble(num2);
		
		
		entrada.close();
		
		
	}
}
