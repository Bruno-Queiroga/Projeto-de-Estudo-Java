package fundamentos;

public class CoversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); // tostring converte tipos primitivos em texto (strix)
		
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
		
		
	}

}
