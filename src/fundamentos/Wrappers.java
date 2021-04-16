package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		// Wrapper é a classe de envelopamento da java a qual permite atribuir tipo primitivos ao associar a string
		
		Scanner entrada = new Scanner(System.in);
		//byte
		Byte b =100;
		Short s =1000;
		
		Integer i = Integer.parseInt(entrada.next()); // Permite converter tipos primitivos em texto (string)
		Long l = 100000L; // Lembrando que o tipo long deve ser inserido o L no final do número OBS : Long com L maiusculo é Classe e com minusculo é tipo primitivo
		
		System.out.println(b.byteValue ()); // ao escreve syso e em seguinda pressionar (ctrl + espaço no linux ) é apresentado a sugestão do java 
		System.out.println(s.toString());  //ao informar a variavel b. identificação a sugestão do java para aplicar o (b.byteValue ())
		System.out.println(i * 3);
		System.out.println(l / 4);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		Character c = '#'; // char especial
		System.out.println(c + "...");
		
		entrada.close();
		
		
		
		
	}
}
