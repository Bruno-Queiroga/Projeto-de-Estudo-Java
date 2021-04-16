package fundamentos;

public class Data {

	String dia;
	String mes;
	String ano;
	
	int dia2;
	int mes2;
	int ano2;
	
	Data() {
		dia = "dia 1";
		mes = "Janeiro";
		ano = "1970";
	}
	
	Data (int diaInicial, int mesInicial, int anoInicial){
		dia2 = diaInicial;
		mes2 = mesInicial;
		ano2 = anoInicial;
	}
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d\n", dia2,mes2,ano2);
	}
}
