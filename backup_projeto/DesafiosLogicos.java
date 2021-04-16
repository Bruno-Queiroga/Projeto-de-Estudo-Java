package fundamentos;

public class DesafiosLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1  ^ trabalho2; 
		
		//Operador uninario, para negação logica insira !true;
		boolean sorvete = true;


		
		System.out.println("Comprou Tv 50\"? " + comprouTv50); //  A barra  \ é chamada de escape, permite inserir aspa duplas dentro de uma string valor literal
		System.out.println("Comprou Tv 32\"? " + comprouTv32); 
		System.out.println("Vamos tomar um sorvete? "  + sorvete);
		
		//System.out.println(tv32 || tv50);
		//System.out.println(sorvete);
		
		
		//boolean tv32 = 
		//boolean tv50 = Trabalho
		//trabalho na terca ( V ou F)
		//Trabalho na quinta (V ou F)
		//50 ou 32 tv
		//apens um trabalho de 32, os dois trabalho 50, ou de 32 ou de 50 iremos tomar sorvete
	}

}
