package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		
		final double fator = 5.0 / 9.0;
		final double Ajuste  = 32;
		double fahrenheit = 86;
		double celsius = (fahrenheit - Ajuste) * fator;
		
		System.out.println("O resultado é " + celsius + " C°");
	}

}
