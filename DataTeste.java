package fundamentos;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();                     // Valores agora atribuido no construtor padrão criado na classe data.java
		
		//d1.dia = "01";                 
		//d1.mes = "Janeiro";
		//d1.ano = "1970";
		
		var d2 = new Data(01,01,1970);             //Valores antes atribuidos em variavel, agora atribuido via atributo do construtor da classe data.java
		
	    //d2.dia2 = 01; 
		//d2.mes2 = 01;
		//d2.ano2 = 1970;
		
	
		
		
		System.out.printf("Hoje é %s de %s de %s ou se preferir %d/%d/%d\n ", d1.dia, d1.mes, d1.ano, d2.dia2, d2.mes2,d2.ano2);
		System.out.println(d2.obterDataFormatada());

		
	}
}
