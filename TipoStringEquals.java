package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
			System.out.println("a" == "a"); // compara se o conteudo da string e igual (true)  porem sem o equals pode levar o erro*
			
			String s = new String ("2"); //declaro variavel s com o valor 2 e comparo a string "2" (false) desta maneira compara o tipo e nao conteudo
			System.out.println("2" == s);
			System.out.println("2".equals(s));// metodo equals compara conteudo mais preciso que "==" (true)
			
			Scanner entrada = new Scanner(System.in);
			
			
			String s2 = entrada.next();
			System.out.println("2"== s2.trim()); // similar o caso acima não foi comparado o conteudo mesmo inserido o digito 2 no scanner
			System.out.println("2".equals(s2.trim())); // e novamente o metodo equals compara o conteudo neste caso inserido atraves de scanner
			
			//OBS: TRIM e utilizado para remover os espaços em branco inserido. O comando "entrada.next();" inserido apos a declaração da variavel scanner tambem 
			//remove os espaços em branco
			entrada.close();
			
			
			//OBS : EQUALS E == SÃO SIMILARES 
			
			//resumo prático é o seguinte:

				//a) Está usando objetos? Compare com equals;
				//b) Está usando tipos primitivos? Use ==.

				//Simples assim.[/quote]

				//Isso funciona em 90% dos casos. Você também pode usar == com objetos, caso deseje saber se ambos estão na mesma área de memória.
			// FONTE : https://www.guj.com.br/t/equals-ou/57529/6
	}

}
