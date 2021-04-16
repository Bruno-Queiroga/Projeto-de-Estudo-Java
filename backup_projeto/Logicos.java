package fundamentos;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		
		System.out.println(condicao1 && condicao2); 
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^  condicao2);
		System.out.println(!condicao1); 
		System.out.println(condicao2);
		
		
		System.out.println("\nTabela verdade  E (AND)");
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & false);
		System.out.println(false & true);
		
		System.out.println("\nTabela verdade  OU (OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false);
		System.out.println(false || true);
		
		System.out.println("\nTabela verdade  OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		System.out.println(false ^ true);
		
		System.out.println("\nTabela verdade  OU Exclusivo (NOT)"); // obs o ponto de exclamação pode ser utilizado na setença como ! Example: System.out.println(condicao1); apresentado o resultado oposto
		System.out.println(!true);
		System.out.println(!false);
		
		
		/* tabela verdade java -  creditos : http://www.universidadejava.com.br/materiais/java-operadores-logicos/
		 * 
		 * 
		 * Os operadores lógicos aceitam apenas operando do tipo boolean.
		 * 
				---Operador E---

Símbolo && é chamado de E. Este operador retorna true somente se os dois operandos forem true.

<operando1> && <operando2>

Se o valor do operando1 for false, então o operador && não verifica o valor do operador2, pois sabe que o resultado já é false.

Tabela verdade:
Operando1 	Operando2 	Resultado
true 	true 			true
true 	false 			false
false 	true 			false
false 	false 			false



				---Operador OU---

Símbolo || é chamado de OU. Este operado retorna true caso tenha pelo menos um operando com o valor true.

<operando1> || <operando2>

Se o valor do operando1 for true, então o operador || não verifica o valor do operando2, pois já sabe que o resultado é true.

Tabela verdade:
Operando1 	Operando2 	Resultado
true 	true 				true
true 	false 				true
false 	true 				true
false 	false				false

				---Operador de negação---

Símbolo ! é chamado de negação. Este operador retorna true se o operando tem o valor false, e retorna false se o operando o valor true.



Tabela verdade:
Operando 	Resultado
false 		true
true 		false

		 */
		
		
	}
}
