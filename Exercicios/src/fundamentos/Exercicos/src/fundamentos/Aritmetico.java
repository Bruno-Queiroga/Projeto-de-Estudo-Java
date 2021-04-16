package fundamentos;

public class Aritmetico {
	
	public static void main(String[] args) {
	
		System.out.println(2 + 3);
		
		var x = 34.56; //variavel var declarada através de infêrencia a qual o compilador tenta identificar o tipo da variavel pelo seu valor
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x / y);
		System.out.println(x * y);
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a / b);
		System.out.println(a * b);
		System.out.println(a / (double) b); // (double) utilizando desta maneira o resultado é apresentado quebrado/decimal mesmo que a variavel seja inteira, este metodo
		//e conhecido como casting possibilitando que o resultado seja apresentado como double e não inteiro
		
		System.out.println(a % b);
		System.out.println(8 % 3); // % modulo = resto da divisão
		
		System.out.println(x + y - a * b); // expressão é resolvida dentro da precendecia do java (multiplicação primeiro neste caso e depois as demais operações )
		
	}

}
