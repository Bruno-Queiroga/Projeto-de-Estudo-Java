package fundamentos;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7.0) { // IF = Se, na tradução pt br, conteudo dentro do parêntese é boolean (true or
											// false) verdadeiro ou falso APENAS
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
			// OBS: NA EXPRESSÃO if (media >= 7.0) NÃO FOI INSERIDO " ; " NESTE CASO O JAVA
			// VALIDA A MEDIA SE É IGUAL O MAIOR 7.0 ATRIBUINDO
			// System.out.println("Aprovado!");
			// JUNTO AO BLOCO DE CODIGO AGRUPADO POR CHAVES " { }
		}

		if (media < 7 && media >= 4.5)
			System.out.println("Recuperação");

		boolean criterioReprovadoAtingido = media < 4.5 && media >= 0;

		if (criterioReprovadoAtingido) {
			System.out.println("Reprovado");
		}

		entrada.close();

	}
}
