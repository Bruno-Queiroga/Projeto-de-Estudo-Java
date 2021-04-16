package fundamentos;

public class ContinueRotulado {
	
	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				if(i == 1) {
					continue externo;                        //Mesmo exemplo de rotulo do laço for com continue neste exemplo
															// seguindo a mesma lógica da class BreakRotulado obtendo os mesmo resultados
				}
				
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}

}
