package fundamentos;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog
				("Informe o número:" );
		int numero = Integer.parseInt(valor); //converte o valor de entrada do inputDialog de string para inteiro "Integer.parseInt(valor);"
		
		if(numero % 2 == 0 ) {
			System.out.println("Número Par! ");	// identifica se o numero inserido e par o impar atraves da divisao / modulo "a sobra da operação" sendo  
			//0 e par, caso contrário é impar conforme abaixo 
		}
		
		if(numero % 2 == 1) {
			System.out.println("Número ímpar! ");
		}
		
		// COM IF / ELSE =  SE, SE NÃO  (OUTRO MANEIRA DO CODIGO ACIMA MAIS SIMPLIFICADA)
		
		if(numero % 2 == 0) {
			System.out.println("Número par! ");
		} else 
		System.out.println("Número ímpar! ");
	

	}

}
