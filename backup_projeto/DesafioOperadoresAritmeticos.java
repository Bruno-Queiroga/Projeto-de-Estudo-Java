package fundamentos;

public class DesafioOperadoresAritmeticos {

	public static void main(String[] args) {
		
		double superiorA = (3 + 2) * 6;
		double potenciaA = Math.pow(superiorA, 2);
		double inferiorA = 3 * 2 ;
		double resultA   = (double)(potenciaA) / (inferiorA);
		
		double superiorB = (1 - 5) * (2 - 7);
		double potenciaB = Math.pow(superiorB, 2);
		double inferiorB = 4;
		double resultB   = (double)(potenciaB) / (inferiorB);
		
		double resultC   = (resultA - resultB);
 		double potenciaC = Math.pow(resultC, 3);
		double inferiorC = Math.pow(10, 3); 
		double soma      =  potenciaC / inferiorC;
		
		System.out.println("O resultado é " + soma);
	};
	
}
