package fundamentos;

import java.util.Scanner;

public class DesafioCoversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o valor do primeiro do salário "); 
		String valor1 = entrada.next().replace(",", ".");
		System.out.print("\nDigite o valor do segundo salário ");  // (\n) lembrando é o comando para quebra de linha
		String valor2 = entrada.next().replace(",", "."); // replace  permite usar tanto virgula como ponto no console para os decimais OBS*** É POSSIVEL UTILIZAR O COMANDO DE IMPORT 
		//LOCALE.SETDEFAULT(LOCALE.US); DEIXANDO NO PADRAO AMERICANO SUBSTITUINDO , POR PONTO . COMO SEPARADOR DECIMAL.
		System.out.print("\nDigite o valor do terceiro do salário "); 
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) /3;
		System.out.println("\nA média dos salários é " + media);
		
		
		
		
		entrada.close();
 		
	}
}
