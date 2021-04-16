package fundamentos;

public class For3 {
	
	public static void main(String[] args) {
		
		int i = 0;
		for(; i < 10; i++) {              //declaração da variavel fora do laço for
			System.out.println(i);
		}
		
		System.out.println("Saiu do for..."); // possibilita alterar a variavel i, quando mesma está fora do laço for, possibilitando imprimir o numero 10
										      // quando o limite do laço declarado é < 10 ou seja até 9	
		System.out.println(i);
		
	}

}
