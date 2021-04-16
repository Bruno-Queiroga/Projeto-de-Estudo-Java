package fundamentos;

import java.util.Date;

public class Import {
	
	public static void main(String[] args) {
		java.lang.String b = "Boa Tarde!";
		java.lang.System.out.println(b);
		
		String s ="Bom dia";
		System.out.println(s);
		
		Date d = new Date(); // Java não exibe a data através do date, somente após o metodo import 
		//"import java.util.Date;
		System.out.println(d);
		
		//JButton botao = new JButton(); ao declar a criação de um botao sem o "import" ao pressionar as teclas
		// "ctrl + shift + o " o sistema identifica que não foi utilizando removendo automaticamente
		// Em resumo o que está fora de java lang é necessario importa
		
		
	}

}
