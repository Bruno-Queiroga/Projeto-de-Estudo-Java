package fundamentos;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // incremento de valores a = a + 1;
		a--; // incremento de valores a = a - 1;
		
		++b; // incremento de valores b = b + 1;
		--b; // incremento de valores b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(" Mini desafio...");
		System.out.println(++a == b--); // resultado é apresentado como  true devido a precedencia de incremnto de a é superior a b e a mesma so aplica o decremento apos 
		//retorno da sentença detalhes : https://www.devmedia.com.br/java-operadores-de-atribuicao-aritmeticos-relacionais-e-logicos/38289
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
		
		
		
	}
}
