package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);  //Java permite identificar a variavel pelo seu valor "inferencia", e outras declarações
		//como abaixo desde que seja o mesmo tipo no caso string 
				
		c = "Outro texto";
		System.out.println(c);
		
		double d; // variavel foi declarada
		d = 123.65; // variavel foi iniciada
		System.out.println(d); // usada!
	}

}
