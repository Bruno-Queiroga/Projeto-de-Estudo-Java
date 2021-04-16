package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println( "Olá pessoal".charAt(0));// CharAt = imprime ou exibe o caracter e sua posição no caso
		// 0  é representado pela letra "O" de Olá confprme string acima.
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa")); // startsWith = Começa com ("xxx") terminal retorna com  true or false
		//Obs = verifica letras maiuscula ou minusculas = retorna true
		System.out.println(s.startsWith("boa")); //retorna false
		System.out.println(s.length());// verifica a quantidade de caracters
		System.out.println(s.endsWith("tarde"));// similar ao startsWith mas este verifica o se termina com
		// a palavra informada retornando como verdadeiro ou falso "true or false"
		System.out.println(s.equals("boa tarde")); // equals compara se o que foi declarado na variavel é igual ou não
		//retorno como true or false
		System.out.println(s.equalsIgnoreCase("boa tarde")); // mesmo exemplo acima porém sem a sensibilidade de caracter maiusculo ou miniusculo
		
		
		// exemplo de inferencia e concatenação sobre as variaveis abaixo
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		System.out.println("Nome: " + nome + " \nSobrenome: " + sobrenome + " \nIdade: " + idade + " \nSálario: " + salario); // \n serve para realizar a quebra de linha 
		// para não sair o texto tudo na mesma linha
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario); // printf é para formatação da string ao exibir no terminal, 
		// outra alternativa para o exemplo acima utilizando o %s (string) e d% (inteiros)e f% (float)
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase); // mesmo exemplo que o acima, mas invés de printf é utilizado String.format
		
		// meios alternativos através de String.format e printf para a concatenação
	}

}
