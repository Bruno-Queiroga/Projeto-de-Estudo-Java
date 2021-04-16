package fundamentos;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		System.out.println('\u0061'); // caracter "A" em unicode
		
		System.out.println(3 > 4);
		
		System.out.println(3 < 7);
		
		System.out.println(3 >= 3); //maior ou igual >=
		
		System.out.println(30 <= 7);
		
		System.out.println(30 != 7);// diferente !=
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto ? " + temDesconto);
		
		
		
		
		
	}
}
