package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia X";
	
		s = s.replace("X", "Senhora"); // s.replace = substitui a string e substituição
		s = s.toUpperCase(); // s.toUpperCase  = altera a variavel s para maiuscula
		s = s.concat("!!!"); // s.concat = serve para concatenar um string a outro texto
		System.out.println(s);
		
		
		String t = "Bom dia T".replace("T", "Senhor").toUpperCase().concat("!!!");
		System.out.println(t); // outra forma para inserir metodo na string, diferente do exemplo acima
		

		String x = "Leo".toUpperCase(); // outro metodo para torna a string da variavel como maiuscula
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Bruno")// outro metodo para substitui a string 
		.concat("!!!"); //outro forma de utilizar o metodo concatenação, junto a declaração da variavel
		System.out.println(y);
		
		
		
		
		
		//Tipo primitivo não tem o operador "."
		int a = 3;
		System.out.println(a);
		
		
		
		
	}

}
