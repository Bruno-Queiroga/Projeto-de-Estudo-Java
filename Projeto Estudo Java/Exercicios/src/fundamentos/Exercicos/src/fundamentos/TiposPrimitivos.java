package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//informações do funcionário
		// DEclaração de variaveis
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 168;
		int id = 56789;
		long pontosAcumulados = 3_034_854_233L; // underline pode ser utilizada para substituir ponto,
		//facilita a visualização (L) é para identificar que o número é um literal long
		
		
		//Tipos Numéricos reais
		float salario = 11_445.44F; // Similar ao caso do long (F) é utilizado de forma literal no caso float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleano
		boolean estaDeFerias = false; // Valores aceitos verdadeiro ou falso ( false , true )
		
		//tipo caratere
		char status = 'A'; // A = ativo, utilizado para representaão através de caracter
		
		
		//Uso das variaveis declaradas
		
		//Dias de empresa
		System.out.println (anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println (numeroDeVoos / 2);
		
		//pontos por real
		System.out.println (pontosAcumulados / vendasAcumuladas);
		
		System.out.println ( id + ":  ganha ->" + salario);
		System.out.println ("ferias?" + estaDeFerias);
		System.out.println ("status:: " + status);
	}
}
