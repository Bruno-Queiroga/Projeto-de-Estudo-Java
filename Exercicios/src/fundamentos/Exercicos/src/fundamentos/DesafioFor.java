package fundamentos;

public class DesafioFor {

		public static void main(String[] args) {
			
			String valor = "#";
			
			for(int i = 1; i <= 5; i++) {
				System.out.println(valor);
				
				valor += "#";
			}	
			
			//Versão desafio
			//Não pode usar valor numérico para controlar o laço for!

			//Resolução
			
			for(String v = "#";!v.equals("######"); v +="#") { //enquato variavel v não for igual a ("######"); incrementa # a cada novo laço V +="#"
				System.out.println(v);
			}
				
			
			
		}
}
