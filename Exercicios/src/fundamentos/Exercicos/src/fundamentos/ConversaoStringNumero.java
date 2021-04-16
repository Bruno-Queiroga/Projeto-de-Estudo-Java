package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número"); // similar a função scanner, permite o usuário inserir informações em uma interface
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1 );
		double numero2 = Double.parseDouble(valor2 ); // funçao parsedouble permite converte texto string em numero inteiro
		
		double soma = numero1 + numero2;
		System.out.println(" Soma é " + soma);
		System.out.println(" Média é " + soma / 2);
		
		
	}
}
